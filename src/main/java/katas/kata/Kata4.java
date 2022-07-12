package katas.kata;

import com.google.common.collect.ImmutableMap;
import katas.model.BoxArt;
import katas.model.MovieList;
import katas.util.DataUtil;

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
        List<MovieList> movieLists = DataUtil.getMovieLists();
        return movieLists.stream()
                .flatMap(list -> list.getVideos().stream().map(movie -> {
                    List<BoxArt> boxArts = movie.getBoxarts().stream().filter(boxArt -> boxArt.getHeight().equals(200) && boxArt.getWidth().equals(150)).collect(Collectors.toList());
                    return ImmutableMap.of("id", movie.getId(), "title", movie.getTitle(), "boxart",
                            boxArts.stream().map(boxArt -> new BoxArt(boxArt.getWidth(), boxArt.getHeight(), boxArt.getUrl())));
                }))
                .collect(Collectors.toList());
    }
}
