/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/4/26-22:29
 * @Description:三角形类
 **/
public class TriAngle {
    private double base;//底边长
    private double hight;//高

    //空参构造器
    public TriAngle() {
    }
    //带参数的构造器


    public TriAngle(double base , double hight) {
        this.base = base;
        this.hight = hight;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public  void setHight(double hight){
        this.hight = hight;
    }

    public double getBase() {
        return this.base;
    }

    public double getHight() {
        return hight;
    }
}
