package com.eureka.helloworld;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.eureka.helloworld.api.configuration.DemoApplication;
import com.eureka.helloworld.api.resources.DemoResource;

@SpringBootApplication
@ComponentScan
public class HelloworldApplication  {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

}
