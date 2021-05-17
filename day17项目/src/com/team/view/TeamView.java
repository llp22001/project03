package com.team.view;

import com.team.domain.Employee;
import com.team.domain.Programmer;
import com.team.service.NameListService;
import com.team.service.TeamException;
import com.team.service.TeamService;

import java.lang.annotation.Target;

/**
 * @Author Joos_Li
 * @Create 2021-05-17-15:15
 * @Description
 */
public class TeamView {
    private NameListService listSvc = new NameListService();
    private TeamService teamSvc = new TeamService();

    public void enterMainMemu() {
        boolean loopFlag = true;
        char menu = 0;
        while (loopFlag) {
            if (menu != '1'){
                listAllEmployess();
            }
            System.out.print("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出 请选择(1-4):");
             menu = TSUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    getTeam();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
                    System.out.println("是否要退出(Y/N)");
                    char c = TSUtility.readConfirmSelection();
                    if (c == 'Y'){
                        loopFlag = false;
                    }
                    break;
            }
        }
    }

    /**
     * <br>
     * 描述: 显示所有员工信息<br>
     * 参数:[]<br>
     * 返回值:void<br>
     * 创建人: lilp
     * 创建时间: 2021/5/17 15:22 <br>
     *
     * @修改人：
     */
    private void listAllEmployess() {
        System.out.println("----------------------------------开发团队调度软件-------------------------------\n");
        System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
        Employee[] allEmployees = listSvc.getAllEmployees();
        if (allEmployees == null || allEmployees.length == 0){
            System.out.println("公司没有任何员工信息");
        }
        for (int i = 0; i < allEmployees.length; i++) {
            System.out.println(allEmployees[i]);
        }
        System.out.println("--------------------------------------------------------------------------------");
    }

    private void getTeam() {
        System.out.println("--------------团队成员列表--------------");
        Programmer[] team = teamSvc.getTeam();
        if (team == null || team.length == 0){
            System.out.println("团队没有任何成员！");
        }else{
            System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票\n");
            for (int i = 0; i < team.length; i++) {
                System.out.println(team[i].getDetailsTeam());
            }
        }
        System.out.println("--------------------------------------");


    }

    private void addMember() {
        System.out.println("----------------添加团队成员-------------");
        System.out.print("请输入要添加的员工ID：");
        int id = TSUtility.readInt();
        try {
            Employee employee = listSvc.getEmployee(id);
            teamSvc.addMember(employee);
            System.out.println("添加成功");
            TSUtility.readReturn();
        } catch (TeamException e) {
            System.out.println("添加失败,原因" + e.getMessage());
            TSUtility.readReturn();
        }
    }

    private void deleteMember() {
        System.out.println("----------------删除团队成员-------------");
        System.out.print("请输入要删除的员工TID：");
        int id = TSUtility.readInt();
        System.out.println("请确认是否删除:(Y/N)");
        char c = TSUtility.readConfirmSelection();
        if (c == 'Y'){

            try {
                teamSvc.removeMember(id);
                TSUtility.readReturn();
            } catch (TeamException e) {
                System.out.println("删除失败,原因" + e.getMessage());
                TSUtility.readReturn();
            }
        }else{
            return;
        }
    }

    public static void main(String[] args) {
        TeamView teamView = new TeamView();
        teamView.enterMainMemu();
    }
}
