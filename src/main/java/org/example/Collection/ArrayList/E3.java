package org.example.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

/*
* 3. Write a Java program to insert an element into the array list at the first position.
 */
public class E3 {
    public static void main(String[] args) {
        List<String> aList= new ArrayList<>();
        aList.add("red");
        aList.add("green");
        aList.add("yellow");
        aList.add("purple");
        aList.add("magenta");
        aList.add(0, "orange" );
        System.out.println(aList);
    }
}
