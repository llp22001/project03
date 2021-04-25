/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/4/25-22:06
 * @Description: 方法重载
 * 同一个类，方法名一样，参数类型或者个数不同,或者参数顺序不同
 **/
public class OverLoad {
    public static void main(String[] args) {
        OverLoad test = new OverLoad();
        test.getSum(1, 2);
    }

    public void getSum(int i, int j) {
        System.out.println(i + j);
    }

    public void getSum(double d1, double d2) {
        System.out.println(d1 + d2);
    }

    public void getSum(String s, int i) {

    }

    public void getSum(int i, String s) {

    }

}
