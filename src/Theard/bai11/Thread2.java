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
public class Thread2 extends Thread{
    Data d;

    public Thread2(Data d) {
        this.d = d;
    }
    public void run(){
        while(true){
            synchronized(d){
                d.notifyAll();
                while(d.getIndex()!=2 && d.isCheck()){
                    try{
                     d.wait();
                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
                }
                if(!d.isCheck())
                    break;
                int num=d.getNum();
                System.out.print("Uoc so cua "+num+":");
                for (int i = 2; i <num ; i++) {
                    if(num%i==0)
                        System.out.print(i+",");
                }
                System.out.println();
                d.setIndex(1);
            }
        }
        System.out.println("T2 STOP");
        synchronized(d){
            stop();
        }
    }
}
