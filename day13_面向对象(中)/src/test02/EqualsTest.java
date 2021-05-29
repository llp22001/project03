package test02;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/5-21:08
 * @Description:
 * == 和 equals  的区别
 * == 是运算符 ，可以使用在基本数据类型变量和引用数据类型变量中
 *   如果两个对象是引用型，比较两个对应的地址值是否相同
 * equals 是方法
 *   只能通过对象来调,
 *   自定义类，没有重写equals方法，调用的是object 的方法，比较两个地址值
 *   一般自定义类需要重写equals比较内容是否相同
 *   String,Date,File包装类中重写了equals方法
 **/
public class EqualsTest {
    public static void main(String[] args) {
        int i = 10;
        int j = 10;
        double d = 10.0;
        System.out.println(i == j);//true
        System.out.println(i == d);//true

        char c = 10;
        System.out.println(i == 10);//true
        char c1 = 'A';
        char c2 = 65;
        System.out.println(c1 == c2);//true
        Customer cust = new Customer("LLP",21);
        Customer cust1 = new Customer("LLP",21);
        System.out.println("cust.equals(cust2):"+cust.equals(cust1));
        System.out.println("cust.hashCode() = " + cust.hashCode());
        System.out.println("cust1.hashCode() = " + cust1.hashCode());
        System.out.println("cust.toString() = " + cust.toString());

        String str1 =  new String("llp");
        String str2 = new String("llp");
        System.out.println(str1 == str2 );//比较地址值
        System.out.println(str1.equals(str2));//比较内容
    }

}
