package week2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

	public static void main(String[] args) {
		System.out.println("Enter your password");
		Scanner s=new Scanner(System.in);
		String Pwd =s.next();
		int len=Pwd.length();
		String pwdval = "(?=.*[0-9].*[0-9])(?=.*[a-z])(?=.*[A-Z]).{10,}";
	//	if ((len>10) &&  passwordmatch = Pwd.matches(pwdval); {
			 
		if (Pattern.matches("[a-zA-Z]+", Pwd) == false && Pwd.length() > 2) {
			 
			System.out.println("valid");
		}
		
		}
	
}
