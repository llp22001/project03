package com.team.service;

import com.team.domain.Architect;
import com.team.domain.Designer;
import com.team.domain.Employee;
import com.team.domain.Programmer;
import sun.security.krb5.internal.crypto.Des;

/**
 * @Author Joos_Li
 * @Create 2021-05-17-10:03
 * @Description 开发团队类
 */
public class TeamService {
    private static int counter = 1;
    private final int MAX_MEMBER = 5;
    Programmer[] team = new Programmer[MAX_MEMBER];
    private int total = 0;

    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < team.length; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    /**
     * <br>
     * 描述: 将指定员工添加团队中<br>
     * 参数:[e]<br>
     * 返回值:void<br>
     * 创建人: lilp
     * 创建时间: 2021/5/17 10:24 <br>
     *
     * @修改人：
     */
    public void addMember(Employee e) throws TeamException {
        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        }
        if (!(e instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加");
        }
        if (isExist(e)) {
            throw new TeamException("该员工已在本开发团队中");
        }

        //Employee强转成programmer 类型,用status判断程序状态是否可以添加团队

        Programmer p = (Programmer) e;
//        if (p.getStatus().getNAME().equals("BUSY")){
//        减少空指针风险
        if ("BUSY".equals(p.getStatus().getNAME())) {
            throw new TeamException("该员工已在其他开发团队中");
        }
        if ("VOCATION".equals(p.getStatus().getNAME())){
            throw new TeamException("该员工正在休假");
        }
        //获取team 成员中已有的程序员，架构是，设计师个数
        int numOfArch=0, numOfDes = 0, numOfPro = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect){
                numOfArch++;
            }else if (team[i] instanceof Designer){
                numOfDes++;
            }else{
                numOfPro++;
            }
        }

        if(p instanceof Architect){
            if (numOfArch >= 1){
                throw new TeamException("团队中最多有一名架构师");
            }
        }else if (p instanceof Designer){
            if (numOfDes >= 2){
                throw new TeamException("团队中最多两名设计师");
            }
        }else{
            if (numOfPro >= 3){
                throw new TeamException("团队中最多三名程序员");
            }
        }

        //将P或者e添加到team里面
        team[total++] = p;
        p.setStatus(Status.BUSY);
        p.setMemberId(counter++);


    }

    private boolean isExist(Employee e) {

        for (int i = 0; i < total; i++) {
            if (team[i].getId() == e.getId()) {
                return true;
            }
        }
        return false;
    }
    /**<br>
     *描述: 从团队中删除成员<br>
     *参数:[memberId]<br>
     *返回值:void<br>
     *创建人: lilp
     *创建时间: 2021/5/17 14:59 <br>
     *@修改人：
    */
    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for ( ;i < total; i++) {
            if(team[i].getMemberId() == memberId){
                team[i].setStatus(Status.FREE);
                break;
            }
        }
        if (i == total){
            throw new TeamException("指定MemberId员工未找到，删除失败");
        }
        for (int j = i+1; j < total-1 ; j++) {
            team[j] = team[j+1];
        }
        team[--total] = null;

    }

    public TeamService() {
    }

    public int getTotal() {
        return total;
    }


}
