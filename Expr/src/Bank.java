import java.beans.Customizer;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/4/26-23:57
 * @Description:
 * 银行对象
 **/
public class Bank {
    private Customer[] customers;//存放多个客户的数组
    private int numberOfCustomers;//记录客户个数

    public  Bank(){
        customers = new Customer[10];
    }

    //添加客户
    public void addCustomer(String f, String l){
        Customer cust = new Customer(f,l);
        //customers[numberOfCustomers] = cust;
        //numberOfCustomers++;

        customers[numberOfCustomers++] = cust;

    }
    //获取客户个数
    public  int getNumberOfCustomers(){
        return  numberOfCustomers;

    }
    //获取指定位置的客户
    public  Customer getCustomer(int index){

        if (index >=0 && index < numberOfCustomers){
            return customers[index];
        }else {
            return null;
        }
    }
}
