package com.springboot.jasypt;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@EnableEncryptableProperties
public class SpringbootJasyptApplication {

	public static void main(String[] args) {
		log.info("App started successfully!");
		SpringApplication.run(SpringbootJasyptApplication.class, args);
	}

}
