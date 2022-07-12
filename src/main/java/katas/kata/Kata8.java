package katas.kata;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import katas.model.Bookmark;
import katas.model.Movie;
import katas.util.DataUtil;

import java.util.List;
import java.util.Map;

/*
    Goal: Combine videos and bookmarks by index (StreamUtils.zip) (https://github.com/poetix/protonpack)
    DataSource: DataUtil.getMovies()
    Output: List of ImmutableMap.of("videoId", "5", "bookmarkId", "3")
*/
public class Kata8 {
    public static List<Map> execute() {
        List<Movie> movies = DataUtil.getMovies();
        List<Bookmark> bookMarks = DataUtil.getBookMarks();

        // StreamUtils.zip()

        return ImmutableList.of(ImmutableMap.of("videoId", 5, "bookmarkId", 3));
    }
}
