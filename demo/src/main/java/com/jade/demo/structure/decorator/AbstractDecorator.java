package com.jade.demo.structure.decorator;

/**
 * @description:
 * @date: 2022/11/2
 **/
public class AbstractDecorator extends AbstractFruitSalad{

    private AbstractFruitSalad fruitSalad;

    public AbstractDecorator(AbstractFruitSalad fruitSalad){
        this.fruitSalad = fruitSalad;
    }

    @Override
    public String remark() {
        return fruitSalad.remark();
    }

    @Override
    public int price() {
        return fruitSalad.price();
    }
}