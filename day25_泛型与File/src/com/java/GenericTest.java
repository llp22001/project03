package com.java;

import org.junit.Test;

import java.util.*;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/6/13-15:28
 * @Description:泛型的使用
 * * 泛型的使用
 *  * 1.jdk 5.0新增的特性
 *  *
 *  * 2.在集合中使用泛型：
 *  *  总结：
 *  *  ① 集合接口或集合类在jdk5.0时都修改为带泛型的结构。
 *  *  ② 在实例化集合类时，可以指明具体的泛型类型
 *  *  ③ 指明完以后，在集合类或接口中凡是定义类或接口时，内部结构（比如：方法、构造器、属性等）使用到类的泛型的位置，都指定为实例化的泛型类型。
 *  *    比如：add(E e)  --->实例化以后：add(Integer e)
 *  *  ④ 注意点：泛型的类型必须是类，不能是基本数据类型。需要用到基本数据类型的位置，拿包装类替换
 *  *  ⑤ 如果实例化时，没有指明泛型的类型。默认类型为java.lang.Object类型。
 *  *
 *  * 3.如何自定义泛型结构：泛型类、泛型接口；泛型方法。见 GenericTest1.java
 **/
public class GenericTest {
    //在集合使用泛型之前的情况
    @Test
    public void test(){
        ArrayList list = new ArrayList();
        list.add(77);
        list.add(79);
        list.add(87);
        list.add(67);
        //问题一：类型不安全
        //list.add("Tom");
        for (Object score : list) {
            //问题二：强转时，可能出现ClassCastExcetion
            int stuScore = (int) score;

            System.out.println("stuScore = " + stuScore);
        }


    }
    @Test
    //在集合使用泛型的情况 以ArrayList 举例
    public void test1(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(77);
        list.add(79);
        list.add(99);
        list.add(67);
        //编译是进行类型检查
        //list.add("tom");
        //方式一
    //    for (Integer integer : list) {
    //        //避免了强转操作
    //        int stuScore = integer;
    //        System.out.println("stuScore = " + stuScore);
    //    }
        //方式二
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println("next = " + next);
        }
    }
    //在集合使用泛型的情况 以HashMap举例
    @Test
    public void test2(){
        //JDK7 特性，类型推断
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"llp");
        map.put(2,"222");
        map.put(3,"333");

        System.out.println("map = " + map);

        Set<Map.Entry<Integer,String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = set.iterator();

        while (iterator.hasNext()){
            Map.Entry<Integer, String> next = iterator.next();

            System.out.println("key=" + next.getKey() + " value=" + next.getValue());
        }

    }

}
