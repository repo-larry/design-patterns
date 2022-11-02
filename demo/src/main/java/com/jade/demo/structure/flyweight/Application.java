package com.jade.demo.structure.flyweight;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

/**
 * @description:
 * @date: 2022/11/2
 **/
public class Application {

    private static final String[] PIE = {"🍇派", "🍈派", "🍓派", "🍒派"};

    public static void main(String[] args) {
        IntStream.range(0, 10).forEach((i) -> {
            String name = PIE[(int) (Math.random() * PIE.length)];
            FruitPie fruitPie = FruitPieFactory.produce(name);
            fruitPie.setProductTime(LocalDateTime.now());
            fruitPie.make();
        });
    }
}
