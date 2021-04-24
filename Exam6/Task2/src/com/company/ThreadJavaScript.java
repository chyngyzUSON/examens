package com.company;

public class ThreadJavaScript extends Thread{
    @Override
    public void run() {
        System.out.println(getName() + " JS");
    }
}
