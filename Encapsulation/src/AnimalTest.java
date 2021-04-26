import java.lang.reflect.Constructor;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/4/26-0:48
 * @Description:
 *
 * 面向对象特征一：封装与隐藏
 **/
public class AnimalTest {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.setName("花花");
        a.setAge(1);
        //a.legs = 4;
        a.setLegs(-6);
        a.show();

    }
}

class Animal{

    //构造器
    public Animal() {

    }

    private String name;
    private int age;
    private int legs;

    public void  setLegs( int legs){
        if( legs >= 0 && legs % 2 == 0){
            this.legs = legs;
        }else{
            throw new RuntimeException("传入数据非法");
        }

    }
    public int getLegs() {
        return legs;
    }



    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat(){
        System.out.println("动物进食");
    }
    public void show(){
        System.out.println("name = " + name +" age = " + age + " legs = " + legs);
    }
}