package io.datajek.spring.basics.movierecommendersystem.lesson3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : Devesh Kumar
 * @project : movie-recommender-system
 * @date : 20-05-2023
 * @time : 10:30 pm
 */
@Component
public class RecommenderImplementation {

    // use filter interface to select filter
    @Autowired
    private Filter filter;

    // dependency is added even without constructor
    public RecommenderImplementation(Filter filter) {
        super();
        this.filter = filter;
    }

    // use a filter to find recommendation
    public String[] recommendMovies(String movie) {
        // print the name of interface implementation being used
        System.out.println("Name of the filten in use: " + filter + "\n");

        String[] results = filter.getRecommendations(movie);

        //return the results
        return results;
    }
}
