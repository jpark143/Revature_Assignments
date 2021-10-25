package com.company.Assignment;

import java.util.HashSet;
import java.util.Iterator;

public class assign1_2 {
    public static void main(String[] args) {
        // Append the specified elements to the end of HashSet
        HashSet<String> animal = new HashSet<>();
        animal.add("Cat");
        animal.add("Dog");
        animal.add("Cow");
        animal.add("Pig");

        // Iterate through all elements in the Hash List
        System.out.println("HashList: ");
        Iterator iterator = animal.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-----------------");

        // Get the number of elements in a HashSet
        System.out.println("Number of elements in HashSet: " + animal.size());
        System.out.println("-----------------");

        // Empty an HashSet
        System.out.println("Empty out HashSet...");
        animal.removeAll(animal);
        System.out.println(animal);
        System.out.println("HashSet is now Empty.");
    }
}
