package explorationday4;

import java.util.Scanner;

public class ClassArrayLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of elements in the array:");
		n = s.nextInt();
		int arrrayofnumbers[] = new int[n];
		int largest=arrrayofnumbers[0];
		int thirdlargest=arrrayofnumbers[0];
		int secondlargest=arrrayofnumbers[0];
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter elements of array:");
			arrrayofnumbers[i]= s.nextInt();
		}
		for (int i=0;i < arrrayofnumbers.length;i++) {
			if (arrrayofnumbers[i]>largest) {
				thirdlargest=largest;
				largest=arrrayofnumbers[i];
			}
			if (secondlargest < arrrayofnumbers[i] && largest != arrrayofnumbers[i]) {
				thirdlargest = secondlargest;
				secondlargest = arrrayofnumbers[i];
				if (thirdlargest < arrrayofnumbers[i] && secondlargest != arrrayofnumbers[i])
					thirdlargest = arrrayofnumbers[i];
				System.out.println("3rd largest number is:" + thirdlargest);
							}
			
		}
		System.out.println("First largest number is:" + largest);

}
}