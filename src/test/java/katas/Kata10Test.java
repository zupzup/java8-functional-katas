package katas;

import katas.kata.Kata10;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;


public class Kata10Test {

    @Test
    public void testExecute() {
        Assert.assertThat(Kata10.execute(), equalTo(4));
    }
}
