package com.java;

import org.junit.Test;

import java.io.*;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/6/20-18:16
 * @Description:
 * 缓冲流
 *  * 处理流之一：缓冲流的使用
 *  *
 *  * 1.缓冲流：
 *  * BufferedInputStream
 *  * BufferedOutputStream
 *  * BufferedReader
 *  * BufferedWriter
 *  *
 *  * 2.作用：提供流的读取、写入的速度
 *  *   提高读写速度的原因：内部提供了一个缓冲区
 *  *
 *  * 3. 处理流，就是“套接”在已有的流的基础上。
 **/
public class BufferedTest {
    @Test
    public void BufferedStreamTest(){
        long start = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File srcFile = new File("爱情与友情.jpg");
            File destFile = new File("爱情与友情4.jpg");
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] buffer = new byte[5];
            int len;
            while ((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //资源关闭
            if(bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bis != null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        long end = System.currentTimeMillis();

        //关闭外层流，内层流也会自动关闭，关闭内层流可以省略
        //fos.close();
        //fis.close();

        System.out.println("处理流执行赋值图片时间：" + (end - start));
    }
    /*
    实现文件赋值的方法，用Buffered...处理流
     */
    public void copyFileBuffered(String srcPath, String destPath){

        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //资源关闭
            if(bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bis != null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



        //关闭外层流，内层流也会自动关闭，关闭内层流可以省略
        //fos.close();
        //fis.close();


    }
    @Test
    public void copyFileBufferedTest(){
        long start = System.currentTimeMillis();
        copyFileBuffered("爱情与友情.jpg","爱情与友情5.jpg");
        long end = System.currentTimeMillis();
        System.out.println("处理流执行赋值图片时间：" + (end - start));
    }
    /*
    使用BufferedReader BufferedWriter 赋值文本文件
     */
    @Test
    public  void testBufferedReaderBufferedWriter(){
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            File srcFile = new File("hello.txt");
            File destFile = new File("hello2.txt");

            FileReader fr = new FileReader(srcFile);
            FileWriter fw = new FileWriter(destFile);

            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);
            //方式一
            //char[] buffer = new char[5];
            //int len;
            //
            //while((len = br.read(buffer)) != -1){
            //    fw.write(buffer, 0, len);
            //}

            //方式二
            String data ;
            while ((data = br.readLine()) != null){
                //方式一
                //bw.write(data +"\n");
                //方式二
                bw.write(data);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null){

                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (br != null){

                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
