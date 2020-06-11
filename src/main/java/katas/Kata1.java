package katas;

import com.google.common.collect.ImmutableMap;
import util.Constants;
import util.DataUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Goal: use map() to project an array of videos into an array of {id, title}-pairs
    DataSource: DataUtil.getMovies()
    Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys")
*/
public class Kata1 {
    public static List<Map> execute() {
        return DataUtil.getMovies()
                .stream()
                .map(movie -> ImmutableMap.of(Constants.KEY_MOVIE_ID, movie.getId(), Constants.KEY_MOVIE_TITLE, movie.getTitle()))
                .collect(Collectors.toUnmodifiableList());
    }
}
