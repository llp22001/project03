/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/4/26-22:35
 * @Description:
 **/
public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle t1 = new TriAngle();
        t1.setBase(2.0);
        t1.setHight(3.0);
        System.out.println("base: " + t1.getBase() + " hight: " + t1.getHight());
        TriAngle t2 = new TriAngle(5.2,3.2);
        System.out.println("base: " + t2.getBase() + " hight: " + t2.getHight());

    }
}
