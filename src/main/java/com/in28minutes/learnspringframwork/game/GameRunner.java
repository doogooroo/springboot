package com.in28minutes.learnspringframwork.game;

public class GameRunner {
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Start Running game : " + game);

        game.up();
        game.down();
        game.left();
        game.right();
    }

}
