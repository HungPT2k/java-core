
import java.math.BigInteger;
import java.util.Scanner;

public class Tong_phan_so  {
    private long Tu;
    private long Mau;
    private long Tu2;
    private long Mau2;
    public Tong_phan_so ()
    {

    }

    public Tong_phan_so(long tu, long mau, long tu2, long mau2) {
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

    public static void main(String[] args) {

        Tong_phan_so[] phan_so = new Tong_phan_so  [10];
        phan_so [0] = getInFo();
        System.out.println(phan_so[0].toString());
    }
    public static Tong_phan_so getInFo()
    {
        Tong_phan_so   s = null;
        long tu,mau,tu2,mau2;
        Scanner input = new Scanner(System.in);
        tu = input.nextLong();
        mau = input.nextLong();
        tu2 = input.nextLong();
        mau2 = input.nextLong();
        s = new Tong_phan_so(tu,mau,tu2,mau2)   ;
        return s;
    }

}


