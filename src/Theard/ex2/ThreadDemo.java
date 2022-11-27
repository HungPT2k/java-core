/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.ex2;

/**
 *
 * @author ADMIN
 */
public class ThreadDemo extends Thread{

    public ThreadDemo(String name) {
        super(name);
    }

    public void run(){
        System.out.println(this.getName()+" START");
        for (int i = 0; i < 6; i++) {
            System.out.println(this.getName()+": "+i);
            try{
               sleep(1000);//1s
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println(this.getName()+" STOP");
    }

}
