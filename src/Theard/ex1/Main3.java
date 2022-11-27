/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.ex1;

/**
 *
 * @author ADMIN
 */
public class Main3 {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        
        MyThread t2=new MyThread();
        t1.start();
        try{
        t1.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        t2.start();
        System.out.println(t1.getName()+":"+t1.getState());
        System.out.println(t2.getName()+":"+t2.getState());
    }
 
}
