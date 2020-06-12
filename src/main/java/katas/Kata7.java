package katas;

import com.google.common.collect.ImmutableMap;
import model.BoxArt;
import model.MovieList;
import util.Constants;
import util.DataUtil;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    Goal: Retrieve the id, title, and smallest box art url for every video
    DataSource: DataUtil.getMovieLists()
    Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys", "boxart": "url)
*/
public class Kata7 {
    public static List<Map> execute() {
        return DataUtil.getMovieLists()
                .stream()
                .map(MovieList::getVideos)
                .flatMap(Collection::stream)
                .flatMap(movie -> {
                    String url = movie.getBoxarts()
                            .stream()
                            .reduce(new BoxArt(Integer.MAX_VALUE, Integer.MAX_VALUE, ""), (boxArt, boxArt2)
                                    -> (boxArt.getWidth() <= boxArt2.getWidth()) && (boxArt.getHeight() <= boxArt2.getHeight()) ? boxArt : boxArt2)
                            .getUrl();

                    return Stream.of(url)
                            .map(string -> ImmutableMap.of(Constants.KEY_MOVIE_ID, movie.getId(), Constants.KEY_MOVIE_TITLE, movie.getTitle(), Constants.KEY_BOX_ART, string));
                })
                .collect(Collectors.toUnmodifiableList());
    }
}
