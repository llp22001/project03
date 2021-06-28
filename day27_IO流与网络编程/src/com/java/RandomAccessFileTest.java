package com.java;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/6/27-18:27
 * @Description:
 *  * RandomAccessFile的使用
 *  * 1.RandomAccessFile直接继承于java.lang.Object类，实现了DataInput和DataOutput接口
 *  * 2.RandomAccessFile既可以作为一个输入流，又可以作为一个输出流
 *  *
 *  * 3.如果RandomAccessFile作为输出流时，写出到的文件如果不存在，则在执行过程中自动创建。
 *  *   如果写出到的文件存在，则会对原有文件内容进行覆盖。（默认情况下，从头覆盖）
 *  *
 *  * 4. 可以通过相关的操作，实现RandomAccessFile“插入”数据的效果
 **/
public class RandomAccessFileTest {
    @Test
    public void test(){
        RandomAccessFile af1 = null;
        RandomAccessFile af2 = null;
        try {
            af1 = new RandomAccessFile(new File("爱情与友情.jpg"),"r");
            af2 = new RandomAccessFile(new File("爱情与友情1.jpg"),"rw");

            byte[] buffer = new byte[1024];
            int len;
            while ((len = af1.read(buffer)) != -1) {
                    af2.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (af1 != null) {

                try {
                    af1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (af2 != null) {

                try {
                    af2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void test2() throws IOException {
        //RandomAccessFile raf1 = new RandomAccessFile(new File("hello1.txt"),"r");
        RandomAccessFile raf2 = new RandomAccessFile(new File("hello.txt"),"rw");
        raf2.seek(3);
        raf2.write("llp".getBytes(StandardCharsets.UTF_8));
        raf2.close();
    }
    @Test
    /*
    使用RandomAccessFile 实现插入效果
     */
    public void test3() throws IOException {
        RandomAccessFile raf1 = new RandomAccessFile(new File("hello.txt"),"rw");
        raf1.seek(3);//将指针调到角标3的位置

        //保存指针3后面的所有数据
        StringBuilder builder = new StringBuilder((int) new File("hello.txt").length());
        byte[] buffer = new byte[20];
        int len;
        while ((len = raf1.read(buffer)) != -1){
            builder.append(new String(buffer,0,len));
        }
        //调回指针
        raf1.seek(3);
        raf1.write("xyz".getBytes(StandardCharsets.UTF_8));
        raf1.write(builder.toString().getBytes(StandardCharsets.UTF_8));

        raf1.close();
    }
}
