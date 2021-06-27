package com.expr;

import org.junit.Test;

import java.io.*;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/6/20-20:50
 * @Description:
 **/
public class PicTest {
    //图片的加密
    @Test
    public void test1(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(new File("爱情与友情.jpg"));
            fos = new FileOutputStream(new File("爱情与友情6.jpg"));

            int b = 0;
            while ((b = fis.read()) != -1){
                fos.write(b^5);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fos != null){

                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fis != null){

                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    //图片的解密
    @Test
    public void test2(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(new File("爱情与友情6.jpg"));
            fos = new FileOutputStream(new File("爱情与友情7.jpg"));

            byte[] buffer = new byte[10];
            int len;
            while ((len = fis.read(buffer)) != -1){

                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte) (buffer[i] ^ 5);
                }
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fos != null){

                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fis != null){

                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
