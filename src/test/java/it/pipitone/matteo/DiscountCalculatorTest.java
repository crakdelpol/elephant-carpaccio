package it.pipitone.matteo;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class DiscountCalculatorTest {

    @Test
    public void amountLessThan1000NoDiscount() {
        DiscountCalculator discountCalculator = new DiscountCalculator();
        BigDecimal amount = BigDecimal.valueOf(100);
        BigDecimal totalWithDiscount = discountCalculator.calculateDiscount(amount);
        assertThat(totalWithDiscount, Matchers.comparesEqualTo(amount));
    }

    @Test
    public void amountGreaterThan1000DiscountIs3Percent() {
        DiscountCalculator discountCalculator = new DiscountCalculator();
        BigDecimal amount = BigDecimal.valueOf(2000);
        BigDecimal totalWithDiscount = discountCalculator.calculateDiscount(amount);
        assertThat(totalWithDiscount, Matchers.comparesEqualTo(BigDecimal.valueOf(1940)));
    }

    @Test
    public void amountGreaterThan1000DiscountIs5Percent() {
        DiscountCalculator discountCalculator = new DiscountCalculator();
        BigDecimal amount = BigDecimal.valueOf(5000);
        BigDecimal totalWithDiscount = discountCalculator.calculateDiscount(amount);
        assertThat(totalWithDiscount, Matchers.comparesEqualTo(BigDecimal.valueOf(4750)));
    }
    @Test
    public void amountGreaterThan1000DiscountIs7Percent() {
        DiscountCalculator discountCalculator = new DiscountCalculator();
        BigDecimal amount = BigDecimal.valueOf(7000);
        BigDecimal totalWithDiscount = discountCalculator.calculateDiscount(amount);
        assertThat(totalWithDiscount, Matchers.comparesEqualTo(BigDecimal.valueOf(6510)));
    }
    @Test
    public void amountGreaterThan1000DiscountIs10Percent() {
        DiscountCalculator discountCalculator = new DiscountCalculator();
        BigDecimal amount = BigDecimal.valueOf(10000);
        BigDecimal totalWithDiscount = discountCalculator.calculateDiscount(amount);
        assertThat(totalWithDiscount, Matchers.comparesEqualTo(BigDecimal.valueOf(9000)));
    }
    @Test
    public void amountGreaterThan1000DiscountIs15Percent() {
        DiscountCalculator discountCalculator = new DiscountCalculator();
        BigDecimal amount = BigDecimal.valueOf(50000);
        BigDecimal totalWithDiscount = discountCalculator.calculateDiscount(amount);
        assertThat(totalWithDiscount, Matchers.comparesEqualTo(BigDecimal.valueOf(42500)));
    }

}