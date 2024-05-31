package org.example.Collection.ArrayList;

import java.util.ArrayList;

//Write a Java program to test whether an array list is empty or not.
public class E18 {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("cebula");
        al1.add("ziemniaki");
        al1.add("marchewka");

        if(al1.isEmpty()) {
                System.out.println("No elements");
        } else {
            System.out.println("there are elements in arrayList");
        }
    }
}
