package TemplateMethod;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/10-1:27
 * @Description:
 * 定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各
 * 类雇员对象的引用。利用循环结构遍历数组元素，输出各个对象的类
 * 型,name,number,birthday,以及该对象生日。当键盘输入本月月份值时，如果本
 * 月是某个Employee对象的生日，还要输出增加工资信息。
 **/
public class PayrollSystem {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Employee[] emps = new Employee[2];
        //MyDate myDate =new MyDate(1988,10,19);
        emps[0] = new SalariedEmployee("张三",1001,new MyDate(1999,10,12),10000);
        emps[1] = new HourlyEmployee("李四",1002,new MyDate(2001,5,3),
                60,240);
        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i]);
            double salary = emps[i].earnings();
            //System.out.println(calendar.get(Calendar.MONTH));
            //System.out.println(emps[i].getBirthday().getMonth());
            if (emps[i].getBirthday().getMonth() == (calendar.get(Calendar.MONTH) +1)){
                System.out.println("生日快乐，奖励100元");
                salary += 100;
            }
            System.out.println("月工资为：" + salary);
        }
    }
}
