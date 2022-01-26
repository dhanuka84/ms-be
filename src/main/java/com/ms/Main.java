package com.ms;


import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
//@ComponentScan({"com.ms", "com.ms.controller","com.ms.service","com.ms.repository"})
//@EnableFeignClients
//@EnableAutoConfiguration
@ComponentScan(useDefaultFilters=true, basePackages="com")
@ComponentScan
@Configuration
public class Main {

  public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Main.class, args); 
  }

}
