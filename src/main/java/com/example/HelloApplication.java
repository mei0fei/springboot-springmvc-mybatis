package com.example;

import java.util.Locale;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

/*
 * Spring Boot提倡约定优于配置
 *  @SpringBootApplication is combination of the annotations @Configuration, @EnableAutoConfiguration and @ComponentScan.
 * */

@SpringBootApplication
@MapperScan("com.example.mapper")
@EnableTransactionManagement
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
	
}
