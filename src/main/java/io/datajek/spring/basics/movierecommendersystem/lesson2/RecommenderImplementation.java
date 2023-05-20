package io.datajek.spring.basics.movierecommendersystem.lesson2;

/**
 * @author : Devesh Kumar
 * @project : movie-recommender-system
 * @date : 20-05-2023
 * @time : 10:30 pm
 */
public class RecommenderImplementation {

    // use filter interface to select filter
    private Filter filter;

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
