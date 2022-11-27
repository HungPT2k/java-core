package Theard.bai8;

public class Dog extends Thread {
    private Data d;

    public Dog(Data d) {
        this.d = d;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (d) {
                if(!d.isCheck()) break;
                d.notifyAll();
                while (d.getIndex() != 2 && d.isCheck())
                    try {
                        d.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Watching!! Watching!!");
                d.setIndex(1);
            }
        }
        synchronized (d)
        {
            System.out.println("t2 stop");
            stop();
        }
    }
}