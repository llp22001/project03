package Abstract;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/9-23:56
 * @Description: abstract 抽象
 * 修饰类 抽象类,不可实例化
 * 修饰方法 抽象方法,只有声明，没有方法体
 * 有抽象方法的类 一定是抽象类
 * 抽象方法不一定有抽象方法
 *
 * abstract 不能修饰属性，构造器
 * 不能修饰private 方法，不能修饰静态方法，不能修饰final方法，不能修饰final类
 **/
public class AbstractTest {
    public static void main(String[] args) {
        //Person p1 =new Person();
        //p1.eat();
        Student stu =new Student("llp",20);
        stu.eat();
        Person p1 = new Person() {
            @Override
            public void eat() {
                System.out.println("匿名子类的对象");
            }
        };
        p1.eat();
        method(new Person() {
            @Override
            public void eat() {
                System.out.println("匿名子类，匿名对象吃");
            }
        });
    }
    public static void method(Person person){
        person.eat();
    }
}

abstract class Person{
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name;
    int age;
    //public void eat(){
    //    System.out.println("吃饭");
    //}
    //抽象方法
    public abstract void eat();
    public void walk(){
        System.out.println("走路");
    }

}

class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("学生多吃有营养的");
    }
}