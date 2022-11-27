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
public class Main {
    public static void main(String[] args) {
        ThreadDemo t1=new ThreadDemo("Gio moi");
        ThreadDemo t2=new ThreadDemo("Mua dong");
        ThreadDemo t3=new ThreadDemo("Mua ha");
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        
        t3.start();
    }
}
