package it.pipitone.matteo;

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.comparesEqualTo;

public class TaxCalculatorTest {

    @Test
    public void calculateTaxForStateUT() {
        TaxCalculator taxCalculator = new TaxCalculator("UT");
        assertThat(taxCalculator.addTax(BigDecimal.valueOf(100)), comparesEqualTo(BigDecimal.valueOf(106.85)));
    }

    @Test
    public void calculateTaxForStateAL() {
        TaxCalculator taxCalculator = new TaxCalculator("AL");
        assertThat(taxCalculator.addTax(BigDecimal.valueOf(100)), comparesEqualTo(BigDecimal.valueOf(104)));
    }
}