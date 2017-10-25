package com.revature.revpro.salesforceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({ "classpath:salesforce-module.properties" })
public class SalesforceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesforceApiApplication.class, args);
	}
}
