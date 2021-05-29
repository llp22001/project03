package TemplateMethod;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/10-0:50
 * @Description:
 * �����࣬ģ�巽�������ģʽ
 **/
public class TemplateTest {
    public static void main(String[] args) {
        Template t1 = new SubTemplate();
        t1.spendTime();
    }
}

abstract class Template{
    /**
    
     *���� ����ĳ�δ����ִ��ʱ��<br>
    
     *����  []<br>
    
     *����ֵ  void<br>
    
     *������  Joost_Li<br>
    
     *����ʱ��  2021/5/10 0:54<br>
    
     *@�޸��˺�������Ϣ
    
     */
    public void spendTime(){
        long start = System.currentTimeMillis();
        code();
        long end  = System.currentTimeMillis();

        System.out.println("���ѵ�ִ��ʱ��Ϊ:"+(end-start));
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