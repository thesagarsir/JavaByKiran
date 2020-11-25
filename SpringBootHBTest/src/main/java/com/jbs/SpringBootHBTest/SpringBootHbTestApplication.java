package com.jbs.SpringBootHBTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan("com.jbs")
public class SpringBootHbTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHbTestApplication.class, args);
	}

}
