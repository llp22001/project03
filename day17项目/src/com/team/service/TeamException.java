package com.team.service;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/5/17-1:31
 * @Description:
 **/
public class TeamException extends Exception {
    static final long serialVersionUID = -7034897190745766939L;

    public TeamException() {

    }

    public TeamException(String message) {
        super(message);
    }
}
