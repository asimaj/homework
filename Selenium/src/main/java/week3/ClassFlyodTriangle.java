package week3;

import java.util.Scanner;

public class ClassFlyodTriangle {
	public static void main(String[] args) {
		int num=1;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int Row=s.nextInt();
		
		System.out.println("Floyd's triangle :-");
		for (int i=1;i<=Row;i++)
		{
			for (int j=1;j<=i;j++)
		{
			System.out.print(num+" ");
			num++;
		}
			 System.out.println();
	}

}
}
