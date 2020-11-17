package it.pipitone.matteo;

import java.math.BigDecimal;

public class Order {

    private final BigDecimal itemsNumber;
    private final BigDecimal price;
    private final String state;
    private final DiscountCalculator discountCalculator;
    private final TaxCalculator taxCalculator;

    public Order(String firstParameter, String secondParameter, String thirdParameter) {
        this.itemsNumber = new BigDecimal(firstParameter);
        this.price = new BigDecimal(secondParameter);
        this.state = thirdParameter;
        this.discountCalculator = new DiscountCalculator();
        this.taxCalculator = new TaxCalculator(this.state);
    }

    protected BigDecimal calculateTotalOfProduct(){
        return itemsNumber.multiply(price);
    }

    public BigDecimal calculateTotalOfProductWithTaxAndDiscount(){
        BigDecimal totalOfProduct = calculateTotalOfProduct();
        BigDecimal totalWithDiscount = discountCalculator.calculateDiscount(totalOfProduct);
        BigDecimal totalWithTax = taxCalculator.addTax(totalWithDiscount);
        return totalWithTax;
    }

}