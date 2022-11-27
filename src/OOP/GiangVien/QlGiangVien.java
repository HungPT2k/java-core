package OOP.GiangVien;
import java.util.*;

public class QlGiangVien implements ChucNang {
    private final List<GiangVien> list;

    private final Scanner in=new Scanner(System.in);

    private int tontai(String ma){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().equalsIgnoreCase(ma.trim()))
                return i;
        }
        return -1;
    }

    public QlGiangVien() {
        list=new ArrayList<>();
    }

    public GiangVien nhap(){
        GiangVien gv;
        String reg="^GV\\d{3}";
        String ma;
        while(true){
            System.out.print("Nhap ma:");
            ma=in.nextLine().toUpperCase();
            if(ma.matches(reg) && tontai(ma)==-1)
                break;
            System.err.println("Nhap lai!");
        }
        System.out.print("Nhap ten:");
        String ten=in.nextLine();
        System.out.print("Nhap email:");
        String email=in.nextLine();
        System.out.print("Nhap hocham 0:Không 1:P.Giáo Sư 2:Giáo Sư:");
        String hocham=in.nextLine();
        System.out.print("Nhap hocvi 0:Đại Học 1:Thạc Sĩ 2:Tiến Sĩ:");
        String hocvi=in.nextLine();
        System.out.print("Nhap diachi:");
        String diachi=in.nextLine();
        System.out.print("Nhap dienthoai:");
        String dienthoai=in.nextLine();
        System.out.print("Nhap gioday:");
        int gioday=Integer.parseInt(in.nextLine());

        gv=new GiangVien(ma,ten,email,hocham,hocvi,diachi,dienthoai,gioday);
        return gv;
    }

    @Override
    public void nhapCoHuu() {
        GiangVien p=nhap();
        System.out.print("Nhap luongtt:");
        int luongtt=Integer.parseInt(in.nextLine());
        System.out.print("Nhap sogioquydinh:");
        int sogioquydinh=Integer.parseInt(in.nextLine());
        list.add(new CoHuu(p.getMa(), p.getTen(),p.getEmail(),p.getHocham(),p.getHocvi(),p.getDiachi(),p.getDienthoai(),
                p.getGioDay(),luongtt,sogioquydinh));
    }

    @Override
    public void nhapThinhGiang() {
        GiangVien p=nhap();
        System.out.print("Nhap diachicq:");
        String diachicq=in.nextLine();
        System.out.print("Nhap dienthoaiCq:");
        String dienthoaiCq=in.nextLine();
        list.add(new ThinhGiang(p.getMa(), p.getTen(),p.getEmail(),p.getHocham(),p.getHocvi(),p.getDiachi(),p.getDienthoai(),
                p.getGioDay(),diachicq,dienthoaiCq));
    }

    @Override
    public void viet() {
        int CH=0;
        System.out.println("GiangVien Co Huu");
        for(GiangVien i:list){
            if(i instanceof CoHuu){
                CH+=1;
                System.out.println(i);
            }
        }
        System.out.println("So GiangVien Co Huu:"+CH);
        int TG=0;

        System.out.println("GiangVien Thinh Giang");
        for(GiangVien i:list){
            if(i instanceof ThinhGiang){
                TG+=1;
                System.out.println(i);
            }
        }
        System.out.println("So GiangVien Thinh Giang:"+TG);

        System.out.println("-------------");
    }

    @Override
    public void xoa() {
        System.out.print("Nhap ma can xoa:");
        String ma=in.nextLine();
        int vt=tontai(ma);
        if(vt== -1)
            System.out.println("khong tim thay de xoa!!");
        else{
            list.remove(vt);
            System.out.println("xoa thanh cong!!!");
        }
    }

    @Override
    public void sua() {
        System.out.print("Nhap ma can sua:");
        String ma=in.nextLine();
        int vt=tontai(ma);
        if(vt==-1)
            System.out.println("khong tim thay de sua!!");
        else{
            GiangVien p=list.get(vt);
            System.out.print("Nhap ten:");
            String ten=in.nextLine();
            System.out.print("Nhap email:");
            String email=in.nextLine();
            System.out.print("Nhap hocham:");
            String hocham=in.nextLine();
            System.out.print("Nhap hocvi:");
            String hocvi=in.nextLine();
            System.out.print("Nhap diachi:");
            String diachi=in.nextLine();
            System.out.print("Nhap dienthoai:");
            String dienthoai=in.nextLine();
            System.out.print("Nhap gioday:");
            int gioday=Integer.parseInt(in.nextLine());
            p.setTen(ten);
            p.setEmail(email);
            p.setHocham(hocham);
            p.setHocvi(hocvi);
            p.setDiachi(diachi);
            p.setDienthoai(dienthoai);
            p.setGioDay(gioday);
            p.setHsluong(p.tinhHsluong());
            System.out.println("Sua thanh cong!!!");
        }
    }


    @Override
    public void suaCHuu() {
        List<CoHuu> l=new ArrayList<>();
        for(GiangVien i:list)
            if(i instanceof CoHuu)
                l.add((CoHuu) i);
        System.out.print("Nhap ma can sua:");
        String ma=in.nextLine();
        int vt=-1;
        for (int i = 0; i < l.size(); i++) {
            if(l.get(i).getMa().equalsIgnoreCase(ma)){
                vt=i;
                break;
            }
        }
        if(vt==-1)
            System.out.println("khong tim thay oto de sua!!");
        else{
            CoHuu p=l.get(vt);
            System.out.print("Nhap ten:");
            String ten=in.nextLine();
            System.out.print("Nhap email:");
            String email=in.nextLine();
            System.out.print("Nhap hocham:");
            String hocham=in.nextLine();
            System.out.print("Nhap hocvi:");
            String hoccvi=in.nextLine();
            System.out.print("Nhap diachi:");
            String diachi=in.nextLine();
            System.out.print("Nhap dienthoai:");
            String dienthoai=in.nextLine();
            System.out.print("Nhap gioday:");
            int gioday=Integer.parseInt(in.nextLine());
            System.out.print("Nhap luongtt:");
            int luongtt=Integer.parseInt(in.nextLine());
            System.out.print("Nhap hsluong:");
            float hesoluong=Float.parseFloat(in.nextLine());
            System.out.print("Nhap sogioquydinh:");
            int sogioquydinh=Integer.parseInt(in.nextLine());
            p.setTen(ten);
            p.setEmail(email);
            p.setHocham(hocham);
            p.setHocvi(hoccvi);
            p.setDiachi(diachi);
            p.setDienthoai(dienthoai);
            p.setGioDay(gioday);
            p.setLuongtt(luongtt);
            p.setHsluong(hesoluong);
            p.setSogioquydinh(sogioquydinh);
            System.out.println("Sua Giang Vien CoHuu thanh cong!!!");
        }
    }

    @Override
    public void timTheoMa() {
        System.out.print("Nhap ma can tim:");
        String ma=in.nextLine();
        int vt=tontai(ma);
        if(vt==-1)
            System.out.println("khong tim thay!!");
        else
            System.out.println(list.get(vt));
    }


    @Override
    public void timTheoTen() {
        System.out.print("Nhap ten can tim:");
        String ten=in.nextLine();
        boolean co=false;
        for(GiangVien i:list)
            if(i.getTen().toLowerCase().contains(ten.toLowerCase())){
                System.out.println(i);
                co=true;
            }
        if(!co)
            System.out.println("khong tim thay GiangVien nao!!");
    }

    @Override
    public void sapxepTheoTen() {
        list.sort(Comparator.comparing(GiangVien::getTen));
    }

    @Override
    public void sapxepHeSoLuong() {
        list.sort((o1, o2) -> {
            return Float.compare(o2.getHsluong(),o1.getHsluong());//giam
        });
    }


    @Override
    public void tinhluong() {
        int CH=0;
        System.out.println("\tGiangVien Co Huu");
        for(GiangVien i:list){
            if(i instanceof CoHuu){
                CH+=1;
                System.out.println(i+" Luong Linh:"+i.getLuong());
            }
        }
        System.out.println("So GiangVien Co Huu:"+CH);

        int TG=0;
        System.out.println("\tGiangVien Thinh Giang");
        for(GiangVien i:list){
            if(i instanceof ThinhGiang){
                TG+=1;
                System.out.println(i+" Luong Linh:"+i.getLuong());
            }
        }
        System.out.println("So GiangVien Thinh Giang:"+TG);

        System.out.println("-------------");
    }

    @Override
    public void maxByLuong(){
        Optional<GiangVien> max= list.stream().max(Comparator.comparing(GiangVien::getLuong));
        System.out.println(max.map(giangVien -> giangVien + " Luong:" + giangVien.getLuong()).orElse("DS rong"));
    }

}
