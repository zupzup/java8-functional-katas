package katas;

import com.google.common.collect.ImmutableList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Kata3Test {

    @Test
    public void testTheSizeOfTheReturnedMovieListShouldEqualToFour() {
        assertEquals(4, Kata3.execute().size());
    }

    @Test
    public void testTheReturnedMovieIDsShouldEqualToTheGivenValues() {
        assertEquals(ImmutableList.of(70111470, 654356453, 65432445, 675465), Kata3.execute());
    }
}
