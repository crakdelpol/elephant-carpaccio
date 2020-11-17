package it.pipitone.matteo;

import java.math.BigDecimal;

public class ParameterConverter {

    public Integer convertItemNumber(String itemNumberString) {
        return Integer.valueOf(itemNumberString);
    }

    public BigDecimal convertToPrice(String secondParameter) {
        return new BigDecimal(secondParameter);
    }
}
