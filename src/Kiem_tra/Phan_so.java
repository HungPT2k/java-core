package Kiem_tra;


import java.math.BigInteger;
import java.util.Scanner;

public class Phan_so  {
    private long Tu;
    private long Mau;
    private long Tu2;
    private long Mau2;
    public Phan_so ()
    {

    }

    public Phan_so(long tu, long mau, long tu2, long mau2) {
        Tu = tu;
        Mau = mau;
        Tu2 = tu2;
        Mau2 = mau2;
    }

    public static String Phanso(long tu , long mau,long tu2 ,long mau2) {
        long k,Mau;
        k = (mau*mau2)/USCLN(mau, mau2);
        Mau=k;
        tu = (tu*(k/mau) + tu2*(k/mau2));
        k=USCLN(Mau,tu);
        tu/=k;
        Mau/=k;
        return tu+"/"+Mau;
    }
    public static long USCLN(long a, long b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }

    public long getTu2() {
        return Tu2;
    }

    public void setTu2(long tu2) {
        Tu2 = tu2;
    }

    public long getMau2() {
        return Mau2;
    }

    public void setMau2(long mau2) {
        Mau2 = mau2;
    }

    public long getTu() {
        return Tu;
    }
    public void setTu(long tu) {
        Tu = tu;
    }

    public long getMau() {
        return Mau;
    }

    public void setMau(long mau) {
        Mau = mau;
    }

    @Override
    public String toString() {
        return  Phanso(Tu,Mau,Tu2,Mau2)+" ";

    }

    public static void Tong_thuong_2_Phan_so()
    {
        long tu,mau,tu2,mau2;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap tu , mau phan so P: ");
        tu = input.nextLong();
        mau = input.nextLong();
        System.out.println("Nhap tu , mau phan so Q: ");
        tu2 = input.nextLong();
        mau2 = input.nextLong();
       Phan_so s = new Phan_so(tu,mau,tu2,mau2)   ;
        System.out.println("Tong 2 phan so la: ");
        System.out.println(s.toString());
        System.out.println("Thuong 2 phan so la: ");
        tu=s.getTu()*s.getMau2();
        mau=s.getMau()*s.getTu2();
        long m=USCLN(tu,mau);
        tu=tu/m;
        mau=mau/m;
        System.out.println(tu+"/"+mau);
    }



}



