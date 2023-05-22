package com.levo.dockerexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerApp {
	public static void main(String[] args) {
		System.out.println("Hi Satish this is from sprint boot java app");
		SpringApplication.run(DockerApp.class, args);
	}
}
