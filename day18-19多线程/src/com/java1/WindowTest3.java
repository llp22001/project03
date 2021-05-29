package com.java1;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/5/19-21:59
 * @Description:
 *  *  关于同步方法的总结：
 *  *  1. 同步方法仍然涉及到同步监视器，只是不需要我们显式的声明。
 *  *  2. 非静态的同步方法，同步监视器是：this
 *  *     静态的同步方法，同步监视器是：当前类本身
 **/
class Window3 implements Runnable{
    private int ticket = 100;
    @Override
    public void run() {

        while (true) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "卖票，票号为：" + ticket);
                    ticket--;
                }else {
                    break;
                }
            }
    }
}

public class WindowTest3 {
    public static void main(String[] args) {
        Window3 w1 = new Window3();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
