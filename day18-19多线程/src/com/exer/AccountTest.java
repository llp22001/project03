package com.exer;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Joost-Li
 * @email:lilinpeng.ok@163.com
 * @date: 2021/5/20-0:27
 * @Description:
 **/
class Account {
    private double balacne;

    public Account(double balacne) {
        this.balacne = balacne;
    }

    public void deposit(double amt) {
        if (amt > 0) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balacne += amt;
            System.out.println(Thread.currentThread().getName() + "存钱成功，余额为：" + balacne);
        }
    }
}

class Customer implements Runnable {
    private Account account;
    private ReentrantLock lock = new ReentrantLock();
    public Customer(Account account) {
        this.account = account;
    }


    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {

            try {
                lock.lock();
                account.deposit(1000);
            } finally {
                lock.unlock();
            }

        }
    }

}

public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account(0);

        Customer c1 = new Customer(acct);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c1);

        t1.setName("甲：");
        t2.setName("乙：");
        t1.start();
        t2.start();

    }
}
