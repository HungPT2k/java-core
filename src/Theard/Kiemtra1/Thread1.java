/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.Kiemtra1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Thread1 extends Thread{
    Data2 d;

    public Thread1(Data2 d) {
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
            br=new BufferedReader(new FileReader("src/Theard/Kiemtra1/In.txt"));
            synchronized(d){
                String line=null;
                int stt=0;
                while((line=br.readLine())!=null){
                   stt++;
                    System.out.println("Doc cau "+stt);
                    String w[]=line.split("[:]");
                   String A[]= w[1].split("[;]");
                   String s1="",s2="";
                   for( int i=0 ; i<A.length;i++)
                   {
                       String B[]=A[i].split("[/]");
                      s1+=B[0];
                      s2+=B[1];
                   }
                        d.setIndex(2);
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
