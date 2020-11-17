package it.pipitone.matteo;


import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.comparesEqualTo;

public class OrderUnitTest {

    @Test
    public void retrieveProductOfParameters() {

        Order order = new Order("1","2", "10");
        assertThat(order.calculateTotalOfProduct(), comparesEqualTo(BigDecimal.valueOf(2)));
    }


    @Test
    public void calculateTaxForStateUT() {
        Order order = new Order("100","1", "UT");
        assertThat(order.calculateTotalOfProductWithTaxAndDiscount(), comparesEqualTo(BigDecimal.valueOf(96.17)));
    }

    @Test
    public void calculateTaxForStateAL() {
        Order order = new Order("100","1", "AL");
        assertThat(order.calculateTotalOfProductWithTaxAndDiscount(), comparesEqualTo(BigDecimal.valueOf(93.60)));
    }
}