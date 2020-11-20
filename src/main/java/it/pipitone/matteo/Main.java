package it.pipitone.matteo;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args){
        StateChecker stateChecker = new StateChecker();
        ParameterConverter parameterConverter = new ParameterConverter();

        String firstParameter = args[0];
        String secondParameter = args[1];
        String state = stateChecker.stateIsAllowed(args[2]);


        Order order = new Order(
                parameterConverter.convertItemNumber(firstParameter),
                parameterConverter.convertToPrice(secondParameter),
                state);

        BigDecimal totalOfProductWithTax = order.calculateAmount();
        System.out.println(totalOfProductWithTax);
    }

}
