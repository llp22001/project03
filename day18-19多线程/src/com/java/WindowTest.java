package com.java;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/5/18-0:20
 * @Description:
 *
 * eg:创建三个窗口买票总票数100张
 **/
class  Window extends Thread{
    private static  int ticket = 100;

    @Override
    public void run() {
        while (ticket > 0){
            System.out.println(getName() + ":卖票，票号为：" + ticket);
            ticket--;
        }
    }

    public Window() {
    }

    public Window(String name) {
        super(name);
    }
}
public class WindowTest {
    public static void main(String[] args) {
        Window t1 = new Window("窗口1");
        Window t2 = new Window("窗口2");
        Window t3 = new Window("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
