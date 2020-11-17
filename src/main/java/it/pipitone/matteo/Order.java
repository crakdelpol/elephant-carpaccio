package it.pipitone.matteo;

import java.math.BigDecimal;

public class Order {
    private final BigDecimal itemsNumber;
    private final BigDecimal price;

    protected static BigDecimal addTaxToTotalAmount(BigDecimal totalAmount) {
        return totalAmount.multiply(BigDecimal.valueOf(1.10));
    }

    public Order(String firstParameter, String secondParameter) {
        this.itemsNumber = new BigDecimal(firstParameter);
        this.price = new BigDecimal(secondParameter);
    }

    protected BigDecimal calculateTotalOfProduct(){
        return  itemsNumber.multiply(price);
    }

    public BigDecimal calculateTotalOfProductWithTax(){
        return calculateTotalOfProduct().multiply(BigDecimal.valueOf(1.10));
    }

    protected static BigDecimal productOfParameters(String firstParameter, String secondParameter) {
        BigDecimal itemsNumber = new BigDecimal(firstParameter);
        BigDecimal price = new BigDecimal(secondParameter);
        return itemsNumber.multiply(price);
    }
}