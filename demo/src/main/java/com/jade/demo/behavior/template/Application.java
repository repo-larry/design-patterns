package com.jade.demo.behavior.template;

/**
 * @description:
 * @date: 2022/11/1
 **/
public class Application {

    public static void main(String[] args) {
        Takeaway barbecue = new BarbecueTakeaway(true);
        barbecue.flow();

        FruitTakeaway fruit = new FruitTakeaway();
        fruit.flow();
    }
}
