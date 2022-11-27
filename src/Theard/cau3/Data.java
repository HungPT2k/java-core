/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.cau3;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private String chuyencauhoi;
    private Cauhoi cauhois;
    private int chuyen;
    public Data(){
        this.chuyen=1;
    }
    public void setChuyencauhoi(String chuyencauhoi){
        this.chuyencauhoi=chuyencauhoi;
    }
    public String getChuyencauhoi(){
        return this.chuyencauhoi;
    }
    public void setCauhoi(){
        cauhois=new Cauhoi(chuyencauhoi);
    }
    public Cauhoi getCauhoi(){
        return this.cauhois;
    }
    public void setChuyen(int chuyen){
        this.chuyen=chuyen;
    }
    public int getChuyen(){
        return this.chuyen;
    }
}
