package org.example.LambdaExpresions;

import java.util.function.BooleanSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;

//9. Write a Java program to implement a lambda expression
// to create a lambda expression to check if a number is prime.
public class E9 {
    public static void main(String[] args) {
        Integer a = 10;
        Predicate<Integer> isPrime = n -> {
            if (n <= 1 ) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(Math.sqrt(a));
        boolean isPrimeResult = isPrime.test(a);
        System.out.println("Prime: " + isPrimeResult);
    }
}
