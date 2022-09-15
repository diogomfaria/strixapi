package br.com.fiap.strixapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class StrixApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StrixApiApplication.class, args);
	}

}
