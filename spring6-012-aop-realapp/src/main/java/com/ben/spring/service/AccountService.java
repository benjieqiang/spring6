package com.ben.spring.service;

import org.springframework.stereotype.Service;

/**
 * @Author: benjieqiang
 * @CreateTime: 2023-05-17  14:13
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class AccountService {
    public void transfer() {
        System.out.println("银行账户正在完成转账业务");
    }
    public void withdraw() {
        // 程序异常应该回滚
        //***********
        //开启事务
        //java.lang.NullPointerException: Cannot invoke "String.toString()" because "s" is null
        //回滚事务
        //***********
//        String s = null;
//        s.toString();
        System.out.println("正在取款，请稍后");
    }
}
