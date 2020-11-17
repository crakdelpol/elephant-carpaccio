package it.pipitone.matteo;

import java.math.BigDecimal;

public class DiscountCalculator {
    public DiscountCalculator() {
    }

    protected  BigDecimal calculateDiscount(BigDecimal amount){

        if(amount.compareTo(BigDecimal.valueOf(50000)) >= 0){
            return amount.multiply(BigDecimal.ONE.subtract(new BigDecimal(".15")));
        }
        if(amount.compareTo(BigDecimal.valueOf(10000)) >= 0){
            return amount.multiply(BigDecimal.ONE.subtract(new BigDecimal(".10")));

        }if(amount.compareTo(BigDecimal.valueOf(7000)) >= 0){
            return amount.multiply(BigDecimal.ONE.subtract(new BigDecimal(".07")));
        }
        if(amount.compareTo(BigDecimal.valueOf(5000)) >= 0){
            return amount.multiply(BigDecimal.ONE.subtract(new BigDecimal(".05")));
        }
        if(amount.compareTo(BigDecimal.valueOf(1000)) >= 0){
            return amount.multiply(BigDecimal.ONE.subtract(new BigDecimal(".03")));
        }
        return amount;
    }

}
