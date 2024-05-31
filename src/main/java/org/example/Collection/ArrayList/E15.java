package org.example.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//15. Write a Java program to join two array lists.
public class E15 {
    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("Kot", "Pies", "Jenot");
        List<String> l2 = Arrays.asList("Wiewiórka", "Kojot", "Zając");
        List<String> l3 = new ArrayList<>();

        l3.addAll(l1);
        l3.addAll(l2);

        System.out.println(l3);

    }

}
