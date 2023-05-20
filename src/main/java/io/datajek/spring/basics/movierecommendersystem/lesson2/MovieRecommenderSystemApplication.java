package io.datajek.spring.basics.movierecommendersystem.lesson2;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		System.out.println("Lesson 2");
//		SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		// create object of RecommenderImplementation class
		// passing the name of the filter as constructor argument
		RecommenderImplementation recommender = new RecommenderImplementation(new CollaborativeFilter());

		// call method the get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");

		// display the results
		System.out.println(Arrays.toString(result));
	}

}
