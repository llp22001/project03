package com.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/6/13-16:52
 * @Description:
 **/
public class Order<T> {
    String orderName;
    int orderAge;
    //类的内部结构可以使用类的泛型
    T orderT;

    public Order(String orderName, int orderAge, T orderT) {
        this.orderName = orderName;
        this.orderAge = orderAge;
        this.orderT = orderT;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getOrderAge() {
        return orderAge;
    }

    public void setOrderAge(int orderAge) {
        this.orderAge = orderAge;
    }

    public T getOrderT() {
        return orderT;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", orderAge=" + orderAge +
                ", orderT=" + orderT +
                '}';
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    public Order() {
        //编译不通过
        //T[] arr = new T[10];
        T[] arr = (T[]) new Object[10];
    }

    //静态方法不能是泛型的
    public void show(){
        System.out.println(orderT);
    }

    //泛型方法：在方法中出现了泛型的结构，泛型参数与类的泛型参数没有任何关系。
    //换句话说，泛型方法所属的类是不是泛型类都没有关系。
    //泛型方法，可以声明为静态的。原因：泛型参数是在调用方法时确定的。并非在实例化类时确定。
    public static <E> List<E> copyFromArrayToList(E[] arr){

        ArrayList<E> list = new ArrayList<>();

        for(E e : arr){
            list.add(e);
        }
        return list;

    }
}
