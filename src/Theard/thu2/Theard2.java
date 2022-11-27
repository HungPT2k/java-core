package Theard.thu2;

import java.util.Scanner;

public class Theard2 extends Thread {
    private Data1 d;

    public Theard2(Data1 d) {
        this.d = d;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (d) {
               d.notifyAll();
                while (d.getIndex() != 2 && d.isCheck()) {
                    try {
                        d.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(!d.isCheck()) break;
                int x=0;
                char t =  (d.getS2().charAt(d.getS2().length() - 2));
                if (t == '0') x = d.Min(d.getS1());
                else if (t == '1') x = d.Max(d.getS1());
                else x = d.Sum(d.getS1());
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhâp kết quả của bạn: ");
                int a = sc.nextInt();
                if (a == x) d.setDiem();
                d.setIndex(1);
            }
        }
        synchronized (d){
           System.out.println("T2 Stop");
            d.notifyAll();
            stop();
        }
        d.setIndex(3);
    }
}