package com.java1;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/5/19-23:31
 * @Description:
 **/
class Window4 extends Thread {
    private static int ticket = 100;

    //private static Object obj = new Object();
    @Override
    public void run() {
        //synchronized(obj) {

        while (true) {
            show();
        }
    }
    private static synchronized void show(){
        if (ticket > 0) {
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
            ticket--;
        }
    }
    public Window4() {
    }

    public Window4(String name) {
        super(name);
    }
}

public class WindowTest4 {
    public static void main(String[] args) {
        Window4 t1 = new Window4("窗口1");
        Window4 t2 = new Window4("窗口2");
        Window4 t3 = new Window4("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
