package com.java;

import org.junit.Test;

import java.io.*;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/6/15-23:36
 * @Description: * 一、流的分类：
 * * 1.操作数据单位：字节流、字符流
 * * 2.数据的流向：输入流、输出流
 * * 3.流的角色：节点流、处理流
 * *
 * * 二、流的体系结构
 * * 抽象基类         节点流（或文件流）                               缓冲流（处理流的一种）
 * * InputStream     FileInputStream   (read(byte[] buffer))        BufferedInputStream (read(byte[] buffer))
 * * OutputStream    FileOutputStream  (write(byte[] buffer,0,len)  BufferedOutputStream (write(byte[] buffer,0,len) / flush()
 * * Reader          FileReader (read(char[] cbuf))                 BufferedReader (read(char[] cbuf) / readLine())
 * * Writer          FileWriter (write(char[] cbuf,0,len)           BufferedWriter (write(char[] cbuf,0,len) / flush()
 * *
 * *
 * *
 **/
public class FileReaderWriterTest {
    /*
    将day24下的hello.txt 文件读到内存中
     */
    @Test
    public void test1() {
        //1.实例化File类的对象，指明要操作的文件
        FileReader fr = null;
        try {
            File file = new File("hello.txt");//相对于当前Module
            //2.提供流
            fr = new FileReader(file);
            //3.数据的读入
            //read():返回读入的一个字符。如果达到文件末尾，返回-1
            //方式一：
            //int data = fr.read();
            //while (data != -1){
            //    System.out.print((char)data);X
            //    data = fr.read();
            //}
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流的关闭操作
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    //对read()操作方法升级：使用read重载的方法
    @Test
    public void testFileReader1() {
        FileReader fr = null;
        try {
            //1.File类的实例化
            File file = new File("hello.txt");
            //2.流的实例化
            fr = new FileReader(file);
            //3.读入操作
            //返回每次读入到数组中字符的个数，如果到文件末尾返回-1
            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1) {
                //方式一
                //for (int i = 0; i < len; i++) {
                //    System.out.print(cbuf[i]);
                //}
                String str = new String(cbuf, 0, len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.资源关闭
            if (fr != null) {

                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /*
    从内存中写出数据到硬盘的文件里。

    说明：
    1. 输出操作，对应的File可以不存在的。并不会报异常
    2.
     File对应的硬盘中的文件如果不存在，在输出的过程中，会自动创建此文件。
     File对应的硬盘中的文件如果存在：
            如果流使用的构造器是：FileWriter(file,false) / FileWriter(file):对原有文件的覆盖
            如果流使用的构造器是：FileWriter(file,true):不会对原有文件覆盖，而是在原有文件基础上追加内容

 */
    @Test
    public void testFileWriter() {
        //1.提供file类的对象 ，指明写出到的文件
        FileWriter fw = null;
        try {
            File file = new File("hello1.txt");
            //2.提供FileWriter的对象，用于数据的写出
            fw = new FileWriter(file,true);
            //3.写出操作
            fw.write("llp12315\n");
            //4.流资源关闭
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fw != null){

                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void testFileReaderFileWriter(){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            //File file = new File("hello.txt");
            //File file1 = new File("hello1.txt");
            File file = new File("爱情与友情.jpg");
            File file1 = new File("爱情与友情1.jpg");
            fr = new FileReader(file);
            fw = new FileWriter(file1);
            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1){
                //String str = new String(cbuf, 0, len);
                //fw.write(str);

                //每次写出len个字符
                fw.write(cbuf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr != null){

                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fw != null){

                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
