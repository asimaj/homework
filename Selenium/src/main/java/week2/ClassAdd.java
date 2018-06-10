package week2;

import java.util.Scanner;

public class ClassAdd {

	public static void main(String[] args) {
		System.out.println("Enter the value for a");
		Scanner s =new Scanner(System.in);
		int a =s.nextInt();
		System.out.println("Enter the value for b");
		Scanner s1 =new Scanner(System.in);
		int b =s1.nextInt();
		a= a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value after swapping is "+a+"\t"+b);
			
	}

}
