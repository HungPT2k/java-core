
import java.math.BigInteger;
import java.util.Scanner;

public class Phan_so  {
    private long Tu;
   private long Mau;
    public Phan_so ()
    {

    }
    public Phan_so (long tu, long mau) {
        this.Tu = tu;
        this.Mau = mau;
    }
    public static long Phanso(long tu , long mau) {
        long k;
        k = USCLN(tu, mau);
        return k;
    }
    public static long USCLN(long a, long b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
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
        return  Tu/Phanso(getTu(),getMau()) +"/"+Mau/Phanso(getTu(),getMau());

    }

    public static void main(String[] args) {

        Phan_so[] phan_so = new Phan_so  [10];
        phan_so [0] = getInFo();
        System.out.println(phan_so[0].toString());
    }
    public static Phan_so  getInFo()
    {
        Phan_so   s = null;
       long tu,mau;
        Scanner input = new Scanner(System.in);
        tu = input.nextLong();
        mau = input.nextLong();
        s = new Phan_so(tu,mau)   ;
        return s;
    }

}


