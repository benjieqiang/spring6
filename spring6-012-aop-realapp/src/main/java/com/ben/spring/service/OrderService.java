package com.ben.spring.service;

import org.springframework.stereotype.Service;

/**
 * @Author: benjieqiang
 * @CreateTime: 2023-05-17  14:12
 * @Description: TODO
 * @Version: 1.0
 */
@Service("orderService")
public class OrderService { //目标对象

    public void generate() {
        System.out.println("正在生成订单");
    }

    public void cancel() {
        System.out.println("正在取消订单");
    }
}
