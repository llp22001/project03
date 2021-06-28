package com.java1;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/6/28-0:34
 * @Description:
 *  * 实现TCP的网络编程
 *  * 例题3：从客户端发送文件给服务端，服务端保存到本地。并返回“发送成功”给客户端。
 *  * 并关闭相应的连接。
 **/
public class TCPTest3 {
    @Test
    public void client() throws IOException {
        //1.
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),8890);
        //2.
        OutputStream os = socket.getOutputStream();
        //3.
        FileInputStream fis = new FileInputStream(new File("beauty.jpg"));
        //4.
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer)) != -1){
            os.write(buffer,0,len);
        }
        //关闭数据输出
        socket.shutdownOutput();
        //5.接受服务器端的数据

        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        byte[] buffer1 = new byte[20];
        int len1;
        while ((len1 = is.read(buffer)) != -1){
            baos.write(buffer,0,len1);
        }
        System.out.println(baos.toString());
        baos.close();
        fis.close();
        os.close();
        socket.close();
    }
    @Test
    public void service() throws IOException {
        ServerSocket ss = new ServerSocket(8890);
        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();
        FileOutputStream fos = new FileOutputStream(new File("beauty3.jpg"));

        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1){
            fos.write(buffer,0,len);
        }
        System.out.println("接收来自于：" + socket.getInetAddress().getHostAddress() + "的数据");
        OutputStream os =socket.getOutputStream();
        os.write("数据发送成功".getBytes(StandardCharsets.UTF_8));

        os.close();
        fos.close();
        is.close();
        ss.close();
    }
}
