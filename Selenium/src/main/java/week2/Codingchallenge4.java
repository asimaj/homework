package week2;

import java.util.Scanner;
public class Codingchallenge4 {
	public static void main(String[] args) {
		int num1, num2;
		System.out.println("Enter the 1st number");
		Scanner s=new Scanner(System.in);
		num1=s.nextInt();
		System.out.println("Enter the 2nd number");
		Scanner s1=new Scanner(System.in);
		num2=s1.nextInt();
		for (int i=num1;i<=num2;i++) {
			if (i%3==0 && i%5==0)
				System.out.print("  FIZZBUZZ  ");
			else if (i%5==0)
				System.out.print("  BUZZ  ");
			else if (i%3==0)
				System.out.print("  FIZZ ");
			else 
				System.out.print("  "+i);
		}
	}
}

