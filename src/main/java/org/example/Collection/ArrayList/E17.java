package org.example.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

//17. Write a Java program to empty an array list.
public class E17 {
    public static void main(String[] args) {
//        ArrayList<String> l1 = (ArrayList<String>) Arrays.asList("Kot", "Pies", "Jenot");
        ArrayList<String>l1 = new ArrayList<>();
        l1.add("Jenot");
        l1.add("Szczór");
        ArrayList<String> l2= new ArrayList<>(l1);
        l2.removeAll(l2);
        System.out.println(l2);

    }

}
