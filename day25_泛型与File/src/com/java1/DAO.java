package com.java1;

import java.util.List;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/6/13-17:34
 * @Description:
 * DAO: data(base) access object
 **/
public class DAO<T> {
    //添加
    public void add(T t){

    }
    //删除
    public boolean remove(T t){
        return false;
    }

    //修改
    public void update(int index,T t){

    }
    //查询
    public T getIndex(int index ){

        return null;
    }
    //查询多条

    public List<T> getForList(int index){
        return null;
    }

}
