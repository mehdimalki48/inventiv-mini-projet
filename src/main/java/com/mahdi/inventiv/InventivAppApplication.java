package com.mahdi.inventiv;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mahdi.inventiv.models.Case;
import com.mahdi.inventiv.service.ICaseService;

@SpringBootApplication
public class InventivAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventivAppApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ICaseService service){
		return args -> {
			service.add(new Case(null, "E01", new Date(), new Date(), "random description 1"));
			service.add(new Case(null, "E02", new Date(), new Date(), "random description 2"));
			service.add(new Case(null, "E03", new Date(), new Date(), "random description 3"));
			service.add(new Case(null, "E04", new Date(), new Date(), "random description 4"));
			
		};
	}
}
