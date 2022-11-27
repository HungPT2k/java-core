package Theard.objetc;

public class SinhVien {

    private String hoten;

    private float diem1,diem2,diem3;

    private String xeploai;

    public SinhVien(String hoten, float diem1, float diem2, float diem3) {
        this.hoten = hoten;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public float getDiem1() {
        return diem1;
    }

    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }

    public float getDiem3() {
        return diem3;
    }

    public void setDiem3(float diem3) {
        this.diem3 = diem3;
    }

    public String getXeploai() {
        return xeploai;
    }

    public void setXeploai(String xeploai) {
        this.xeploai = xeploai;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoten='" + hoten + '\'' +
                ", diem1=" + diem1 +
                ", diem2=" + diem2 +
                ", diem3=" + diem3 +
                ", xeploai='" + xeploai + '\'' +
                '}';
    }
}
