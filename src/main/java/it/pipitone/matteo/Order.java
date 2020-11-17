package it.pipitone.matteo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Order {
    private final BigDecimal itemsNumber;
    private final BigDecimal price;
    private final BigDecimal tax;

    protected static BigDecimal addTaxToTotalAmount(BigDecimal totalAmount) {
        return totalAmount.multiply(BigDecimal.valueOf(1.10));
    }

    public Order(String firstParameter, String secondParameter, String thirdParameter) {
        this.itemsNumber = new BigDecimal(firstParameter);
        this.price = new BigDecimal(secondParameter);
        this.tax = new BigDecimal(thirdParameter);
    }

    protected BigDecimal calculateTotalOfProduct(){
        return  itemsNumber.multiply(price);
    }

    public BigDecimal calculateTotalOfProductWithTax(){
        return calculateTotalOfProduct().multiply(BigDecimal.valueOf(100).add(tax)).divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);
    }

    protected static BigDecimal productOfParameters(String firstParameter, String secondParameter) {
        BigDecimal itemsNumber = new BigDecimal(firstParameter);
        BigDecimal price = new BigDecimal(secondParameter);
        return itemsNumber.multiply(price);
    }
}