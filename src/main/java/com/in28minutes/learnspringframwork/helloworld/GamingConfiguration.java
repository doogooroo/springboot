package com.in28minutes.learnspringframwork.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learnspringframwork.game.GameRunner;
import com.in28minutes.learnspringframwork.game.GamingConsole;
import com.in28minutes.learnspringframwork.game.PacManGame;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game(){
        var game = new PacManGame();
        return game;
    }


    // //var game = new MarioGame();
    //     //var game = new ContraGame();
    //     var game = new PacManGame();

    //     var gameRunner = new GameRunner(game);
    //     gameRunner.run();
}
