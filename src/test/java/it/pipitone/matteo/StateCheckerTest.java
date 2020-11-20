package it.pipitone.matteo;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StateCheckerTest {

    private StateChecker stateChecker;

    @Before
    public void setUp() throws Exception {
        stateChecker = new StateChecker();
    }

    @Test
    public void checkStatePresent() {
        String state = stateChecker.stateIsAllowed("UT");
        assertThat(state, is("UT"));
    }

    @Test(expected = StateNotAllowedException.class)
    public void checkStateNotAllowed() {
        stateChecker.stateIsAllowed("AT");
    }

    @Test(expected = StateTooLongException.class)
    public void checkStateTooLong() {
        stateChecker.stateIsAllowed("AT3");
    }
}