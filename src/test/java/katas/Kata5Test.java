package katas;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;


public class Kata5Test {

    @Test
    public void testExecute() {
        Assert.assertThat(Kata5.execute(), equalTo(4));
    }
}
