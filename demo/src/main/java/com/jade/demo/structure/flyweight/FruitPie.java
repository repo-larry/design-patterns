package com.jade.demo.structure.flyweight;

import java.time.LocalDateTime;

/**
 * @description:
 * @date: 2022/11/2
 **/
public class FruitPie implements Pie {

    private String name;
    private LocalDateTime productTime;

    public FruitPie(String name) {
        this.name = name;
    }

    public void setProductTime(LocalDateTime productTime) {
        this.productTime = productTime;
    }

    @Override
    public void make() {
        try {
            Thread.sleep(100);
            System.out.println(name + "生产时间：" + this.productTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}