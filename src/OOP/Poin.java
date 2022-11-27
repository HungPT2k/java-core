package OOP;

import java.lang.Math;
import java.util.Scanner;

public class Poin {
    private double x;
    private double y;
    public Poin()
    {

    }

    public Poin(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public  String distance(Poin p2)
    {
        return String.format("%.4f", Math.sqrt((Math.pow((getX()-p2.getX()),2)) +  ( Math.pow((getY()-p2.getY()),2))));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static void main(String[] args) {
        int t;
        Scanner input = new Scanner(System.in);
        t= input.nextInt();
       for( int i=0 ; i<t ; i++)
       {  Poin p1 = new Poin();
           Poin p2 = new Poin();
           p1.setX(input.nextDouble());
           p1.setY(input.nextDouble());
           p2.setX(input.nextDouble());
           p2.setY(input.nextDouble());

           System.out.println(p1.distance(p2));
        }
    }
  /*  public static Poin nhap()
    {   Poin s = null;
        double x,y;
        Scanner input = new Scanner(System.in);
        x = input.nextDouble();
        y = input.nextDouble();
        s = new Poin(x,y);
        return s;

    }*/

}


