package Theard.objetc;

import java.util.ArrayList;

public class Thread3 extends Thread{

    final Data d;

    final ArrayList<SinhVien> list;

    public Thread3(ArrayList<SinhVien> list, Data d) {
        this.list = list;
        this.d = d;
    }

    public void run(){
        while(true){
            synchronized(d){
                if(!d.isCheck())
                    break;
                synchronized (list){
                    for (SinhVien sv: list
                         ) {
                        if(sv.getXeploai()==null){
                            float gpa = (sv.getDiem1()+sv.getDiem2()+ sv.getDiem3())/3;
                            if(gpa<5){
                                sv.setXeploai("yeu");
                            }
                            else if(5<=gpa && gpa<6.5){
                                sv.setXeploai("trung binh");
                            }
                            else if(6.5<=gpa && gpa<8){
                                sv.setXeploai("kha");
                            }
                            else {
                                sv.setXeploai("gioi");
                            }
                            System.out.println(sv.toString());
                        }
                    }
                }
            }
        }
        System.out.println("T2 STOP");
        synchronized(d){
            stop();
        }
    }
}
