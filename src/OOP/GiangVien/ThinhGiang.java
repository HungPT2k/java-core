package OOP.GiangVien;

public class ThinhGiang extends GiangVien implements TinhLuong {
    private String diachicq;

    private String dienthoaiCq;

    public ThinhGiang(String ma, String ten, String email, String hocham, String hocvi, String diachi, String dienthoai,
                      int gioDay,String diachicq,String dienthoaiCq) {
        super(ma, ten, email, hocham, hocvi, diachi, dienthoai, gioDay);
        this.diachicq=diachicq;
        this.dienthoaiCq=dienthoaiCq;
    }

    @Override
    public String toString() {
        return "ThinhGiang{" +
                "ma='" + getMa() + '\'' +
                ", ten='" + getTen() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", hocham='" + getHocham() + '\'' +
                ", hocvi='" + getHocvi() + '\'' +
                ", diachi='" + getDiachi() + '\'' +
                ", dienthoai='" + getDienthoai() + '\'' +
                ", gioDay=" + getGioDay() +
                ", hsluong=" + getHsluong() +
                ", diachicq='" + diachicq + '\'' +
                ", dienthoaiCq='" + dienthoaiCq + '\'' +
                '}';
    }
    @Override
    public float getLuong(){
        float luong=getGioDay()*200;
        return luong;
    }
}
