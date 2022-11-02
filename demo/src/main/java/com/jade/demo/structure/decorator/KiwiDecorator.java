package com.jade.demo.structure.decorator;

/**
 * @description:
 * @date: 2022/11/2
 **/
public class KiwiDecorator extends AbstractDecorator {

    public KiwiDecorator(AbstractFruitSalad fruitSalad) {
        super(fruitSalad);
    }

    @Override
    public String remark() {
        return super.remark() + "加份🥝切\n";
    }

    @Override
    public int price() {
        return super.price() + 2;
    }
}
