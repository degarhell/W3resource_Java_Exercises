package org.example.LambdaExpresions;

import java.util.function.Consumer;

//1. Write a Java program to implement a lambda expression to find the sum of two integers.
public class E1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        CalculatesSum calculatesSum = (x,y) -> x+y;
        System.out.println(calculatesSum.adding(a,b));

    }
}

interface CalculatesSum {
    public int adding(int a, int b);
}
