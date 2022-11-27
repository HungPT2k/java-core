package Kiem_tra_3;

public class SachGk extends Sach implements Tao_Ma{
    private int Lop;

    public SachGk(String ma, String ten_sach, String tac_gia, String nha_suat_ban, Float don_gia, int lop) {
        super(ma, ten_sach, tac_gia, nha_suat_ban, don_gia);
        Lop = lop;
    }

    public int getLop() {
        return Lop;
    }

    public void setLop(int lop) {
        Lop = lop;
    }

    @Override
    public String getTaoMa() {
        String S;
        S=String.valueOf(1+super.getMa() + getLop());
        return S;
    }
    @Override
    public String toString() {
        return getTaoMa() + ' '+super.getTen_sach()+' '+super.getNha_suat_ban()+' '+super.getTac_gia()+' '+super.getDon_gia()+' '+getLop();
    }
}
