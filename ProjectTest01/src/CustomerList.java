import java.security.PrivateKey;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/4/28-23:19
 * @Description:
 **/
public class CustomerList {
    private Customer[] customers;//用来保存客户对象的数组
    private int total = 0;//记录已保存客户对象的数量
    /**
    * 用途：构造器，用来初始化customers数组
    * 参数：totalCustomer：指定customers数组的最大空间
    */
    public CustomerList(int totalCustomer){
        customers = new  Customer[totalCustomer];
    }
    /**
    * 用途：将参数customer添加到数组中最后一个客户对象记录之后
    * 参数：customer指定要添加的客户对象
    * 返回：添加成功返回true；false表示数组已满，无法添加
    *
    * */
    public boolean addCustomer(Customer customer){
        if(total > customers.length){
            return false;
        }
        customers[total++] = customer;
        return true;
    }
    /**
    * 用途：用参数customer替换数组中由index指定的对象
    * 参数：customer指定替换的新客户对象
	*	           index指定所替换对象在数组中的位置，从0开始
    *   返回：替换成功返回true；false表示索引无效，无法替换
    * */
    
    public boolean replaceCustomer(int index, Customer cust){
        if(index < 0 || index >= total){
            return false;
        }
        customers[index] = cust;
        return true;
    }


    /**
     * Description: <br/>
     * @author: Joost_Li <br/>
     * @date: 2021/4/29 2:17<br/>
     * @param:<br/>
     * @return:
     */
    public boolean deleteCustomer(int index){
        if (index < 0 || index >= total){
            return false;
        }
        for (int i = index; i < total; i++) {
            customers[i] = customers[i+1];
        }
        //customers[total-1]= null;
        //total--;
        customers[total--] = null;
        return true;

    }
    /**
     * @Autor JoostLi
     * @Description 获取客户所有信息
     * @Date 2021/4/29 0:03
     * @Param []
     * @Return Customer[]
    **/
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
        for (int i = 0; i < custs.length; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    /**

     *描述<br>

     *参数  [index]<br>

     *返回值  Customer<br>

     *创建人  Joost_Li

     *创建时间  2021/4/29 23:04

     *@修改人和其它信息

     */
    public Customer getCustomer(int index){
        if (index < 0 || index >= total){
            return null;
        }
        return customers[index];

    }
    /**
     * @Autor JoostLi
     * @Description 获取存储客户的数量
     * @Date 2021/4/29 0:08
     * @Param []
     * @Return int
    **/
    public int getTotal(){
        return total;

    }


}
