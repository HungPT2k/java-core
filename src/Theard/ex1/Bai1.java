/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class Bai1 {
    public static void main(String[] args) {
        new Thread(){
            public void run(){
                SimpleDateFormat f=new SimpleDateFormat("hh:mm:ss");
                while(true){
                    System.out.println("\33[31m"+f.format(new Date()));
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
                }
            }
        }.start();
    }
}
