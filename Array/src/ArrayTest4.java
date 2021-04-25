/**
 * @author Joost-Li
 * @date 2021/4/24-15:45
 *
 * 数组的赋值
 **/
public class ArrayTest4 {
    public static void main(String[] args) {
        int[] arr1, arr2;
        arr1 = new int[]{2,3,5,7,11,13};

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
        System.out.println();
        arr2= new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0){
                arr2[i] = i;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
    }
}
