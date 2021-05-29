package IntrfaceTest;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/11-23:31
 * @Description:类，接口练习
 **/
public class CompareableCircleTest {
    public static void main(String[] args) {
        CompareCircle c1 = new CompareCircle(3.2);
        CompareCircle c2 = new CompareCircle(3.4);
        //Bullet b1 = new Bullet();
        int i = c1.compareTo(c2);
        //int i1 = c1.compareTo(b1);
        //System.out.println("i = " + i);
        if (i > 0){
            System.out.println("C1 大于 C2");
        }else if (i < 0 ){
            System.out.println("C1 小于 C2");
        }else{
            System.out.println("C1 等于 C2");

        }
    }

}
