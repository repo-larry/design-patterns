package com.jade.demo.behavior.strategy;

/**
 * @description:
 * @date: 2022/11/1
 **/
public class FullReductionPromotionStrategy implements PromotionStrategy {
    public void promotion() {
        System.out.println("满1000立减1");
    }
}
