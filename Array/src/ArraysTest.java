import java.util.Arrays;

/**
 * @author Joost-Li
 * @date 2021/4/24-17:42
 **/
public class ArraysTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = new int[]{1,3,2,4};
        boolean equals = Arrays.equals(arr1, arr2);
        System.out.println("equals = " + equals);
        System.out.println(Arrays.toString(arr1));
        //Arrays.fill(arr1,20);
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        int i = Arrays.binarySearch(arr1, 2)    ;

        System.out.println("i = " + i);

    }
}
