package com.threadsExample;

//class Hi implements Runnable {
//    public void run() {
//        for(int i=0;i<5;i++) {
//            System.out.println("Hi");
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//        }
//    }
//}

//class Hello implements Runnable {
//    public void run() {
//        for(int i=0;i<5;i++) {
//            System.out.println("Hello");
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}


public class ThreadsEg {
    public static void main(String[] args) throws InterruptedException {
//        Runnable obj1 = () -> {
//                for(int i=0;i<5;i++) {
//                    System.out.println("Hi");
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//
//                }
//            }
//        };
//        Runnable obj2 = () -> {
//                for(int i=0;i<5;i++) {
//                    System.out.println("Hello");
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//
//        };
        Thread t1 = new Thread(() -> {
            for(int i=0;i<5;i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
        Thread t2 = new Thread(() -> {
            for(int i=0;i<5;i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }, "HiThread");
        t1.setPriority(Thread.MIN_PRIORITY);

        System.out.println(t1.getName() + " " + t1.getPriority());
        System.out.println(t2.getName() + " " + t2.getPriority());

        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        System.out.println(t1.isAlive());
        t1.join();
        t2.join();
        System.out.println(t1.isAlive());
        System.out.println(t1.isInterrupted());

        System.out.println("Bye");
    }
}
