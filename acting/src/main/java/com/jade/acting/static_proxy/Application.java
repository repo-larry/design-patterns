package com.jade.acting.static_proxy;

/**
 * @description:
 * @date: 2022/11/2
 **/
public class Application {

    public static void main(String[] args) {
        PieServiceProxy proxy = new PieServiceProxy();
        proxy.makePie();
    }
}
