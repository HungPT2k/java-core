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
public class Main1 {
    public static void main(String[] args) {
        ChuChay c=new ChuChay();
        Thread t=new Thread(c);
        t.start();
        Scanner sc=new Scanner(System.in);
        String in=null;
        if((in=sc.next()).equalsIgnoreCase("c"))
            c.stop();
    }
}
