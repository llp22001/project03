package com.team.junit;

import com.team.domain.Employee;
import com.team.service.NameListService;
import com.team.service.TeamException;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/5/17-1:37
 * @Description:NameListService 测试
 **/
public class NameListServiceTest {

    public static void main(String[] args) {
        testGetAllEmployys();
        testGetEmployee();

    }
    public static void testGetAllEmployys(){
        NameListService nameListService = new NameListService();
        Employee[] allEmployees = nameListService.getAllEmployees();
        for (int i = 0; i < allEmployees.length; i++) {
            System.out.println(allEmployees[i]);
        }
    }
    public static void testGetEmployee(){
        NameListService nameListService = new NameListService();
        int id = 10;
        try {
            Employee employee = nameListService.getEmployee(id);
            System.out.println(employee.toString());
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }

}
