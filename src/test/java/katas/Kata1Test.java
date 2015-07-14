package katas;

import org.hamcrest.CoreMatchers;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Assert;
import org.junit.Test;


public class Kata1Test {

    @Test
    public void testExecute() {
        Assert.assertThat(Kata1.execute().size(), equalTo(4));
    }
}
