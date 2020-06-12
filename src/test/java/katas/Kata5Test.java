package katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Kata5Test {

    @Test
    public void testTheLargestRatingShouldBeFive() {
        assertEquals(Double.valueOf(5.0), Kata5.execute());
    }
}
