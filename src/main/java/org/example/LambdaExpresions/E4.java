package org.example.LambdaExpresions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//4. Write a Java program to implement a lambda expression
// to filter out even and odd numbers from a list of integers.
public class E4 {
    public static void main(String[] args) {
        List<Integer> listInt = Arrays.asList(23,14,51,32,6534,435,3241,34);
        System.out.println("Only Even numbers");
        listInt.stream().filter( in -> in%2 == 0).forEach(System.out::println);
        System.out.println("\nOnly Odd numbers");
        listInt.stream().filter(in -> in%2 == 1).forEach(System.out::println);
        System.out.println(listInt);
    }
}
