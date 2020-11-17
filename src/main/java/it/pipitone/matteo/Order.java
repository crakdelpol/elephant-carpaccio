package it.pipitone.matteo;

import java.math.BigDecimal;

public class Order {

    private final BigDecimal itemsNumber;
    private final BigDecimal price;
    private final String state;

    public Order(String firstParameter, String secondParameter, String thirdParameter) {
        this.itemsNumber = new BigDecimal(firstParameter);
        this.price = new BigDecimal(secondParameter);
        this.state = thirdParameter;
    }

    protected BigDecimal calculateTotalOfProduct(){
        return  itemsNumber.multiply(price);
    }

    public BigDecimal calculateTotalOfProductWithTax(){
        BigDecimal totalOfProduct = calculateTotalOfProduct();
        return TaxCalculator.addTax(totalOfProduct, state);
    }

}