package com.jade.demo.create.prototype;

import java.util.ArrayList;

/**
 * @description:
 * @date: 2022/11/1
 **/
public class Application {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student();
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Student s = (Student) student.clone();
            s.setName("学生" + i);
            s.setAge(20 + i);
            list.add(s);
        }
        System.out.println(list);
    }
}
