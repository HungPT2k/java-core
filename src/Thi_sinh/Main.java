package Thi_sinh;

import java.util.Scanner;
public class Main {
    public static void main( String[] args) {

        Thi_sinh[] thi_sinh = new Thi_sinh[10];
        thi_sinh[0] = getInFo();
        System.out.println(thi_sinh[0].toString());
    }
    public static Thi_sinh getInFo()
    {
            Thi_sinh s = null;
    String name , date ;
    float d1 , d2 ,d3;
            Scanner input = new Scanner(System.in);
            name = input.nextLine();
            date = input.next();
            d1 = input.nextFloat();
            d2 = input.nextFloat();
            d3 = input.nextFloat();
        s = new Thi_sinh(name , date , d1,d2,d3)   ;
        return s;
    }

}

