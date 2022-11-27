package OOP;

import java.util.Scanner;

public class Doi_tuong_sinh_vien_1 {
    private String Name;
    private String MaSv;
    private String Date;
    private float d1;

    public Doi_tuong_sinh_vien_1() {

    }

    public Doi_tuong_sinh_vien_1(String Name, String MaSv, String Date, float d1) {
        this.Name = "";
        this.Date = "";
        this.MaSv = "";
        this.d1 = 0;
    }

    public String getTong() {
        String[] st = Date.split("/");
        if (st[0].length() < 2) {
            st[0] = "0" + st[0];
        }
        if (st[1].length() < 2) {
            st[1] = "0" + st[1];
        }
        Date = st[0] + '/' + st[1] + '/' + st[2];
        return Date;
    }

    public String getDiem() {
        return String.format("%.2f", this.d1);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMaSv() {
        return MaSv;
    }

    public void setMaSv(String maSv) {
        MaSv = maSv;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public float getD1() {
        return d1;
    }

    public void setD1(float d1) {
        this.d1 = d1;
    }


    @Override
    public String toString() {
        return " " + Name + ' ' + MaSv.toUpperCase() + ' ' + getTong() + ' ' + getDiem();
    }

    public static void main(String[] args) {
        int x = 0, t;
        Scanner input = new Scanner(System.in);
        t = Integer.parseInt(input.nextLine());
        while (t > x) {
            Doi_tuong_sinh_vien_1 thi_sinh = new Doi_tuong_sinh_vien_1();
            thi_sinh.setName(input.nextLine());
            thi_sinh.setMaSv(input.nextLine());
            thi_sinh.setDate(input.nextLine());
            thi_sinh.setD1(Float.parseFloat(input.nextLine()));
            if (x < 9) System.out.print("B20DCCN00" + (x + 1));
            else System.out.print("B20DCCN0" + (x + 1));
            System.out.println(thi_sinh.toString());
            x++;
        }
    }
}
