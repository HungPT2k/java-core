package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quan_li_bai_tap_nhom {
    private String MaSv;
    private String Name;
    private String Phone;
    private int stt;

    public Quan_li_bai_tap_nhom(String maSv, String name, String phone, int stt ) {
        MaSv = maSv;
        Name = name;
        Phone = phone;
        this.stt = stt;
    }
    public String getMaSv() {
        return MaSv;
    }

    public void setMaSv(String maSv) {
        MaSv = maSv;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }


    @Override
    public String toString() {
        return
                MaSv + ' ' +
                        Name + ' ' +
                        Phone + ' '
                ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();
       int tt=sc.nextInt();
       sc.nextLine();
        Quan_li_bai_tap_nhom[] a = new Quan_li_bai_tap_nhom[n];
        int k = 0;
        while (n-- > 0) {
            String masv=sc.nextLine();
            String name=sc.nextLine();
            String phone=sc.nextLine();
            int st=Integer.parseInt(sc.nextLine());
            a[k]=new Quan_li_bai_tap_nhom(masv,name,phone,st);
            k++;
        }
        ArrayList<String> Str = new ArrayList<String>();
        for( int i=0; i<tt;i++)
        {  
          String   ss=sc.nextLine();
          Str.add(ss);
        }
        int t=Integer.parseInt(sc.nextLine());
        while (t-- >0)
        {
            int st= Integer.parseInt(sc.nextLine());
            System.out.println("DANH SACH NHOM " + st +": ");
            for (int j=0 ; j<k ;j++) {
                if(a[j].getStt()==st) System.out.println(a[st-1]);
            }
            System.out.println("Bai tap dang ky: "+Str.get(st-1));

        }
    }
}