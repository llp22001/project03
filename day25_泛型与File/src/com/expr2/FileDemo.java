package com.expr2;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/6/14-0:33
 * @Description:
 **/
public class FileDemo {
    @Test
    public void test1() throws IOException {
        File file1 = new File("D:\\IO\\hello.txt");
        File file2 = new File(file1.getParent(),"haha.txt");
        boolean newFile = file2.createNewFile();
        if (newFile){
            System.out.println("文件创建成功");
        }
    }
}
