package it.pipitone.matteo;

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.comparesEqualTo;

public class TaxCalculatorTest {

    @Test
    public void calculateTaxForStateUT() {
        assertThat(TaxCalculator.addTax(BigDecimal.valueOf(100), "UT"), comparesEqualTo(BigDecimal.valueOf(106.85)));
    }

    @Test
    public void calculateTaxForStateAL() {
        assertThat(TaxCalculator.addTax(BigDecimal.valueOf(100), "AL"), comparesEqualTo(BigDecimal.valueOf(104)));
    }
}