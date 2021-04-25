/**
 * @author Joost-Li
 * @date 2021/4/24-16:12
 *
 * 数组反转/查找
 **/
public class ArrayTest5 {
    public static void main(String[] args) {
        String[] arr1 = new String[]{"AA","BB","CC","DD","EE"};

        //方法一 数组反转
        //for (int i = 0; i < arr1.length/2; i++) {
        //    String temp = arr1[i];
        //    arr1[i]= arr1[arr1.length - i -1];
        //    arr1[arr1.length -1] = temp;
        //
        //}
        //方法二 数组反转
        //for (int i = 0, j = arr1.length -1; i < j ; i++ , j--) {
        //    String temp = arr1[i];
        //    arr1[i] = arr1[j];
        //    arr1[j] = temp;
        //
        //}
        /*
        * 数组查找 线性查找
        * */
        String dest = "D";
        boolean isFlag = true;
        for (int i = 0; i < arr1.length; i++) {
            if(dest.equals(arr1[i])){
                System.out.println("找到了指定元素，位置为"+i);
                isFlag = false;
                break;
            }

        }
        if(isFlag){
            System.out.println("很遗憾没有找到！");
        }
        /*
        * 二分法查找
        * 所要查找的数据要有序的
        * */

    }
}
