package Kiem_tra_3;

public class Sach {
    private String Ma;
    private String Ten_sach;
    private String Tac_gia;
    private String Nha_suat_ban;
    private Float Don_gia;

    public Sach(String ma, String ten_sach, String tac_gia, String nha_suat_ban, Float don_gia) {
        Ma = ma;
        Ten_sach = ten_sach;
        Tac_gia = tac_gia;
        Nha_suat_ban = nha_suat_ban;
        Don_gia = don_gia;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String ma) {
        Ma = ma;
    }

    public String getTen_sach() {
        return Ten_sach;
    }

    public void setTen_sach(String ten_sach) {
        Ten_sach = ten_sach;
    }

    public String getTac_gia() {
        return Tac_gia;
    }

    public void setTac_gia(String tac_gia) {
        Tac_gia = tac_gia;
    }

    public String getNha_suat_ban() {
        if( Nha_suat_ban.equalsIgnoreCase(String.valueOf('1'))) return "Giao Duc";
        else if( Nha_suat_ban.equalsIgnoreCase(String.valueOf('2')))    return "Khoa hoc va Ki thuat";
        else return "Buu dien";
    }

    public void setNha_suat_ban(String nha_suat_ban) {
        Nha_suat_ban = nha_suat_ban;
    }

    public Float getDon_gia() {
        return Don_gia;
    }

    public void setDon_gia(Float don_gia) {
        Don_gia = don_gia;
    }
}
