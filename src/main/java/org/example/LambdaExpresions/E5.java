package org.example.LambdaExpresions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//5. Write a Java program to implement a lambda expression
// to sort a list of strings in alphabetical order.
public class E5 {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("chce", "miec", "prace", "w", "branzy", "it", "im", "szybciej", "tym", "lepiej");
        Collections.sort(strList);
        System.out.println(strList);
    }
}
