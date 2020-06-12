package katas;

import com.google.common.collect.ImmutableMap;
import model.MovieList;
import util.Constants;
import util.DataUtil;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Goal: Retrieve id, title, and a 150x200 box art url for every video
    DataSource: DataUtil.getMovieLists()
    Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys", "boxart": BoxArt)
*/
public class Kata4 {
    public static List<Map> execute() {
        return DataUtil.getMovieLists()
                .stream()
                .map(MovieList::getVideos)
                .flatMap(Collection::stream)
                .flatMap(movie -> movie.getBoxarts()
                        .stream()
                        .filter(boxArt -> boxArt.getWidth().equals(150) && boxArt.getHeight().equals(200))
                        .map(boxArt -> ImmutableMap.of(Constants.KEY_MOVIE_ID, movie.getId(), Constants.KEY_MOVIE_TITLE, movie.getTitle(), Constants.KEY_BOX_ART, boxArt)))
                .collect(Collectors.toUnmodifiableList());
    }
}
