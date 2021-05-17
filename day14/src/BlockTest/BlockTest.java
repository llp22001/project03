package BlockTest;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/7-22:44
 * @Description:
 **/
public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.desc;

        Person p1 = new Person();
        Person p2 = new Person();
    }
}

class  Person{
    String name;
    int age;
    static  String desc = "我是一个人！";

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //static 代码块
    static {
        System.out.println("hello,static block");
    }
    //非static 代码块
    {
        System.out.println("hello block");
    }
}