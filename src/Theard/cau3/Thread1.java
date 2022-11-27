/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.cau3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread1 extends Thread{
    private Data data;
    public Thread1(Data data){
        this.data=data;
    }
    @Override
    public void run(){
        while(true){
            synchronized(data){
                File file=new File("src/Theard/cau3/Cauhoi.txt");
                if(!file.exists()){
                    try {
                        file.createNewFile();
                    } catch (IOException ex) {
                        Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                try {
                    BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
                    String s=bufferedReader.readLine();
                    while(s!=null){
                        if(data.getChuyen()==1){
                            Thread.sleep(1000);
                            data.setChuyencauhoi(s);
                            data.setChuyen(2);
                            s=bufferedReader.readLine();
                            data.notifyAll();
                        }
                        data.wait();
                        
                    }
                    data.setChuyen(4);
                    data.notifyAll();
                    break;
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
    }
}
