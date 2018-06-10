package explorationday3;
import java.util.Scanner;
public class ClassMonthSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S= new Scanner(System.in);
		System.out.println("Enter the month details in number");
		int num1= S.nextInt();
switch (num1)
{
case 1: 
	System.out.println(+num1+"st Month of the year is January \nNumber of days in the months is 31");
	break;
case 2: 
	System.out.println(+num1+"st Month of the year is February \nNumber of days in the months is 29");
	break;
case 3: 
	System.out.println(+num1+"st Month of the year is March \nNumber of days in the months is 30");
	break;
case 4: 
	System.out.println(+num1+"st Month of the year is Aprial \nNumber of days in the months is 30");
	break;
case 5: 
	System.out.println(+num1+"st Month of the year is May \nNumber of days in the months is 31");
	break;
case 6: 
	System.out.println(+num1+"st Month of the year is June \nNumber of days in the months is 30");
	break;
case 7: 
	System.out.println(+num1+"st Month of the year is July \nNumber of days in the months is 31");
	break;
case 8: 
	System.out.println(+num1+"st Month of the year is August \nNumber of days in the months is 31");
	break;
case 9: 
	System.out.println(+num1+"st Month of the year is September \nNumber of days in the months is 30");
	break;
case 10: 
	System.out.println(+num1+"st Month of the year is October \nNumber of days in the months is 31");
	break;
case 11: 
	System.out.println(+num1+"st Month of the year is November \nNumber of days in the months is 30");
	break;
case 12: 
	System.out.println(+num1+"st Month of the year is December \nNumber of days in the months is 31");
	break;
	default:
		System.out.println("Enter a number between 1 to 12");
}
	}

}
