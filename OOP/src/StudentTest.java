/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/4/24-23:12
 * @Description:
 **/
public class StudentTest {
    public static void main(String[] args) {
        Student[] stus = new  Student[20];

        for (int i = 0; i < stus.length; i++) {
            stus[i] = new  Student();
            stus[i].number = i + 1;
            stus[i].stat =(int)(Math.random() * 6 + 1);
            stus[i].score = (int)(Math.random()*101);

        }
        for (int i = 0; i < stus.length; i++) {
            if (stus[i].stat == 3) {
                System.out.println(stus[i].getInfo());
            }

        }
    }
}



class Student{
    int number;
    int stat;
    int score;
    
    /**
     * @Description 
     * @Date 2021/4/24 23:56
     * @param []
     *@return java.lang.String
    **/
    public  String getInfo(){

        return "学号:" + number +"\t\t年级: " +stat +"\t\t分数: " + score;
    }
}
