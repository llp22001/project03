import javax.xml.ws.soap.Addressing;
import java.util.Scanner;

/**
 * @author Joost-Li
 * @date 2021/4/24-19:16
 **/
public class PersonTest1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "TOM";
        System.out.println("p1.name  = " + p1.name);
        p1.eat();
        p1.talk("我是谁？");

        Person p2 = new Person();
        p2.name = "llp";
        System.out.println("p2.name = " + p2.name);


    }
}
class Person {
    String name;
    int age;
    boolean isMale;
    public void  eat(){
        System.out.println("吃");
    }
    public  void sleep(){
        System.out.println("睡");
    }

    public  void  talk(String language){
        System.out.println("说话 = " + language);
    }
}
