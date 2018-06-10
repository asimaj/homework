package explorationday4;
import java.util.*;
public class ClassArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of elements in the array:");
		n = s.nextInt();
		int arrrayofnumbers[] = new int[n];

		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter elements of array:");
			arrrayofnumbers[i]= s.nextInt();
		}
		for (int i=0;i<n;i++)
		{
			for (int j=i+1;j<n;j++)
			{
				if (arrrayofnumbers[i]>arrrayofnumbers[j])

				{
					int temp=arrrayofnumbers[i];
					arrrayofnumbers[i]=arrrayofnumbers[j];
					arrrayofnumbers[j]=temp;
				}
			}
		}

		System.out.print("Ascending Order:\t");
		for (int i = 0; i < n - 1; i++) 
		{
			System.out.print(arrrayofnumbers[i] + ",");
		}
		System.out.print(arrrayofnumbers[n - 1]);    		
		for (int i=0;i<n;i++)
		{
			for (int j=i+1;j<n;j++)
			{
				if (arrrayofnumbers[i]<arrrayofnumbers[j])

				{
					int temp=arrrayofnumbers[i];
					arrrayofnumbers[i]=arrrayofnumbers[j];
					arrrayofnumbers[j]=temp;
				}
			}
		}
		System.out.print("\n");
		System.out.print("Decending Order:\t");
	for (int i = 0; i < n-1 ; i++) 
	{
		System.out.print(arrrayofnumbers[i] + ",");
	}
	System.out.print(arrrayofnumbers[n-1]);   
}
}
