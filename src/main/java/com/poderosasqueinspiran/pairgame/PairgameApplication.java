package com.poderosasqueinspiran.pairgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PairgameApplication {

	public static void main(String[] args) {
		SpringApplication.run(PairgameApplication.class, args);
	}

}
