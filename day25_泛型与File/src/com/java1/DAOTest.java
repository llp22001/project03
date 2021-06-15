package com.java1;

import org.junit.Test;

import java.util.List;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/6/13-17:43
 * @Description:
 **/
public class DAOTest {
    @Test
    public void test(){
        CustomerDAO dao1 = new CustomerDAO();
        dao1.add(new Customer());
        List<Customer> forList = dao1.getForList(1);

        StudentDAO dao2 = new StudentDAO();
        dao2.add(new Student());
        List<Student> forList1 = dao2.getForList(10);
    }
}
