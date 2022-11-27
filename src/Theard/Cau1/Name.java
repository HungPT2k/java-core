/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.Cau1;

public class Name extends Thread{
    public synchronized void run(){
        String[] b={"To An An","Bui Thi Ly","Tran Quang Minh","Nguyen Hoai Thuong",
                "Phan Thi Ly","Nguyen Quoc Tuan","Nguyen Quan Huy"};
        int i=0;
        while(i<b.length){
            System.out.println(b[i]);
            try {
                sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            i++;
        }
    }
}
