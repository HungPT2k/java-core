/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.bai3;

import java.util.Calendar;
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
       Calendar calendar=Calendar.getInstance();
            int time=calendar.get(Calendar.SECOND);
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
            }
             
            synchronized(data){
                if(data.getGiay()==20){
                    data.notifyAll();
                    break;
                }
                if(time%2==0){
                    data.setChuyen(2);
                   
                }
                else{
                    data.setChuyen(3);
                }
                 data.notifyAll();
                    try {
                        data.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
            time+=1;
        }
        System.out.println("Tong tien la: "+(data.getGiay()*10+data.getTui()*5));
        synchronized(data){
            stop();
        }
    }
}
