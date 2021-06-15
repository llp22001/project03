package com.expr;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/6/4-22:52
 * @Description:
 **/
public class EmployeeTest {
    @Test
    public void test2() {

        TreeSet<Employee> set = new TreeSet<>(new Comparator<Employee>() {
            //使用泛型之后的
            @Override
            public int compare(Employee o1, Employee o2) {
                MyDate b1 = o1.getBirthday();
                MyDate b2 = o2.getBirthday();
                return b1.compareTo(b2);
            }
            //使用泛型之前的方式
        //    @Override
        //    public int compare(Object o1, Object o2) {
        //        if (o1 instanceof Employee && o2 instanceof Employee) {
        //            Employee e1 = (Employee) o1;
        //            Employee e2 = (Employee) o2;
        //            MyDate b1 = e1.getBirthday();
        //            MyDate b2 = e2.getBirthday();
        //            //    方式一
        //            //    int minusYear = b1.getYear() - b2.getYear();
        //            //    if (minusYear != 0) {
        //            //        return minusYear;
        //            //    }
        //            //    int minusMonth = b1.getMonth() - b2.getMonth();
        //            //    if (minusMonth != 0) {
        //            //        return minusMonth;
        //            //    }
        //            //    return Integer.compare(b1.getDay(), b2.getDay());
        //            //}
        //            //throw new RuntimeException("输入数据类型错误");
        //            //方式二
        //            return b1.compareTo(b2);
        //        }
        //        throw new RuntimeException("输入数据类型错误");
        //    }
        });

        Employee e1 = new Employee("llp1", 20, new MyDate(1999, 10, 1));
        Employee e2 = new Employee("jack", 21, new MyDate(1999, 12, 10));
        Employee e3 = new Employee("tom", 33, new MyDate(1988, 05, 6));
        Employee e4 = new Employee("lilei", 19, new MyDate(2001, 03, 22));
        Employee e5 = new Employee("hanmeimei", 54, new MyDate(2001, 03, 13));
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        Iterator<Employee> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //自然排序
    @Test
    public void test() {
        TreeSet<Employee> set = new TreeSet<>();
        Employee e1 = new Employee("llp1", 20, new MyDate(1999, 10, 1));
        Employee e2 = new Employee("jack", 21, new MyDate(200, 12, 10));
        Employee e3 = new Employee("tom", 33, new MyDate(1988, 5, 6));
        Employee e4 = new Employee("lilei", 19, new MyDate(2001, 3, 22));
        Employee e5 = new Employee("hanmeimei", 54, new MyDate(1974, 7, 17));
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        Iterator<Employee> iterator = set.iterator();
        while (iterator.hasNext()) {
            Employee next = iterator.next();
            System.out.println(next);
        }
        //set.forEach(System.out::println);

    }
}
