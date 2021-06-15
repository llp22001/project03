package com.team.service;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/16-23:52
 * @Description:
 **/
//public class Status {
//    private final String NAME;
//    private Status(String name){
//        this.NAME = name;
//    }
//
//    public static final Status FREE = new Status("FREE");
//    public static final Status BUSY = new Status("BUSY");
//    public static final Status VOCATION = new Status("VOCATION");
//
//    public String getNAME() {
//        return NAME;
//    }
//
//    @Override
//    public String toString() {
//        return NAME;
//    }
//}

public enum Status {
    FREE,BUSY,VOCATION;
}