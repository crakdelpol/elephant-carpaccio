package it.pipitone.matteo;

import java.math.BigDecimal;

public class DiscountCalculator {
    public DiscountCalculator() {
    }

    protected  BigDecimal calculateDiscount(BigDecimal amount){
        if(amount.compareTo(BigDecimal.valueOf(1000)) > 0){
            return calculateDiscount(amount, BigDecimal.valueOf(.03));
        }
        return amount;
    }

    private BigDecimal calculateDiscount(BigDecimal amount, BigDecimal discountPercent) {
        return amount.multiply(BigDecimal.ONE.subtract(discountPercent));
    }
}
