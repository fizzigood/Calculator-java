package com.baummann.calculator;

//Class containing all methods to make mathematical calculations.
public class Operations {

    //Static method makes it ready to use without creating an object first.
    //Takes a list/array of decimals, in case of further development later...
    public static double addition(double[] numbers) {

        double result = 0;
        //Loop that iterates through the array and adds the number (n).
        for (double n : numbers) {
            //Takes the variable to the left, adds it to the variable to the right, and saves the result in n.
            result += n;
        }
        return result;
    }

}
