package OOP.GiangVien;
public class GiangVien implements TinhLuong {
    private String ma;

    private String ten;

    private String email;

    private String hocham;

    private String hocvi;

    private String diachi;

    private String dienthoai;

    private int gioDay;

    private float hsluong;

    public float tinhHsluong(){
        float hv;
        if(hocvi.equalsIgnoreCase("0"))
            hv=1;
        else if(hocvi.equalsIgnoreCase("1"))
            hv= (float) 1.1;
        else
            hv= (float) 1.2;
        float hh;
        if(hocham.equalsIgnoreCase("2"))
            hh= (float) 0.2;
        else if(hocham.equalsIgnoreCase("1"))
            hh= (float) 0.1;
        else
            hh= 0;
        return hv+hh;
    }

    public GiangVien(String ma, String ten, String email, String hocham, String hocvi, String diachi, String dienthoai, int gioDay) {
        this.ma = ma;
        this.ten = ten;
        this.email = email;
        this.hocham = hocham;
        this.hocvi = hocvi;
        this.diachi = diachi;
        this.dienthoai = dienthoai;
        this.gioDay = gioDay;
        this.hsluong = tinhHsluong();
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHocham() {
        if( hocham.equalsIgnoreCase("00")) return "Khong";
        else if(hocham.equalsIgnoreCase("11")) return "P.GiaoSu";
        else return "GiaoSu";
    }

    public void setHocham(String hocham) {
        this.hocham = hocham;
    }

    public String getHocvi() {
        if(hocham.equalsIgnoreCase("00")) return "DaiHoc";
        else if(hocham.equalsIgnoreCase("11")) return "ThacSi";
        else return "TienSi";
    }

    public void setHocvi(String hocvi) {
        this.hocvi = hocvi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public int getGioDay() {
        return gioDay;
    }

    public void setGioDay(int gioDay) {
        this.gioDay = gioDay;
    }

    public float getHsluong() {
        return hsluong;
    }

    public void setHsluong(float hsluong) {
        this.hsluong = hsluong;
    }

    @Override
    public float getLuong(){
        return 0;
    }

    @Override
    public String toString() {
        return "GiangVien{" +
                "ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", email='" + email + '\'' +
                ", hocham='" + hocham + '\'' +
                ", hocvi='" + hocvi + '\'' +
                ", diachi='" + diachi + '\'' +
                ", dienthoai='" + dienthoai + '\'' +
                ", gioDay=" + gioDay +
                ", hsluong=" + hsluong +
                '}';
    }
}
