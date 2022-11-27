package Theard.Kiemtra1;

import Theard.objetc.Data;

import java.util.ArrayList;

public class Thread2 extends Thread{
    final ArrayList<Phuong_an> a;
    final ArrayList<Cau_hoi> list2;

    final Data d;
    public Thread2(ArrayList<Phuong_an> pa, ArrayList<Cau_hoi> list2, Data d) {
        a = pa;
        this.list2 = list2;
        this.d = d;
    }

    public void run(){
        while(true){
            synchronized(d){
                d.notifyAll();
                while(d.getIndex()!=2 && d.isCheck()){
                    try{
                        d.wait();
                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
                }
                if(!d.isCheck())
                    break;
                synchronized (list2){
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

                  //  list.add(new SinhVien(name,Float.parseFloat(diems[0]),Float.parseFloat(diems[1]),Float.parseFloat(diems[2])));
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

