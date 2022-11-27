package Kiem_tra_2;

import java.util.Calendar;
import java.util.Scanner;

public class Oto  extends PTGT implements Tinh_gia {
    private String Motor;
    private int Slot;

    public Oto(){

    }
    public Oto(String code, String brand, String year, String price, String color, String motor, int slot) {
        super(code, brand, year, price, color);
        Motor = motor;
        Slot = slot;
    }

    public String getMotor() {
        return Motor;
    }

    public void setMotor(String motor) {
        Motor = motor;
    }

    public int getSlot() {
        return Slot;
    }

    public void setSlot(int slot) {
        Slot = slot;
    }

    @Override
    public double getGia() {
        Calendar c=Calendar.getInstance();
        int y=c.get(Calendar.YEAR);
        if((y-Integer.parseInt(super.getYear())) >= 2)
        {
            return  Double.parseDouble(super.getPrice())*0.85;
        }
        else return  Double.parseDouble(super.getPrice());
    }

    @Override
    public String toString() {
        return super.getCode()+' '+super.getBrand()+' '+super.getYear()+' '+super.getPrice()+' '+super.getColor()+' '+getMotor()+' '+getSlot();
    }
}
