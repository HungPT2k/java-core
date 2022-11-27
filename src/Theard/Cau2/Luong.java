/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.Cau2;

public class Luong {
    private int ma;
    private String hoten;
    private double luongcb;
    private int heso;
    private double thue;

    public Luong(int ma, String hoten, int luongcb, int heso, double thue) {
        this.ma = ma;
        this.hoten = hoten;
        this.luongcb = luongcb;
        this.heso = heso;
        this.thue = thue;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getLuongcb() {
        return luongcb;
    }

    public void setLuongcb(double luongcb) {
        this.luongcb = luongcb;
    }

    public int getHeso() {
        return heso;
    }

    public void setHeso(int heso) {
        this.heso = heso;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }


}
