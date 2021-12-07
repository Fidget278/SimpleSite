package com.SimpleSite.biz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.SimpleSite"})
@SpringBootApplication
public class SimpleSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSiteApplication.class, args);
	}

}
