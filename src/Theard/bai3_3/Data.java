/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.bai3_3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hanh
 */
public class Data {
    private int chuyen;
    private String sinhvien;
    private List<String> tenSinhVien;
    private List<String> diem;
    public Data(){
        this.chuyen=1;
        tenSinhVien=new ArrayList<String>();
        diem=new ArrayList<String>();
    }
    public void setChuyen(int chuyen){
        this.chuyen=chuyen;
    }
    public int getChuyen(){
        return this.chuyen;
    }
    public void chuyenSinhVien(String sinhvien){
        this.sinhvien=sinhvien;
    }
    public void themSinhVien(){
        String[] string=this.sinhvien.split("; ");
        tenSinhVien.add(string[0]);
        diem.add(string[1]);
    }
    public List<String> getTenSinhVien(){
        return this.tenSinhVien;
    }
    public List<String> getDiem(){
        return this.diem;
    }
}
