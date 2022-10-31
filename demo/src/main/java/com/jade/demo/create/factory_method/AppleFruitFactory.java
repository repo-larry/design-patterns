package com.jade.demo.create.factory_method;

/**
 * @description:
 * @date: 2022/11/1
 **/
public class AppleFruitFactory extends FruitFactory{
    @Override
    public Fruit produceFruit() {
        return new Apple();
    }
}