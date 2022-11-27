/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.bai4;

/**
 *
 * @author ADMIN
 */
public class ChuChay implements Runnable{
    public boolean running;

    public ChuChay() {
       running=true;
    }
    public void stop(){
        running=false;
    }
    @Override
    public void run() {
        String line="HOC VIEN CONG NGHE BUU CHINH VIEN THONG - NHOM 7";
                while(running){
                    line=line.charAt(line.length()-1)+line.substring(0,line.length()-1);
                    System.out.println(line);
                    try{
                Thread.sleep(300);
            }catch(InterruptedException e){
                System.out.println(e);
            }
                }
    }
    
}
