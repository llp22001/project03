package com.java1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/5/20-0:05
 * @Description:
 * * 解决线程安全问题的方式三：Lock锁  --- JDK5.0新增
 *  *
 *  * 1. 面试题：synchronized 与 Lock的异同？
 *  *   相同：二者都可以解决线程安全问题
 *  *   不同：synchronized机制在执行完相应的同步代码以后，自动的释放同步监视器
 *  *        Lock需要手动的启动同步（lock()），同时结束同步也需要手动的实现（unlock()）
 *  *
 *  * 2.优先使用顺序：
 *  * Lock  同步代码块（已经进入了方法体，分配了相应资源）  同步方法（在方法体之外）
 *  *
 *  *
 *  *  面试题：如何解决线程安全问题？有几种方式
 **/
class Window5 implements Runnable{

    private ReentrantLock lock = new ReentrantLock();
    private int ticket = 100;
    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "售票：票号为#" + ticket);
                    ticket--;
                }else {
                    break;
                }
            } finally {
                lock.unlock();
            }
        }

    }
}
public class LockTest {
    public static void main(String[] args) {
        Window5 w5 = new Window5();

        Thread t1 = new Thread(w5);
        Thread t2 = new Thread(w5);
        Thread t3 = new Thread(w5);
        t1.setName("窗口1::");
        t2.setName("窗口2::");
        t3.setName("窗口3::");

        t1.start();
        t2.start();
        t3.start();
    }
}
