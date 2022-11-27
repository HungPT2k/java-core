/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.bai3_3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hanh
 */
public class Thread3 extends Thread{
    private Data data;
    public Thread3(Data data){
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
                if(data.getChuyen()==3){
                    String ten=data.getTenSinhVien().get(data.getTenSinhVien().size()-1);
                    String diem=data.getDiem().get(data.getDiem().size()-1);
                    String[] diemtp=diem.split(" ");
                    Double diemtb=(Double.parseDouble(diemtp[0])+Double.parseDouble(diemtp[1])+Double.parseDouble(diemtp[2]))/3;
                    if(diemtb<5){
                        System.out.println(ten+" xep loai yeu");
                    }
                    else if(diemtb<6.5){
                        System.out.println(ten+" xep loai trung binh");
                    }
                    else if(diemtb<8){
                        System.out.println(ten+" xep loai kha");
                    }
                    else{
                        System.out.println(ten+" xep loai gioi");
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
