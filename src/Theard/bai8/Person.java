package Theard.bai8;

public class Person extends Thread {
    private Data d;

    public Person(Data d) {
        this.d = d;
    }

    @Override
    public void run() {
        synchronized (d) {
            while (d.getIndex()!=3 && d.isCheck()) {
                try {
                    d.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Wow big Dog, run, run run....");
            for (int i = 10; i < 50; i += 10) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
            System.out.println("t3 stop");
            synchronized (d) {
                stop();
            }
        }
    }
}