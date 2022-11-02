package com.jade.demo.structure.adapter;

/**
 * @description:
 * @date: 2022/11/2
 **/
//类适配器
//public class RaspberryPieAdaptor extends Raspberry implements Pie{
//    @Override
//    public void make() {
//        System.out.println("制作一个派🥧");
//        super.addRaspberry();
//    }
//}

//对象适配器
public class RaspberryPieAdaptor implements Pie {

    private Raspberry raspberry = new Raspberry();

    @Override
    public void make() {
        System.out.println("制作一个派🥧");
        raspberry.addRaspberry();
    }
}