package org.example.LambdaExpresions;

import java.util.Arrays;
import java.util.List;

//6. Write a Java program to implement a lambda expression
// to find the average of a list of doubles.
public class E6 {
    public static void main(String[] args) {
        List<Double> doubleList = Arrays.asList(5.432, 432.0, 67542.0, 123.5, 123.9);
        double average = doubleList.stream().mapToDouble( d -> d.doubleValue()).average().orElse(0.0);
        System.out.println("'n average double from list: " + average);
    }
}
