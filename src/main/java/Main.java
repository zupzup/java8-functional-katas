import com.google.common.collect.ImmutableMap;
import katas.Kata1;
import katas.Kata2;
import katas.Kata3;
import model.Movie;
import util.DataUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static org.junit.Assert.*;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = DataUtil.getMovies();
        List<Map> result = movies.stream().map((movie) ->
                ImmutableMap.of("id", movie.getId(), "title", movie.getTitle())).collect(Collectors.toList());
        System.out.println(result);

        assertEquals(Kata1.execute().size(), 3);
        System.out.println("Kata 1 solved!");

        assertEquals(Kata2.execute().size(), 2);
        System.out.println("Kata 2 solved!");

        assertEquals(Kata3.execute().size(), 4);
        System.out.println("Kata 3 solved!");
    }
}
