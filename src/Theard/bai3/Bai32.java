/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.bai3;

/**
 *
 * @author hanh
 */
public class Bai32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Data data=new Data();
        Thread1 thread1=new Thread1(data);
        Thread2 thread2=new Thread2(data);
        Thread3 thread3=new Thread3(data);
        thread1.start();
        thread2.start();
        thread3.start();
    }
    
}