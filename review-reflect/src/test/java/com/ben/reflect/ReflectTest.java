package com.ben.reflect;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author: benjieqiang
 * @CreateTime: 2023-05-15  17:31
 * @Description: TODO
 * @Version: 1.0
 */
public class ReflectTest {

    /**
     * @param :
     * @return void
     * @description 你知道以下这几条信息：
     * ● 类名是：com.powernode.reflect.User
     * ● 该类中有String类型的name属性和int类型的age属性。
     * ● 另外你也知道该类的设计符合javabean规范。（也就是说属性私有化，对外提供setter和getter方法）
     * 你如何通过反射机制给User对象的name属性赋值zhangsan，给age属性赋值20岁。
     * @author benjieqiang
     * @date 2023/5/15 5:32 PM
     */
    @Test
    public void testUserReflect() throws Exception {
        String properName = "age";
        String properName2 = "name";
        // 获取类名
        Class<?> clazz = Class.forName("com.ben.reflect.User");
        // 获取方法名
        String methodName = "set" + properName.toUpperCase().charAt(0) + properName.substring(1);
        // 获取方法, 指定参数类型的方法；

        // 根据属性名获取方法类型的参数
        Field ageField = clazz.getDeclaredField(properName);
        Field nameField = clazz.getDeclaredField(properName2);


        Method setAgeMethod = clazz.getDeclaredMethod(methodName, ageField.getType());
        Method setNameMethod = clazz.getDeclaredMethod("setName", String.class);
        // 获取对象
        Object obj = clazz.newInstance();
        // 调用方法
        setAgeMethod.invoke(obj, 20);
        setNameMethod.invoke(obj, "alex");
        System.out.println(obj); //User{name='alex', age=20}
    }


}
