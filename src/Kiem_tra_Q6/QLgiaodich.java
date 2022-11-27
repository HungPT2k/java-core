package Kiem_tra_Q6;
import Kiem_tra_3.Sach;

import java.util.*;

public class QLgiaodich  implements Chuc_nang{
    private ArrayList<Giao_dich> Gd;
    private Scanner in = new Scanner(System.in);
    private String reg ="\\d{1,2}[/]\\d{1,2}[/]\\d{4}";
    public QLgiaodich(){
        Gd = new ArrayList<>();
    }
    private int Ton_tai(String ma){
        for(int i=0 ; i<Gd.size();i++)
        {
            if(Gd.get(i).getMa().equalsIgnoreCase(ma))
            {
                return i;
            }
        }
        return -1;
    }
    public Giao_dich Nhap()
    {
        String ma , date ;
        int Solg;
        Float Dongia;
        while(true){
            System.out.print("Nhap ma Gd : ");
            ma=in.nextLine();
            if(Ton_tai(ma)==-1)
            {
                break;
            }
            else  System.out.println("Ma sai cu phap hoặc đã tồn tại");
    }
        while(true){
            System.out.print("Nhap date Gd : ");
            date=in.nextLine();
            if(date.matches(reg))
            {
                break;
            }
            else System.out.printf("Date sai cu phap ");
        }
        System.out.print("Nhap don gia Gd : ");
        Dongia=Float.parseFloat(in.nextLine());
        System.out.print("Nhap So luong Gd : ");
        Solg=Integer.parseInt(in.nextLine());
        return new Giao_dich(ma,date,Dongia,Solg);

    }
    @Override
    public void Nhap_Gd_vang() {
        Giao_dich g=Nhap();
            System.out.print("Nhap loai Vang (9999,18K,16K): ");
         String   t=in.nextLine();
         t=t.toUpperCase();
        Gd.add(new Vang(g.getMa(),g.getDate(),g.getDongia(),g.getSoluong(),t));
    }

    @Override
    public void Nhap_Gd_tien() {
        int tigia;
        Giao_dich g=Nhap();
        System.out.print("Nhap ti gia (23,26): ");
        tigia=Integer.parseInt(in.nextLine());
            System.out.print("Nhap loai tien(USD,EURO): ");
          String  t=in.nextLine();
          t=t.toUpperCase();
        Gd.add(new Tien_te(g.getMa(),g.getDate(),g.getDongia(),g.getSoluong(),tigia,t));
    }

    @Override
    public void In_DS_GD() {
        System.out.println("Danh sach Gd Tien tệ: ");
        int dem=0;
        for(Giao_dich i:Gd)
        {
            if(i instanceof Tien_te)
            {   dem++;
                System.out.println(i);
            }
        }
        System.out.println(" Tong Gd Tiền tệ : "+dem);
        System.out.println("Danh sach Gd Vàng: ");
        for(Giao_dich i:Gd)
        {
            if(i instanceof Vang)
            {
                System.out.println(i);
            }
        }
        System.out.println(" Tong Gd Vàng : "+(Gd.size()-dem));
    }

    @Override
    public void Sua_Gd() {
        int t;
        boolean check=false;
        String date,mat;
            System.out.print("Nhập mã tiền gd: ");
          mat = in.nextLine();
            for (Giao_dich i : Gd) {
                if (i instanceof Tien_te && i.getMa().equalsIgnoreCase(mat)) {
                    while(true){
                        System.out.print("Nhap date can sửa : ");
                        date=in.nextLine();
                        if(date.matches(reg))
                        {
                            i.setDate(date);
                            break;
                        }
                        else  System.out.println("Date sai cu phap ");
                    }
                    System.out.print("Sua đơn giá : ");
                     i.setDongia(Float.parseFloat(in.nextLine()));
                    System.out.print("Sửa loại tiền: ");
                    ((Tien_te) i).setLoaitien(in.nextLine());
                    check = true;
                    break;
                }
            }
            if(check) System.out.println("sửa thành công");
            else System.out.println("Mã không tồn tại");
        }
    @Override
    public void Sap_xep() {
            List<Vang>l=new ArrayList<>();
            for(Giao_dich i:Gd)
            {
                if(i instanceof Vang)
                {
                    l.add((Vang) i);
                }
            }
            Collections.sort(l,new Comparator<Vang>() {
                @Override
                public int compare(Vang o1, Vang o2) {
                    return Double.compare(o1.getTien(), o2.getTien());
                }
            });
            System.out.println("Danh sach gd vang sau khi SX:");
            for(Vang i:l)
            {
                System.out.println(i);
            }
        }
    @Override
    public void Max() {
        //   Collections.max();
    }
}
