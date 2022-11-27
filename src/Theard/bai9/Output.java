/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.bai9;

import java.util.Scanner;



/**
 *
 * @author ADMIN
 */
public class Output extends  Thread{
    private Data d;

    public Output(Data d) {
        this.d = d;
    }
    public void run(){
        while(d.isRunning()){
            synchronized(d){
                try{
                    d.wait();
                }catch(InterruptedException e){
                    System.out.println(e);
                }
                int num=d.get();
                if(num==0){
                    d.setRunning(false);
                    d.notify();
                    break;
                }
                int num1=d.get();
                System.out.println("tong:"+(num+num1));
                d.setIndex(1);
                d.notify();
                
            }
        }
    }
}
