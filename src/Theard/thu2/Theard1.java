package Theard.thu2;

import Theard.bai11.Data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Theard1 extends Thread{
    private Data1 d;

    public Theard1(Data1 d) {
        this.d = d;
    }
    public void run(){
        BufferedReader br=null;
        try{
            br=new BufferedReader(new FileReader("src/Theard/thu2/bai3.txt"));
            synchronized(d){
                String line=null;
                while((line=br.readLine())!=null){
                    String[] w=line.split("[:]");
                    d.setS1(w[0]);
                    d.setS2(w[1]);
                    d.setIndex(2);
                    System.out.println("Đọc "+line);
                    d.notifyAll();
                    d.wait();
                    sleep(500);
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

