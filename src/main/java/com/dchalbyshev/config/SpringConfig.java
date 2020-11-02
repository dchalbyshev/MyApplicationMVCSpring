package com.dchalbyshev.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

// конфигурационный файл
@Configuration
@ComponentScan("com.dchalbyshev")
@EnableWebMvc
public class SpringConfig {
}
