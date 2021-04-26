/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/4/27-0:25
 * @Description:
 * 银行存取款
 **/
public class BankTest {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.addCustomer("li","peng");
        bank.getCustomer(0).setAccount(new Account(2000));
        bank.getCustomer(0).getAccount().drawMoney(500);
        bank.getCustomer(0).getAccount().saveMoney(10000);
    }
}
