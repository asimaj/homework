package testcases;
import java.util.Scanner;
public class NEwclass_Regex {
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub

		      System.out.println("Enter a password");
		      Scanner sc=  new Scanner (System.in);
		      String password =sc.nextLine();
		      String passwordvalidation = "(?=.*[0-9].*[0-9])(?=.*[a-z])(?=.*[A-Z]).{10,}";
		      boolean passwordmatch = password.matches(passwordvalidation);
		     if (passwordmatch==true)
		     {
		    	 System.out.println("Password is corrrect ");
		     }
		     else
		     {
		    	 System.out.println("1. A password must have at least ten characters.\\n\" +\r\n" + 
		    	 		"                \"2. A password contain atlest 1 capital letter.\\n\" +\r\n" + 
		    	 		"                \"3. A password must contain at least two digits \\n\" +\n"+
		    	 		"                \"4. A password must contain at 1 capital letter \\n\" +\n");
		     }
		   }
		
			 
		}



