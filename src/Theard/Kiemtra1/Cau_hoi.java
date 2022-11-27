package Theard.Kiemtra1;

import java.util.ArrayList;

public class Cau_hoi {
    private int ma;
    private String noid;
    private ArrayList<Phuong_an> Pa;

    public Cau_hoi(int ma, String noid, ArrayList<Phuong_an> pa) {
        this.ma = ma;
        this.noid = noid;
        Pa = pa;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getNoid() {
        return noid;
    }

    public void setNoid(String noid) {
        this.noid = noid;
    }

    public ArrayList<Phuong_an> getPa() {
        return Pa;
    }

    public void setPa(ArrayList<Phuong_an> pa) {
        Pa = pa;
    }
}
