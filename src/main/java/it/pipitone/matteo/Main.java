package it.pipitone.matteo;

import java.math.BigDecimal;

public class Main {

    public static void main(String[]args){

        String firstParameter = args[0];
        String secondParameter = args[1];
        BigDecimal totalAmount = productOfParameters(firstParameter, secondParameter);
        BigDecimal totalWithTax = addTaxToTotalAmount(totalAmount);
        System.out.println(totalWithTax);
    }

    protected static BigDecimal addTaxToTotalAmount(BigDecimal totalAmount) {
        return totalAmount.multiply(BigDecimal.valueOf(1.10));
    }

    protected static BigDecimal productOfParameters(String firstParameter, String secondParameter) {
        BigDecimal itemsNumber = new BigDecimal(firstParameter);
        BigDecimal price = new BigDecimal(secondParameter);
        return itemsNumber.multiply(price);
    }

}
