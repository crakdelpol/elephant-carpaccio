package it.pipitone.matteo;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainTest {

    @Test
    public void printConcatParameters() {

        String result = Main.concatParameters("1", "2");
        assertThat(result, is("2"));

    }
}