package StaticTest;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/6-21:11
 * @Description:
/*
 * static�ؼ��ֵ�ʹ��
 *
 * 1.static:��̬��
 * 2.static�����������Σ����ԡ�����������顢�ڲ���
 *
 * 3.ʹ��static�������ԣ���̬���������������
 * 		3.1 ���ԣ����Ƿ�ʹ��static���Σ��ַ�Ϊ����̬����  vs �Ǿ�̬����(ʵ������)
 * 		   ʵ�����������Ǵ�������Ķ������ÿ�����󶼶�����ӵ��һ�����еķǾ�̬���ԡ����޸�����һ�������е�
 *              �Ǿ�̬����ʱ�����ᵼ������������ͬ��������ֵ���޸ġ�
 *       ��̬���������Ǵ�������Ķ�����󣬶��������ͬһ����̬��������ͨ��ĳһ�������޸ľ�̬����ʱ���ᵼ��
 *              ����������ô˾�̬����ʱ�����޸Ĺ��˵ġ�
 * 		3.2 static�������Ե�����˵����
 * 			�� ��̬����������ļ��ض����ء�����ͨ��"��.��̬����"�ķ�ʽ���е���
 *          �� ��̬�����ļ���Ҫ���ڶ���Ĵ�����
 *          �� ������ֻ�����һ�Σ���̬�������ڴ���Ҳֻ�����һ�ݣ����ڷ������ľ�̬���С�
 *
 *          ��		�����	ʵ������
 *          ��		yes		no
 *          ����		yes		yes
 *
 *      3.3 ��̬���Ծ�����System.out; Math.PI;
 *
 * 4.ʹ��static���η�������̬����
 * 		�� ������ļ��ض����أ�����ͨ��"��.��̬����"�ķ�ʽ���е���
 * 		��			��̬����	�Ǿ�̬����
 *          ��		yes		no
 *          ����		yes		yes
 * 		�� ��̬�����У�ֻ�ܵ��þ�̬�ķ���������
 *        �Ǿ�̬�����У��ȿ��Ե��÷Ǿ�̬�ķ��������ԣ�Ҳ���Ե��þ�̬�ķ���������
 *
 * 5. staticע��㣺
 *    5.1 �ھ�̬�ķ����ڣ�����ʹ��this�ؼ��֡�super�ؼ���
 *    5.2 ���ھ�̬���Ժ;�̬������ʹ�ã���Ҷ����������ڵĽǶ�ȥ��⡣
 *
 * 6. �����У����ȷ��һ�������Ƿ�Ҫ����Ϊstatic�ģ�
 * 		> �����ǿ��Ա��������������ģ��������Ŷ���Ĳ�ͬ����ͬ�ġ�
 * 		> ���еĳ���Ҳ��������Ϊstatic
 *
 *    �����У����ȷ��һ�������Ƿ�Ҫ����Ϊstatic�ģ�
 *    	> ������̬���Եķ�����ͨ������Ϊstatic��
 *      > �������еķ�����ϰ��������Ϊstatic�ġ� ���磺Math��Arrays��Collections
 */
public class StaticTest {
    public static void main(String[] args) {
        Chinese c1 = new Chinese();
        c1.name = "�׽���";
        c1.age = 30;
        Chinese c2 = new Chinese();
        c2.name = "�ֵ�";
        c2.age = 28;
        c1.nation = "CHN";
        Chinese.nation ="�й�";
        System.out.println("c2.nation = " + c2.nation);
        c1.eat();
        Chinese.show();
    }
}


class  Chinese{
    public static  double rate;

    public static double getRate() {
        return rate;
    }

    String name;
    int age;
    static String nation;
    public void eat(){
        System.out.println("�й��˳��в�");
    }
    public static void show(){
        System.out.println("����һ���й���");
    }

}