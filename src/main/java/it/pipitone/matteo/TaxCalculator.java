package it.pipitone.matteo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;

public class TaxCalculator {

    final static HashMap<String, BigDecimal> taxMatrix = new HashMap<String, BigDecimal>() {{
        put("UT", BigDecimal.valueOf(6.85));
        put("NV", BigDecimal.valueOf(8));
        put("TX", BigDecimal.valueOf(6.25));
        put("AL", BigDecimal.valueOf(4));
        put("CA", BigDecimal.valueOf(8.25));
    }};

    protected static BigDecimal addTax(BigDecimal bigDecimal, String state) {
        return bigDecimal.multiply(BigDecimal.valueOf(100).add(taxMatrix.getOrDefault(state, BigDecimal.valueOf(10)))).divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);
    }
}