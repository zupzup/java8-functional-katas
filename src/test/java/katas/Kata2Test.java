package katas;

import com.google.common.collect.ImmutableList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Kata2Test {

    @Test
    public void testTheSizeOfTheReturnedMovieListShouldEqualToTwo() {
        assertEquals(2, Kata2.execute().size());
    }

    @Test
    public void testTheReturnedMovieIDsShouldEqualToTheGivenValues() {
        assertEquals(ImmutableList.of(654356453, 675465), Kata2.execute());
    }
}
