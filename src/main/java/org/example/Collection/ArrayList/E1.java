package org.example.Collection.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
* Write a Java program to create an array list,
* add some colors (strings) and print out the collection.*/
public class E1 {
    public static void main(String[] args) {
        List<String> aList= new ArrayList<>();
        aList.add("red");
        aList.add("green");
        aList.add("yellow");
        aList.add("purple");
        aList.add("magenta");
        System.out.println(aList);
    }
}
