package OOP;

import java.util.Scanner;

public class HCN {
  private  double with;
    private double height;
  private   String color;

    public void Rectange()
    {
        this.with=1;
        this.height=1;
    }
    public  HCN(double with, double height, String color) {
        this.with = with;
        this.height = height;
        this.color = color;
    }
    public String Incolor(String c)
    {
        c=c.toUpperCase();
        char ch=c.charAt(0);
        c=c.toLowerCase();
        c= String.valueOf(ch+c.substring(1));
        return c;
    }

    public int findArea(){
        return (int)(with*height);
    }
    public int findPerimeter()
    {
        return (int)((with+height)*2);
    }

    public double getWith() {
        return with;
    }

    public void setWith(double with) {
        this.with = with;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public String toString() {
        return findPerimeter() +  " " + findArea() + " "+ Incolor(color);
    }
    public static void main( String[] args) {
        HCN[] hcn = new HCN[10];
        hcn[0] = getInFo();
        if(hcn[0].with <= 0 || hcn[0].height <= 0)
        {
            System.out.println("INVALID");
        }
      else {
            System.out.println(hcn[0].toString());
        }
    }
    public static HCN getInFo()
    {
        HCN s = null;
        String color;
        int rong ,dai;
        Scanner input = new Scanner(System.in);
        rong =input.nextInt();
        dai = input.nextInt();
        color = input.next();
       s= new  HCN(rong,dai,color)   ;
        return s;
    }
}
