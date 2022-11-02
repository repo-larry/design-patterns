package com.jade.demo.structure.bridging;

/**
 * @description:
 * @date: 2022/11/2
 **/
public class ApplePie implements Pie {
    @Override
    public Pie makePie() {
        System.out.println("制作苹果派🍎🥧");
        return new ApplePie();
    }

    @Override
    public void getType() {
        System.out.println("水果派");
    }
}


