package com.team.domain;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/17-0:07
 * @Description:
 **/
public class Architect extends Designer{
    private int stock;//

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {

        return getDtetails() + "\t架构师\t" + getStatus() + "\t" +
                getBonus() + "\t" +stock + "\t" + getEquipment().getDescription() + "\t";
    }
    public String getDetailsTeam(){
        return getBaseDetailsTeam() + "\t架构师" + getBonus()+"\t" + getStock();
    }
}
