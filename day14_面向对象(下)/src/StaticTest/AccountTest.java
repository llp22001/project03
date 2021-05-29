package StaticTest;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/6-23:23
 * @Description:
 **/
public class AccountTest {
    public static void main(String[] args) {
        Account acc1 = new Account("123456",2000);
        Account acc2 = new Account("111456",3000);
        Account acc3 = new Account("222456",4000);
        System.out.println("acc1 = " + acc1);
        System.out.println("acc2 = " + acc2);
        System.out.println("acc3 = " + acc3);
        System.out.println("acc1.getAcc() = " + acc1.getAcc());
    }
}
