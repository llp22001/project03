package TemplateMethod;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/10-1:27
 * @Description:
 * ����PayrollSystem�࣬����Employee�������鲢��ʼ�����������Ÿ�
 * ���Ա��������á�����ѭ���ṹ��������Ԫ�أ���������������
 * ��,name,number,birthday,�Լ��ö������ա����������뱾���·�ֵʱ�������
 * ����ĳ��Employee��������գ���Ҫ������ӹ�����Ϣ��
 **/
public class PayrollSystem {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Employee[] emps = new Employee[2];
        //MyDate myDate =new MyDate(1988,10,19);
        emps[0] = new SalariedEmployee("����",1001,new MyDate(1999,10,12),10000);
        emps[1] = new HourlyEmployee("����",1002,new MyDate(2001,5,3),
                60,240);
        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i]);
            double salary = emps[i].earnings();
            //System.out.println(calendar.get(Calendar.MONTH));
            //System.out.println(emps[i].getBirthday().getMonth());
            if (emps[i].getBirthday().getMonth() == (calendar.get(Calendar.MONTH) +1)){
                System.out.println("���տ��֣�����100Ԫ");
                salary += 100;
            }
            System.out.println("�¹���Ϊ��" + salary);
        }
    }
}
