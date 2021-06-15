package com.expr1;

import org.junit.Test;

import java.util.Iterator;
import java.util.List;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/6/13-18:39
 * @Description:
 *  * 创建 DAO 类的对象， 分别调用其 save、get、update、list、delete 方法来操作 User 对象，
 *  使用 Junit 单元测试类进行测试。
 **/
public class DAOTest {
    @Test
    public void test1(){
        DAO<User> dao = new DAO<>();
        dao.save("1",new User(1,20,"张三"));
        dao.save("2",new User(2,21,"李四"));
        dao.save("3",new User(3,22,"王五"));
        User user = dao.get("1");
        System.out.println("user = " + user);
        List<User> list = dao.list();
        list.forEach(System.out::println);

        System.out.println("*********************************************************");
        dao.update("2",new User(1,33,"徐六"));
        List<User> list1 = dao.list();
        list1.forEach(System.out::println);

        System.out.println("*********************************************************");
        dao.delete("2");
        List<User> list2 = dao.list();
        list2.forEach(System.out::println);

        //    Iterator<User> iterator = list.iterator();
    //    while (iterator.hasNext()){
    //        System.out.println("iterator.next() = " + iterator.next());
    //    }
    }
}
