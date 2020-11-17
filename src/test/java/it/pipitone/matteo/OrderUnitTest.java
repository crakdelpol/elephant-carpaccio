package it.pipitone.matteo;


import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.comparesEqualTo;

public class OrderUnitTest {

    @Test
    public void retrieveProductOfParameters() {

        Order order = new Order(1,BigDecimal.valueOf(2), "10");
        assertThat(order.calculateTotalOfProduct(), comparesEqualTo(BigDecimal.valueOf(2)));
    }


    @Test
    public void calculateTaxForStateUT() {
        Order order = new Order(100,BigDecimal.ONE, "UT");
        assertThat(order.calculateAmount(), comparesEqualTo(BigDecimal.valueOf(96.17)));
    }

    @Test
    public void calculateTaxForStateAL() {
        Order order = new Order(100,BigDecimal.ONE, "AL");
        assertThat(order.calculateAmount(), comparesEqualTo(BigDecimal.valueOf(93.60)));
    }
}