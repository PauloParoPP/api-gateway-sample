package com.github.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@ComponentScan(basePackages = {"com.github.swagger.product", "com.github.swagger.user" })
public class ApiServiceApplication {

    public static void main(String[] args) {

	SpringApplication.run(ApiServiceApplication.class, args);
    }
}
