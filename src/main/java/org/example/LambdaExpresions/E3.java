package org.example.LambdaExpresions;

import java.util.Arrays;
import java.util.List;

//3. Write a Java program to implement a lambda expression
// to convert a list of strings to uppercase and lowercase.
public class E3 {
    public static void main(String[] args) {
        List<String> jedzenie = Arrays.asList("zupa", "ogórki", "kurczak", "schabowy");

        jedzenie.replaceAll(str -> str.toUpperCase());
        System.out.println("Upper Case");
        for (String str : jedzenie) {
            System.out.println( str );
        }

        jedzenie.replaceAll( str -> str.toLowerCase());
        System.out.println("\nLower Case");
        for (String str : jedzenie) {
            System.out.println(str);
        }
    }
}
