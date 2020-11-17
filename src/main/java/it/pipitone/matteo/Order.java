package it.pipitone.matteo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;

public class Order {

    private final BigDecimal itemsNumber;
    private final BigDecimal price;
    private final BigDecimal tax;
    private final HashMap<String, BigDecimal> taxMatrix = new HashMap<String, BigDecimal>(){{
        put("UT", BigDecimal.valueOf(6.85));
        put("NV", BigDecimal.valueOf(8));
        put("TX", BigDecimal.valueOf(6.25));
        put("AL", BigDecimal.valueOf(4));
        put("CA", BigDecimal.valueOf(8.25));
    }};

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

}