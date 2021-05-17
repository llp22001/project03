package com.team.domain;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/16-23:42
 * @Description:
 **/
public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    /**<br>
     *描述: 判断员工是否在团队中<br>
     *参数:[]<br>
     *返回值:java.lang.String<br>
     *创建人: lilp
     *创建时间: 2021/5/17 10:37 <br>
     *@修改人：
    */
    public String getDtetails() {
        return id + "\t" + name + "\t" + age + "\t" + salary + "\t";
    }

    @Override
    public String toString() {
        return getDtetails();
    }
}
