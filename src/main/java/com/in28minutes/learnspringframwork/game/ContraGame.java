package com.in28minutes.learnspringframwork.game;

public class ContraGame implements GamingConsole{

    public void up(){
        System.out.println("straight");
    }

    public void down(){
        System.out.println("sit down");
    }

    public void left(){
        System.out.println("turn left");
    }

    public void right(){
        System.out.println("shoot your gun");
    }

}
