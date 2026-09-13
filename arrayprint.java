package priiiii;
import java.util.Scanner;
public class addition {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
System.out.println("Enter the valuse of no of arrays");
int n=sc.nextInt();
int []a=new int[n];
// Here int[] means the array is of integer type..
// a=the name of the array.... new=for new array..... int[n]=array will store n number of elements...
System.out.println("Enter the value you want to add to array memory");
for(int i=0;i<n;i++) {
	a[i]=sc.nextInt();
	
}for(int i=0;i<n;i++) {
	System.out.println("The elements of the array are "+a[i]);
}
	

	   
	
}}