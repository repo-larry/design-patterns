package com.jade.demo.behavior.memo;

/**
 * @description:
 * @date: 2022/11/1
 **/
public class Player {

    public static void main(String[] args) {

        Game game = new Game();
        System.out.println("游戏开始，捡到滑板，前进10步");
        game.setPlayerStep(10);
        //备份当前状态
        System.out.println("备份当前状态");
        GameMemento gameMemento = game.createGameMemento();

        Caretaker caretaker = new Caretaker();

        caretaker.saveMemento(gameMemento);
        System.out.println("备份完成");
        game.play();
        System.out.println("踩到便便了，当前步数为："+game.getPlayerStep());
        System.out.println("还原到之前一步");
        game.restore(caretaker.retrieveMemento());

        System.out.println("恢复完成，当前玩家步数是："+game.getPlayerStep());

    }

}
