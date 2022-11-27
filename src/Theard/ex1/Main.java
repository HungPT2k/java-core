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
public class Main {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        System.out.println(t.getState());
    }
}
