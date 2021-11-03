package com.lombardy.crema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


// exclude DataSourceAutoConfiguration.class is only there while we dont have a database configured.
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CremaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CremaApplication.class, args);
	}

}
