import java.util.ArrayList;

/**
 * @author Joost-Li
 * @date 2021/4/24-17:00
 *
 * 排序算法：冒泡排序
 **/
public class sortTest {
    public static void main(String[] args) {

        int[] arr1 = new int[]{-1,10,3,-20,30,-1,99,16,5};

        for (int i = 0; i < arr1.length - 1; i++) {

            for (int j = 0; j < arr1.length - 1 - i; j++) {

                if (arr1[j] > arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }



    }
}
