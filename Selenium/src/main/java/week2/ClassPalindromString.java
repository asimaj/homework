package week2;
import java.util.*;
public class ClassPalindromString {
	public static void main(String[] args) {
		String rev="";
		String char1="";
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the String to be reversed");
		char1=s.nextLine();
		int temp=char1.length();
		for(int i=temp-1;i>=0;i--)
		{
			rev =rev+char1.charAt(i);
		}	
		if (char1.equals(rev))
		{
			System.out.println("String is palindrome");
			}
		else 
			System.out.println("String is not palindrome");
		}
	
}
