package com.learn.poorvi.week1Intro.IntroToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Apple {
    void eatApple(){
        System.out.println("I am eating the apple");
    }
    @PostConstruct
    void callBeforeConstruct(){
        System.out.println("Calling Before Constructing Apple");
    }

    @PreDestroy
    void callBeforeDestruct(){
        System.out.println("Finally Destroying Apple bean");
    }
}
