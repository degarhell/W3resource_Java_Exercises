package org.example.LambdaExpresions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//7. Write a Java program to implement a lambda expression
// to remove duplicates from a list of integers.
public class E7 {
        public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5,1,2,34,5,6,7,812,3,1,3,4,6,8);
        List<Integer> intListWithoutDuplicates = intList.stream().distinct().toList();
            System.out.println(intListWithoutDuplicates);
    }
}
