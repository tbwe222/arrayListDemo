package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String args[]) {
// create an array list
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Initial size of al: " + al.size());
// add elements to the array list
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        System.out.println("Size of al after additions: " + al.sizes());
        a1.add(1,"A2");
        System.out.println("Size of al after additions A2: " + al.sizes());
// display the array list
        System.out.println("Contents of al: " + al);

        Collections.sort(al);

        System.out.println("Contents of al: " + al);

        Collections.sort(al);
        System.out.println("Contents of al: " + al);
// Remove elements from the array list
        int searchIndex = Collections.binarySearch(a1, "z");

        if(searchIndex >= 0){
            system.out.println("D has been found. " + searchIndex);
        }else{
            System.out.println("D is not found." + searchIndex);
        }
        al.remove("F");
        al.remove("G");
        al.remove(2);
        System.out.println("Size of al after deletions: " + al.size());
        System.out.println("Contents of al: " + al);
    }
}