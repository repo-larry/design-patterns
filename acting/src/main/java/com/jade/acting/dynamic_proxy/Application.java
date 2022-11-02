package com.jade.acting.dynamic_proxy;

import com.jade.acting.static_proxy.PieServcie;
import com.jade.acting.static_proxy.PieServiceImpl;

/**
 * @description:
 * @date: 2022/11/2
 **/
public class Application {

    public static void main(String[] args) {

        PieServcie pieServiceDynamicProxy = (PieServcie) new DynamicProxy(new PieServiceImpl()).proxy();
        pieServiceDynamicProxy.makePie();
        System.out.println("-----------------");
        IceCreamService iceCreamServiceDynamicProxy = (IceCreamService) new DynamicProxy(new IceCreamServiceImpl()).proxy();
        iceCreamServiceDynamicProxy.makeIceCream("🍓");
    }
}
