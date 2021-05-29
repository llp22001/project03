package com.java;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/5/27-23:55
 * @Description: Jdk 8中日期时间API的测试 ,JDK8 吸收了jodatime的精华
 **/
public class JDK8DateTimeTest {
    @Test
    public void testDate() {
        Date date = new Date(2021 - 1900, 5 - 1, 27);
        System.out.println("date = " + date);
    }

    /*
LocalDate、LocalTime、LocalDateTime 的使用
说明：
    1.LocalDateTime相较于LocalDate、LocalTime，使用频率要高
    2.类似于Calendar
 */
    @Test
    public void test1() {
        //now()。获取当前日期时间
        LocalDate localDate = LocalDate.now();//获取当前本地的日期

        LocalTime localTime = LocalTime.now();//获取当前时间
        LocalDateTime localDateTime = LocalDateTime.now();//获取当前日期时间

        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);
        System.out.println("localDateTime = " + localDateTime);

        //of() --设置指定的年月日时分秒
        LocalDateTime localDateTime1 = LocalDateTime.of(2021, 5, 28, 0, 9, 20, 300);

        System.out.println("localDateTime1 = " + localDateTime1);

        //getxx
        System.out.println("\"******************************\" = " + "******************************");
        System.out.println("localDateTime.getDayOfMonth() = " + localDateTime.getDayOfMonth());
        System.out.println("localDateTime.getDayOfWeek() = " + localDateTime.getDayOfWeek());
        System.out.println("localDateTime.getDayOfYear() = " + localDateTime.getDayOfYear());
        System.out.println("localDateTime.getMonth() = " + localDateTime.getMonth());
        System.out.println("localDateTime.getMonthValue() = " + localDateTime.getMonthValue());
        System.out.println("localDateTime.getMinute() = " + localDateTime.getMinute());
        System.out.println("localDateTime.getDayOfWeek().getValue() = " + localDateTime.getDayOfWeek().getValue());
        //withxxx 设置相关属性
        LocalDateTime localDateTime2 = localDateTime.withDayOfMonth(30);
        System.out.println("localDateTime = " + localDateTime);
        System.out.println("localDateTime2 = " + localDateTime2);

        //plusxxx 加相关属性

        LocalDateTime localDateTime3 = localDateTime.plusDays(3);
        System.out.println("localDateTime3 = " + localDateTime3);

        //
        LocalDateTime localDateTime4 = localDateTime.minusMonths(2);

        System.out.println("localDateTime4 = " + localDateTime4);

    }
    /*
        Instant的使用
    类似于 java.util.Date类
     */

    @Test
    public void test2() {
        //now():获取本初子午线对应的标准时间
        Instant instant = Instant.now();
        System.out.println("instant = " + instant);
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println("offsetDateTime = " + offsetDateTime);
        //toEpochMilli():获取自1970年1月1日0时0分0秒（UTC）开始的毫秒数  ---> Date类的getTime()
        long milli = instant.toEpochMilli();

        System.out.println("milli = " + milli);
        //ofEpochMilli():通过给定的毫秒数，获取Instant实例  -->Date(long millis)
        Instant instant1 = Instant.ofEpochMilli(1622133016863L);
        System.out.println("instant1 = " + instant1);
    }

    /*
    DateTimeFormatter:格式化或解析日期、时间
    类似于SimpleDateFormat

     */
    @Test
    public void test3() {
        ////        方式一：预定义的标准格式。如：ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE;ISO_LOCAL_TIME

        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //格式化:日期-->字符串
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        String str1 = formatter.format(localDateTime);
        System.out.println("str1 = " + str1);
        //解析：字符串 -->日期
        TemporalAccessor parse = formatter.parse("2021-05-28T00:37:01.356");
        System.out.println("parse = " + parse);
        //        方式二：
//        本地化相关的格式。如：ofLocalizedDateTime()
//        FormatStyle.LONG / FormatStyle.MEDIUM / FormatStyle.SHORT :适用于LocalDateTime
    }
}
