package com.TestAlBa.WebScraping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WebScrapingApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebScrapingApplication.class, args);
	}

}
