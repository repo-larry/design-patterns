package com.jade.demo.behavior.memo;

import lombok.Getter;

/**
 * @description:
 * @date: 2022/11/1
 **/
@Getter
public class GameMemento {
    /**
     * 步数
     */
    private int playerSteps;

    /**
     * 备份步数
     *
     * @param playerSteps
     */
    public GameMemento(int playerSteps) {
        this.playerSteps = playerSteps;
    }

}
