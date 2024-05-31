package org.example.LambdaExpresions;

import java.util.Scanner;
import java.util.function.IntUnaryOperator;

//8. Write a lambda expression to implement a lambda expression
// to calculate the factorial of a given number.
public class E8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" what is the number, you want factorial of? :\n");
        int a = sc.nextInt();
        a = (Integer) a;
//        IntUnaryOperator intUnaryOperator = x ->
        Calculate calculate = x -> {
            int result = 1;
            for ( int i = 1; i <= x; i++) {
            result*=i;
        } return  result;};
        System.out.println(calculate.factorial(a));
    }
}

interface Calculate {
    Integer factorial(int a);
}

