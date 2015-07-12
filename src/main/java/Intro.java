import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.Bookmark;
import model.BoxArt;
import model.Movie;
import model.MovieList;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Intro {

    public static void main(String[] args) {
        // project array of videos to [{id, title}]
        List<Movie> movies = getMovies();
        List<Map> result = movies.stream().map((movie) ->
                ImmutableMap.of("id", movie.getId(), "title", movie.getTitle())).collect(Collectors.toList());
        System.out.println(result);

    }

    private static List<Movie> getMovies() {
        List<Movie> result = new ArrayList<Movie>();
        result.add(new Movie(70111470,
                "Die Hard",
                ImmutableList.of(
                        new BoxArt(150, 200, "http://cdn-0.nflximg.com/images/2891/DieHard150.jpg"),
                        new BoxArt(200, 200, "http://cdn-0.nflximg.com/images/2891/DieHard200.jpg")
                ),
                "http://api.netflix.com/catalog/titles/movies/70111470",
                4.0,
                new ArrayList<Bookmark>()));
        result.add(new Movie(654356453,
                "Bad Boys",
                ImmutableList.of(
                        new BoxArt(200, 200, "http://cdn-0.nflximg.com/images/2891/BadBoys200.jpg"),
                        new BoxArt(150, 200, "http://cdn-0.nflximg.com/images/2891/BadBoys150.jpg")
                ),
                "http://api.netflix.com/catalog/titles/movies/70111470",
                5.0,
                ImmutableList.of(new Bookmark(432534, new Date()))));
        result.add(new Movie(65432445,
                "The Chamber",
                ImmutableList.of(
                        new BoxArt(150, 200, "http://cdn-0.nflximg.com/images/2891/TheChamber150.jpg"),
                        new BoxArt(200, 200, "http://cdn-0.nflximg.com/images/2891/TheChamber200.jpg")
                ),
                "http://api.netflix.com/catalog/titles/movies/70111470",
                4.0,
                new ArrayList<Bookmark>()));
        result.add(new Movie(675465,
                "Fracture",
                ImmutableList.of(
                        new BoxArt(200, 200, "http://cdn-0.nflximg.com/images/2891/Fracture200.jpg"),
                        new BoxArt(150, 200, "http://cdn-0.nflximg.com/images/2891/Fracture150.jpg"),
                        new BoxArt(300, 200, "http://cdn-0.nflximg.com/images/2891/Fracture300.jpg")
                ),
                "http://api.netflix.com/catalog/titles/movies/70111470",
                5.0,
                ImmutableList.of(new Bookmark(432534, new Date()))
        ));
        return result;
    }

    private static List<MovieList> getMovieLists() {
        List<MovieList> result = new ArrayList<MovieList>();
        result.add(new MovieList("New Releases", getMovies().subList(0, 1)));
        result.add(new MovieList("Dramas", getMovies().subList(2, 3)));
        return result;
    }

}
