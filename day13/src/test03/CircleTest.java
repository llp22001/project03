package test03;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/5-23:05
 * @Description:
 **/
public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle("red",2.0,3.0);
        Circle circle2 = new Circle("red",2.0,3.0);
        System.out.println("颜色是否相同:" + circle1.getColor().equals(circle2.getColor()));

        System.out.println("半径是否相同:" + circle1.equals(circle2));

        System.out.println("circle1 = " + circle1);
        System.out.println("circle2 = " + circle2);
    }
}
