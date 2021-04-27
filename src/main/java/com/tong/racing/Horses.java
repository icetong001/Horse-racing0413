package com.tong.racing;

public class Horses extends Thread{   //Thread
    @Override
    public void run() {
        for (int i=0;i<10000;i++){
            System.out.println(getName()+" "+i);
        }
    }
}
