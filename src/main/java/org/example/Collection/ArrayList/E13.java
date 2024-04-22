package org.example.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

/*
* 13. Write a Java program to compare two array lists.
 */
public class E13 {
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
        List<String> a2List = aList.subList(0,aList.size());
        boolean isAEqualList = aList.equals(a2List);
        System.out.println(isAEqualList);
    }
}
