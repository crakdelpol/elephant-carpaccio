package it.pipitone.matteo;

public class Main {

    public static void main(String[]args){

        String firstParameter = args[0];
        String secondParameter = args[1];
        System.out.println(productOfParameters(firstParameter, secondParameter));
    }

    protected static String productOfParameters(String firstParameter, String secondParameter) {
        int itemsNumber = Integer.parseInt(firstParameter);
        int price = Integer.parseInt(secondParameter);

        return String.valueOf(itemsNumber*price);
    }

}
