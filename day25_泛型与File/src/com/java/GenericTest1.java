package com.java;

import org.junit.Test;

import javax.crypto.interfaces.PBEKey;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/6/13-16:55
 * @Description:
 *  如何自定义泛型结构：泛型类、泛型接口；泛型方法。
 *  *
 *  * 1. 关于自定义泛型类、泛型接口：
 **/
public class GenericTest1 {
    @Test
    public void test(){
        //如果定义了泛型类，实例化没有指明类的泛型，则认为此泛型类型为Object类型
        //要求：如果大家定义了类是带泛型的，建议在实例化时要指明类的泛型。
        Order order = new Order();
        order.setOrderT(123);
        order.setOrderT("ABS");
        //建议：实例化时指明类的泛型
        Order<String> stringOrder = new Order<>("llp",12,"STU");

        stringOrder.setOrderT("TEACH");
    }
    @Test
    public void test2(){
        SubOrder subOrder = new SubOrder();
        //由于子类在继承带泛型的父类时，指明了泛型类型。则实例化子类对象时，不再需要指明泛型。
        subOrder.setOrderT(1122);
    }
    @Test
    public void test3(){
        SubOrder1<String> sub1 = new SubOrder1<>();
        sub1.setOrderT("AAA");
    }
    @Test
    public void test4(){
        ArrayList<String> list1 = null;
        ArrayList<Integer> list2 = null;
        //泛型不同的引用不能相互赋值
        //list1 = list2;
        Person p1 = null;
        Person p2 = null;
        p1 = p2;


    }
    //泛型方法的测试
    @Test
    public void test5(){
        Order<String> order1 = new Order<>();
        Integer[] arr = new Integer[]{1,2,3,4};
        List<Integer> integers = order1.copyFromArrayToList(arr);
        System.out.println(integers);
    }
}

