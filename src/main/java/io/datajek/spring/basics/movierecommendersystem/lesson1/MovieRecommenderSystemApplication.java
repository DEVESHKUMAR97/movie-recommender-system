package io.datajek.spring.basics.movierecommendersystem.lesson1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		System.out.println("Lesson 1");
//		SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		// create object of RecommenderImplementation class
		RecommenderImplementation recommender = new RecommenderImplementation();

		// call method the get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");

		// display the results
		System.out.println(Arrays.toString(result));
	}

}
