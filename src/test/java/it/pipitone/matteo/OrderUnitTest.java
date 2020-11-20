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
    public void calculateAmountForUtWithoutDiscount() {
        Order order = new Order(100,BigDecimal.ONE, "UT");
        assertThat(order.calculateAmount(), comparesEqualTo(BigDecimal.valueOf(106.85)));
    }

    @Test
    public void calculateAmountForALWithDiscount() {
        Order order = new Order(1000, BigDecimal.ONE, "AL");
        assertThat(order.calculateAmount(), comparesEqualTo(BigDecimal.valueOf(1008.8)));
    }
}