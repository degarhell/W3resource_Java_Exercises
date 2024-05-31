package org.example.LambdaExpresions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//11. Write a Java program to implement a lambda expression
// to find the maximum and minimum values in a list of integers.
public class E11 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(5,8,1,324,-23,4,56,10230);
        System.out.println("minimum value from the list");
        int min = Collections.min(intList);
        System.out.println(min);

        System.out.println("maximum value from the list");
        int max = Collections.max(intList);
        System.out.println(max);
    }
}
