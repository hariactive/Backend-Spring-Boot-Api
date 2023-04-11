package com.tutorial.crudmongoback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
//or -> @CrossOrigin(origins = "*.*")
public class CrudMongoBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudMongoBackApplication.class, args);
	}

}
