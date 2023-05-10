package com.ben.spring6.test;

import com.ben.spring6.bean.User;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: benjieqiang
 * @CreateTime: 2023-05-10  16:34
 * @Description: 测试spring中bean对象的获取；
 * @Version: 1.0
 */
public class FirstSpring6Test {

    @Test
    public void testGetFirstBeanObj() {
        // ApplicationContext: 应用上下文，就是Spring容器；
        // ClassPathXmlApplicationContext： 专门从类路径下加载Spring的配置文件的一个Spring上下文对象
        // 启动了Spring容器，解析spring.xml文件，实例化里面的所有Bean对象，放到Spring容器中；
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Object userBean = applicationContext.getBean("userBean");
        User user = applicationContext.getBean("userBean", User.class);
        System.out.println(userBean); //com.ben.spring6.bean.User@188715b5
        System.out.println(user); //com.ben.spring6.bean.User@1ea9f6af

        Object sqlBean = applicationContext.getBean("userDaoImplForMySQLBean");
        System.out.println(sqlBean); //com.ben.spring6.dao.impl.UserDaoImplForMySQL@6a192cfe
    }

    @Test
    public void testLog4j2() {
        Logger logger = LoggerFactory.getLogger(FirstSpring6Test.class);
        logger.info("测试log打印");
    }
}
