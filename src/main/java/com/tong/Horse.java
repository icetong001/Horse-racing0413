package com.tong;

public class Horse extends Thread{   //Thread
    @Override
    public void run() {
        for (int i=0;i<10000;i++){
            System.out.println(getName()+" "+i);
        }
    }
}
