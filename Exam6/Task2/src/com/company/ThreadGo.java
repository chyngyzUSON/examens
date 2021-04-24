package com.company;

public class ThreadGo extends Thread{
    @Override
    public void run() {
        System.out.println(getName() + " Go");
    }
}
