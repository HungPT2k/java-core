package Kiem_tra_Q6;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        QLgiaodich q=new QLgiaodich();
        boolean check=true;
        while (check) {
            System.out.println("------MENU-------");
            System.out.println("0:Thoát");
            System.out.println("1:Nhap Gd Tiền");
            System.out.println("2:Nhap  Gd Vàng");
            System.out.println("3:IN DS từng Gd");
            System.out.println("4:Sửa Giao dịch");
            System.out.println("5:Sắp xếp Vàng theo Tiền");
            System.out.println("6:Đưa ra Gd vàng lớn nhát theo Tiền");
            System.out.println("Chon 0-->6:");
            int chon;
            Scanner in = new Scanner(System.in);
            chon = Integer.parseInt(in.nextLine());
            switch (chon) {
                case 0:check=false;
                    break;
                case 1: q.Nhap_Gd_tien();
                    break;
                case 2:
                    q.Nhap_Gd_vang();
                    break;
                case 3:
                    q.In_DS_GD();
                    break;
                case 4:
                    q.Sua_Gd();
                    break;
                case 5:
                    q.Sap_xep();
                    break;
                case 6:q.Max();
                break;
                default:
                    System.out.println("chi chon 0->6");
                    break;

            }
        }
    }
}

