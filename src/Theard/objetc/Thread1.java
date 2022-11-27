package Theard.objetc;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Thread1 extends Thread{
    final Data d;

    public Thread1(Data d) {
        this.d = d;
    }
    public void run(){
        try{
            sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        BufferedReader br;
        try{
            br=new BufferedReader(new FileReader("src/Bai3_KiemTra/sinhvien.txt"));
            synchronized(d){
                String line;
                while((line=br.readLine())!=null){
                    d.setLine(line.trim());
                    d.setIndex(1);
                    d.notifyAll();
                    d.wait();
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
