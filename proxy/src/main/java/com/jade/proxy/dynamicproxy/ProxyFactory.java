package com.jade.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * 创建动态代理对象
 * 动态代理不需要实现接口,但是需要指定接口类型
 */
public class ProxyFactory {

    //维护一个目标对象
    private final Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象生成代理对象
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("开始事务2");
                    //执行目标对象方法
                    Object returnValue = method.invoke(target, args);
                    System.out.println("提交事务2");
                    return returnValue;
                }
        );
    }

}

