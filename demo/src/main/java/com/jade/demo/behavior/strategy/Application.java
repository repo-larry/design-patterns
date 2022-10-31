package com.jade.demo.behavior.strategy;

/**
 * @description:
 * @date: 2022/11/1
 **/
public class Application {

    public static void main(String[] args) {
        // 模拟客户端传递的促销策略key
        String promotionKey = "fr";
        PromotionStrategy promotionStrategy = PromotionStrategyFactory.getPromotionStrategy(promotionKey);
        promotionStrategy.promotion();
    }
}
