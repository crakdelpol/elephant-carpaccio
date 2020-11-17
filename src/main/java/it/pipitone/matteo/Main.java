package it.pipitone.matteo;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args){

        String firstParameter = args[0];
        String secondParameter = args[1];
        String thirdParameter = args[2];
        Order order = new Order(firstParameter, secondParameter, thirdParameter);

        BigDecimal totalOfProductWithTax = order.calculateTotalOfProductWithTax();
        System.out.println(totalOfProductWithTax);
    }

}
