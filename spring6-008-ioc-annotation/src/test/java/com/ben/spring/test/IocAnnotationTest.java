package com.ben.spring.test;

import com.ben.spring.bean.User;
import com.ben.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: benjieqiang
 * @CreateTime: 2023-05-16  17:31
 * @Description: TODO
 * @Version: 1.0
 */
public class IocAnnotationTest {

    @Test
    public void testAnnotation() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        Object userBean = applicationContext.getBean("userBean", User.class);
        Object userBean = applicationContext.getBean("user", User.class); //注解没有写value值，默认是类名首字母小写之后的单词。
        System.out.println(userBean);//com.ben.spring.bean.User@10959ece

        UserService userServiceBean = applicationContext.getBean("userServiceBean", UserService.class);
        System.out.println(userServiceBean); //com.ben.spring.service.UserService@378542de

    }
}
