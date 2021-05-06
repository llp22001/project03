package test01;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/1-15:37
 * @Description:
 **/
public class Man extends  Person{
    private Boolean isSmoking;

    public Man(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("男人多吃饭");
    }

    @Override
    public void walk() {
        System.out.println("男人多走路");
    }

    public Boolean getSmoking() {
        return isSmoking;
    }

    public void setSmoking(Boolean smoking) {
        isSmoking = smoking;
    }

    public void earnMoney(){
        System.out.println("男人赚钱养家");
    }
}
