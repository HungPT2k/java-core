/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.bai9;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        Data d=new Data();
        Input t1=new Input(d);
        Output t2=new Output(d);
        t1.start();
        t2.start();
    }
}
