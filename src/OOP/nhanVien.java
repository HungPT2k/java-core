package OOP;
import java.util.Scanner;
class nhanVien{
    public static int thutu=0;
    private String manhanvien;
    private String ten;
    private String ngaysinh;
    private String lop;
    private float gpa;
    public nhanVien(String ten,String lop,String ngaysinh, float gpa){
        thutu++;
        String[] st=ngaysinh.split("/");
        if(st[0].length()<2){
            st[0]="0"+st[0];
        }
        if(st[1].length()<2){
            st[1]="0"+st[1];
        }
        String y=String.valueOf(thutu);
        if(y.length()==1){
            y="00"+y;
        }
        else{
            y="0"+y;
        }
        manhanvien="B20DCCN"+y;
        this.ten=ten;
        this.lop=lop;
        this.ngaysinh=st[0]+"/"+st[1]+"/"+st[2];
        this.gpa=gpa;
    }
    public void show(){
        System.out.println(this.manhanvien+" "+this.ten+" "+this.lop+" "+this.ngaysinh+" "+String.format("%.2f",this.gpa));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        nhanVien[] a= new nhanVien[n];
        int i=0;
        while(n>0){
            sc.nextLine();
            String ten,lop,ngay;
            ten=sc.nextLine();
            lop=sc.nextLine();
            ngay=sc.nextLine();
            float gpa=sc.nextFloat();
            a[i]=new nhanVien(ten,lop,ngay,gpa);
            a[i].show();
            i++;
            n--;
        }
    }
}