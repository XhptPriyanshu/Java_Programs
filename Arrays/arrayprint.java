import java.util.Scanner;

public class ArrayPrint {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("The elements of the array are:");

        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }

        sc.close();
    }
}
