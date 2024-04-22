package org.example.DataTypes;
/*1. Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius*
* */

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("write farenheit temperature value");
        int farenheitValue = scaner.nextInt();

        System.out.println("celcius value: " + celsiusValue(farenheitValue));
    }

    public static double celsiusValue(int farenheitValue) {
        return (5.0*((double)farenheitValue-32.0)/9.0 );
    }
}
