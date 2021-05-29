package com.java1;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/6-23:50
 * @Description:懒汉式 单例模式 线程安全的
 **/
public class SingletonTest2 {
    public static void main(String[] args) {
        Order o1 = Order.getInstance();
        Order o2 = Order.getInstance();
        System.out.println(o1 == o2);
    }
}

class Order{
    private Order(){

    }
    private static Order instance = null;

    public static  Order getInstance(){
        //方式一：效率比较差
        //synchronized (Order.class) {
        //    if (instance == null){
        //        instance = new Order();
        //    }
        //    return instance;
        //}

        //方式二
        if (instance == null) {
            synchronized (Order.class) {
                if (instance == null) {
                    instance = new Order();
                }
            }
        }
        return instance;
    }


}
