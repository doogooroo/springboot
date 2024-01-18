package com.in28minutes.learnspringframwork.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age){};

record Address (String sido, String gun){};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "doogooroo";
    }

    @Bean
    public int age(){
        return 38;
    }

    @Bean
    public Person person(){
        Person person = new Person("NamT", 33);
        return person;
    }

    @Bean(name = "addr2")
    public Address addr(){
        return new Address("busan", "haeundae");
    }
    
}
