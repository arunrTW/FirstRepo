package com.threadsExample;

class IncrementClass {
    int count;
    public synchronized void IncrementMethod() {
        count++;
    }
}

public class SynchronisedExample {
    public static void main(String[] args) throws InterruptedException {
        IncrementClass c = new IncrementClass();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<=1000; i++) {
                    c.IncrementMethod();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<=1000; i++) {
                    c.IncrementMethod();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
