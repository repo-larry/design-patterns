package com.jade.demo.structure.decorator;

/**
 * @description:
 * @date: 2022/11/2
 **/
public class Application {

    public static void main(String[] args) {
        // 点了份水果沙拉，并加了两份🥝和一份🍉，看看最终价格是多少？
        AbstractFruitSalad fruitSalad = new FruitSalad();
        fruitSalad = new KiwiDecorator(fruitSalad);
        fruitSalad = new KiwiDecorator(fruitSalad);
        fruitSalad = new WaterMelonDecorator(fruitSalad);

        System.out.println(fruitSalad.remark() + "价格是：" + fruitSalad.price());
    }
}
