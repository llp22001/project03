package com.team.domain;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/17-0:05
 * @Description:
 **/
public class Designer extends Programmer {
    private double bonus;//

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }



    @Override
    public String toString() {

        return getDtetails() + "\t设计师\t" + getStatus() + "\t" +
                bonus + "\t\t\t\t" + getEquipment().getDescription() + "\t";
    }
    public String getDetailsTeam(){
        return getBaseDetailsTeam() + "\t设计师" + getBonus();
    }
}
