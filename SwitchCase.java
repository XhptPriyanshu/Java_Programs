import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
Scanner sc=new Scanner(System.in);
System.out.println("1.Student Registration \n2.Coarse management\n3.Attendence management\n4.Grade management\n5.search module\n6.report generation\n7.Student Data Analytics");
int choice=sc.nextInt();
switch(choice){
case 1:System.out.println("Student has selected Student registration Module");
break;
case 2:System.out.println("Student has selected Course Management Module");
break;
case 3:System.out.println("Student has selected Attendance Management Module");
break;
case 4:System.out.println("Student has selected Grade Calculation Module");
break;
case 5:System.out.println("Student has selected Search Module");
break;
case 6:System.out.println("Students has selected Report Generation Module");
break;
case 7:System.out.println("Student has selected Student Data Analytics");
break;
default:System.out.println("Student should enter choice between 1-7 only");
break;
}

    }
}