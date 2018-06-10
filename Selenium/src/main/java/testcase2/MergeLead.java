package testcase2;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class MergeLead extends ProjectMethods {
	@Test
	public void mergelead () throws InterruptedException {
		//login();
		/*startApp("Chrome","http://leaftaps.com/opentaps");
		WebElement Usname = locateElement("username");
		type(Usname,"DemoSalesManager");
		WebElement Pwd = locateElement("password");
		type(Pwd,"crmsfa");
		WebElement Logbut = locateElement("class","decorativeSubmit");
		click(Logbut);*/
		WebElement CRM = locateElement("link","CRM/SFA");
		click(CRM);
		WebElement Leadlk = locateElement("link","Create Lead");
		click(Leadlk);
		WebElement Mergelk = locateElement("link","Merge Leads");
		click(Mergelk);
		WebElement fmerlead = locateElement("XPath","//input[@name='partyIdFrom']/following::a");
		click(fmerlead);
		Thread.sleep(3000);
		switchToWindow(1);
}

	
	}
}