package Theard.objetc;

import java.util.ArrayList;

public class Thread2 extends Thread{
    final ArrayList<SinhVien> list;

    final Data d;

    public Thread2(ArrayList<SinhVien> list, Data d) {
        this.list = list;
        this.d = d;
    }

    public void run(){
        while(true){
            synchronized(d){
                d.notifyAll();
                while(d.getIndex()!=1 && d.isCheck()){
                    try{
                        d.wait();
                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
                }
                if(!d.isCheck())
                    break;
                synchronized (list){
                    String line =d.getLine();
                    int index=0;
                    for( int i=0;i<line.length();i++){
                        if(line.charAt(i) == ';'){
                           index=i;
                           break;
                        }
                    }
                    String name =line.substring(0,index);
                    String diem = line.substring(index+1).trim();
                    String[] diems = diem.split(" ");

                    list.add(new SinhVien(name,Float.parseFloat(diems[0]),Float.parseFloat(diems[1]),Float.parseFloat(diems[2])));
                }
            }
            d.setIndex(0);
        }
        System.out.println("T2 STOP");
        synchronized(d){
            stop();
        }
    }

}
