package katas;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;


public class Kata4Test {

    @Test
    public void testExecute() {
        Assert.assertThat(Kata4.execute().size(), equalTo(4));
    }
}
