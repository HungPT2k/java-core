/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.cau3;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread2 extends Thread{
    private Data data;
    public Thread2(Data data){
        this.data=data;
    }
    @Override
    public void run(){
        while(true){
            synchronized(data){
               
            if(data.getChuyen()==4){
                data.notifyAll();
                break;
            }
            if(data.getChuyen()==2){
                data.setCauhoi();
                data.setChuyen(3);
                data.notifyAll();
            }
            try {
                data.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
    }
}
