import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();

        int[] a=new int[n];

        System.out.println("Enter the elements:");

        for (int i=0; i<n;i++) {
            a[i]=sc.nextInt();
        }

        int totalEven=0;
        int totalOdd=0;

        for (int i=0;i<n; i++) {
            if (a[i] % 2 == 0) {
                totalEven++;
            } else {
                totalOdd++;
            }
        }

        System.out.println("Total even numbers: " + totalEven);
        System.out.println("Total odd numbers: " + totalOdd);
    }
}