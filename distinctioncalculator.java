package priiiii;
import java.util.Scanner;
public class addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of student you want to check result");
int N=sc.nextInt(); int i=1;int distinction=0; int firstclass=0;int secondclass=0;int fail=0;
while(i<=N) {
	 System.out.println("Enter your name");
	 String name=sc.next();
	 System.out.println("Enter your ID");
	 int id=sc.nextInt();
	
	 System.out.println("Enter the result CGPA");
	 
	 int cgpa=sc.nextInt();
	 if (cgpa>=75) {
		 
		 System.out.println("Distinction");
		 distinction++;
	 }else if(cgpa>=60&&cgpa<=74){
		 System.out.println("First Class");
		 firstclass++;
	 }else if(cgpa>=45&&cgpa<=59) {
		 System.out.println("Second Class");
		 secondclass++;
	 }else {
		 System.out.println("Fail");
		 fail++;
	 }i++;
	
}System.out.println("Summary");
System.out.println("Total Students"+N);
System.out.println("Total Distinction :"+distinction);
System.out.println("Total First Class :"+firstclass);
System.out.println("Total Second Class :"+secondclass);
System.out.println("Total fail :"+fail);

	}

}
