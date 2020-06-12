package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import org.junit.Test;
import util.Constants;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;


public class Kata7Test {

    private final List<Map> moviesWithIDsAndBoxArtsForAssertion = ImmutableList.of(
            ImmutableMap.of(Constants.KEY_MOVIE_ID, 70111470, Constants.KEY_MOVIE_TITLE, "Die Hard",
                    Constants.KEY_BOX_ART, "http://cdn-0.nflximg.com/images/2891/DieHard150.jpg"),
            ImmutableMap.of(Constants.KEY_MOVIE_ID, 654356453, Constants.KEY_MOVIE_TITLE, "Bad Boys",
                    Constants.KEY_BOX_ART, "http://cdn-0.nflximg.com/images/2891/BadBoys150.jpg"),
            ImmutableMap.of(Constants.KEY_MOVIE_ID, 65432445, Constants.KEY_MOVIE_TITLE, "The Chamber",
                    Constants.KEY_BOX_ART, "http://cdn-0.nflximg.com/images/2891/TheChamber150.jpg"),
            ImmutableMap.of(Constants.KEY_MOVIE_ID, 675465, Constants.KEY_MOVIE_TITLE, "Fracture",
                    Constants.KEY_BOX_ART, "http://cdn-0.nflximg.com/images/2891/Fracture150.jpg")
    );

    @Test
    public void testTheReturnedListShouldContainFourImmutableMaps() {
        assertEquals(4, Kata7.execute().size());
    }

    @Test
    public void testTheReturnedMoviesShouldEqualToTheGivenValues() {
        List<Map> returnedMovies = Kata4.execute();

        for (int index = 0; index < returnedMovies.size(); index++) {
            Map returnedMovie = returnedMovies.get(index);
            Map movieForAssertion = moviesWithIDsAndBoxArtsForAssertion.get(index);

            assertEquals(movieForAssertion.get(Constants.KEY_MOVIE_ID), returnedMovie.get(Constants.KEY_MOVIE_ID));
            assertEquals(movieForAssertion.get(Constants.KEY_MOVIE_TITLE), returnedMovie.get(Constants.KEY_MOVIE_TITLE));
            assertEquals(movieForAssertion.get(Constants.KEY_BOX_ART), returnedMovie.get(Constants.KEY_BOX_ART));
        }
    }
}
