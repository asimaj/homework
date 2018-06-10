package week2;

import java.util.Scanner;

public class ClassAddArray {
	public static void main(String[] args) {

		int sum=0;
		System.out.println("Enter the number of elements ");
		Scanner s = new Scanner (System.in);
		int n=s.nextInt();
		int array[]= new int [n];
		System.out.println("Enter the Values for the array ");
		for(int i=0;i<n;i++) {
			array[i]=s.nextInt();
			sum=sum+array[i];
		}

		for (int i:array) {
			System.out.println("Entered Values are  "+i);
		}
		System.out.println("Sum of the Value is  "+sum);

	}
}