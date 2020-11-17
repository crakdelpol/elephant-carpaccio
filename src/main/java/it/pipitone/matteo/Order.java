package it.pipitone.matteo;

import java.math.BigDecimal;

public class Order {

    private final Integer numberOfItems;
    private final BigDecimal price;
    private final DiscountCalculator discountCalculator;
    private final TaxCalculator taxCalculator;

    public Order(Integer numberOfItems, BigDecimal itemsPrice, String state) {
        this.numberOfItems = numberOfItems;
        this.price = itemsPrice;
        this.discountCalculator = new DiscountCalculator();
        this.taxCalculator = new TaxCalculator(state);
    }

    protected BigDecimal calculateTotalOfProduct(){
        return price.multiply(BigDecimal.valueOf(numberOfItems));
    }

    public BigDecimal calculateAmount(){
        BigDecimal totalOfProduct = calculateTotalOfProduct();
        BigDecimal totalWithDiscount = discountCalculator.calculateDiscount(totalOfProduct);
        return taxCalculator.addTax(totalWithDiscount);
    }

}