package org.example.Collection.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
* 7. Write a Java program to search for an element in an array list.
 */
public class E7 {
    public static void main(String[] args) {
        List<String> aList= new ArrayList<>();
        aList.add("red");
        aList.add("green");
        aList.add("yellow");
        aList.add("purple");
        aList.add("magenta");
        //

        System.out.println(aList.contains("yellow"));
    }
}
