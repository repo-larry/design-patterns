package com.jade.demo.behavior.template;

/**
 * @description:
 * @date: 2022/11/1
 **/
public class FruitTakeaway extends Takeaway {

    @Override
    protected void make() {
        System.out.println("水果配货");
    }

    @Override
    protected boolean needTableware() {
        return false;
    }
}
