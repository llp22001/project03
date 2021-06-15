package com.expr;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/6/4-22:06
 * @Description:
 **/
public class CollectionTest {
    @Test
    public void test(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(227);
        coll.add(156);
        coll.add(879);
        coll.forEach(System.out::println);
    }
    public static List duplicateList(List list){
        HashSet set = new HashSet();
        set.addAll(list);
        return new ArrayList(set);
    }
    @Test
    public void test2(){
        List list = new ArrayList();
        list.add(new Integer(1));
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(3));
        List list2 = duplicateList(list);
        for (Object o : list2) {
            System.out.println(o);
        }
    }
    @Test
    public void test3(){
        HashSet set = new HashSet();
        Person p1 = new Person(1001 , "AA");
        Person p2 = new Person(1002, "BB");
        set.add(p1);
        set.add(p2);
        p1.setName("CC");
        set.remove(p1);

        System.out.println(set);

        set.add(new Person(1001,"CC"));
        System.out.println(set);
        set.add(new Person(1001,"AA"));
        System.out.println(set);
    }

}
