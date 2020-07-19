package com.transport.cab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.transport"})
public class cabBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(cabBookingApplication.class, args);
	}

}
