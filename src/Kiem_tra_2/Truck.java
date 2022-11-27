package Kiem_tra_2;

import java.util.Calendar;
import java.util.Scanner;

public class Truck extends PTGT implements Tinh_gia{
    private int Weight;

    public Truck(){

    }

    public Truck(String code, String brand, String year, String price, String color, int weight) {
        super(code, brand, year, price, color);
        Weight = weight;
    }
    public void show_Truck(){
        show_PTGT();
        System.out.print(getWeight());
        System.out.println();
    }
    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    @Override
    public double getGia() {
        Calendar c=Calendar.getInstance();
        int y=c.get(Calendar.YEAR);
        if((y-Integer.parseInt(super.getYear())) >= 2)
        {
            return  Double.parseDouble(super.getPrice())*0.8;
        }
        else return  Double.parseDouble(super.getPrice());
    }
    @Override
    public String toString() {
        return super.getCode()+' '+super.getBrand()+' '+super.getYear()+' '+super.getPrice()+' '+super.getColor()+' '+getWeight();
    }
}
