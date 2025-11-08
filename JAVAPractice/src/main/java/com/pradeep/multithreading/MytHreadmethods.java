package com.pradeep.multithreading;

public class MytHreadmethods extends Thread{
    public void run() {
        while (true) {
            System.out.println("DDDThread is Running...");
        }
    }
    public static void main(String[] args) {
        MytHreadmethods mt=new MytHreadmethods();
        //mt.start();
        mt.setDaemon(true);
        mt.start();
        System.out.println("Main Done...");
    }
}
