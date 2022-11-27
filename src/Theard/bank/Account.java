
package Theard.bank;

/**
 *
 * @author ADMIN
 */
public class Account {
    private long balance=3000;
    public synchronized boolean check(long value){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        return value<balance;
    }
    public synchronized void withdraw(String name,long value){
        System.out.println(name+" withdraw "+value);
        
        if(!check(value)){
            try{
                System.out.println("Waiting!!");
                wait();
            }catch(InterruptedException e){
                System.out.println(e);
            }
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        
        }
        balance-=value;
        System.out.println(name+" successfull");
        
        System.out.println(" balance: "+balance);
    }
    public synchronized void deposite(String name,long value){
        System.out.println(name+" deposite "+value);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        balance+=value;
        notify();
    }
    
}
