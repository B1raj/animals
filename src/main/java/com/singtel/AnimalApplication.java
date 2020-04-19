package com.singtel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @author birajmishra@hotmail.com
 *
 */

@SpringBootApplication
@ComponentScan(basePackages = { "com.singtel.animal", "com.singtel" })
public class AnimalApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalApplication.class, args);
	}
}
