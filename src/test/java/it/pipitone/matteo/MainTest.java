package it.pipitone.matteo;


import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainTest {

    @Test
    public void retrieveProductOfParameters() {

        BigDecimal result = Main.productOfParameters("1", "2");
        assertThat(result, equalTo(BigDecimal.valueOf(2)));

    }
}