package org.example.DataTypes;

import java.util.Scanner;

/*2. Write a Java program that reads a number in inches and converts it to meters.
Note: One inch is 0.0254 meter.
Test Data
Input a value for inch: 1000
Expected Output :
1000.0 inch is 25.4 meters
* */
public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write amount of inches to convert \n");
        double inches = scanner.nextDouble();
        double meters = inches * 0.0254;
        System.out.println("meters=" + meters);

    }


}
