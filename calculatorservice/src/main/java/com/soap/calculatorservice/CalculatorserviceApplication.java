package com.soap.calculatorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.*;

@SpringBootApplication
public class CalculatorserviceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorserviceApplication.class, args);
	}

}
