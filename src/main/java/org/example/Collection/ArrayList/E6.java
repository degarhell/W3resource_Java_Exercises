package org.example.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

/*
* 6. Write a Java program to remove the third element from an array list.
 */
public class E6 {
    public static void main(String[] args) {
        List<String> aList= new ArrayList<>();
        aList.add("red");
        aList.add("green");
        aList.add("yellow");
        aList.add("purple");
        aList.add("magenta");
        //
        aList.remove(3);
        System.out.println(aList);
    }
}
