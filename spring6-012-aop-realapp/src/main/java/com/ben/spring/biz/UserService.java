package com.ben.spring.biz;

import org.springframework.stereotype.Service;

/**
 * @Author: benjieqiang
 * @CreateTime: 2023-05-17  14:47
 * @Description: TODO
 * @Version: 1.0
 */
@Service("userService")
public class UserService {

    public void saveUser() {
        System.out.println("正在保存用户信息");
    }

    public void deleteUser() {
        System.out.println("正在删除用户信息");
    }

    public void modifyUser() {
        System.out.println("正在修改用户信息");
    }

    public void getUser() {
        System.out.println("正在获取用户信息");
    }

}
