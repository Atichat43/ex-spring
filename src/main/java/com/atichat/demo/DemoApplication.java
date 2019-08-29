package com.atichat.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
@RestController
public class DemoApplication extends SpringBootServletInitializer implements CommandLineRunner{

	@Override
   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
      return application.sources(DemoApplication.class);
   }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		 System.out.println("Hello world from Command Line Runner");
	}
}
