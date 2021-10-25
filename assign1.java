package com.company.Assignment;

import java.util.Iterator;
import java.util.LinkedList;

public class assign1 {
    public static void main(String[] args) {
        // append the specified elements to the end of LinkedList
        LinkedList<String> animal = new LinkedList<>();
        animal.add("Dog");
        animal.add("Cat");
        animal.add("Bird");
        animal.add("Cow");

        // Iterate through all elements in the LinkedList
        Iterator iterator = animal.iterator();
        System.out.println("LinkedList: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-----------------");

        // Iterate LinkedList starting specified position
        Iterator iterator1 = animal.listIterator(1);
        System.out.println("LinkedList starting at position of 1: ");
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println("-----------------");

        // Iterate LinkedList in reverse order
        System.out.println("Reverse order of LinkedList: ");
        for (int i=animal.size()-1; i>=0; i--){
            System.out.println(animal.get(i));
        }
        System.out.println("-----------------");

        // Insert specified element at the specified position in the LinkedList
        animal.add(2,"Pig");
        System.out.println("Inserted new element at position of 2: " + animal);
    }
}
