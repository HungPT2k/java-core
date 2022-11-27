package Theard.bai8;

public class Main {
    public static  void main(String [] args)
    {
        Data d = new Data();
        Clock t1=new Clock(d);
        Dog t2=new Dog(d);
        Person t3=new Person(d);
        t1.start();
        t2.start();
        t3.start();
    }
}
