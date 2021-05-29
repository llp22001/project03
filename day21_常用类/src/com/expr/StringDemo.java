package com.expr;

import com.sun.org.apache.bcel.internal.generic.IFNE;
import org.junit.Test;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/5/23-17:53
 * @Description:
 **/
public class StringDemo {
    /*
将一个字符串进行反转。将字符串中指定部分进行反转。比如“abcdefg”反转为”abfedcg”

方式一：转换为char[]
 */
    public String reverse(String str, int startIndex, int endIndex) {

        if (str == null) {
            return null;
        } else {
            char[] arr = str.toCharArray();
            for (int x = startIndex, y = endIndex; x < y; x++, y--) {
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
            return new String(arr);
        }
    }

    //方式二：使用String的拼接
    public String reverse1(String str, int startIndex, int endIndex) {
        if (str != null) {
            String reverseStr = str.substring(0, startIndex);
            for (int i = endIndex; i >= startIndex; i--) {
                reverseStr += str.charAt(i);
            }
            reverseStr += str.substring(endIndex+1, str.length());

            return reverseStr;
        }
        return null;

    }
    //方式三：使用StringBuffer/StringBuilder替换String
    public String reverse2(String str, int startIndex, int endIndex) {
        if (str != null) {
            StringBuilder stringBuilder = new StringBuilder(str.length());

            stringBuilder.append(str.substring(0,startIndex));
            for (int i = endIndex; i >= startIndex; i--) {
                stringBuilder.append(str.charAt(i));
            }
            stringBuilder.append(str.substring(endIndex+1));
            return stringBuilder.toString();
        }
        return null;
    }
    @Test
    public void testReverse() {
        String str = "abcdefg";
        String str1 = reverse(str, 2, 5);
        System.out.println("str = " + str);
        System.out.println("str1 = " + str1);

        String str3 = reverse1(str,2,5);
        System.out.println("str3 = " + str3);
        String str4 = reverse2(str,2,5);
        System.out.println("str4 = " + str4);


    }

}
