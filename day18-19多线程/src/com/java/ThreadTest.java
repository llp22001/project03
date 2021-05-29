package com.java;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/5/17-22:56
 * @Description:多线程的创建，继承Thread类
 * 1.创建一个thread的子类
 * 2.重新thread类的run方法
 * 3.创建thread 子类的对象
 * 4.调用thread 类的start() 方法
 * eg:遍历100以内的偶数
 **/
public class ThreadTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
        System.out.println("hello");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0 ){
                System.out.println(Thread.currentThread().getName() + ":" + "i = " + i);
            }

        }

    }

}
class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0 ){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }

        }
    }
}


