package com.jade.demo.behavior.duty;

/**
 * @description:
 * @date: 2022/10/31
 **/
public abstract class StringValidator {

    protected StringValidator validator;

    public void setNextValidator(StringValidator validator) {
        this.validator = validator;
    }

    public abstract void check(String value);
}
