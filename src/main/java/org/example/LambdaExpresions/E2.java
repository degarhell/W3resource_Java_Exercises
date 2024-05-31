package org.example.LambdaExpresions;

//2. Write a Java program to implement a lambda expression to check if a given string is empty.
public class E2 {
    public static void main(String[] args) {
        StringConsumer strConsumer = s -> s.isEmpty();

        System.out.println(strConsumer.isEmptyString("abnsdfa"));

    }
}

interface StringConsumer {
    boolean isEmptyString(String s);
}