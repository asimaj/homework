package testcases;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class Login extends SeMethods {
	@Test 
	public void Login()
	{
		startApp("Chrome","http://leaftaps.com/opentaps");
		WebElement Usname = locateElement("username");
		type(Usname,"DemoSalesManager");
		WebElement Pwd = locateElement("password");
		type(Pwd,"crmsfa");
		WebElement Logbut = locateElement("class","decorativeSubmit");
		click(Logbut);
		WebElement CRM = locateElement("link","CRM/SFA");
		click(CRM);

	}
}
