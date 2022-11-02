package com.jade.acting.dynamic_proxy;

/**
 * @description:
 * @date: 2022/11/2
 **/
public class IceCreamServiceImpl implements IceCreamService {

    public void makeIceCream(String fruit) {
        System.out.println("制作" + fruit + "🍦");
    }
}
