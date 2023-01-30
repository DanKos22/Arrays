package ie.atu.week1;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        // Declare an array integers
        int[] anArray;
        // Allocates memory for 10 integers
        anArray = new int[10];

        // Initialize the elements
        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        int indexValue = 0;

        for(int value: anArray)
        {
            System.out.println("Element at index " + indexValue + " : " + value);
            indexValue++;
        }

        Scanner myscan = new Scanner(System.in);

        try
        {
            System.out.println("Enter a value: ");
            anArray[10] = myscan.nextInt();
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("You went outside your memory block");
        }
    }

}
