package com.jade.demo.behavior.template;

/**
 * @description:
 * @date: 2022/11/1
 **/
public abstract class Takeaway {

    final void order() {
        System.out.println("下单");
    }

    final void packageSend() {
        System.out.println("打包派送");
    }

    protected abstract void make();

    protected boolean needTableware() {
        return true;
    }

    final void flow() {
        this.order();
        this.make();
        if (needTableware()) {
            System.out.println("赠送一次性餐具");
        }
        this.packageSend();
    }
}
