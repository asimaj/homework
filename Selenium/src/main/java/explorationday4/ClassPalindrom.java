package explorationday4;
import java.util.*;
public class ClassPalindrom {
	public static void main(String[] args) {
	int Sum=0, r;
	Scanner S =new Scanner(System.in);
	System.out.println("Enter the Number to be reversed");
	int nummber  = S.nextInt();
	int temp=nummber;
	while(nummber>0) 
	{
	r=nummber%10;
	Sum =(Sum*10)+r;
	nummber=nummber/10;
	}
	if (temp==Sum)
	System.out.println("The number is Palindrom");
	else
		System.out.println("The number is not a Palindrom");	
}
}