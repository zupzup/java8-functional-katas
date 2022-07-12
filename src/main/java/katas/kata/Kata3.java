package katas.kata;

import katas.model.Movie;
import katas.model.MovieList;
import katas.util.DataUtil;

import java.util.List;
import java.util.stream.Collectors;

/*
    Goal: Use map() and flatMap() to project and flatten the movieLists into an array of video ids (flatMap(c -> c.stream()))
    DataSource: DataUtil.getMovieLists()
    Output: List of Integers
*/
public class Kata3 {
    public static List<Integer> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();
        return movieLists.stream()
                .map(MovieList::getVideos)
                .flatMap(movies -> movies.stream().map(Movie::getId)).collect(Collectors.toList());
    }
}
