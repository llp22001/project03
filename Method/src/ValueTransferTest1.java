/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/4/25-23:26
 * @Description:
 **/
public class ValueTransferTest1 {
    public static void main(String[] args) {
        //int m = 10;
        //int n = 20;
        Data data = new Data();
        data.m = 10;
        data.n = 20;
        ValueTransferTest1 test = new ValueTransferTest1();

        //这样无法交换m,n的值
        //参数是基本数据类型，实参赋值的是数据值
        //参数是引用数据类型，实参赋值的是地址值
        //test.swap(m , n);
        test.swap(data);
        System.out.println("方法外面 m = " + data.m + " n = " + data.n);
    }
    public void swap(Data data){
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
        System.out.println("方法里面 m = " + data.m + " n = " + data.n);
    }
}
class Data{
    int m;
    int n;
}
