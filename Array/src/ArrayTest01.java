import java.util.Scanner;

/**
 * @author Joost-Li
 * @date 2021/4/21-23:52
 * 数组应用练习
 * 输入学生个数之后学生分数计算学生分数
 **/
public class ArrayTest01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入学生人数");
        int stuCount = scan.nextInt();
        int[] score = new int[stuCount];
        int maxScore = 0;
        int difScore = 0;
        for (int i = 0; i < score.length ; i++) {
            System.out.println("输入第" + (i+1) + "个学生的分数") ;
            score[i] = scan.nextInt();
            if (score[i] > maxScore){
                maxScore = score[i];
            }

        }
        //for (int i = 0; i < score.length; i++) {
        //
        //    if (score[i] > maxScore){
        //        maxScore = score[i];
        //    }
        //}
        for (int i = 0; i < score.length; i++) {

            difScore = score[i] - maxScore;

            if (difScore >= -10){
                System.out.println("student " + (i+1) +" score is "+score[i] +" grade is A");
            }else if (difScore >= -20){
                System.out.println("student " + (i+1) +" score is "+score[i] +" grade is B");
            }else if (difScore >= -30){
                System.out.println("student " + (i+1) +" score is "+score[i] +" grade is C");
            }else{
                System.out.println("student " + (i+1) +" score is "+score[i] +" grade is D");
            }
            
        }
    }
}
