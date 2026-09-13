package priiiii;
import java.util.Scanner;
public class addition {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of no arrays you want to store");
int n=sc.nextInt();

int []a=new int[n];
System.out.println("enter the values to store");
int i;
for(i=0;i<n;i++) {
	a[i]=sc.nextInt();
}int sum=0;for(i=0;i<n;i++) {
	System.out.println("The value in the Sttring are :"+a[i]);
	if(a[i]>=0) {
		sum=a[i]+sum;
	}
}System.out.println("The sum of element of the array is :"+sum);

}}