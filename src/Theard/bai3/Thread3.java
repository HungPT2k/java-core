/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.bai3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hanh
 */
public class Thread3 extends Thread{
    private Data data;
    public Thread3(Data data){
        this.data=data;
    }
    @Override
    public void run(){
        while(true){
            synchronized(data){
                if(data.getGiay()==20){
                    data.notifyAll();
                    break;
                }
                if(data.getChuyen()==3){
                    data.setTui();
                    System.out.println("So luong doi giay: "+data.getTui());
                    data.notifyAll();
                    
                }
                try {
                    data.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        synchronized(data){
            stop();
        }
    }
}
