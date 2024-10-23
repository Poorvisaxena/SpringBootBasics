package com.learn.poorvi.week1Intro.IntroToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class IntroToSpringBootApplication implements CommandLineRunner{

	@Autowired
	Apple obj; // so we injected apple dependency inside spring bean
	public static void main(String[] args) {
		SpringApplication.run(IntroToSpringBootApplication.class, args);
		System.out.println("Poorvi");

		/*obj.eatApple();static method main can't invoke non-static so we override run method */
	}

	@Override
	public void run(String... args) throws Exception {
		obj.eatApple();
	}

}