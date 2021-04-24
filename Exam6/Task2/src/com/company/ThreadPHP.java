package com.company;

public class ThreadPHP extends Thread{
    @Override
    public void run() {
        System.out.println(getName() + " PHP");
    }
}
