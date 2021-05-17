package com.team.domain;

import com.team.service.Status;
import static com.team.service.Status.*;
/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/16-23:45
 * @Description:
 **/
public class Programmer extends  Employee{
    private int memberId;//项目组ID
    private Status status=FREE;
    private Equipment equipment;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;

    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }


    @Override
    public String toString() {

        return getDtetails()+ "\t程序员\t" + status + "\t\t\t\t\t" + equipment.getDescription() +"\t";
    }
    public String getBaseDetailsTeam(){
        return memberId + "/" +getId() + "\t" + getName() +"\t" +getAge() +"\t" +getSalary();
    }
    public String getDetailsTeam(){
        return getBaseDetailsTeam() +"\t程序员";
    }
}
