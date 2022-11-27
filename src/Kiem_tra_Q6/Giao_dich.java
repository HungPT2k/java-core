package Kiem_tra_Q6;

public class Giao_dich {
    private String Ma;
    private String Date;
    private Float Dongia;
    private int Soluong;
    private Float Tien;

    public Giao_dich(String ma, String date, Float dongia, int soluong) {
        Ma = ma;
        Date = date;
        Dongia = dongia;
        Soluong = soluong;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String ma) {
        Ma = ma;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public Float getDongia() {
        return Dongia;
    }

    public void setDongia(Float dongia) {
        Dongia = dongia;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int soluong) {
        Soluong = soluong;
    }

}
