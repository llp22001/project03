/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/4/25-22:46
 * @Description:
 * 可变个数的形参JDK5.0 新增
 *
 *可变方法传入参数个数可以是0个，1个，2个....
 * 多个参数的类型要保持与方法参数类型一致
 * 可变形参，必须声明在末尾，且可变形参最多只能声明一个
 **/
public class MethodArsTest {

    public static void main(String[] args) {
        MethodArsTest test = new MethodArsTest();
        test.show("hellp");
        test.show("hh","pp","dd","mm");
        //JDK1.5之方法多个参数传值
        //test.show( new String[]{"aa","bb","cc"});


    }

    public void show(int i){

    }

    public void show(String ... strs){
        for (int i = 0; i < strs.length; i++) {
        //    多个参数的遍历
            System.out.print(strs[i] + "\t");

        }
        System.out.println();
        //System.out.println("show (String ... strs)");
    }
    //JDK 1.5之前设置多个参数的方法 以数组形式传送
    //public void show(String[] strs){
    //
    //}
}
