package katas;

import katas.kata.Kata1;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;


public class Kata1Test {

    @Test
    public void testExecute() {
        Assert.assertThat(Kata1.execute().size(), equalTo(4));
    }
}
