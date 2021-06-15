package com.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/6/3-21:11
 * @Description:集合元素的遍历
 *  * 集合元素的遍历操作，使用迭代器Iterator接口
 *  * 1.内部的方法：hasNext() 和  next()
 *  * 2.集合对象每次调用iterator()方法都得到一个全新的迭代器对象，
 *  * 默认游标都在集合的第一个元素之前。
 *  * 3.内部定义了remove(),可以在遍历的时候，删除集合中的元素。此方法不同于集合直接调用remove()
 **/
public class IteratorTest {
    @Test
    public void test(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(false);
        coll.add(new String("TOM"));
        coll.add(new Person("llp",20));
        Iterator iterator = coll.iterator();
        //方式二
        //for (int i = 0; i < coll.size(); i++) {
        //
        //    System.out.println("iterator.next() = " + iterator.next());
        //}
        //方式三

        while (iterator.hasNext()){
            System.out.println("iterator.next() = " + iterator.next());

        }
    }
    //测试Iterator.remove
    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(false);
        coll.add(new String("TOM"));
        coll.add(new Person("llp",20));
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            if("TOM".equals(obj)){
                iterator.remove();
            }
        }
        iterator = coll.iterator();
        while (iterator.hasNext()){
            System.out.println("iterator.next() = " + iterator.next());
        }
    }
}
