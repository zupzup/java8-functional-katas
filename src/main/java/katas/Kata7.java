package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.Bookmark;
import model.BoxArt;
import model.Movie;
import model.MovieList;
import util.DataUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Goal: Retrieve the id, title, and smallest box art url for every video
    DataSource: DataUtil.getMovieLists()
    Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys", "boxart": "url)
*/
public class Kata7 {
    public static List<Map> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();

        //return ImmutableList.of(ImmutableMap.of("id", 5, "title", "Bad Boys", "boxart", "url"));
        return DataUtil.getMovieLists()
                .stream()
                .flatMap(movieList -> movieList.getVideos()
                        .stream()
                        .map(movie -> ImmutableMap.of(
                                "id", movie.getId(),
                                "title", movie.getTitle(),
                                "boxart", movie.getBoxarts()
                                        .stream()
                                        .reduce((x1, x2) -> (x1.getHeight() * x1.getWidth()) > (x2.getHeight() * x2.getWidth()) ? x1 : x2)
                                        .map(BoxArt::getUrl)
                                        .get())))
                .collect(Collectors.toList());
    }
}
