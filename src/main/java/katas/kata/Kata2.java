package katas.kata;

import katas.model.Movie;
import katas.util.DataUtil;

import java.util.List;
import java.util.stream.Collectors;

/*
    Goal: Chain filter() and map() to collect the ids of videos that have a rating of 5.0
    DataSource: DataUtil.getMovies()
    Output: List of Integers
*/
public class Kata2 {
    public static List<Integer> execute() {
        List<Movie> movies = DataUtil.getMovies();
        return movies
                .stream()
                .filter(movie -> movie.getRating().equals(5.0))
                .map(Movie::getId)
                .collect(Collectors.toList());
    }
}
