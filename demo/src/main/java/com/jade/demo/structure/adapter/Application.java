package com.jade.demo.structure.adapter;

/**
 * @description:
 * @date: 2022/11/2
 **/
public class Application {
    public static void main(String[] args) {
        Pie pie = new RaspberryPieAdaptor();
        pie.make();
    }
}
