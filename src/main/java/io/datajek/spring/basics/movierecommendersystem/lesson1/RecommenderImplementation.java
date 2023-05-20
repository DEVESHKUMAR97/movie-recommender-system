package io.datajek.spring.basics.movierecommendersystem.lesson1;

/**
 * @author : Devesh Kumar
 * @project : movie-recommender-system
 * @date : 20-05-2023
 * @time : 10:30 pm
 */
public class RecommenderImplementation {
    public String[] recommendMovies(String movie) {
        //use content based filter to find similar movies
        ContentBasedFilter filter = new ContentBasedFilter();
        String[] results = filter.getRecommendations(movie);

        //return the results
        return results;
    }
}
