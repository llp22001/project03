package com.opp.junit;

import org.junit.Test;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/5-23:49
 * @Description:
 * ��װ���ʹ��
 * java �ṩ��8�ֻ����������Ͷ�Ӧ�İ�װ�ࡢ
 * ���ջ����������͡���װ�ࡢString����֮���ת��
 **/
public class WapperTest {
    //������������ת���ɰ�װ��
    @Test
    public void test1(){
        int num1 = 10;
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());
        Integer in2 = new Integer("123");
        System.out.println("in2.toString() = " + in2.toString());

    }
    //��װ��ת��������������
    @Test
    public void test2(){
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        System.out.println(i1 +2);
    }
    //��װ����Զ�װ�� ���Զ�����
    //�����������͡���װ��-----> String   ����ת��
    @Test
    public void test03(){
        int i = 10;
        Integer i1 = i;

        int i2 = i1;
        String num1 = i + "";

        String.valueOf(i);//ת����String

        Double d1 = new Double(12.4);
        String d = String.valueOf(d1);


    }
    //String ----> �����������͡���װ��,���ð�װ����еķ���parsexxx()
    @Test
    public void test04(){
        String str1 = "123";
        //�������
        //int num1 = (int) str1;
        //Integer in1 = (Integer) str1;
        int i = Integer.parseInt(str1);

        String str2 = "true";

        boolean b1 = Boolean.parseBoolean(str2);

    }

}
