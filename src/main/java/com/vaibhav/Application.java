package com.vaibhav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		RestTemplate rt=new RestTemplate();
		
		String endpoint="http://localhost:9090/welcome";
		
		ResponseEntity<String> forEntity = rt.getForEntity(endpoint, String.class);
		
		if(forEntity.getStatusCodeValue()==200) {
			String body = forEntity.getBody();
			System.out.println("Response::"+body);
		}
	}

}
