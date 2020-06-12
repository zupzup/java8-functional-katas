package katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Kata6Test {

    @Test
    public void testTheLargestBoxArtsURLShouldBeTheGivenValue() {
        assertEquals("http://cdn-0.nflximg.com/images/2891/Fracture300.jpg", Kata6.execute());
    }
}
