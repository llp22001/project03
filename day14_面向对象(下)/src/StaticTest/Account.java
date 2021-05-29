package StaticTest;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/6-23:19
 * @Description:
 **/
public class Account {
    private  int acc;
    private String pwd="000000";
    private double bal;
    private static double rate;
    private static  double minBal=1.0;
    private  static int init=1001;

    public Account() {
        acc = init++;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Account{" +
                "acc=" + acc +
                ", pwd='" + pwd + '\'' +
                ", bal=" + bal +
                '}';
    }

    public int getAcc() {
        return acc;
    }

    public Account(String pwd, double bal) {
        this();
        this.pwd = pwd;
        this.bal = bal;
    }

    public static void setRate(double rate) {
        Account.rate = rate;
    }

    public static void setMinBal(double minBal) {
        Account.minBal = minBal;
    }

    public String getPwd() {
        return pwd;
    }

    public double getBal() {
        return bal;
    }

    public static double getRate() {
        return rate;
    }

    public static double getMinBal() {
        return minBal;
    }
}
