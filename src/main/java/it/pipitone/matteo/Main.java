package it.pipitone.matteo;

public class Main {

    public static void main(String[]args){

        String firstParameter = args[0];
        String secondParameter = args[1];
        System.out.println(concatParameters(firstParameter, secondParameter));
    }

    protected static String concatParameters(String firstParameter, String secondParameter) {
        return firstParameter+secondParameter;
    }

}
