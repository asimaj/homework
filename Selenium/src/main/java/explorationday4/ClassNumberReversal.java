package explorationday4;
import java.util.*;

public class ClassNumberReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverse="";
	Scanner S=new Scanner(System.in);
	System.out.println("Please enter a string to be reversed");
	String text= S.next();
	int Lenght= text.length();
	for (int i=Lenght-1;i>=0;i--)
		 reverse = reverse + text.charAt(i);  
	System.out.println("Reversed number/String is : "+reverse);

	}

}
