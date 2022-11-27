/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.Bai37;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hanh
 */
public class Thread2 extends Thread{
    private Data data;
    public Thread2(Data data){
        this.data=data;
    }
    @Override
    public void run(){
        Scanner sc=new Scanner(System.in);
         int diem=0;
        while(true){
            synchronized(data){
               
            if(data.getChuyen()==3){
                System.out.println("Diem cua ban la:"+diem);
                data.notifyAll();
                break;
            }
            if(data.getChuyen()==2){
                System.out.print("Cau hoi: "+data.getCauhoi().getNoidung()+"?\n");
                System.out.print("Cac dap an:");
                for(Dapan i : data.getCauhoi().getDapans()){
                    System.out.print(i.getTraloi()+" ");
                }
                System.out.print("\nNhap dap an:");
                int a=Integer.parseInt(sc.nextLine());
                for(Dapan i : data.getCauhoi().getDapans()){
                    if(Integer.parseInt(i.getTraloi())==a && i.getDapan()==true){
                        diem+=1;
                    }
                }
                data.setChuyen(1);
                data.notifyAll();
            }
            try {
                data.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
        System.out.println("Thread2 end");
    }
}
