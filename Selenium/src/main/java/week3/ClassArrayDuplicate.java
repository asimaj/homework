package week3;

public class ClassArrayDuplicate {

	public static void main(String[] args) {
			
		int[] a = {13,65,15,67,88,65,13,99,67,13,65,87,13};
		 
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i]==a[j])
				{					
		System.out.println("Duplicate"+a[i]);
	}
			}
		}
}
}