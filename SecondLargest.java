package priiiii;

import java.util.Scanner;

// Program to find the second largest element in a 1D array
public class SecondLargest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array must contain at least 2 elements.");
            sc.close();
            return;
        }

        int[] a = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int largest = a[0];
        int secondLargest = a[1];

        // Make sure largest contains the bigger of the first two elements
        if (secondLargest > largest) {
            int temp = largest;
            largest = secondLargest;
            secondLargest = temp;
        }

        // Find the largest and second largest elements
        for (int i = 2; i < n; i++) {

            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];

            } else if (a[i] > secondLargest && a[i] != largest) {
                secondLargest = a[i];
            }
        }

        System.out.println("Largest element: " + largest);
        System.out.println("Second largest element: " + secondLargest);

        sc.close();
    }
}