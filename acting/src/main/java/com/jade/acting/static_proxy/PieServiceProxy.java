package com.jade.acting.static_proxy;

/**
 * @description:
 * @date: 2022/11/2
 **/
public class PieServiceProxy {

    private PieServcie pieServcie;

    public void makePie() {
        beforeMethod();
        pieServcie = new PieServiceImpl();
        pieServcie.makePie();
        afterMethod();
    }

    private void beforeMethod() {
        System.out.println("准备材料");
    }

    private void afterMethod() {
        System.out.println("保鲜");
    }

}
