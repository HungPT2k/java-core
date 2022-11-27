package Theard.bai8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock extends Thread {
    private Data d;

    public Clock(Data d) {
        this.d = d;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (d) {
                for (int i = 0; i < 5; i++) {
                    SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss");
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("\33[31m" + f.format(new Date()));
                    d.setIndex(2);
                    d.notifyAll();
                    try {
                        d.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                d.setCheck(false);
                d.setIndex(3);
                break;
            }
        }
        synchronized (d)
        {
        d.notifyAll();
                stop();
            }
        }
    }
