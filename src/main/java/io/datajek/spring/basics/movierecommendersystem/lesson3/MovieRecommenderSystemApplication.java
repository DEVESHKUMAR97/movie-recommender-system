package io.datajek.spring.basics.movierecommendersystem.lesson3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		System.out.println("Lesson 3");

		// ApplicationContext manages the bean and dependencies
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		// use application context to find which filter is being used
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

		// call method the get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");

		// display the results
		System.out.println(Arrays.toString(result));
	}

}
