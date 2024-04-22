package org.example.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
* 8. Write a Java program to sort a given array list.
 */
public class E8 {
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
        Collections.sort(aList);
        System.out.println(aList);
    }
}
