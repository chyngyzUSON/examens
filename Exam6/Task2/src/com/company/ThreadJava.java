package com.company;

public class ThreadJava extends Thread{
    @Override
    public void run() {
        System.out.println(getName() + " Java");
    }
}
