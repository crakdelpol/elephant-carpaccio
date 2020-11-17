package it.pipitone.matteo;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ParameterConvertUnitTests {


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


}
