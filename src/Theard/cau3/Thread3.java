package Theard.cau3;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread3 extends Thread{
    private Data data;
    public Thread3(Data data){
        this.data=data;
    }
    @Override
    public void run(){
        Scanner sc=new Scanner(System.in);
         int diem=0;
        while(true){
            synchronized(data){
                if(data.getChuyen()==4){
                System.out.println("Diem cua ban la:"+diem);
                data.notifyAll();
                break;
            }
                if(data.getChuyen()==3){
                System.out.print(data.getCauhoi());
                System.out.print("\nChon dap an:");
                int a=Integer.parseInt(sc.nextLine());
                if(data.getCauhoi().getDapan()==a){
                    diem+=1;
                }
                data.setChuyen(1);
                data.notifyAll();
            }
                try {
                    data.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
}
