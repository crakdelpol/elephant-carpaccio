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
        return itemsNumber.multiply(price);
    }

    public BigDecimal calculateTotalOfProductWithTaxAndDiscount(){
        BigDecimal totalOfProduct = calculateTotalOfProduct();
        BigDecimal totalWithDiscount = totalOfProduct.multiply(BigDecimal.valueOf(.90));
        BigDecimal totalWithTax = TaxCalculator.addTax(totalWithDiscount, state);
        return totalWithTax;
    }

}