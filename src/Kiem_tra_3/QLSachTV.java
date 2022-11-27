package Kiem_tra_3;

import java.util.*;

public class QLSachTV  implements Chuc_nang{
    private Scanner in = new Scanner(System.in);
    private ArrayList<Sach> Sa;
    private String regex="^A\\D{2}";
    private Boolean True = Boolean.TRUE;
    private Boolean False = Boolean.FALSE;
    public QLSachTV (){
        Sa=new ArrayList<>();
    }
    private int Trung(String ma){
        for (int i=0;i<Sa.size();i++)
        {
            if(Sa.get(i).getMa().equalsIgnoreCase(ma)) return i;
        }
        return -1;
    }

    public Sach Nhap(){
        String ma , ten , tacgia,nhasx;
        float gia;
        while(true){
            System.out.println("Nhap ma:(ABC): ");
            ma = in.nextLine();
            if(Trung(ma)==-1 && ma.matches(regex)) break;
            System.out.println(" mã đã tồn tại: ");
        }
        System.out.println("Nhap ten sach: ");
        ten=in.nextLine();
        System.out.println("Nhap ten tac gia: ");
        tacgia=in.nextLine();
        System.out.println("Nhap nha xuat ban: ");
        nhasx=in.nextLine();
        System.out.println("Nhap don gia: ");
        gia=Float.parseFloat(in.nextLine());
      return   new Sach(ma,ten,tacgia,nhasx,gia);
    }
    @Override
    public void Nhap_SachGk() {
        int lop;
      Sach q=Nhap();
        System.out.println("Nhap  lop: ");
      lop=Integer.parseInt(in.nextLine());
      Sa.add(new SachGk(q.getMa(),q.getTen_sach(),q.getTac_gia(),q.getNha_suat_ban(),q.getDon_gia(),lop));
    }

    @Override
    public void Nhap_SachTk() {
        boolean nn;
        Sach q=Nhap();
        // Quy ước true là tiếng việt;
        System.out.println("Nhap ngon ngu (True/False): ");
        nn=Boolean.parseBoolean(in.nextLine());
        Sa.add(new SachTK(q.getMa(),q.getTen_sach(),q.getTac_gia(),q.getNha_suat_ban(),q.getDon_gia(),nn));

    }

    @Override
    public void Viet_Ds() {
        int dem=0;
        System.out.println("Ds sách giáo  khoa:");
        for (Sach i:Sa)
        {
            if(i instanceof SachGk)
            {
                dem++;
                System.out.println(i);
            }
        }
        System.out.println("tong sách giáo  khoa:"+dem);
        System.out.println("Ds sách Tham khảo:");
        for (Sach i:Sa)
        {
            if(i instanceof SachTK)
                System.out.println(i);
        }
        System.out.println("tong sách tham  khao:"+(Sa.size()-dem));
    }
    @Override
    public void Tim_SachTk() {
        Boolean nn,check=true;
        System.out.println("Nhập nn sach muon tim(True/Tv , False/NN):");
        nn=Boolean.parseBoolean(in.nextLine());
        for (Sach i:Sa)
        {
            if(i instanceof SachTK) {
                if (nn.equals(((SachTK) i).getNgon_ngu()))
                {
                    System.out.println(i);
                    check=false;
                }
            }
        }
        if (check) System.out.println("Không tìm thấy");
    }

    @Override
    public void Sap_xep_theo_Tg() {
        Collections.sort(Sa, new Comparator<Sach>() {
            @Override
            public int compare(Sach o1, Sach o2) {
                return o1.getTac_gia().compareTo(o2.getTac_gia());
            }
        });
        System.out.println("Ds sau khi sắp xếp :");
        for (Sach i:Sa)
        {
                System.out.println(i);
        }
    }

    @Override
    public void Tim_sach_max_theo_Tg() {
        Set<String> set = new HashSet<String>();
        for (int i=0 ; i<Sa.size();i++)
        {
           set.add(Sa.get(i).getTac_gia());
        }
        for (String j:set)
        {
            ArrayList<Float> f=new ArrayList<>();
        double max=0;
            for (int i=0 ; i<Sa.size();i++)
            {
                if(j.compareTo(Sa.get(i).getTac_gia())==0)
                {
                    f.add(Sa.get(i).getDon_gia());
                }
            }
            for(Float i:f)
            {
                if(i>max) max=i;
            }
            System.out.println("Sach dat nhat cua tac gia :"+j+": ");
            for (int i=0 ; i<Sa.size();i++)
            {
                if(Sa.get(i).getDon_gia()==max) System.out.println(Sa.get(i));
            }
            f.clear();
        }

    }
}
