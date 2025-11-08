package com.pradeep.multithreading;

public class MyThread2 extends Thread {
    MyThread2(String name){
        super(name);
    }
    public void run(){
        for(int i=0; i<10;i++) {
            String a="";
            for(int j=0;j<100000;j++){
                a+="a";
            }
        }
        System.out.println("["+getName()+"]"+" Thraed Priority.."+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread2 l= new MyThread2("Pradeep");
        MyThread2 m=new MyThread2("Kumar");
        MyThread2 h= new MyThread2("Yadav");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();
       // t2.setPriority(Thread.NORM_PRIORITY);
        //t2.join();
        System.out.println("Thread-2");
    }

}
