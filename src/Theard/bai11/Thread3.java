/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.bai11;

/**
 *
 * @author ADMIN
 */
public class Thread3 extends Thread{
    Data d;

    public Thread3(Data d) {
        this.d = d;
    }
    public void run(){
        while(true){
            synchronized(d){
                d.notifyAll();
                while(d.getIndex()!=3 && d.isCheck()){
                    try{
                     d.wait();
                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
                }
                if(!d.isCheck())
                    break;
                int num=d.getNum();
                System.out.println("Binh phuong cua "+num+": "+(num*num));
                d.setIndex(1);
            }
        }
        System.out.println("T3 STOP");
        synchronized(d){
            stop();
        }
    }
}
