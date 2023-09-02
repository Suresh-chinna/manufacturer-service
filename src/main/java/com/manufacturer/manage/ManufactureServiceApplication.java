package com.manufacturer.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableFeignClients
public class ManufactureServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManufactureServiceApplication.class, args);
	}

}
