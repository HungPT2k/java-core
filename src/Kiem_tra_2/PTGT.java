package Kiem_tra_2;

import java.util.Scanner;

public class PTGT {
    private String Code;
    private String Brand;
    private String Year;
    private String Price;
    private String Color;

    public PTGT(){

    }

    public PTGT(String code, String brand, String year, String price, String color) {
        Code = code;
        Brand = brand;
        Year = year;
        Price = price;
        Color = color;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void show_PTGT(){
        System.out.print(getCode()+' '+getBrand()+' '+getPrice()+' '+getColor()+' '+getYear()+' ');
    }
}
