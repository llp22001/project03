package com.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/6/3-22:07
 * @Description:
 * 增强for循环
 **/
public class ForTest {
    @Test
    public void test(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(false);
        coll.add(new String("TOM"));
        coll.add(new Person("llp",20));
        //for(集合元素的类型 局部变量 : 集合对象)
        //内部仍然调用了迭代器。
        for (Object o : coll) {
            System.out.println("o = " + o);
        }
    }
    @Test
    public void test2(){
        int[] arr = new int[]{1,2,3,4,5};
        for (int i : arr) {
            System.out.println("i = " + i);
        }
    }
    //练习题
    @Test
    public void test3(){
        String[] arr = new String[]{"MM","MM","MM"};
        //for (int i = 0; i < arr.length; i++) {
        //    arr[i] = "GG";
        //}
        for (String s : arr) {
            s = "GG";
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
