package com.jade.demo.create.put_up.singleton.lazy;

/**
 * @description: 同步锁
 * @date: 2022/11/2
 **/
public class LazySingleton1 {

    private static LazySingleton1 lazySingleton = null;

    private LazySingleton1() {

    }

    public static LazySingleton1 getInstance() {
        synchronized (LazySingleton1.class) {
            if (lazySingleton == null) {
                lazySingleton = new LazySingleton1();
            }
        }
        return lazySingleton;
    }
}
