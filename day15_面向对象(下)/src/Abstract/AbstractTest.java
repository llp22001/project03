package Abstract;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/9-23:56
 * @Description: abstract ����
 * ������ ������,����ʵ����
 * ���η��� ���󷽷�,ֻ��������û�з�����
 * �г��󷽷����� һ���ǳ�����
 * ���󷽷���һ���г��󷽷�
 *
 * abstract �����������ԣ�������
 * ��������private �������������ξ�̬��������������final��������������final��
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
                System.out.println("��������Ķ���");
            }
        };
        p1.eat();
        method(new Person() {
            @Override
            public void eat() {
                System.out.println("�������࣬���������");
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
    //    System.out.println("�Է�");
    //}
    //���󷽷�
    public abstract void eat();
    public void walk(){
        System.out.println("��·");
    }

}

class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("ѧ�������Ӫ����");
    }
}