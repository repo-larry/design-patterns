package com.jade.demo.structure.bridging;

/**
 * @description:
 * @date: 2022/11/2
 **/
public abstract class Store {

    protected Pie pie;

    public Store(Pie pie){
        this.pie = pie;
    }

    abstract Pie makePie();
}
