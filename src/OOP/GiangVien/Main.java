package OOP.GiangVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QlGiangVien q=new QlGiangVien();

        while(true){
            System.out.println("------MENU-------");
            System.out.println("1. nhap CoHuu ");
            System.out.println("2. Nhap Thing Giang");
            System.out.println("3. Viet ra ds");

            System.out.println("4. Xoa");
            System.out.println("5. sua");
            System.out.println("6. sua CoHuu");

            System.out.println("7. Tim theo ma");
            System.out.println("8. tim theo ten");

            System.out.println("9. Sap xep theo ten");
            System.out.println("10. Sap xep theo HesoLuong");
            System.out.println("11. Tinh Luong");
            System.out.println("12. Giang Vien Luong cao nhat");

            System.out.println("0. Thoat");
            System.out.println("-----------------");
            System.out.print("Ban chon (0->10):");
            int chon;
            Scanner in=new Scanner(System.in);
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 0:System.out.println("BYE!!!");
                    System.exit(0);//safe exit
                case 1:q.nhapCoHuu();
                    break;
                case 2:q.nhapThinhGiang();
                    break;
                case 3:q.viet();
                    break;
                case 4:q.xoa();
                    break;
                case 5:q.sua();
                    break;
                case 6:q.suaCHuu();
                    break;
                case 7:q.timTheoMa();
                    break;
                case 8:q.timTheoTen();
                    break;
                case 9:q.sapxepTheoTen();
                    break;
                case 10:q.sapxepHeSoLuong();
                    break;
                case 11:q.tinhluong();
                    break;
                case 12:q.maxByLuong();
                    break;
                default:System.out.println("chi chon 0->12");
                    break;
            }
        }

    }
}
