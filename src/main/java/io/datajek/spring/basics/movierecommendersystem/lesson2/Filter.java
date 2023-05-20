package io.datajek.spring.basics.movierecommendersystem.lesson2;

/**
 * @author : Devesh Kumar
 * @project : movie-recommender-system
 * @date : 20-05-2023
 * @time : 10:44 pm
 */
public interface Filter {
    public String[] getRecommendations(String movie);
}
