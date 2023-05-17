package com.ben.spring.test;

import com.ben.spring.biz.UserService;
import com.ben.spring.service.AccountService;
import com.ben.spring.service.OrderService;
import com.ben.spring.service.SpringConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: benjieqiang
 * @CreateTime: 2023-05-17  14:30
 * @Description: TODO
 * @Version: 1.0
 */
public class AopSpringTest {


    @Test
    public void testSecurityLogAspectWithXml() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userBean = applicationContext.getBean("userService", UserService.class);

        userBean.saveUser();
        userBean.deleteUser();
        userBean.modifyUser();
        userBean.getUser();
    }

    @Test
    public void testAopWithoutXml() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);

        orderService.generate();
        orderService.cancel();

        accountService.transfer();
        accountService.withdraw();
    }
    @Test
    public void testAopWithXml() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);

        orderService.generate();
        orderService.cancel();

        accountService.transfer();
        accountService.withdraw();
    }
}
