/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.Cau1;

/**
 *
 * @author VanTrung
 */
public class Address extends Thread{

    public synchronized void run(){
        String[] a={"Thanh Hoa","Ha Noi","Thanh Hoa","Ha Noi",
                "Nam Dinh","Thai Binh","Hai Phong"};
        int i=0;
        while(i<a.length){
            System.out.println(a[i]);
            try {
                sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            i++;
        }
    }
}
