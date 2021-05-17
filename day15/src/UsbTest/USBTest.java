package UsbTest;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/11-20:31
 * @Description:
 **/
public class USBTest {
    public static void main(String[] args) {
        Computer com = new Computer();
        Flash flash = new Flash();
        com.transferData(flash);
    }
}

class Computer{
    public void transferData(USB usb){
        usb.start();
        System.out.println("����ϸ��");
        usb.stop();
    }
}

interface USB{
    void start();
    void stop();
}
class Flash implements USB{
    @Override
    public void start() {
        System.out.println("U�̿�������");
    }

    @Override
    public void stop() {
        System.out.println("U�̽�������");

    }
}
class Printer implements USB{
    @Override
    public void start() {
        System.out.println("��ӡ����������");


    }

    @Override
    public void stop() {
        System.out.println("��ӡ����������");

    }
}