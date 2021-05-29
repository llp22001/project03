package SingletonTest;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/6-23:41
 * @Description:
 **/
public class SingletonTest1 {
    public static void main(String[] args) {
        Bank b1 = Bank.getInstance();
        Bank b2 = Bank.getInstance();
        System.out.println(b1 == b2);
    }


}



class Bank{
    //
    private Bank(){

    }

    private  static Bank instance = new Bank();


    public static Bank getInstance(){
        return instance;
    }
}