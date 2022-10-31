package com.jade.demo.behavior.observer;

/**
 * @description:
 * @date: 2022/11/1
 **/
public class Application {

    public static void main(String[] args) {
        Blog blog = new Blog("Java从入门到放弃");
        Author author = new Author("MrBird");

        // 添加观察者
        blog.addObserver(author);

        Comment comment = new Comment("Scott",
                "感谢楼主的文章，让我及时放弃Java，回家继承了千万家产。");
        blog.comment(comment);
    }
}
