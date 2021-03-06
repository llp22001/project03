package com.expr;

import org.junit.Test;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/5/23-18:20
 * @Description:
 *
 *     获取一个字符串在另一个字符串中出现的次数。
 *       比如：获取“ab”在 “abkkcadkabkebfkaabkskab” 中出现的次数
 *
 *
 **/
public class StringDemo1 {
    /**

     *描述 判断一个字符串在另一个字符串出现的次数<br>

     *参数  [mainStr, subStr]<br>

     *返回值  int<br>

     *创建人  Joost_Li<br>

     *创建时间  2021/5/23 18:22<br>

     *@修改人和其它信息

     */
    public int getCount(String mainStr, String subStr){
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int count = 0;
        int index = 0;
        if (mainLength >= subLength){
            //方式一
            //while ( (index = mainStr.indexOf(subStr)) != -1){
            //    count ++;
            //    mainStr = mainStr.substring(index +subLength);
            //}
            //方式二，
            while ((index = mainStr.indexOf(subStr , index)) != -1){
                count ++;
                index += subLength;
            }

            return count;
        }else {

            return 0;
        }
    }
    @Test
    public void test(){
        String mainStr = "abkkcadkabkebfkaabkskab";
        String subStr = "ab";
        int count = getCount(mainStr, subStr);
        System.out.println("count = " + count);
    }
}
