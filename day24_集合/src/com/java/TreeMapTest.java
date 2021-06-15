package com.java;

import org.junit.Test;

import java.util.*;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/6/9-0:08
 * @Description:
 **/
public class TreeMapTest {
    //向TreeMap中添加key-value，要求key必须是由同一个类创建的对象
    //因为要按照key进行排序：自然排序 、定制排序
    //自然排序
    @Test
    public void test(){

        TreeMap map = new TreeMap();
        User u1 = new User("llp",19);
        User u2 = new User("jack",20);
        User u3 = new User("tom",30);
        User u4 = new User("marry",44);
        map.put(u1,77);
        map.put(u2,79);
        map.put(u3,88);
        map.put(u4,67);
        Set set1 = map.entrySet();
        //set1.forEach(System.out::println);
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()){
            Object obj = iterator1.next();
            Map.Entry entry = (Map.Entry)obj;
            System.out.println( entry.getKey() + "-------"  + entry.getValue());

        }
    }
    //定制排序
    @Test
    public void test2(){
        TreeMap map = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof  User && o2 instanceof User){
                    User u1 = (User) o1;
                    User u2 = (User) o2;
                    return Integer.compare(u1.getAge() , u2.getAge());
                }
                throw new RuntimeException("输入类型不匹配");
            }
        });
        User u1 = new User("llp",19);
        User u2 = new User("jack",20);
        User u3 = new User("tom",30);
        User u4 = new User("marry",44);
        map.put(u1,77);
        map.put(u2,79);
        map.put(u3,88);
        map.put(u4,67);
        Set set1 = map.entrySet();
        //set1.forEach(System.out::println);
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()){
            Object obj = iterator1.next();
            Map.Entry entry = (Map.Entry)obj;
            System.out.println( entry.getKey() + "-------"  + entry.getValue());

        }
    }



}
