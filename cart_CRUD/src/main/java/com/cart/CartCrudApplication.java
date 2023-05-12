package com.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class CartCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartCrudApplication.class, args);
	}

}
