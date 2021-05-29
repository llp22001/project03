package com.opp.junit;

import org.junit.Test;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/5-23:49
 * @Description:
 * 包装类的使用
 * java 提供了8种基本数据类型对应的包装类、
 * 掌握基本数据类型、包装类、String三者之间的转换
 **/
public class WapperTest {
    //基本数据类型转换成包装类
    @Test
    public void test1(){
        int num1 = 10;
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());
        Integer in2 = new Integer("123");
        System.out.println("in2.toString() = " + in2.toString());

    }
    //包装类转换基本数据类型
    @Test
    public void test2(){
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        System.out.println(i1 +2);
    }
    //包装类的自动装箱 与自动拆箱
    //基本数据类型、包装类-----> String   类型转换
    @Test
    public void test03(){
        int i = 10;
        Integer i1 = i;

        int i2 = i1;
        String num1 = i + "";

        String.valueOf(i);//转换成String

        Double d1 = new Double(12.4);
        String d = String.valueOf(d1);


    }
    //String ----> 基本数据类型、包装类,调用包装类的中的方法parsexxx()
    @Test
    public void test04(){
        String str1 = "123";
        //错误情况
        //int num1 = (int) str1;
        //Integer in1 = (Integer) str1;
        int i = Integer.parseInt(str1);

        String str2 = "true";

        boolean b1 = Boolean.parseBoolean(str2);

    }

}
