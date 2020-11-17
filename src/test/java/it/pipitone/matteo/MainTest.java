package it.pipitone.matteo;


import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.comparesEqualTo;

public class MainTest {

    @Test
    public void retrieveProductOfParameters() {

        BigDecimal result = Main.productOfParameters("1", "2");
        assertThat(result, comparesEqualTo(BigDecimal.valueOf(2)));
    }

    @Test
    public void checkTaxCalculation() {

        BigDecimal priceWithoutTax = Main.addTaxToTotalAmount(BigDecimal.valueOf(100));
        assertThat(priceWithoutTax, comparesEqualTo(BigDecimal.valueOf(110)));
    }
}