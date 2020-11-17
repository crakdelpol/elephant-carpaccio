package it.pipitone.matteo;

import java.math.BigDecimal;

public class Order {

    private final BigDecimal itemsNumber;
    private final BigDecimal price;
    private final DiscountCalculator discountCalculator;
    private final TaxCalculator taxCalculator;

    public Order(String firstParameter, String secondParameter, String thirdParameter) {
        this.itemsNumber = new BigDecimal(firstParameter);
        this.price = new BigDecimal(secondParameter);
        this.discountCalculator = new DiscountCalculator();
        this.taxCalculator = new TaxCalculator(thirdParameter);
    }

    protected BigDecimal calculateTotalOfProduct(){
        return itemsNumber.multiply(price);
    }

    public BigDecimal calculateAmount(){
        BigDecimal totalOfProduct = calculateTotalOfProduct();
        BigDecimal totalWithDiscount = discountCalculator.calculateDiscount(totalOfProduct);
        return taxCalculator.addTax(totalWithDiscount);
    }

}