package OOP;

import java.util.Locale;
import java.util.Scanner;

public class Tim_giang_vien {
    private String Name;
    private String Position;

    public Tim_giang_vien(String name, String position) {
        Name = name;
        Position = position;
    }

    public String Vt() {
        String st = getPosition();
        st = st.trim();
        st = st.replaceAll("\\s+", " ");
        String[] temp = st.split(" ");
        st = "";
        for (int i = 0; i < temp.length; i++) {
            st += String.valueOf(temp[i].charAt(0)).toUpperCase();
        }
        return st;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    @Override
    public String toString() {
        return
                Name + ' ' +
                        Vt() + ' ';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k,t,i=0;
        String name, chucvu,s;
        t = Integer.parseInt(sc.nextLine());
        Tim_giang_vien[] a = new Tim_giang_vien[t+1];
        while (t-- > 0) {
            name = sc.nextLine();
            chucvu = sc.nextLine();
           a[i] = new Tim_giang_vien(name,chucvu);
            i++;
        }
         k=Integer.parseInt(sc.nextLine());
        while (k-- >0)
        {
            s= sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+s+":");
            for ( int j=0  ; j<i ;j++)
            {
                if((a[j].getName().toLowerCase()).contains(s.toLowerCase()))
                {
                   if(j<9) System.out.print("GV0"+(j+1)+" ");
                   else System.out.print("GV"+(j+1)+" ");
                   System.out.print(a[j].toString());
                }
                System.out.println();
            }
        }

    }
}