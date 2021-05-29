package TemplateMethod;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/10-0:50
 * @Description:
 * 抽象类，模板方法的设计模式
 **/
public class TemplateTest {
    public static void main(String[] args) {
        Template t1 = new SubTemplate();
        t1.spendTime();
    }
}

abstract class Template{
    /**
    
     *描述 计算某段代码的执行时间<br>
    
     *参数  []<br>
    
     *返回值  void<br>
    
     *创建人  Joost_Li<br>
    
     *创建时间  2021/5/10 0:54<br>
    
     *@修改人和其它信息
    
     */
    public void spendTime(){
        long start = System.currentTimeMillis();
        code();
        long end  = System.currentTimeMillis();

        System.out.println("花费的执行时间为:"+(end-start));
    }

    public abstract void code();
}
class SubTemplate extends Template{

    @Override
    public void code() {
        for (int i = 2; i < 1000; i++) {
            boolean isFlag = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0){
                    isFlag = false;
                    break;
                }
            }
            if (isFlag){
                System.out.println(i);
            }

        }
    }
}