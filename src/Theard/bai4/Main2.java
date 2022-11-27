/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.bai4;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main2 {
    public static void main(String[] args) {
        ChuChay c=new ChuChay();
        Thread t=new Thread(c);
        t.start();
        Scanner sc=new Scanner(System.in);
        String in=null;
        while(sc.hasNext() && !(in=sc.next()).equalsIgnoreCase("exit")){
            if(in.equalsIgnoreCase("c"))
                t.suspend();
            else
                t.resume();
        }
        t.stop();
        sc.close();
    }
}
