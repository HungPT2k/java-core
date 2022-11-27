package Kiem_tra_2;

import java.util.Calendar;
import java.util.Scanner;

public class Xe_may extends PTGT implements Tinh_gia{
    private int Power;

    public Xe_may() {
    }

    public Xe_may(String code, String brand, String year, String price, String color, int power) {
        super(code, brand, year, price, color);
        Power = power;
    }

    public int getPower() {
        return Power;
    }

    public void setPower(int power) {
        Power = power;
    }

    @Override
    public double getGia() {
        Calendar c=Calendar.getInstance();
        int y=c.get(Calendar.YEAR);
        if((y-Integer.parseInt(super.getYear())) >= 2)
        {
            return  Double.parseDouble(super.getPrice())*0.9;
        }
        else return  Double.parseDouble(super.getPrice());
    }
    @Override
    public String toString() {
        return super.getCode()+' '+super.getBrand()+' '+super.getYear()+' '+super.getPrice()+' '+super.getColor()+' '+getPower();
    }
}
