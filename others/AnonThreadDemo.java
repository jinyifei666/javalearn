package com.jinyifei.lessons.others;


public class AnonThreadDemo {
    public static void main(String[] args) {
//        new Thread(new Runnable(){
//
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName() + " is running");
//
//            }
//        }, "MyThread").start();
        for(int j=0;j<10;j++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("start");
                    for (int i = 0; i < 100; i++) {
                        new MyThread1().start();
                        new Thread(new MyThread2()).start();
                    }
                }
            }).start();
        }

    }
}

class MyThread1 extends Thread{

    public static int i=0;

    @Override
    public void run(){
        System.out.println("MyThread1:"+String.valueOf(i));
        i++;
    }

}
class MyThread2 implements Runnable{

    static int j=0;
    @Override
    public void run() {
        System.out.println("MyThread2:"+String.valueOf(j));
        j++;
    }
}
