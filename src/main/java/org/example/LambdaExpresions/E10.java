package org.example.LambdaExpresions;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

//10. Write a Java program
// to implement a lambda expression to concatenate two strings.
public class E10 {
    public static void main(String[] args) {
        String s1 = "abu";
        String s2 = "dabi";

//        BiFunction<String, String, String> concatenate = (str1, str2) -> str1 + str2;
//        String result = concatenate.apply(s1, s2);
        BiConsumer<String, String> biConsumer = (str1, str2) -> {
            System.out.println( str1.concat(str2));
        };
        biConsumer.accept(s1, s2);
    }
}
