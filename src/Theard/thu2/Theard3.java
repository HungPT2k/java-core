package Theard.thu2;

public class Theard3 extends Thread {
    private Data1 d;

    public Theard3(Data1 d) {
        this.d = d;
    }

    @Override
    public void run() {
            synchronized (d) {
                d.notifyAll();
                while (d.getIndex() != 3 && d.isCheck()) {
                    try {
                        d.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Điểm số của bạn là "+d.getDiem());
            }
            synchronized (d){
                stop();
            }
        }
    }
