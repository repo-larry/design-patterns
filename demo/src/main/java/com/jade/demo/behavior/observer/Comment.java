package com.jade.demo.behavior.observer;

/**
 * @description:
 * @date: 2022/10/31
 **/
public class Comment {
    /**
     * 评论者昵称
     */
    private String nickname;
    /**
     * 评论内容
     */
    private String value;

    public Comment(String nickname, String value) {
        this.nickname = nickname;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getNickname() {
        return nickname;
    }
}