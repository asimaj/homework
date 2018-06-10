package week2;
import java.util.Scanner;

public class ClassArthOperation {
	public static void main(String[] args) {
 
System.out.println("Enter the 1st number :");
 Scanner s =new Scanner(System.in);
 int num1=s.nextInt();
 System.out.println("Enter the 2nd number :");
 Scanner s1 =new Scanner(System.in);
 int num2=s1.nextInt();
 System.out.println("Enter the details of the arthemetic operation to be performed ADD/SUB/MUL/DIV:");
 Scanner s2 =new Scanner(System.in);
 String char1=s2.next();
 switch(char1) {
 case "ADD":
	 System.out.println("You have entered + operater");
	 int sum = num1+num2;
	 System.out.println("The Results are "+sum);
	 break;
	
 case "SUB":
	 System.out.println("You have entered - operater");
	 int sub = num1-num2;
	 System.out.println("The Results are "+sub);
	 break;
 case "MUL":
	 System.out.println("You have entered * operater");
	 int mul = num1-num2;
	 System.out.println("The Results are "+mul);
	 break;
 case "DIV":
	 System.out.println("You have entered / operater");
	 float div = num1-num2;
	 System.out.println("The Results are "+div);
	 break;
default:
	System.out.println("Incorrect Operater");
 }
 
 
} 
}
