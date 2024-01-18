package com.in28minutes.learnspringframwork.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringframwork.game.ContraGame;
import com.in28minutes.learnspringframwork.game.GameRunner;
import com.in28minutes.learnspringframwork.game.GamingConsole;
import com.in28minutes.learnspringframwork.game.MarioGame;
import com.in28minutes.learnspringframwork.game.PacManGame;

/* 
    강한 결합 예제(Tightly Coupled) 
    why?

*/

public class App03GamingSpringBeans {

    public static void main(String[] args){

        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);

        context.getBean(GamingConsole.class).up();

    }
    
}
