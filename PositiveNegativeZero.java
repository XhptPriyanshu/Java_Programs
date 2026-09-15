package priiiii;

import java.util.Scanner;

// Program to count positive, negative, and zero elements in a 1D array
public class PositiveNegativeZero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to store:");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements:");

        int negative = 0;
        int zero = 0;
        int positive = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

            if (a[i] < 0) {
                negative++;
            } else if (a[i] == 0) {
                zero++;
            } else {
                positive++;
            }
        }

        System.out.println("Number of positive values: " + positive);
        System.out.println("Number of negative values: " + negative);
        System.out.println("Number of zero values: " + zero);

        sc.close();
    }
}