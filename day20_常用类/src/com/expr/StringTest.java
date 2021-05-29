package com.expr;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/5/22-18:58
 * @Description:
 **/
public class StringTest {

    String str = new String("good");
    char[] ch = { 't', 'e', 's', 't' };

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'b';
    }
    public static void main(String[] args) {
        StringTest ex = new StringTest();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str);//good
        System.out.println(ex.ch);//best
    }
}

