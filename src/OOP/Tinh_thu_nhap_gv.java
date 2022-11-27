package OOP;

import java.util.Scanner;

public class Tinh_thu_nhap_gv {
    private String ChucVu;
    private String Name;
    private String Salary;

    public Tinh_thu_nhap_gv(String chucVu, String name, String salary) {
        ChucVu = chucVu;
        Name = name;
        Salary = salary;
    }

    public long Heso() {
        int k;
        if (getChucVu().charAt(2) == '0') k = getChucVu().codePointAt(3)-48;
        else k = Integer.parseInt(getChucVu().substring(2));
        return k;
    }

    public String PhuCap() {
        String S;
        if ("HT".equals(getChucVu().substring(0,2))) S = "2000000";
        else if ("HP".equals(getChucVu().substring(0,2))) S = "900000";
        else S = "500000";
        return S;
    }
    public String chuannHoa() {
        String st = getName();
        st = st.trim().toLowerCase();
        st = st.replaceAll("\\s+", " ");
        String[] temp = st.split(" ");
        st = "";
        for (int i = 0; i < temp.length; i++) {
            st += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1)
                st += " ";
        }
        return st;
    }
    public Long TotalSalary() {
        return Heso() *Long.parseLong(getSalary()) +Long.parseLong(PhuCap());
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String chucVu) {
        ChucVu = chucVu;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return ChucVu + ' ' + chuannHoa() + ' ' + Heso() + ' ' + PhuCap() + ' ' + TotalSalary();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, luong, chucvu;
        chucvu = sc.next();
        sc.nextLine();
        name = sc.nextLine();
        //sc.nextLine();
        luong = sc.next()   ;// Không nhập được
        //sc.nextLine();
        Tinh_thu_nhap_gv a = new Tinh_thu_nhap_gv(chucvu, name, luong);
        System.out.println(a.toString());
    }
}
