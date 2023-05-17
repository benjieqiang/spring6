package com.ben.spring.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @Author: benjieqiang
 * @CreateTime: 2023-05-17  14:18
 * @Description: 利用切面完成开启事务，执行业务程序，提交事务，回滚事务的操作
 * @Version: 1.0
 */

@Component
@Aspect
public class TransactionAspect {

    @Around("execution(* com.ben.spring.service..*(..))") //往service下面的所有方法进行切入
    public void aroundAdvice(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("***********");
            System.out.println("开启事务");
            // 执行目标
            joinPoint.proceed();
            System.out.println("提交事务");
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("回滚事务");
            System.out.println("***********");
        }
    }
}
