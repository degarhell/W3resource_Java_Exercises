package org.example.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* 10. Write a Java program to shuffle elements in an array list.
 */
public class E10 {
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
        Collections.shuffle(aList);
        System.out.println(aList);
    }
}
