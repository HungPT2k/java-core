
package Theard.ex1;


public class Main1 {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println(t.getName()+" START");
        for (int i = 0; i < 5; i++) {
            System.out.println(t.getName()+":"+i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        DeamonThread t0=new DeamonThread();
        t0.setDaemon(true);
        t0.start();
        
        
        ThreadDemo t1=new ThreadDemo("Gio Moi");
        System.out.println(t1.getName()+":"+t1.getState());
        t1.start();
        System.out.println(t1.getName()+":"+t1.getState());
        
        RunnableDemo r=new RunnableDemo("Nhom 4");
        Thread t2=new Thread(r);
        t2.start();
        
        System.out.println(t.getName()+" STOP");
    }
}
