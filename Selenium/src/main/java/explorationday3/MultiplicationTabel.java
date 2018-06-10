package explorationday3;
import java.util.Scanner;
public class MultiplicationTabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number for the multiplication tabel");
		int input1=s.nextInt();
		System.out.println("Enter the number for the limit tabel");
		int input2=s.nextInt();
		System.out.println("Multiplication table for "+input1+" is :");
		for(int n=1;n<=input2;n++)
		{
			int Value=n*input1;
			System.out.println(input1+"*"+n+"="+Value);
			
		}

		}
}