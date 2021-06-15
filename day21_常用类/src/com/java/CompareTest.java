package com.java;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/5/29-13:36
 * @Description:Java中compare的测试 * 一、说明：Java中的对象，正常情况下，只能进行比较：==  或  != 。不能使用 > 或 < 的
 * *          但是在开发场景中，我们需要对多个对象进行排序，言外之意，就需要比较对象的大小。
 * *          如何实现？使用两个接口中的任何一个：Comparable 或 Comparator
 * *
 * * 二、Comparable接口与Comparator的使用的对比：
 * *    Comparable接口的方式一旦一定，保证Comparable接口实现类的对象在任何位置都可以比较大小。
 * *    Comparator接口属于临时性的比较。
 **/
public class CompareTest {
    /**
     * Comparable 的比较测试
     * String 包装类 实现了Compareable 接口 重写了CompareTo的方法给出了比较两个对象大小的方式。
     * 2.像String、包装类重写compareTo()方法以后，进行了从小到大的排列
     * 3. 重写compareTo(obj)的规则：
     * 如果当前对象this大于形参对象obj，则返回正整数，
     * 如果当前对象this小于形参对象obj，则返回负整数，
     * 如果当前对象this等于形参对象obj，则返回零。
     * 4. 对于自定义类来说，如果需要排序，我们可以让自定义类实现Comparable接口，重写compareTo(obj)方法。
     * 在compareTo(obj)方法中指明如何排序
     */
    @Test
    public void test1() {
        String[] arr = new String[]{"AA", "GG", "MM", "CC", "TT", "EE"};
        Arrays.sort(arr);

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }


    @Test
    public void test2() {
        Goods[] arr = new Goods[5];
        arr[0] = new Goods("lenovoMouse", 35);
        arr[1] = new Goods("appleMouse", 55);
        arr[2] = new Goods("dellMouse", 44);
        arr[3] = new Goods("xiaomiMouse", 22);
        arr[4] = new Goods("huaweimouse", 44);
        Arrays.sort(arr);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }

    /*
        Comparator 接口的使用 定制排序
     1.背景：
    当元素的类型没有实现java.lang.Comparable接口而又不方便修改代码，
    或者实现了java.lang.Comparable接口的排序规则不适合当前的操作，
    那么可以考虑使用 Comparator 的对象来排序
    2.重写compare(Object o1,Object o2)方法，比较o1和o2的大小：
    如果方法返回正整数，则表示o1大于o2；
    如果返回0，表示相等；
    返回负整数，表示o1小于o2。
     */
    @Test
    public void test3() {
        Goods[] arr = new Goods[5];
        arr[0] = new Goods("lenovoMouse", 35);
        arr[1] = new Goods("appleMouse", 55);
        arr[2] = new Goods("dellMouse", 44);
        arr[3] = new Goods("xiaomiMouse", 22);
        arr[4] = new Goods("huaweimouse", 44);
        Arrays.sort(arr, new Comparator<Goods>() {
            @Override
            public int compare(Goods o1, Goods o2) {
                if (o1 instanceof Goods && o2 instanceof Goods){
                    Goods g1 = (Goods) o1;
                    Goods g2 = (Goods) o2;
                    if (g1.getName().equals(g2.getName())){
                        return Double.compare(g1.getPrice(),g2.getPrice());
                    }else{
                        return g1.getName().compareTo(g2.getName());
                    }
                }
                throw new RuntimeException("数据类型不一致");
            }
        });
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }

}
