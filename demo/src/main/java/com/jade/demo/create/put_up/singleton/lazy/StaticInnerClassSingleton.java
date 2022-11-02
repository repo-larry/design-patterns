package com.jade.demo.create.put_up.singleton.lazy;

/**
 * @description:
 * JVM在类的初始化阶段会加Class对象初始化同步锁，同步多个线程对该类的初始化操作
 * 静态内部类InnerClass的静态成员变量instance在方法区中只会有一个实例
 * Java规范中，当以下这些情况首次发生时，A类将会立刻被初始化：
 * A类型实例被创建；
 * A类中声明的静态方法被调用；
 * A类中的静态成员变量被赋值；
 * A类中的静态成员被使用（非常量）；
 * @date: 2022/11/2
 **/
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {

    }

    private static class InnerClass {
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.instance;
    }
}
