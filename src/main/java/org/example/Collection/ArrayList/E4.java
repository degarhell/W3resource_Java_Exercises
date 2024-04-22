package org.example.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

/*
* 4. Write a Java program to retrieve an element (at a specified index) from a given array list.
 */
public class E4 {
    public static void main(String[] args) {
        List<String> aList= new ArrayList<>();
        aList.add("red");
        aList.add("green");
        aList.add("yellow");
        aList.add("purple");
        aList.add("magenta");
        aList.add(0, "orange" );
        System.out.println(aList.get(2));
    }
}
