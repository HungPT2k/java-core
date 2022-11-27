/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.bank;

/**
 *
 * @author ADMIN
 */
public class Thread1 extends Thread{
    String name;
    long value;
    Account a;

    public Thread1(String name, long value, Account a) {
        this.name = name;
        this.value = value;
        this.a = a;
    }
    public void run(){
        a.withdraw(name, value);
    }
}
