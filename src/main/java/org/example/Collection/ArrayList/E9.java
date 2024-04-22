package org.example.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
* 9. Write a Java program to copy one array list into another.
 */
public class E9 {
    public static void main(String[] args) {
        List<String> aList= new ArrayList<>();
        List<String> a2List = new ArrayList<>();
        aList.add("red");
        aList.add("green");
        aList.add("yellow");
        aList.add("purple");
        aList.add("magenta");
        aList.add("apricot");
        aList.add("ecru");
        aList.add("dandelion");

        a2List.add("1");
        a2List.add("2");
        a2List.add("3");
        a2List.add("4");
        a2List.add("5");
        a2List.add("6");
        a2List.add("7");
        a2List.add("8");
//
//        a2List.addAll(aList);
//        secound way
        Collections.fill(a2List, " zapisane ");
        System.out.println(a2List);
        Collections.copy(a2List, aList); // lista detination musi mieć size() niemniejszy niż list src
        System.out.println(aList);
        System.out.println(a2List);
    }
}
