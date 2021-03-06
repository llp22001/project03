package com.expr;

import org.junit.Test;
import sun.security.util.Length;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/5/27-22:25
 * @Description:
 *     获取两个字符串中最大相同子串。比如：
 *    str1 = "abcwerthelloyuiodefabcdef";str2 = "cvhellobnm"
 *    提示：将短的那个串进行长度依次递减的子串与较长的串比较。
 **/
public class StringDemo2 {
    public String getMaxSameString(String str1, String str2){
        if (str1 != null && str2 != null){
            String maxStr = (str1.length() >= str2.length())? str1 :str2;
            String minStr = (str1.length() < str2.length())? str1 :str2;
            int length = minStr.length();
            for (int i = 0; i < length; i++) {

                for(int x = 0, y = length - i ; y <= length ; x++, y++){
                    String subStr = minStr.substring(x , y);
                    if (maxStr.contains(subStr)){
                        return subStr;
                    }
                }

            }
        }
        return null;
    }

    // 如果存在多个长度相同的最大相同子串
    // 此时先返回String[]，后面可以用集合中的ArrayList替换，较方便
    public String[] getMaxSameString1(String str1, String str2) {
        if (str1 != null && str2 != null) {
            StringBuffer sBuffer = new StringBuffer();
            String maxString = (str1.length() > str2.length()) ? str1 : str2;
            String minString = (str1.length() > str2.length()) ? str2 : str1;

            int len = minString.length();
            for (int i = 0; i < len; i++) {
                for (int x = 0, y = len - i; y <= len; x++, y++) {
                    String subString = minString.substring(x, y);
                    if (maxString.contains(subString)) {
                        sBuffer.append(subString + ",");
                    }
                }
//                System.out.println(sBuffer);
                if (sBuffer.length() != 0) {
                    break;
                }
            }
            String[] split = sBuffer.toString().replaceAll(",$", "").split("\\,");
            return split;
        }

        return null;
    }
    @Test
    public void test(){
        String str1 = "abcwerthello1yuiodefabcdef";
        String str2 = "cvhello1bnmabcdef";
        String[] maxSameString = getMaxSameString1(str1, str2);
        System.out.println("maxSameString = " + Arrays.toString(maxSameString));
    }
}
