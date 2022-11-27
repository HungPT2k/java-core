package Kiem_tra;


import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        SoNguyen sn=null;
        Phan_so x=new Phan_so();
        MaTran1 a=new MaTran1();
        while(true){
            System.out.println("------MENU-------");
            System.out.println("1. Nhap n");
            System.out.println("2. Số nguyên tố nhỏ hơn n là: ");
            System.out.println("3. Số nguyên tố có n chữ số là: ");

            System.out.println("4. Phan So");
            System.out.println("5. Nhap ma tran");
            System.out.println("6. Viet ra");
            System.out.println("7. In tong các hàng của ma trận: ");
            System.out.println("8. Ma tran con");
            
            System.out.println("0. Thoat");
            System.out.println("-----------------");
            System.out.print("Ban chon (0->4):");
            int chon;
            Scanner in=new Scanner(System.in);
            chon=Integer.parseInt(in.nextLine());
            switch(chon){


                case 1:sn=new SoNguyen();
                       break;
                case 2:sn.So_Nt_nho_hon_n();
                       break;
                case 3:sn.So_Nt_co_n_so();
                       break;
                case 4:x.Tong_thuong_2_Phan_so();
                       break;
                case 5:a.nhapKT();
                       a.nhap();
                       break;  
                case 6:a.viet();
                       break;  
                case 7:
                       System.out.println("A");
                       a.viet();
                       a.tong_cac_hang();
                       break;
                case 11:
                    MaTran1 c=new MaTran1(a.getCot(),a.getHang());
                    System.out.println("Nhap ma tran c");
                    c.nhap();
                    System.out.println("A");
                    a.viet();
                    System.out.println("B");
                    c.viet();
                    System.out.println("Tich");
                    break;
                default:System.out.println("chi chon 0->11");
                      break; 
            }
        }
        
    }
    
}
