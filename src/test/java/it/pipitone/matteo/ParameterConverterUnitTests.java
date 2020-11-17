package it.pipitone.matteo;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.comparesEqualTo;
import static org.hamcrest.Matchers.is;

public class ParameterConverterUnitTests {


    private ParameterConverter parameterConverter;

    @Before
    public void setUp() throws Exception {
        parameterConverter = new ParameterConverter();
    }

    @Test
    public void convertItemNumberHappyPath() {
        Integer itemNumber = parameterConverter.convertItemNumber("1");
        assertThat(itemNumber, is(1));
    }

    @Test(expected = NumberFormatException.class)
    public void StringValueThrowException() {
        parameterConverter.convertItemNumber("S");
    }

    @Test
    public void convertItemsPriceHappyPath() {
        BigDecimal itemNumber = parameterConverter.convertToPrice("1");
        assertThat(itemNumber, comparesEqualTo(BigDecimal.ONE));
    }

    @Test(expected = NumberFormatException.class)
    public void convertItemsPriceWithInconvertible() {
        parameterConverter.convertToPrice("S");
    }
}
