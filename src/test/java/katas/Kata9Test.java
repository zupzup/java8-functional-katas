package katas;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;


public class Kata9Test {

    @Test
    public void testExecute() {
        Assert.assertThat(Kata9.execute(), equalTo(4));
    }
}
