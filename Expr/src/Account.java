/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/4/26-23:55
 * @Description:
 *
 * 银行账户
 **/
public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    //存钱操作
    public void saveMoney(double balance){
        if (balance > 0){
            this.balance += balance;
            System.out.println("存钱成功,当前账余额:"+ this.balance);
        }
    }
    //取钱操作
    public void drawMoney(double balance){
        if (this.balance < balance){
            System.out.println("余额不足，差值" + (balance-this.balance));
        }else{
            this.balance -=balance;
            System.out.println("取款成功,账户余额：" + this.balance);
        }
    }
}
