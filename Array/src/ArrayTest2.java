/**
 * @author Joost-Li
 * @date 2021/4/22-0:27
 *
 * 二维数组的定义及使用
 **/
public class ArrayTest2 {
    public static void main(String[] args) {
        //二维数组的定义
        int[][] arr1 = new int[][]{{1,2,3},{2,3}};

        String[][] arr2 = new String[3][2];
        //遍历二维数组
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
    }
}
