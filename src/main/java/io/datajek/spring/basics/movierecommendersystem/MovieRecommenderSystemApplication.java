package io.datajek.spring.basics.movierecommendersystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		System.out.println("Hello");
		SpringApplication.run(MovieRecommenderSystemApplication.class, args);
	}

}
