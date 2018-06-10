package explorationday3;
import java.util.Scanner;
public class ClassBiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner S= new Scanner(System.in);
System.out.println("Enter the 1st number");
int num1= S.nextInt();
System.out.println("Enter the 2nd number");
int num2= S.nextInt();
System.out.println("Enter the 3rd number");
int num3= S.nextInt();
if(num1>num2 & num1>num3)
{
	System.out.println(num1+" is largest number");

	}
else if (num2>num3 )
{
	System.out.println(num2+" is largest number");
}

else 
	System.out.println(num3+" is largest number");
	

}
}
