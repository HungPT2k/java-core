package Theard.thu2;

public class Main {
    public static void main(String[] args) {
        Data1 d = new Data1();
        Theard1 t1 = new Theard1(d);
        Theard2 t2 = new Theard2(d);
        Theard3 t3 = new Theard3(d);
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();

    }
}