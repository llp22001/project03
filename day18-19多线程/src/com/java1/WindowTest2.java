package com.java1;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/5/18-0:20
 * @Description:
 *
 * * 使用同步代码块解决继承Thread类的方式的线程安全问题
 *  *
 *  * 例子：创建三个窗口卖票，总票数为100张.使用继承Thread类的方式
 *  *
 *  * 说明：在继承Thread类创建多线程的方式中，慎用this充当同步监视器，考虑使用当前类充当同步监视器。
 **/
class  Window extends Thread{
    private static  int ticket = 100;
    //private static Object obj = new Object();
    @Override
    public void run() {
        //synchronized(obj) {

            while (true) {
                synchronized(Window.class) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + ":卖票，票号为：" + ticket);
                    ticket--;
                }else {
                    break;
                }
            }
        }
    }

    public Window() {
    }

    public Window(String name) {
        super(name);
    }
}

public class WindowTest2 {
    public static void main(String[] args) {
        Window t1 = new Window("窗口1");
        Window t2 = new Window("窗口2");
        Window t3 = new Window("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
