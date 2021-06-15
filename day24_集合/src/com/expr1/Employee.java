package com.expr1;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/6/4-22:50
 * @Description:
 **/
public class Employee implements Comparable {
    private String name;
    private int age;
    private MyDate birthday;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public Employee() {
    }

    //
    @Override
    public int compareTo(Object o) {
        if(o instanceof Employee){
            Employee employee = (Employee)  o;
            return this.name.compareTo(employee.name);
        }
        throw new RuntimeException("数据类型不一致");

    }
}
