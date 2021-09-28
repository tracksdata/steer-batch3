package com.xoraint.emp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScans({@ComponentScan("com.xoraint.emp.service"),
	             @ComponentScan("com.xoraint.emp.dao"),
	             @ComponentScan("com.xoraint.emp.aop") 
				})
@EnableAspectJAutoProxy
public class AppConfig {
	
	

}
