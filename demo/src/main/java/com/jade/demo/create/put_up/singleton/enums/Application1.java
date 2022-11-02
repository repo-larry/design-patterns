package com.jade.demo.create.put_up.singleton.enums;

import java.lang.reflect.Constructor;

/**
 * @description:
 * @date: 2022/11/2
 **/
public class Application1 {

    public static void main(String[] args) throws Exception {
        EnumSingleton instance = EnumSingleton.getInstance();

        Class<EnumSingleton> c = EnumSingleton.class;
        // 枚举类只包含一个(String,int)类型构造器
        Constructor<EnumSingleton> constructor = c.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        EnumSingleton newInstance = constructor.newInstance("hello", 1);

        System.out.println(instance == newInstance);
    }
}
