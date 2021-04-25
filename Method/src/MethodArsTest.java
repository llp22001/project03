/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/4/25-22:46
 * @Description:
 * 可变个数的形参JDK5.0 新增
 **/
public class MethodArsTest {

    public static void main(String[] args) {
        MethodArsTest test = new MethodArsTest();
        test.show("hellp");
        test.show("hh","pp");

    }

    public void show(int i){

    }

    public void show(String ... strs){
        System.out.println("show (String ... strs)");
    }
}
