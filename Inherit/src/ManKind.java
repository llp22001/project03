/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/4/29-23:13
 * @Description:
 **/
public class ManKind{
    private int sex;
    private int salary;

    public ManKind() {
    }

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public  void manOrWoman(){
        if (sex == 1){
            System.out.println("man");
        }else if(sex == 0) {
            System.out.println("woman");
        }

    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
    
     *描述<br>
    
     *参数  []<br>
    
     *返回值  void<br>
    
     *创建人  Joost_Li<br>
    
     *创建时间  2021/4/29 23:17<br>
    
     *@修改人和其它信息
    
     */
    public void empoyeed(){
        //if(salary == 0){
        //    System.out.println(" no job");
        //}else {
        //    System.out.println("job");
        //}
        //三元运算符
        String jobInfo = (salary == 0) ? "no job" : "job";
        System.out.println(jobInfo);
    }
}
