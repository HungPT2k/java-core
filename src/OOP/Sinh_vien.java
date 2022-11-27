


import java.util.Scanner;

public class Sinh_vien {
    private String Name;
    private String MaSv;
    private String Date ;
    private float d1 ;
    public Sinh_vien ()
    {

    }
    public  Sinh_vien ( String Name ,String MaSv ,String Date ,float d1 )
    {
        this.Name=Name;
        this.Date=Date;
        this.MaSv=MaSv;
        this.d1=d1;
    }
    public  String getTong( )
    {
        for( int i=0 ; i<Date.length() ;i++)
        {
           int t,s;
           if(Date.indexOf('/')==1) Date = "0"+Date;
            t=Date.indexOf('/');
           s=Date.lastIndexOf('/');
           if((s-t)==2) Date = String.valueOf(Date.substring(0,t+1)+"0"+Date.substring(s-1));
        }
        return Date;
    }
    public  String getDiem( ) {
        return String.format("%.2f", this.d1);
    }
        public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMaSv() {
        return MaSv;
    }

    public void setMaSv(String maSv) {
        MaSv = maSv;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public float getD1() {
        return d1;
    }

    public void setD1(float d1) {
        this.d1 = d1;
    }


    @Override
    public String toString() {
        return    "B20DCCN001 "+ Name + ' '+MaSv+' ' + getTong() + ' ' + getDiem();
    }


}


