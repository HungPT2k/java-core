package Kiem_tra_3;

import java.util.Scanner;
 public class Main {
        public static void main(String[] args) {
            QLSachTV q=new QLSachTV();
            boolean check=true;
            while (check) {
                System.out.println("------MENU-------");
                System.out.println("0:Thoat");
                System.out.println("1:Nhap Sach GK");
                System.out.println("2:Nhap Sach tk");
                System.out.println("3:IN DS");
                System.out.println("4:Tim kiem sach");
                System.out.println("5:Sap xep sach theo tác giả");
                System.out.println("6:Tim  sach đắt nhất theo từng tác giả");
                int chon, a;
                System.out.println("Chon 1-->6 :");
                Scanner in = new Scanner(System.in);
                chon = Integer.parseInt(in.nextLine());
                switch (chon) {
                    case 0:check=false;
                        break;
                    case 1: q.Nhap_SachGk();
                        break;
                    case 2:
                        q.Nhap_SachTk();
                        break;
                    case 3:
                        q.Viet_Ds();
                        break;
                    case 4:
                        q.Tim_SachTk();
                        break;
                    case 5:
                        q.Sap_xep_theo_Tg();
                        break;
                    case 6:
                        q.Tim_sach_max_theo_Tg();
                        break;
                    default:
                        System.out.println("chi chon 0->6");
                        break;

                }
            }
        }
    }

