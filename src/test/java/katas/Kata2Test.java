package katas;

import katas.kata.Kata2;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;


public class Kata2Test {

    @Test
    public void testExecute() {
        Assert.assertThat(Kata2.execute().size(), equalTo(2));
    }
}
