package Kiem_tra_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class QLGT implements Chuc_nang{
   private List<PTGT> list ;
   private Scanner in = new Scanner(System.in);
   private int Ton_tai(String ma){
       for ( int i=0 ; i<list.size();i++){
           if (list.get(i).getCode().equalsIgnoreCase(ma))
               return i;
       }
       return -1;
   }
    public QLGT(){
        list =new ArrayList<>();
    }

    private PTGT nhap() {
       String cod , brand , price , year, color;
       String regex = "^VN\\d{3}";
       while(true)
       {
           System.out.println("Nhap mã: ");
           cod=in.nextLine().toUpperCase();
           if(Ton_tai(cod)==-1 && cod.matches(regex))
               break;
           System.err.println("Code đã tồn tại !!");
       }
        System.out.println("Nhap thuong hieu : ");
       brand=in.nextLine();
        System.out.println("Nhap giá : ");
        price=in.nextLine();
        System.out.println("Nhap năm sản xuất : ");
        year=in.nextLine();
        System.out.println("Nhap màu : ");
        color=in.nextLine();
    return new PTGT(cod,brand,year,price,color);
    }

    @Override
    public void nhap_oto() {
       PTGT p=nhap();
       String motor;
       int slot;
        System.out.println("Nhap tên động cơ : ");
        motor=in.nextLine();
        System.out.println("Nhap số chỗ ngồi : ");
        slot=Integer.parseInt(in.nextLine());
    list.add(new Oto(p.getCode(),p.getBrand(),p.getYear(),p.getPrice(),p.getColor(),motor,slot));
    }

    @Override
    public void nhap_xe_may() {
       PTGT p=nhap();
        int power;
        System.out.println("Nhap  mức công suất : ");
        power=Integer.parseInt(in.nextLine());
        list.add(new Xe_may(p.getCode(),p.getBrand(),p.getYear(),p.getPrice(),p.getColor(),power));
    }

    @Override
    public void nhap_truck() {
        PTGT p=nhap();
        int weight;
        System.out.println("Nhap  trọng tải : ");
        weight=Integer.parseInt(in.nextLine());
        list.add(new Truck(p.getCode(),p.getBrand(),p.getYear(),p.getPrice(),p.getColor(),weight));
    }

    @Override
    public void viet_ds() {
        System.out.println(" Ds oto : ");
        for( PTGT i:list)
        {
            if(i instanceof Oto) System.out.println(i);
        }
        System.out.println(" Ds xe may : ");
        for( PTGT i:list)
        {
            if(i instanceof Xe_may) System.out.println(i);
        }
        System.out.println(" Ds xe tai : ");
        for( PTGT i:list)
        {
            if(i instanceof Truck) System.out.println(i);
        }
    }

    @Override
    public void xoa() {
        String ma;
        System.out.println(" Nhap mã cần xóa: ");
        ma=in.nextLine();
       if(Ton_tai(ma)>=0)
       {
           list.remove(Ton_tai(ma));
       }
       else System.err.println("Mã không tồn tại");
    }

    @Override
    public void sua() {

    }

    @Override
    public void Tim_kiem() {

    }

    @Override
    public void Thong_ke() {

    }

    @Override
    public void sap_xep() {

    }
}
