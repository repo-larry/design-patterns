package com.jade.demo.create.put_up.singleton.destroy;

import java.io.*;

/**
 * @description:
 * 这种方式反序列化过程内部还是会重新创建HungrySingleton实例，只不过因为HungrySingleton类定义了readResolve方法（方法内部返回instance引用），反序列化过程会判断目标类是否定义了readResolve该方法，是的话则通过反射调用该方法。
 * @date: 2022/11/2
 **/
public class HungrySingleton implements Serializable {

    private static final long serialVersionUID = -8073288969651806838L;

    private final static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return instance;
    }

    // 新增 防止序列化破坏
    private Object readResolve() {
        return instance;
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 演示序列化破坏单例
        HungrySingleton instance = HungrySingleton.getInstance();
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("file"));
        outputStream.writeObject(instance);

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("file"));
        HungrySingleton newInstance = (HungrySingleton) inputStream.readObject();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
