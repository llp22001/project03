/**
 * @author Joost-Li
 * @date 2021/4/21-22:44
 * 数组练习
 * ①一维数组的声明和初始化
 * ②如何调用数组指定位置
 * ③如何获取数组长度
 * ④如何遍历数组
 * ⑤数组默认初始化
 * ⑥数组的内存结息
 **/
public class ArrayTest {
    public static void main(String[] args) {
        int[] ids;//声明
        //1.1静态初始化
        ids = new int[]{1001,1002,1003};
        //1.2动态初始化
        String[] names = new String[5];

        //2.如何调用数组制定位置
        names[0] = "llp";
        names[1] = "tom1";
        names[2] = "tom2";
        names[3] = "tom3";
        names[4] = "tom4";
        //数组遍历
        for (int i = 0; i < names.length; i++) {
            //System.out.println(names[i].charAt(0));
            System.out.println(names[i]);

        }
        /*
        数组默认初始化
          数组元素是整型：0
          数组元素是浮点型：0.0
          数组元素是char:0  或 \u0000 ASSIC 码 0 非‘0’
          bool类型 默认值：false
          引用数据类型默认值：null
        */
        short[] arr1 = new short[4];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        float[] arr2 = new float[4];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        char[] arr3 = new char[4];
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        boolean[] arr4 = new boolean[5];
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }

        String[] arr5 = new String[5];
        for (int i = 0; i < arr5.length; i++) {
            System.out.println(arr5[i]);
        }
        if (arr5[0] == null) {
          System.out.println("string默认值是null");

        }

    }
}
