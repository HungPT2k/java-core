package Theard.bai5;

import java.util.Scanner;

public class Theard1 extends Thread {
    private Data d;
    int dem = 0;
    public Theard1(Data d) {
        this.d = d;
    }

    @Override
    public void run() {
        System.out.print("Nhập chuỗi màu :");
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        S = S.trim().toLowerCase();
        S = S.replaceAll("\\s+", " ");
        String[] w = S.split("\\s");
        d.setRunning(true);
        while (d.isRunning()) {
            for (int i = 0; i < w.length; i++) {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                d.Color(w[i]);
                dem += 1;
                if(dem==10)
                {
                    d.setRunning(false);
                    break;
                }
            }
        }
    }
}
