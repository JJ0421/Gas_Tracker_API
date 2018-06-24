package com.GasTracker.API.GasTrackerWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.GasTracker.API.*"})
public class GasTrackerWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(GasTrackerWebApplication.class, args);
	}
}
