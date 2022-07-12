package katas.kata;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import katas.model.MovieList;
import katas.util.DataUtil;

import java.util.List;
import java.util.Map;

/*
    Goal: Retrieve the id, title, and smallest box art url for every video
    DataSource: DataUtil.getMovieLists()
    Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys", "boxart": "url)
*/
public class Kata7 {
    public static List<Map> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();

        return ImmutableList.of(ImmutableMap.of("id", 5, "title", "Bad Boys", "boxart", "url"));
    }
}
