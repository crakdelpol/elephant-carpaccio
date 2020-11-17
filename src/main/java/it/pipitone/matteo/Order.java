package it.pipitone.matteo;

import java.math.BigDecimal;

public class Order {

    private final Integer itemsNumber;
    private final BigDecimal price;
    private final DiscountCalculator discountCalculator;
    private final TaxCalculator taxCalculator;

    public Order(String firstParameter, String secondParameter, String thirdParameter) {
        this.itemsNumber = Integer.valueOf(firstParameter);
        this.price = new BigDecimal(secondParameter);
        this.discountCalculator = new DiscountCalculator();
        this.taxCalculator = new TaxCalculator(thirdParameter);
    }

    protected BigDecimal calculateTotalOfProduct(){
        return price.multiply(BigDecimal.valueOf(itemsNumber));
    }

    public BigDecimal calculateAmount(){
        BigDecimal totalOfProduct = calculateTotalOfProduct();
        BigDecimal totalWithDiscount = discountCalculator.calculateDiscount(totalOfProduct);
        return taxCalculator.addTax(totalWithDiscount);
    }

}