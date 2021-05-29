package StaticTest;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/6-23:05
 * @Description:
 **/
public class CircleTest {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("c1.getId() = " + c1.getId());

        Circle c2 = new Circle();
        Circle c3 = new Circle(3.4);
        System.out.println("c2.getId() = " + c2.getId());
        System.out.println("Circle.getTotal() = " + Circle.getTotal());
        System.out.println("c3.findArea() = " + c3.findArea());
    }
}

class Circle {
    private double radius;
    private int id;
    private static int init = 1001;
    private static int total;

    public Circle(double radius) {
        this();
        this.radius = radius;
        //total ++;
        //id = init++;
    }

    public static int getTotal() {
        return total;
    }

    public double getRadius() {
        return radius;
    }

    public int getId() {
        return id;
    }

    public Circle() {
        total++;
        id = init++;
    }

    public double findArea() {
        return Math.PI * radius * radius;
    }
}
