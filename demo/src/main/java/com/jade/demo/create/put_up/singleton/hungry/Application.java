package com.jade.demo.create.put_up.singleton.hungry;

import java.lang.reflect.Constructor;

/**
 * @description:
 * 对于这种情况，饿汉模式下的例子可以在构造器中添加判断逻辑来防御
 * @date: 2022/11/2
 **/
public class Application {

    public static void main(String[] args) throws Exception {
        HungrySingleton instance = HungrySingleton.getInstance();
        // 反射创建实例
        Class<HungrySingleton> c = HungrySingleton.class;
        // 获取构造器
        Constructor<HungrySingleton> constructor = c.getDeclaredConstructor();
        // 打开构造器权限
        constructor.setAccessible(true);
        HungrySingleton newInstance = constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
