package com.bosch.io.boschgitrepos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BoschGitReposApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoschGitReposApplication.class, args);
	}

}
