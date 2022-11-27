/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.ex1;


public class RunnableDemo implements Runnable{
    private String name;

    public RunnableDemo(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
        System.out.println(name+" START");
        for (int i = 0; i < 6; i++) {
            System.out.println(name+": "+i);
            try{
               Thread.sleep(1000);//1s
            }catch(InterruptedException e){
                System.out.println(e);
            }   
        }
        System.out.println(name+" STOP");
    }
    
}
