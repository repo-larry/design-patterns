package com.jade.demo.create.factory_method;

/**
 * @description:
 * @date: 2022/11/1
 **/
public class Application {

    public static void main(String[] args) {
        FruitFactory factory = new AppleFruitFactory();
        Fruit fruit = factory.produceFruit();
        fruit.eat();
    }
}
