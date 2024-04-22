package org.example.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* 11. Write a Java program to reverse elements in an array list.
 */
public class E11 {
    public static void main(String[] args) {
        List<String> aList= new ArrayList<>();
        aList.add("red");
        aList.add("green");
        aList.add("yellow");
        aList.add("purple");
        aList.add("magenta");
        aList.add("apricot");
        aList.add("ecru");
        aList.add("dandelion");
//
        Collections.reverse(aList);
        System.out.println(aList);
    }
}
