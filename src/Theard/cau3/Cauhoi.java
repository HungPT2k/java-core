/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.cau3;

import com.sun.xml.internal.ws.message.StringHeader;
import java.util.ArrayList;
import java.util.List;

public class Cauhoi {
    private List<Integer> hesos;
    private int bac,x,dapan;
    public Cauhoi(String s){
        hesos=new ArrayList<Integer>();
        String[] strings=s.split("/");
        this.bac=Integer.parseInt(strings[0].trim());
        this.x=Integer.parseInt(strings[2].trim());
        this.dapan=Integer.parseInt(strings[3].trim());
        String[] heso=strings[1].trim().split(" ");
        for(String i :heso){
            hesos.add(Integer.parseInt(i));
        }
    }
    public int getDapan(){
        return this.dapan;
    }
    @Override
    public String toString(){
        int i=0;
        String s="";
        for(int j=this.bac;j>1;j--){
            s=s+String.valueOf(this.hesos.get(i))+"*x^"+String.valueOf(j)+" ";
            i+=1;
        }
        s=s+String.valueOf(this.hesos.get(i))+"*x "+String.valueOf(this.hesos.get(i+1))+" Tinh p("+String.valueOf(this.x)+")=?";
        return s;
    }
}
