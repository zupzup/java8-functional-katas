package katas;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;


public class Kata3Test {

    @Test
    public void testExecute() {
        Assert.assertThat(Kata3.execute().size(), equalTo(4));
    }
}
