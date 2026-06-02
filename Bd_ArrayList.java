// ArrayList is a resizable array implementation of the List interface in Java. It allows us to store and manipulate a collection of objects. 
// ArrayList Methods:
// 1. add(E e): Adds an element to the end of the list. E is the type of elements in the list. e is the element to be added.
// 2. add(int index, E element): Inserts an element at the specified index.
// 3. get(int index): Returns the element at the specified index.
// 4. remove(int index): Removes the element at the specified index.
// 5. size(): Returns the number of elements in the list.

import java.util.ArrayList;
import java.util.Collections;

public class Bd_ArrayList {
    public static void main(String args[]){
        ArrayList<String> list1 = new ArrayList<>(); // Create an ArrayList of String type
        list1.add("Java");
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>(); // Create an ArrayList of Integer type
        
        // Add elements to the ArrayList
        list2.add(5);
        list2.add(3);
        list2.add(1);
        System.out.println(list2);

        // Accessing elements in the ArrayList
        int element1 = list2.get(0); // Get the element at index 0
        int element2 = list2.get(1); // Get the element at index 1
        int element3 = list2.get(2); // Get the element at index 2
        System.out.println("Element at index 0: " + element1);
        System.out.println("Element at index 1: " + element2);
        System.out.println("Element at index 2: " + element3);

        // Adding an element at a specific index
        list2.add(2, 2); // Add 2 at index 2
        System.out.println(list2);

        // Removing an element from the ArrayList
        list2.remove(0); // Remove the element at index 0
        System.out.println(list2);

        // Getting the size of the ArrayList
        int size = list2.size();
        System.out.println("Size of the ArrayList: " + size);

        // loop through the ArrayList
        System.out.println("Elements in the ArrayList:");
        for (int i = 0; i < list2.size(); i++){
            System.out.print(list2.get(i));
        }
        System.out.println();

        // Sorting the ArrayList
        Collections.sort(list2);
        System.out.println("Sorted ArrayList: " + list2);
    }
}