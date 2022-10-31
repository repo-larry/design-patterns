package com.jade.demo.behavior.duty;

/**
 * @description:
 * @date: 2022/10/31
 **/
public class Application {

    public static void main(String[] args) {
        StringValidator lengthValidator = new StringLengthValidator();
        StringValidator valueValidator = new StringValueValidator();

        lengthValidator.setNextValidator(valueValidator);
        lengthValidator.check("hello");
    }
}
