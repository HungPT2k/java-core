/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.bai11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Thread1 extends Thread{
    Data d;

    public Thread1(Data d) {
        this.d = d;
    }
    public void run(){
        try{
            sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        BufferedReader br=null;
        try{
            br=new BufferedReader(new FileReader("src/Theard/bai11/so.txt"));
            synchronized(d){
                String line=null;
                while((line=br.readLine())!=null){
                    int num=Integer.parseInt(line.trim());
                    System.out.println("\33[31m"+num);
                    d.setNum(num);
                    if(num%2==0)
                        d.setIndex(2);
                    else
                        d.setIndex(3);
                    d.notifyAll();
                    d.wait();
                    sleep(1000);
                }
                d.setCheck(false);
                br.close();
            }
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("T1 STOP");
        synchronized(d){
            d.notifyAll();
            stop();
        }
            
        }
    }
