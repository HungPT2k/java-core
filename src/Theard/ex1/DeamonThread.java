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
public class DeamonThread extends Thread{
    public void run(){
        while(true){
            System.out.println("I am a servicer");
            try{
                sleep(200);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    @Override
    public void finalize(){
        //don dep
    }
}
