package com.team.domain;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/16-23:30
 * @Description:
 **/
public class PC implements Equipment {
    private String model;//��ʾ�������ͺ�

    private String display;//��ʾ��ʾ������

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public PC() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDescription() {
        return model + "(" +display + ")";
    }
}
