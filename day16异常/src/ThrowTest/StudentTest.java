package ThrowTest;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/13-21:33
 * @Description:
 * s
 **/
public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        try {
            s.regist(-1001);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

}
class Student{
    private int id;
    public void regist(int id) throws Exception {
        if (id > 0 ){
            this.id = id;
        }else {
            //System.out.println("您输入的数据非法");
            //throw new RuntimeException("输入的数据非法");
            throw new Exception("输入的数据非法");
        }
    }
}
