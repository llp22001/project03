package SingletonTest;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/6-23:41
 * @Description:单例的设计模式
 **/
public class SingletonTest1 {
    public static void main(String[] args) {
        Bank b1 = Bank.getInstance();
        Bank b2 = Bank.getInstance();
        System.out.println(b1 == b2);
    }


}


//饿汉式
class Bank{
    //1私有化构造器
    private Bank(){

    }
    //2.内部创建对象
    //4.要求此对象必须是静态的
    private  static Bank instance = new Bank();

    //3.提供公共的静态方法，返回对象
    public static Bank getInstance(){
        return instance;
    }
}