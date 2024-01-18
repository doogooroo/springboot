package com.in28minutes.learnspringframwork.helloworld;

import com.in28minutes.learnspringframwork.game.ContraGame;
import com.in28minutes.learnspringframwork.game.GameRunner;
import com.in28minutes.learnspringframwork.game.MarioGame;
import com.in28minutes.learnspringframwork.game.PacManGame;

/* 
    강한 결합 예제(Tightly Coupled) 
    why?

*/

public class App01GamingBasic {

    public static void main(String[] args){

        //var game = new MarioGame();
        //var game = new ContraGame();
        var game = new PacManGame();

        var gameRunner = new GameRunner(game);
        gameRunner.run();

    }
    
}
