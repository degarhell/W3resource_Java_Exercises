package org.example.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//16. Write a Java program to clone an array list to another array list.
public class E16 {
    public static void main(String[] args) {
//        ArrayList<String> l1 = (ArrayList<String>) Arrays.asList("Kot", "Pies", "Jenot");
        ArrayList<String>l1 = new ArrayList<>();
        l1.add("Jenot");
        l1.add("Szczór");
        ArrayList<String> l2= new ArrayList<>(l1);

        System.out.println(l2);

    }

}
