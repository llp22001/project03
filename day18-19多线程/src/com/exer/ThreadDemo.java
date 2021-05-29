package com.exer;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/5/17-23:20
 * @Description:创建两个线程，一个线程遍历100以内的偶数，一个遍历100以内的积数
 **/
public class ThreadDemo {
    public static void main(String[] args) {
        //MyThread1 t1 = new MyThread1();
        //MyThread2 t2 = new MyThread2();
        //t1.start();
        //t2.start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0){
                        System.out.println("100以内的偶数:" + i  );
                    }
                }
            }
        }.start();
    }

}
class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println("100以内的偶数:" + i  );
            }
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0){
                System.out.println("100以内的奇数:" + i  );
            }
        }
    }
}

