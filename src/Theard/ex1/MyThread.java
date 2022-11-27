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
public class MyThread extends Thread{
    public void run(){
        DemoBlocked.common();
    }
}
