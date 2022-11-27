/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.Bai37;

/**
 *
 * @author hanh
 */
public class Dapan {
    private String traloi;
    private boolean dapan;
    public Dapan(String s){
        String[] strings=s.split("/");
        if(strings[1].equals("F")){
            this.dapan=false;
        }
        else{
            this.dapan=true;
        }
        this.traloi=strings[0];
    }
    public boolean getDapan(){
        return this.dapan;
    }
    public String getTraloi(){
        return this.traloi;
    }
}
