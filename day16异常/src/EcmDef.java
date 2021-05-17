/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/16-21:43
 * @Description:
 **/
public class EcmDef {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            int result = ecm(i, j);
            System.out.println(result);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }catch (MyException e){
            e.printStackTrace();
        }
    }

    public static int ecm(int i, int j) throws MyException {
        if (i < 0 || j < 0) {
            throw new MyException("分子或分母为负数");
        }
        return i / j;
    }
}
