package test01;

import com.sun.org.apache.bcel.internal.generic.POP2;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/1-15:40
 * @Description:对象类型强制转换
 * instanceof
 **/
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Man("llp",18);
        p1.eat();
        p1.walk();

        Man p2 = (Man) p1;
        p2.earnMoney();
        p2.setSmoking(true);

    //    a instanceof A 判断对象a是否是类A的一个实例
    //    if(p2 instanceof Woman){
    //        Woman w1 = (Woman)p2;
    //        w1.shoping();
    //    }
    }
}
