package org.example.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* 12. Write a Java program to extract a portion of an array list.
 */
public class E12 {
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
        List<String> a2List = aList.subList(1,aList.size()-3);
        System.out.println(a2List);
    }
}
