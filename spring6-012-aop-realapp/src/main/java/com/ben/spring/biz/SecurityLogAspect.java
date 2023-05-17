package com.ben.spring.biz;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: benjieqiang
 * @CreateTime: 2023-05-17  14:50
 * @Description: TODO
 * @Version: 1.0
 */

@Component
@Aspect
public class SecurityLogAspect {

    //切点表达式单独的定义出来，在需要的位置引入即可
    @Pointcut("execution(* com.ben.spring.biz..*(..))")
    public void savePointcut(){}
    @Pointcut("execution(* com.ben.spring.biz..*(..))")
    public void deletePointcut(){}
    @Pointcut("execution(* com.ben.spring.biz..*(..))")
    public void modifyPointcut(){}
    @Pointcut("execution(* com.ben.spring.biz..*(..))")
    public void getPointcut(){}

    @Before("savePointcut() || deletePointcut() || modifyPointcut() || getPointcut()")
    public void beforeAspect(JoinPoint joinPoint) {
        System.out.println("******************************************************");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = simpleDateFormat.format(new Date());
        System.out.println("张三："+ time + "正在操作" + joinPoint.getSignature().getDeclaringTypeName() + "的" + joinPoint.getSignature().getName() + "方法");
    }
}
