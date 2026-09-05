package Addition;
import java.util.Scanner;
public class Course {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("Enetr the no of students you want to check");
int n=sc.nextInt();

int i=1;int j=1;int highesttotal=0;int topperstudent=0;
while(i<=n) {
	System.out.println("Enter the student no :");
	int N=sc.nextInt();
	while(j<=N) {
		System.out.println("Enter the marks in Subject 1");
		int sub1=sc.nextInt();
		System.out.println("Enter the marks in Subject 2");
		int sub2=sc.nextInt();
		System.out.println("Enter the marks in Subject 3");
		int sub3=sc.nextInt();
		int total=sub1+sub2+sub3;
		j++;
		if(total>highesttotal) {
			highesttotal=total;
			topperstudent=i;
		}i++;
	}
}System.out.println("The topper is the student no :"+topperstudent);
	
	
	
	
	
	
	}	
	}
