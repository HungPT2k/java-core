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
public class Data {
    private Cauhoi cauhois;
    private int chuyen;
    public Data(){
        this.chuyen=1;
    }
    public void setCauhoi(String cauhoi){
        cauhois=new Cauhoi(cauhoi);
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
