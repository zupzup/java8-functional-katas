package katas;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;


public class Kata7Test {

    @Test
    public void testExecute() {
        Assert.assertThat(Kata7.execute(), equalTo(4));
    }
}
