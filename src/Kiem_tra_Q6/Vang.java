package Kiem_tra_Q6;

public class Vang extends Giao_dich implements Thanh_tien{
    private String LoaiVang;

    public Vang(String ma, String date, Float dongia, int soluong, String loaiVang) {
        super(ma, date, dongia, soluong);
        LoaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return LoaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        LoaiVang = loaiVang;
    }

    @Override
    public double getTien() {
        if(LoaiVang.equalsIgnoreCase("9999"))
        {
            return super.getSoluong()*super.getDongia();
        }else if(LoaiVang.equalsIgnoreCase("16K"))
        {
            return super.getSoluong()*super.getDongia()*0.8;
        }
        return super.getSoluong()*super.getDongia()*0.6;
    }

    @Override
    public String toString() {
       return super.getMa()+" "+super.getDate()+' '+super.getDongia()+' '+super.getSoluong()+' '+getLoaiVang()+' '+getTien();
    }
}
