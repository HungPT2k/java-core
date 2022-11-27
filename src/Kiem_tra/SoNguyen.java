/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kiem_tra;

import java.util.Scanner;

public class SoNguyen {
    private int n;

        // Kiểm tra số nguyên tố
    public static boolean Check(int n)
    {
        if(n<2) return false;
        else if (n <= 3)  return true;
        else  if (n%2 == 0 || n%3 == 0) return false;
        for (int i=5; i*i<=n; i=i+6)
        {if (n%i == 0 || n%(i+2) == 0)  return false;}
        return true;
    }// Nhap so N
    public SoNguyen() {
        Scanner in=new Scanner(System.in);
        System.out.print("n=");
        n=Integer.parseInt(in.nextLine());
    }
    public void So_Nt_nho_hon_n(){
        for (int i = 2; i < n; i++) {
            if(Check(i))
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public void So_Nt_co_n_so(){
        int S=1;
       while (n-- >0) S*=10;
        for(int i=S; i<=S*10-1;i++)
        {
            if(Check(i))
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    
}
