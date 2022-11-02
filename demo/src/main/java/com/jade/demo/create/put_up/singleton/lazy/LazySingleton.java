package com.jade.demo.create.put_up.singleton.lazy;

/**
 * @description: 不安全
 * @date: 2022/11/2
 **/
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}