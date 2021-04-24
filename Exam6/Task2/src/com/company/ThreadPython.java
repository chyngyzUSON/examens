package com.company;

public class ThreadPython extends Thread{
    @Override
    public void run() {
        System.out.println(getName() + " Python");
    }
}
