/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.bai3_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hanh
 */
public class Thread1 extends Thread{
    private Data data;
    public Thread1(Data data){
        this.data=data;
    }
    @Override
    public void run(){
        File file=new File("in.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        while(true){
            synchronized(data){
                try {
                        BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
                        String s=bufferedReader.readLine();
                        while(s!=null){
                            if(data.getChuyen()==1){
                                data.chuyenSinhVien(s);
                            s=bufferedReader.readLine();
                            data.setChuyen(2);
                            data.notifyAll();
                            }
                            
                            data.wait();
                        }
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                }
                data.setChuyen(4);
                data.notifyAll();
                break;
            }
        }
    }
}
