package OOP.GiangVien;

public class CoHuu extends GiangVien implements TinhLuong {
    private int luongtt;

    private int sogioquydinh;

    public CoHuu(String ma, String ten, String email, String hocham, String hocvi, String diachi, String dienthoai, int gioDay, int luongtt,int sogioquydinh) {
        super(ma, ten, email, hocham, hocvi, diachi, dienthoai, gioDay);
        this.sogioquydinh=sogioquydinh;
        this.luongtt=luongtt;
    }

    public int getLuongtt() {
        return luongtt;
    }

    public void setLuongtt(int luongtt) {
        this.luongtt = luongtt;
    }

    public int getSogioquydinh() {
        return sogioquydinh;
    }

    public void setSogioquydinh(int sogioquydinh) {
        this.sogioquydinh = sogioquydinh;
    }

    @Override
    public String toString() {
        return "CoHuu{" +
                "ma='" + getMa() + '\'' +
                ", ten='" + getTen() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", hocham='" + getHocham() + '\'' +
                ", hocvi='" + getHocvi() + '\'' +
                ", diachi='" + getDiachi() + '\'' +
                ", dienthoai='" + getDienthoai() + '\'' +
                ", gioDay=" + getGioDay() +
                ", hsluong=" + getHsluong() +
                ", luongtt=" + luongtt +
                ", sogioquydinh=" + sogioquydinh +
                '}';
    }

    @Override
    public float getLuong(){
        float luong=luongtt;
        if(super.getGioDay()>getSogioquydinh()){
            luong+=(super.getGioDay()-getSogioquydinh())*50+getSogioquydinh()*200;
        }
        else {
            luong = getSogioquydinh()*200;
        }
        return luong;
    }
}
