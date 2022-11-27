
package Theard.bank;


public class Main {
    public static void main(String[] args) {
        Account a=new Account();
        Thread1 h=new Thread1("Husband", 3500, a);
        h.start();
        Thread2 w=new Thread2("wife", 1000, a);
        w.start();
    }
}
