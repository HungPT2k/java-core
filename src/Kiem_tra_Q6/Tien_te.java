package Kiem_tra_Q6;

public class Tien_te    extends Giao_dich implements Thanh_tien{
    private int Tigia;
    private String Loaitien;

    public Tien_te(String ma, String date, Float dongia, int soluong, int tigia, String loaitien) {
        super(ma, date, dongia, soluong);
        Tigia = tigia;
        Loaitien = loaitien;
    }

    public int getTigia() {
        return Tigia;
    }

    public void setTigia(int tigia) {
        Tigia = tigia;
    }

    public String getLoaitien() {
        return Loaitien;
    }

    public void setLoaitien(String loaitien) {
        Loaitien = loaitien;
    }

    @Override
    public double getTien() {
        if(getLoaitien().equalsIgnoreCase("USD")) return super.getSoluong()*super.getDongia()*23;
        else return super.getSoluong()*super.getDongia()*26;
    }

    @Override
    public String toString() {
        return super.getMa()+" "+super.getDate()+' '+super.getDongia()+' '+super.getSoluong()+' '+getTigia()+' '+getLoaitien()+' '+getTien();
    }
}
