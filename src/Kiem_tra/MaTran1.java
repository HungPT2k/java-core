/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kiem_tra;

import java.util.Scanner;
public class MaTran1 {
    private int[][] a;
    private Scanner in=new Scanner(System.in);
    
    public MaTran1() {
    }

    
    public MaTran1(int m, int n) {
        a=new int[m][n];
    }
    
    public void nhapKT(){
        System.out.print("nhap hang:");
        int m=Integer.parseInt(in.nextLine());
        System.out.print("nhap cot:");
        int n=Integer.parseInt(in.nextLine());
        a=new int[m][n];
    }
    public void nhap(){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print("phan tu "+i+","+j+"= ");
                a[i][j]=Integer.parseInt(in.nextLine());
            }
        }
    }
    public void viet(){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void tong_cac_hang() {
        for (int i = 0; i < a.length; i++) {
            long Sum = 0;
            for (int j = 0; j < a[0].length; j++) {
                Sum += a[i][j];
            }
            System.out.println("Tong hang" + i + 1 + "la: " + Sum);
        }
    }

    public int[][] getMaTran() {
        return a;
    }

    public void setMaTran(int[][] a) {
        this.a = a;
    }
    // mxn   nxp
    public int getHang() {
        return a.length;
    }

    

    public int getCot() {
        return a[0].length;
    }

    
    
}
