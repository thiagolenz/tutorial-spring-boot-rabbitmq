package com.masterdev.demo.worker;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class DemoBackendWorkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBackendWorkerApplication.class, args);
        System.out.println("Rodando Worker");
	}

}
