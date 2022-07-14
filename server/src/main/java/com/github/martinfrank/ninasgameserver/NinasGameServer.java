package com.github.martinfrank.ninasgameserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class NinasGameServer {

	public static void main(String[] args) {
		SpringApplication.run(NinasGameServer.class, args);
	}

}
