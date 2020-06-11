package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;


public class Kata1Test {

    private static final int SIZE_OF_RETURNED_MOVIES = 4;

    private static final String KEY_MOVIE_ID = "id";
    private static final String KEY_MOVIE_TITLE = "title";

    private final List<Map> moviesWithIDsForAssertion = ImmutableList.of(
            ImmutableMap.of(KEY_MOVIE_ID, 70111470, KEY_MOVIE_TITLE, "Die Hard"),
            ImmutableMap.of(KEY_MOVIE_ID, 654356453, KEY_MOVIE_TITLE, "Bad Boys"),
            ImmutableMap.of(KEY_MOVIE_ID, 65432445, KEY_MOVIE_TITLE, "The Chamber"),
            ImmutableMap.of(KEY_MOVIE_ID, 675465, KEY_MOVIE_TITLE, "Fracture")
    );

    @Test
    public void testSizeOfTheReturnedMovieList() {
        assertEquals(SIZE_OF_RETURNED_MOVIES, Kata1.execute().size());
    }

    @Test
    public void testContentOfReturnedMovies() {
        List<Map> moviesWithIDs = Kata1.execute();

        for(int index = 0; index < moviesWithIDs.size(); index++) {
            Map movieWithID = moviesWithIDs.get(index);
            Map movieWithIDForAssertion = moviesWithIDsForAssertion.get(index);

            assertEquals(movieWithIDForAssertion.get(KEY_MOVIE_ID), movieWithID.get(KEY_MOVIE_ID));
            assertEquals(movieWithIDForAssertion.get(KEY_MOVIE_TITLE), movieWithID.get(KEY_MOVIE_TITLE));
        }
    }
}
