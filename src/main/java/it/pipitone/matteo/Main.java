package it.pipitone.matteo;

public class Main {

    public static void main(String[]args){

        String firstParameter = args[0];
        String secondParameter = args[1];
        Integer totalAmount = productOfParameters(firstParameter, secondParameter);
        System.out.println(totalAmount);
    }

    protected static Integer productOfParameters(String firstParameter, String secondParameter) {
        int itemsNumber = Integer.parseInt(firstParameter);
        int price = Integer.parseInt(secondParameter);

        return itemsNumber * price;
    }

}
