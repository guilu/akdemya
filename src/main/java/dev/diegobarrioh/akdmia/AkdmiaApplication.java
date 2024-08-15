package dev.diegobarrioh.akdmia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AkdmiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AkdmiaApplication.class, args);
	}

}
