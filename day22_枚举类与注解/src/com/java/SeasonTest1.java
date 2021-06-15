package com.java;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/5/29-18:38
 * @Description:
 *  * 使用enum关键字定义枚举类
 *  * 说明：定义的枚举类默认继承于java.lang.Enum类
 **/
public class SeasonTest1 {
    public static void main(String[] args) {
        Season1 winter = Season1.WINTER;
        //toString()
        System.out.println("winter = " + winter);
        //System.out.println("Season1.class.getSuperclass() = " + Season1.class.getSuperclass());

        //values():返回所有的枚举类对象构成的数组

        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println("values[i] = " + values[i]);
            values[i].show();
        }
        System.out.println("********************************************");
        Thread.State[] values1 = Thread.State.values();
        for (int i = 0; i < values1.length; i++) {
            System.out.println("values1[i] = " + values1[i]);

        }

        //valueOf(String objName):返回枚举类中对象名是objName的对象。
        Season1 winter1 = Season1.valueOf("WINTER");
        System.out.println("winter1 = " + winter1);
        //如果没有objName的枚举类对象，则抛异常：IllegalArgumentException
    }
}

interface Info{
    void show();
}
enum Season1 implements Info{
    //1.提供当前枚举类的对象 对个对象间用逗号隔开，末尾用分号结束
    SPRING ("春天","春暖花开"){
        @Override
        public void show() {
            System.out.println("当前季节是春天");
        }
    },
    SUMMER ("夏天","夏日炎炎"){
        @Override
        public void show() {
            System.out.println("当前季节是夏天");
        }
    },
    AUTUMN ("秋天","秋风瑟瑟"){
        @Override
        public void show() {
            System.out.println("当前季节是秋天");
        }
    },
    WINTER ("冬天","寒风刺骨"){
        @Override
        public void show() {
            System.out.println("当前季节是冬天");
        }
    };
    //1.声明Season1对象的属性: private final 修饰
    private final String seasonName;
    private final String seasonDesc;

    //2.私有化类的构造器，并给对象属性赋值

    private Season1(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    //3.提供当前枚举类的多个对象 声明 public static final


    public String getSeason1Name() {
        return seasonName;
    }

    public String getSeason1Desc() {
        return seasonDesc;
    }


    //@Override
    //public void show() {
    //    System.out.println("这是一个季节");
    //}
}
