package SoDt;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        PhoneBook q=new PhoneBook();
        
        while(true){
            System.out.println("------MENU-------");
            System.out.println("1. Them sdt moi");
            System.out.println("2. Tim sdt theo ma vung");
            System.out.println("3. Liet ke so dien thoai");
            
            System.out.println("4. Tinh tong sdt theo tung vung");
            System.out.println("5. Tim kiem theo duoi sdt");
            System.out.println("6. Sap xep sdt");
            
            System.out.println("0. Thoat");
            System.out.println("-----------------");
            System.out.print("Ban chon (0->10):");
            int chon;
            Scanner sc=new Scanner(System.in);
            chon=Integer.parseInt(sc.nextLine());
            switch(chon){
                case 0:System.out.println("BYE!!!");
                       System.exit(0);
                case 1:System.out.println("1.Nhap so dien thoai trong nuoc");
                      System.out.println("2.Nhap so dien thoai quoc te");
                      System.out.print("Vui long nhap lua chon:");
                      int x=sc.nextInt();
                      sc.nextLine();
                      while(true){
                      System.out.print("Nhap so dien thoai:");
                      String s=sc.nextLine();
                      String[] st= s.split("-");
                      if((x==1 && (st[0].length()<3 || st[0].length()>4 || st[0].charAt(0)!='0')) || (x==2 && (st[1].length()<2 || st[1].length()>3 || st[1].charAt(0)=='0'))){
                        System.err.println("Nhap sai dinh dang, vui long nhap lai!");
                      }
                      else if(x==1){
                        PhoneNumber o=new PhoneNumber(Integer.parseInt(st[0]),Integer.parseInt(st[1]));
                        q.them(o);
                        break;
                      }
                      else{
                        IntlPhoneNumber o=new IntlPhoneNumber(Integer.parseInt(st[0]),Integer.parseInt(st[1]),Integer.parseInt(st[2]));
                        q.them(o);
                        break;
                      }
                    }
                       break;
                case 2:q.timtheomavung();
                       break;
                case 3:System.out.println("1.Liet ke so dien thoai trong nuoc");
                      System.out.println("2.Liet ke so dien thoai quoc te");
                      System.out.println("3.Liet ke tat ca so dien thoai");
                      System.out.print("Vui long nhap lua chon:");
                      int y=sc.nextInt();
                      sc.nextLine();
                       if(y==1){
                        q.lietketrongnuoc();
                       }
                       else if(y==2){
                        q.lietkequocte();
                       }
                       else{
                        q.lietke();
                       }
                       break;
                case 4:q.tinhtongtheovung();
                       break; 
                case 5:q.timtheoduoi();
                       break; 
                case 6:q.sapxep();
                break;
                default:System.out.println("chi chon 0->9");
                      break; 
            }
        }
        
    }
    
}
