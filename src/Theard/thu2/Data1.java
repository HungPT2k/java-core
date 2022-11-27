package Theard.thu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Data1 {
    private int Index=1;
    public int diem=0;
    private boolean Check=true;
    private String S1;
    private String S2;

    public int getDiem() {
        return diem;
    }

    public void setDiem() {
        this.diem ++;
    }

    public String getS1() {
        return S1;
    }

    public void setS1(String s1) {
        S1 = s1;
    }

    public String getS2() {
        return S2;
    }

    public void setS2(String s2) {
        S2 = s2;
    }

    public boolean isCheck() {
        return Check;
    }

    public void setCheck(boolean check) {
        Check = check;
    }

    public int getIndex() {
        return Index;
    }

    public void setIndex(int index) {
        Index = index;
    }


    public int Max(String s)
    {
        ArrayList<Integer> Arr=new ArrayList<>();
        String[] w=s.split("\\s");
        for( int i=0 ; i<w.length ; i++)
        {
            int a=Integer.valueOf(w[i]);
            Arr.add(a);
        }
       Arr.sort(Comparator.naturalOrder());
        return Arr.get(Arr.size()-1);
    }
    public int Min(String s)
    {
        ArrayList<Integer> Ar=new ArrayList<>();
        String[] w=s.split("\\s");
        for( int i=0 ; i<w.length ; i++)
        {
            int a=Integer.valueOf(w[i]);
            Ar.add(a);
        }
       Ar.sort(Comparator.naturalOrder());
        return Ar.get(0);
    }
    public int Sum(String s)
    {   int sum=0;
        String[] w=s.split("\\s");
        for( int i=0 ; i<w.length ; i++)
        {
            int a=Integer.valueOf(w[i]);
           sum+=a;
        }
        return sum;
    }
}
