package com.porfolio.yv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class YvApplication {

	public static void main(String[] args) {
		SpringApplication.run(YvApplication.class, args);
	}

}
