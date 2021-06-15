package com.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/6/1-23:01
 * @Description:
 * Collection 接口中声明方法的测试
 **/
public class CollectionTest {
    @Test
    public void test(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(false);
        coll.add(new String("TOM"));
        //Person llp = new Person("llp", 20);
        //coll.add(llp);
        coll.add(new Person("llp",20));


        //1.contains(Object obj):判断当前集合中是否包含obj
        //我们在判断时会调用obj对象所在类的equals()。
        System.out.println("coll.contains(123) = " + coll.contains(123));
        System.out.println("coll.contains(new String(\"TOM\")) = " + coll.contains(new String("TOM")));
        //System.out.println("coll.contains(llp) = " + coll.contains(llp));
        System.out.println("coll.contains(new Person(\"llp\",20)) = " + coll.contains(new Person("llp", 20)));

        //2.containsAll(Collection coll1):判断形参coll1中的所有元素是否都存在于当前集合中。
        Collection coll1 = Arrays.asList(123,456);

        System.out.println("coll.containsAll(coll1) = " + coll.containsAll(coll1));

    }
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(false);
        coll.add(new String("TOM"));
        coll.add(new Person("llp",20));
        System.out.println("coll = " + coll);
        coll.remove(123);
        System.out.println("coll = " + coll);
        //4. removeAll(Collection coll1):差集：从当前集合中移除coll1中所有的元素。
        Collection coll1 = Arrays.asList(123,456);
        coll.removeAll(coll1);
        System.out.println("coll = " + coll);
    }
    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(false);
        coll.add(new String("TOM"));
        coll.add(new Person("llp",20));
        System.out.println("coll = " + coll);
        //Collection coll1 = Arrays.asList(123,456,789);
        ////retainAll 求两个集合的交集
        //coll.retainAll(coll1);
        //System.out.println("coll = " + coll);

        //6.equals(Object obj):要想返回true，需要当前集合和形参集合的元素都相同。
        Collection coll1 = new ArrayList();
        coll1.add(123);
        coll1.add(456);
        coll1.add(false);
        coll1.add(new String("TOM"));
        coll1.add(new Person("llp",20));
        System.out.println(coll.equals(coll1));

        //7.hashcode 返回当前对象哈希值

        System.out.println("coll.hashCode() = " + coll.hashCode());
        //8.集合----->Array数组：toArray
        Object[] array = coll.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[i] = " + array[i]);
        }
        //数组--->集合
        List<String> list = Arrays.asList(new String[]{"AA", "BB"});

        System.out.println("strings = " + list);
        System.out.println("list.size() = " + list.size());
        //9.iterator():返回Iterator接口的实例，用于遍历集合元素。放在IteratorTest.java中测试
    }
}
