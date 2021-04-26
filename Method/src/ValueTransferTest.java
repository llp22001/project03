/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/4/25-23:26
 * @Description:
 **/
public class ValueTransferTest {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        ValueTransferTest test = new ValueTransferTest();

        //这样无法交换m,n的值
        //参数是基本数据类型，实参赋值的是数据值
        //参数是引用数据类型，实参赋值的是地址值
        //test.swap(m , n);
        test.swap(m , n);
        System.out.println("方法外面 m = " + m + " n = " + n);
    }
    public void swap(int m , int n){
        int temp = m;
        m = n;
        n = temp;
        System.out.println("方法里面 m = " + m + " n = " + n);
    }
}
