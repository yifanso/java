package com.yun.song.immediate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ImmediateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImmediateApplication.class, args);
	}

}
