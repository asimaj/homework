package explorationday4;

import java.util.Scanner;

public class ClassFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial = 1;
		Scanner S=new Scanner(System.in);
		System.out.println("Please enter the number");
		int n = S.nextInt();
		for (int i=1;i<=n;i++)
		{
			factorial=factorial*i;
					}
		System.out.println("Factorial number is "+factorial);
	}
}
