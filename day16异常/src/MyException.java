/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/13-21:47
 * @Description:
 **/
public class MyException extends Exception {
    static final long serialVersionUID = -7034897190745766939L;

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
