package io.datajek.spring.basics.movierecommendersystem.lesson3;

import org.springframework.stereotype.Component;

/**
 * @author : Devesh Kumar
 * @project : movie-recommender-system
 * @date : 20-05-2023
 * @time : 10:43 pm
 */
public class CollaborativeFilter implements Filter {
    @Override
    public String[] getRecommendations(String movie) {
        // logic of collaborative Filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
