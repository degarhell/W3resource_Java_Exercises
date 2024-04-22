package org.example.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* Write a Java program to iterate through all elements in an array list..
 */
public class E2 {
    public static void main(String[] args) {
        List<String> aList= new ArrayList<>();
        aList.add("red");
        aList.add("green");
        aList.add("yellow");
        aList.add("purple");
        aList.add("magenta");
        System.out.println(aList);
        for( String s : aList) {
            System.out.println(s);
        }
// using iteratorE2
        Iterator<String> iterator = aList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
