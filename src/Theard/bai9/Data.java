/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theard.bai9;

import java.util.Vector;

/**
 *
 * @author ADMIN
 */
public class Data {
    Vector<Integer> v;
    private int  index;
    private boolean running;

    public Data() {
        v=new Vector<>();
        running=true;
        index=1;
    }
    public void add(int x){
        v.add(x);
    }
    public int get(){
        return v.remove(0);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
    
    
}
