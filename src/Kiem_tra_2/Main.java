package Kiem_tra_2;

import Kiem_tra.SoNguyen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QLGT q=new QLGT();
        while (true) {
            System.out.println("------MENU-------");
            System.out.println("1:Nhap Oto");
            System.out.println("2:Nhap Xe tai");
            System.out.println("3:Nhap Xe may");
            System.out.println("4:IN xe Oto");
            System.out.println("5:IN xe Xe tai");
            System.out.println("6:IN xe Xe may");
            System.out.println("7:Tim kiem theo hãng");
            System.out.println("8:Tim kiem theo thời gian sản xuất");
            System.out.println("9:Sap xem theo gia");
            int chon, a;
            System.out.println("Chon 1-->4 :");
            Scanner in = new Scanner(System.in);
            chon = Integer.parseInt(in.nextLine());
            switch (chon) {
                case 1: q.nhap_oto();
                    break;
                case 2:
                    q.nhap_truck();
                    break;
                case 3:
                    q.nhap_xe_may();
                    break;
                case 4:
                    q.viet_ds();
                    break;
                default:
                    System.out.println("chi chon 0->11");
                    break;

            }
        }
    }
}
