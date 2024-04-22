package org.example.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

/*
* Write a Java program to update an array element by the given element.
 */
public class E5 {
    public static void main(String[] args) {
        List<String> aList= new ArrayList<>();
        aList.add("red");
        aList.add("green");
        aList.add("yellow");
        aList.add("purple");
        aList.add("magenta");
        aList.set(0, "orange" );
        System.out.println(aList.get(2));
    }
}
