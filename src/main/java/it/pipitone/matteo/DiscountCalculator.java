package it.pipitone.matteo;

import java.math.BigDecimal;

public class DiscountCalculator {
    public DiscountCalculator() {
    }
    protected  BigDecimal calculateDiscount(BigDecimal amount){
        return amount.multiply(BigDecimal.ONE.subtract(BigDecimal.valueOf(.1)));
    }
}
