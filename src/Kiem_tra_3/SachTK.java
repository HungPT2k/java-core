package Kiem_tra_3;

public class SachTK extends Sach implements Tao_Ma{
    private boolean Ngon_ngu;

    public SachTK(String ma, String ten_sach, String tac_gia, String nha_suat_ban, Float don_gia, boolean ngon_ngu) {
        super(ma, ten_sach, tac_gia, nha_suat_ban, don_gia);
        Ngon_ngu = ngon_ngu;
    }

    public String getNgon_ngu() {
       if(Ngon_ngu) return "Tieng viet";
       else return "Ngoai Ngu";
    }

    public void setNgon_ngu(boolean ngon_ngu) {
        Ngon_ngu = ngon_ngu;
    }

    @Override
    public String getTaoMa() {
        String  S;
        int tt;
        if(super.getNha_suat_ban().length()>10)
            tt=2;
        else tt=3;
        if(getNgon_ngu().equalsIgnoreCase("Tieng viet"))
        S=String.valueOf(tt+super.getMa()+'V');
        else S=String.valueOf(tt+super.getMa()+"NN");
        return S;
    }

    @Override
    public String toString() {
        return getTaoMa() + ' '+super.getTen_sach()+' '+super.getNha_suat_ban()+' '+super.getTac_gia()+' '+super.getDon_gia()+' '+getNgon_ngu();
    }
}
