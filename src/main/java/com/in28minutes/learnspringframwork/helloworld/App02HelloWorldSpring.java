package com.in28minutes.learnspringframwork.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringframwork.game.ContraGame;
import com.in28minutes.learnspringframwork.game.GameRunner;
import com.in28minutes.learnspringframwork.game.MarioGame;
import com.in28minutes.learnspringframwork.game.PacManGame;

/* 
    강한 결합 예제(Tightly Coupled) 
    why?

*/

public class App02HelloWorldSpring {

    public static void main(String[] args){
        // 1. Launch a Spring Context

        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
                
            // 2. Configure the thinngs that we want Spring to manage @Configureation
            System.out.println(context.getBean("name"));

            System.out.println(context.getBean("age"));

            System.out.println(context.getBean("person"));

            System.out.println(context.getBean("addr2"));


            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }catch(Exception e){
            System.out.println("Excetpion : " + e.getMessage());
        }


        

        


    }
    
}
