import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.SimpleFormatter;

public class Test{
    public static void main(String[] args) {
        Date date = new Date();
        Scanner sc = new Scanner(System.in);
        String dd=sc.nextLine();
        String w[]=dd.split("[;]");
        int x=0,y=0;
        int z=0;
        w[2]=w[2].trim();
        w[3]=w[3].trim();
        w[4]=w[4].trim();
        x=Integer.valueOf(w[2]);
        y=Integer.valueOf(w[3]);
        z=Integer.valueOf(w[4]);
        int s;
        s=(x*y)*(1-z);
        System.out.println(w[0]+"; "+w[1]+"; "+s);
    }
}