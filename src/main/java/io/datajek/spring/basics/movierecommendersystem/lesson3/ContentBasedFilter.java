package io.datajek.spring.basics.movierecommendersystem.lesson3;

import org.springframework.stereotype.Component;

/**
 * @author : Devesh Kumar
 * @project : movie-recommender-system
 * @date : 20-05-2023
 * @time : 10:33 pm
 */

@Component
public class ContentBasedFilter implements Filter {
    @Override
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
