package InstanceTest;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/4-17:47
 * @Description:
 **/
public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();
        test.method(new Student());
    }

    public void  method( Person e){
        String info = e.getInfo();
        System.out.println("info = " + info);
        if ( e instanceof  Graduate){
            System.out.println("a graduate studet");
            System.out.println("a  studet");
            System.out.println("a  person");
        }else if (e instanceof Student){
            System.out.println("a  studet");
            System.out.println("a  person");
        }else{
            System.out.println("a  person");
        }
    }
}
class Person{
    protected  String name="person";
    protected int age = 50;
    public String getInfo() {
        return "Name:" + name + "\n" + "age" + age;
    }
}
class Student extends Person{
    protected  String school="pku";

    @Override
    public String getInfo() {
        return "Name:" + name + "\n" + "age" + age + "\nschool" + school;
    }
}
class  Graduate extends Student{
    public String major="IT";

    @Override
    public String getInfo() {
        return "Name:" + name + "\n" + "age" + age +
                "\nschool" + school + "\nmajor" + major;
    }
}