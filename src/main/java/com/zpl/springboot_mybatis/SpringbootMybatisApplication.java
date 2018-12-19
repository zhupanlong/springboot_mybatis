package com.zpl.springboot_mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.zpl.springboot_mybatis.dao")
public class SpringbootMybatisApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringbootMybatisApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisApplication.class, args);
	}

}

