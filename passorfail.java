package priiiii;
import java.util.Scanner;
public class addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of student you want to check result");
int N=sc.nextInt(); int i=1;String withstand,published;
while(i<=N) {
	 System.out.println("Enter your name");
	 String name=sc.next();
	 System.out.println("Enter your ID");
	 int id=sc.nextInt();
	 System.out.println("Enter your coarse code");
	 String coarse=sc.next();
	 System.out.println("Enter the result status(Published or Withstand)");
	 
	 String result=sc.next();
	 if (result.equals("withstand")) {
		 i++;
		 System.out.println("Result cannot be published");
		 continue;
	 }else {
		 System.out.println(" name :"+name);
		 System.out.println("ID :"+id);
		 System.out.println("Coarse Code"+coarse);
		 System.out.println("result : publisher");
	 }i++;
}

	}

}