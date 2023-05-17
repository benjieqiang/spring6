package com.ben.spring.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: benjieqiang
 * @CreateTime: 2023-05-17  14:35
 * @Description: 利用注解来实现不需要配置spring.xml文件，全注解开发
 * @Version: 1.0
 */

@Configuration
@ComponentScan({"com.ben.spring.service"}) // 组件扫描
@EnableAspectJAutoProxy(exposeProxy = true) //开启自动切面
public class SpringConfig {

}
