package OOP;
import java.util.Scanner;

public class Nhan_vien {
    private String Name;
    private String DateofBirth;
    private String Manv;
    private String Gender;
    private String Address;
    private String Code;
    private String DateSig;
    private String Ma;

    public Nhan_vien() {

    }

    public Nhan_vien(String name, String gender,String dateofBirth, String address, String code, String dateSig) {
        Name = name;
        DateofBirth = dateofBirth;
        Gender = gender;
        Address = address;
        Code = code;
        DateSig = dateSig;
    }

    public String getMa() {
        Ma="00001";
        return Ma;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDateofBirth() {
        return DateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        DateofBirth = dateofBirth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getDateSig() {
        return DateSig;
    }

    public void setDateSig(String dateSig) {
        DateSig = dateSig;
    }

    @Override
    public String toString() {
        return   getMa()+' '
               + Name + ' '
                + Gender + ' '
                + DateofBirth+' '
                + Address + ' '
                + Code + ' '
               + DateSig ;
    }

    public static void main(String[] args) {
    Nhan_vien[] nhan_vien = new Nhan_vien[15];
        nhan_vien[0] = getInFo();
        System.out.print(nhan_vien[0].toString());
    }
    public static Nhan_vien getInFo()
    {
        Nhan_vien s = null;
        String name , dateofbirth ,code;
        String datesig,gender,address;
        Scanner input = new Scanner(System.in);
       // Scanner input2 = new Scanner(System.in);
        name = input.nextLine();
      //  input.nextLine();
        gender=input.nextLine();
        dateofbirth = input.nextLine();
        address =  input.nextLine();
     //   input.nextLine();
        code = input.nextLine();
        datesig = input.nextLine();
        s = new Nhan_vien(name ,gender, dateofbirth,address,code ,datesig)   ;
        return s;
    }

}


