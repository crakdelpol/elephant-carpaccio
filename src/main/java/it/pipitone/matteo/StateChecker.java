package it.pipitone.matteo;

public class StateChecker {

    public String stateIsAllowed(String state) {
        if (state.length() > 2) {
            throw new StateTooLongException();
        }
        if (!TaxCalculator.taxMatrix.containsKey(state)) {
            throw new StateNotAllowedException();
        }

        return state;
    }
}
