package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import org.junit.Test;
import util.Constants;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;


public class Kata1Test {



    private final List<Map> moviesWithIDsForAssertion = ImmutableList.of(
            ImmutableMap.of(Constants.KEY_MOVIE_ID, 70111470, Constants.KEY_MOVIE_TITLE, "Die Hard"),
            ImmutableMap.of(Constants.KEY_MOVIE_ID, 654356453, Constants.KEY_MOVIE_TITLE, "Bad Boys"),
            ImmutableMap.of(Constants.KEY_MOVIE_ID, 65432445, Constants.KEY_MOVIE_TITLE, "The Chamber"),
            ImmutableMap.of(Constants.KEY_MOVIE_ID, 675465, Constants.KEY_MOVIE_TITLE, "Fracture")
    );

    @Test
    public void testSizeOfTheReturnedMovieList() {
        assertEquals(4, Kata1.execute().size());
    }

    @Test
    public void testContentOfReturnedMovies() {
        List<Map> moviesWithIDs = Kata1.execute();

        for(int index = 0; index < moviesWithIDs.size(); index++) {
            Map movieWithID = moviesWithIDs.get(index);
            Map movieWithIDForAssertion = moviesWithIDsForAssertion.get(index);

            assertEquals(movieWithIDForAssertion.get(Constants.KEY_MOVIE_ID), movieWithID.get(Constants.KEY_MOVIE_ID));
            assertEquals(movieWithIDForAssertion.get(Constants.KEY_MOVIE_TITLE), movieWithID.get(Constants.KEY_MOVIE_TITLE));
        }
    }
}
