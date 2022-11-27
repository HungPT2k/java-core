/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.bai3;

/**
 *
 * @author hanh
 */
public class Data {
    private int tui,giay,chuyen;
    public Data(){
        this.tui=0;
        this.giay=0;
        this.chuyen=1;
    }
    public void setChuyen(int chuyen){
        this.chuyen=chuyen;
    }
    public int getChuyen(){
        return this.chuyen;
    }
    public void setTui(){
        this.tui+=1;
    }
    public void setGiay(){
        this.giay+=1;
    }
    public int getTui(){
        return this.tui;
    }
    public int getGiay(){
        return this.giay;
    }
}
