/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.Cau2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilterReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader br=null;
        List<Luong> list=new ArrayList<>();
        try {
            br=new BufferedReader(new FileReader("src/Theard/Cau2/In.txt"));
            String line=null;
            while((line=br.readLine())!=null){
                line=line.trim();
                String[] w=line.split(";\\s*");
                list.add(new Luong(Integer.parseInt(w[0]),
                        w[1],Integer.parseInt(w[2]),Integer.parseInt(w[3]),
                        Double.parseDouble(w[4])));
            }
            br.close();
            PrintWriter p =new PrintWriter("src/Theard/Cau2/Out.txt");
            for(Luong i:list){
                
                double luongt=(int) ((i.getLuongcb()*i.getHeso())*(1-i.getThue()));
                p.println(i.getMa()+";"+i.getHoten()+";"+luongt);
            }
            p.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
