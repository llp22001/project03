package com.opp;

import java.util.Scanner;
import java.util.Vector;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/6-0:31
 * @Description: 利用vector代替数组
 **/
public class VectorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector v = new Vector();
        int maxScore = 0;

        for (; ; ) {
            System.out.println("请输入学生成绩，已负数代表输入结束");
            int score = scanner.nextInt();
            if (score < 0) {
                break;
            }
            if (score > 100) {
                System.out.println("输入数据非法，请重新输入");
                continue;
            }
            v.add(score);
            //获取成绩最大值
            if (maxScore < score) {
                maxScore = score;
            }

        }
        char level;
        for (int i = 0; i < v.size(); i++) {
            Object obj = v.elementAt(i);
            //
            //Integer inScore = (Integer) obj;
            //int score = inScore;
            int score = (int) obj;
            if (maxScore - score <= 10) {
                level = 'A';

            } else if (maxScore - score <= 20) {
                level = 'B';
            } else if (maxScore - score <= 30) {
                level = 'C';
            } else {
                level = 'D';


            }
            System.out.println("student:" + (i+1) + " score " + score + " level is " + level);
        }
    }
}
