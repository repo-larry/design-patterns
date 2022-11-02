package com.jade.demo.create.put_up.singleton.enums;

/**
 * @description:
 * @date: 2022/11/2
 **/
public class Application {

    public static void main(String[] args) throws Exception {

        EnumSingleton instance = EnumSingleton.getInstance();
        instance.setData(new Object());
        EnumSingleton newInstance = EnumSingleton.getInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance.getData());
        System.out.println(newInstance.getData());
    }
}
