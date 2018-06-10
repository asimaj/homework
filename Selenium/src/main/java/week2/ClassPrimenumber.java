package week2;

import java.util.Scanner;

public class ClassPrimenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		System.out.print("Enter the value of n");
		Scanner S=new Scanner(System.in);
		int n = S.nextInt();
		for (i=2;i<=n;i++) {
			for(int j=2;j<=n;j++) {
				if (i==j) {
					System.out.print(i+"  ");
				}
				if (i%j==0) {
					break;

				}
			}

		}

	}

}
