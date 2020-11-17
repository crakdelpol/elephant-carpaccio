package it.pipitone.matteo;


import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.comparesEqualTo;

public class OrderUnitTest {

    @Test
    public void retrieveProductOfParameters() {

        Order order = new Order("1","2");
        assertThat(order.calculateTotalOfProduct(), comparesEqualTo(BigDecimal.valueOf(2)));
    }

    @Test
    public void checkTaxCalculation() {
        Order order = new Order("100","1");

        assertThat(order.calculateTotalOfProductWithTax(), comparesEqualTo(BigDecimal.valueOf(110)));
    }
}