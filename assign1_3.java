package com.company.Assignment;

import java.util.Iterator;
import java.util.TreeSet;

public class assign1_3 {
    public static void main(String[] args) {
        // Create TreeSet and adding Colors
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Pink");
        colors.add("Green");

        // Iterate through all elements
        System.out.println("Original colors: ");
        Iterator iterator = colors.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("--------------");

        // Create new TreeSet and add new colors
        TreeSet<String> newColors = new TreeSet<>();
        newColors.add("Blue");
        newColors.add("Yellow");
        System.out.println("New colors: ");
        Iterator iterator1 = newColors.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println("--------------");

        // adding new elements to original TreeSet
        colors.addAll(newColors);
        System.out.println("Added colors: " + colors);

        System.out.println("--------------");

        // Reverse order view
        Iterator iterator2 = colors.descendingIterator();
        System.out.println("Reverse Order: ");
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
        System.out.println("--------------");

        // Get first and last elements in the TreeSet
        System.out.println("First element: " + colors.first());
        System.out.println("Last element: " + colors.last());
    }
}
