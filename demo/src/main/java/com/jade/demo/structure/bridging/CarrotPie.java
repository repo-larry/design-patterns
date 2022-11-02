package com.jade.demo.structure.bridging;

/**
 * @description:
 * @date: 2022/11/2
 **/
public class CarrotPie implements Pie{
    @Override
    public Pie makePie() {
        System.out.println("制作胡萝卜派🥕🥧");
        return new CarrotPie();
    }

    @Override
    public void getType() {
        System.out.println("蔬菜沙拉派");
    }
}
