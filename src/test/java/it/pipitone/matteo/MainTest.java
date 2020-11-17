package it.pipitone.matteo;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainTest {

    @Test
    public void retrieveProductOfParameters() {

        Integer result = Main.productOfParameters("1", "2");
        assertThat(result, is(2));

    }
}