package com.xoriant.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // AutoConfiguration
//@ComponentScan("com,com.xoriant")
public class Application {

	public static void main(String[] args) { 
		
		SpringApplication.run(Application.class,args);

	}

}
