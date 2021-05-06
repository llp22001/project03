/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/4/29-23:20
 * @Description:
 **/
public class Kids extends ManKind{
    private int age;

    public Kids() {
    }

    public Kids(int age) {
        this.age = age;
    }

    public void printAge(){
        System.out.println("age = " + age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
