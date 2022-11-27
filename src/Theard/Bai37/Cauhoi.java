/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.Bai37;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hanh
 */
public class Cauhoi {
    private List<Dapan> dapans;
    private int ma;
    private String noidung;
    public Cauhoi(String s){
        String[] strings=s.split(":");
        this.noidung=strings[0];
        String[] listdapan=strings[1].trim().split(";");
        dapans=new ArrayList<Dapan>();
        for(String s1:listdapan){
            dapans.add(new Dapan(s1));
        }
    }
    public List<Dapan> getDapans(){
        return this.dapans;
    }
    public String getNoidung(){
        return this.noidung;
    }
}
