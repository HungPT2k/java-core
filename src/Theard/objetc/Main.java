package Theard.objetc;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<SinhVien> list=new ArrayList();
        Data d = new Data();
        Thread1 t1=new Thread1(d);
        Thread2 t2=new Thread2(list,d);
        Thread3 t3=new Thread3(list,d);
        t1.start();
        t2.start();
        t3.start();
    }
}
