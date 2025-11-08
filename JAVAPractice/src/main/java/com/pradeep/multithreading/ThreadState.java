package com.pradeep.multithreading;

public class ThreadState extends Thread{
    public void run(){
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e)  {
            System.out.println(e);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        ThreadState t1=new ThreadState();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(10);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
    }
}
