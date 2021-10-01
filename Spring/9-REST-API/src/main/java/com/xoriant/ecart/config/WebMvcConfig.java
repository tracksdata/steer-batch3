package com.xoriant.ecart.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScans(value= {@ComponentScan(basePackages="com.xoriant.ecart.controller")})
public class WebMvcConfig implements WebMvcConfigurer {


}