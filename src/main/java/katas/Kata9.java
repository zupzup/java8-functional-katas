package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.*;
import util.DataUtil;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Goal: Retrieve each video's id, title, middle interesting moment time, and smallest box art url
    DataSource: DataUtil.getMovies()
    Output: List of ImmutableMap.of("id", 5, "title", "some title", "time", new Date(), "url", "someUrl")
*/
public class Kata9 {
    public static List<Map> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();

        //return ImmutableList.of(ImmutableMap.of("id", 5, "title", "some title", "time", new Date(), "url", "someUrl"));
        return DataUtil.getMovieLists()
                .stream()
                .flatMap(movieList -> movieList.getVideos()
                        .stream()
                        .map(movie -> ImmutableMap.of(
                                "id", movie.getId(),
                                "title", movie.getTitle(),
                                "time", movie.getInterestingMoments()
                                        .stream()
                                        .filter(interestingMoment -> interestingMoment.getType().equals("Middle"))
                                        .map(InterestingMoment::getTime)
                                        .findFirst()
                                        .get()
                                ,
                                "url", movie.getBoxarts()
                                        .stream()
                                        .reduce((x1, x2) -> (x1.getHeight() * x1.getWidth()) > (x2.getHeight() * x2.getWidth()) ? x1 : x2)
                                        .map(BoxArt::getUrl)
                                        .get())))
                .collect(Collectors.toList());
    }
}
