package com.jade.demo.create.put_up.singleton.enums;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @description: 枚举类型创建单例是不错的选择，这也是Effective Java推荐的方式。
 * @date: 2022/11/2
 **/
public enum EnumSingleton {

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

    /*
     * @param: args
     * @return: void
     * @description: 序列化攻击
     * @date: 2022/11/2
     */
    public static void main(String[] args) throws Exception {
        EnumSingleton instance = EnumSingleton.getInstance();
        instance.setData(new Object());
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("file"));
        outputStream.writeObject(instance);

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("file"));
        EnumSingleton newInstance = (EnumSingleton) inputStream.readObject();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);

        System.out.println(instance.getData());
        System.out.println(newInstance.getData());
        System.out.println(instance.getData() == newInstance.getData());
    }
}
