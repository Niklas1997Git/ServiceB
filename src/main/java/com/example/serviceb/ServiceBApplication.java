package com.example.serviceb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceBApplication {

	@Value("${crossorigin.client}")
	private static String client;

	public static void main(String[] args) {
		System.out.println("Client: " + client);
		SpringApplication.run(ServiceBApplication.class, args);
	}

}
