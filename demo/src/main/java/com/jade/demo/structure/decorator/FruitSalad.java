package com.jade.demo.structure.decorator;

/**
 * @description:
 * @date: 2022/11/2
 **/
public class FruitSalad extends AbstractFruitSalad{
    @Override
    public String remark() {
        return "水果🥗（标准）\n";
    }

    @Override
    public int price() {
        return 9;
    }
}
