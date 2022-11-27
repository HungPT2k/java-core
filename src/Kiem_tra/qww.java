package Kiem_tra;

import java.util.Scanner;

public class qww {
    private String S;
    public  qww() {
        System.out.print("nhap xau=");
        Scanner sc = new Scanner(System.in);
        S = sc.nextLine();
    }

    public void Check_name() {
        boolean check = true;
        S = S.trim().toLowerCase();
        S = S.replaceAll("\\s+", " ");
        for (int i = 0; i < S.length(); i++) {
            int s = S.codePointAt(i);
            if (s == 42) break;
            if (s != 32) {
                if (s < 97 || s > 122) {
                    check = false;
                    break;
                }
            }
        }
        if (check) System.out.println("YES");
        else System.out.println("NO");
    }

    public void Check_age() {
        String str = "";
        for (int i = S.length() - 1; i >= 0; i--) {
            char s = S.charAt(i);
            if (s == '/') break;
            str += String.valueOf(S.charAt(i));
        }
        StringBuilder ss = new StringBuilder(str);
        ss = ss.reverse();
        int so = Integer.parseInt(ss.toString());
        so = 2021 - so;
        System.out.println(so);
    }

}


