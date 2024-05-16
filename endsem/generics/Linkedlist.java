Linkedlist

import java.util.*;

public class Linkedlist {
    public static void main(String[] args) {
        // Create a LinkedList to store the random integers
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Generate and insert 25 random integers into the LinkedList
        Random random = new Random();
        for (int i = 0; i < 25; i++) {
            int randomInt = random.nextInt(101); // Generates random integer between 0 and 100
            linkedList.add(randomInt);
        }

        // Sort the elements in ascending order
        Collections.sort(linkedList);

        // Calculate the sum of elements
        int sum = 0;
        for (int num : linkedList) {
            sum += num;
        }

        // Calculate the floating-point average
        double average = (double) sum / linkedList.size();

        // Print the sorted order, sorted elements, sum, and average
        System.out.println("Sorted order: " + linkedList);
        System.out.println("Sorted elements: " + linkedList);
        System.out.println("Sum of elements: " + sum);
        System.out.println("Floating average: " + average);
    }
}
