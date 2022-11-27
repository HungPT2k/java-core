package Theard;


public class  test2 extends Thread {
    public synchronized void run() {
        for (int i=0 ;i<4;i++)
            System.out.println("Theard 3");
        }
    }


