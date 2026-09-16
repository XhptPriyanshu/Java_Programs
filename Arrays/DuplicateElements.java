package priiiii;

import java.util.Scanner;

// Program to find duplicate elements in a 1D array
public class DuplicateElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements:");

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                }
            }
        }

        sc.close();
    }
}
