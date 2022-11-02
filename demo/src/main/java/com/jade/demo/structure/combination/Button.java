package com.jade.demo.structure.combination;

/**
 * @description:
 * @date: 2022/11/2
 **/
public class Button extends AbstractMenuButton {

    private String name;

    public Button(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return "按钮";
    }

    @Override
    public void print() {
        System.out.println(getName() + "【" + getType() + "】");
    }
}
