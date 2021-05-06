/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/4/28-23:19
 * @Description:
 **/
public class CustomerView {
    public CustomerView() {
        Customer customer = new Customer("llp", '男', 18,
                "173111222", "123@163.com");
        customerList.addCustomer(customer);
    }

    private CustomerList customerList = new CustomerList(10);

    /**
     * @Autor JoostLi
     * @Description 显示界面操作
     * @Date 2021/4/29 0:12
     * @Param []
     * @Return void
     **/
    public void enterMainMenu() {
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("\n-----------------客户信息管理软件--------------");
            System.out.println("                    1添加客户");
            System.out.println("                    2修改客户");
            System.out.println("                    3删除客户");
            System.out.println("                    4客户列表");
            System.out.println("                    5退   出\n");
            System.out.print("          请选择(1-5):");
            char menu = CMUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.println("是否确认退出(Y/N)");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
                    //break;
            }


        }

    }

    /**
     * @Autor JoostLi
     * @Description 添加客户操作
     * @Date 2021/4/29 0:10
     * @Param []
     * @Return void
     **/
    private void addNewCustomer() {
        System.out.println("---------------------添加客户---------------------");
        System.out.print("姓名:");
        String name = CMUtility.readString(10);
        System.out.print("性别:");
        char gender = CMUtility.readChar();
        System.out.print("年龄:");
        int age = CMUtility.readInt();
        System.out.print("电话:");
        String phone = CMUtility.readString(13);
        System.out.print("邮箱:");
        String email = CMUtility.readString(30);
        Customer cust = new Customer(name, gender, age, phone, email);
        boolean isSucc = customerList.addCustomer(cust);
        if (isSucc) {
            System.out.println("----------------添加客户成功---------");
            //listAllCustomers();
        } else {
            System.out.println("----------------客户已添加满,添加失败---------");
        }

    }

    /**
     * @Autor JoostLi
     * @Description 修改客户操作
     * @Date 2021/4/29 0:11
     * @Param []
     * @Return void
     **/
    private void modifyCustomer() {
        System.out.println("---------------------修改客户---------------------");
        int index = 0;
        Customer cust = null;
        for (; ; ) {
            System.out.print("请选择待修改客户编号(-1退出)：");
            index = CMUtility.readInt();
            if (index == -1) {
                return;
            }
            cust = customerList.getCustomer(index - 1);
            if (cust == null) {
                System.out.println("无法找到指定客户");
            } else {
                break;
            }
        }
        System.out.print("姓名(" + cust.getName() + ")：");
        String name = CMUtility.readString(4, cust.getName());

        System.out.print("性别(" + cust.getGender() + ")：");
        char gender = CMUtility.readChar(cust.getGender());

        System.out.print("年龄(" + cust.getAge() + ")：");
        int age = CMUtility.readInt(cust.getAge());

        System.out.print("电话(" + cust.getPhone() + ")：");
        String phone = CMUtility.readString(15, cust.getPhone());

        System.out.print("邮箱(" + cust.getEmail() + ")：");
        String email = CMUtility.readString(15, cust.getEmail());
        cust = new Customer(name, gender, age, phone, email);
        boolean flag = customerList.replaceCustomer(index - 1, cust);
        if (flag) {
            System.out
                    .println("---------------------修改完成---------------------");
        } else {
            System.out.println("----------无法找到指定客户,修改失败--------------");
        }

    }

    /**
     * @Autor JoostLi
     * Description 删除客户操作
     * @Date 2021/4/29 0:11
     * Param []
     * Return void
     **/
    private void deleteCustomer() {
        System.out.println("---------------------删除客户---------------------");
        int index = 0;
        Customer cust = null;
        for (; ; ) {
            System.out.print("请选择待删除客户编号(-1退出)：");
            index = CMUtility.readInt();
            if (index == -1) {
                return;
            }
            cust = customerList.getCustomer(index - 1);
            if (cust == null) {
                System.out.println("无法找到指定客户");
            } else {
                break;
            }
        }
        System.out.print("确认是否删除(Y/N)：");
        char yn = CMUtility.readConfirmSelection();
        if (yn == 'n') {
            return;
        }
        boolean flag = customerList.deleteCustomer(index - 1);
        if (flag) {
            System.out.println("---------------------删除完成---------------------");
        } else {
            System.out.println("----------无法找到指定客户,删除失败--------------");
        }

    }


    /**
     * @Autor JoostLi
     * @Description 显示客户列表
     * @Date 2021/4/29 0:11
     * @Param []
     * @Return void
     **/

    private void listAllCustomers() {
        System.out.println("-----------------------------客户列表---------------------");
        int total = customerList.getTotal();
        if (total == 0) {
            System.out.println("没有客户记录");
        } else {
            System.out.println("编号\t姓名\t性别\t年龄\t\t电话\t\t\t邮箱");
            final Customer[] allCustomers = customerList.getAllCustomers();
            for (int i = 0; i < allCustomers.length; i++) {
                System.out.println(i + 1 + "\t\t" + allCustomers[i].getName() + "\t\t" + allCustomers[i].getGender() + "\t\t"
                        + allCustomers[i].getAge() + "\t\t\t" + allCustomers[i].getPhone()
                        + "\t\t" + allCustomers[i].getEmail());
            }
        }

        System.out.println("-----------------------------客户列表完成------------------");


    }

    /**
     * @Autor JoostLi
     * @Description 入口
     * @Date 2021/4/29 2:01
     * @Param [args]
     * @Return void
     **/
    public static void main(String[] args) {
        CustomerView view = new CustomerView();


        view.enterMainMenu();

    }


}
