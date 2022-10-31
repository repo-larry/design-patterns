package com.jade.demo.behavior.duty;

/**
 * @description:
 * @date: 2022/10/31
 **/
public class StringValueValidator extends StringValidator {
    @Override
    public void check(String value) {
        if (value.contains("fuck")) {
            System.out.println("字符串值不合法");
            if (validator != null) {
                validator.check(value);
            }
        } else {
            System.out.println("字符串值合法");
        }
    }
}
