package com.jade.demo.structure.bridging;

/**
 * @description:
 * @date: 2022/11/2
 **/
public class JackStore extends Store {

    public JackStore(Pie pie) {
        super(pie);
    }

    @Override
    Pie makePie() {
        System.out.print("杰克的小店💒");
        return pie.makePie();
    }
}