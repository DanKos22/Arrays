package ie.atu.week1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistDemo {
    public static void main(String[] args) {

        // Declare an array of integers
        ArrayList<Integer> myList = new ArrayList<>();

        // Initialize the elements
        myList.add(100);
        myList.add(200);
        myList.add(300);
        myList.add(400);
        myList.add(500);
        myList.add(600);
        myList.add(700);
        myList.add(800);
        myList.add(900);
        myList.add(1000);
        loop(myList);

        Scanner myscan = new Scanner(System.in);


        try
        {
            // Add a new value to the ArrayList
            System.out.println("Please enter a number: ");
            myList.add(myscan.nextInt());
            // Loop through the list again
            loop(myList);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("You went outside your memory block");
        }
    }

    // Function to loop through the ArrayList
    public static void loop(ArrayList<Integer> someArrayList)
    {
        int indexValue = 0;
        // Enhanced for loop
        for(int value: someArrayList)
        {
            System.out.println("Element at index " + indexValue + " : " + value);
            indexValue++;
        }
    }
}

