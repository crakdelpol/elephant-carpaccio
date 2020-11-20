package it.pipitone.matteo;

import java.math.BigDecimal;

public class ParameterConverter {

    public Integer convertItemNumber(String itemNumberString) {
        try{

            return Integer.valueOf(itemNumberString);
        }catch (NumberFormatException numberFormatException){
            throw new NonconvertibleItemNumberException();
        }
    }

    public BigDecimal convertToPrice(String secondParameter)  {
        try {
            return new BigDecimal(secondParameter);
        }catch (NumberFormatException numberFormatException){
            throw new NonconvertibleItemPriceException();
        }
    }
}
