package week2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassLogin {

	public static void main(String[] args) {
		// Launch bowser
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

//Enter the URL
ChromeDriver drivers =new ChromeDriver();
drivers.manage().window().maximize();
drivers.get("http://leaftaps.com/opentaps/control/main");
drivers.findElementById("username").sendKeys("DemoSalesManager");
drivers.findElementById("password").sendKeys("crmsfa");
drivers.findElementByClassName("decorativeSubmit").click(); 	
drivers.findElementByLinkText("CRM/SFA").click();
drivers.findElementByLinkText("Create Lead").click();
drivers.findElementById("createLeadForm_companyName").sendKeys("Name 1");
drivers.findElementById("createLeadForm_firstName").sendKeys("Name 2");
drivers.findElementById("createLeadForm_lastName").sendKeys("Name 3");
WebElement  source = drivers.findElementById("createLeadForm_dataSourceId");
Select dd = new Select(source);
dd.selectByVisibleText("Existing Customer");
WebElement  source1 = drivers.findElementById("createLeadForm_marketingCampaignId");
Select dd1 = new Select(source1);
dd1.selectByIndex(3);
WebElement  source2 = drivers.findElementById("createLeadForm_industryEnumId");
Select dd2= new Select(source2);
System.out.println(dd2.getOptions().size());
List<WebElement> allOptions = dd2.getOptions();
for (WebElement eachOptions: allOptions) {
	System.out.println(eachOptions.getText());
}
//drivers.findElementByName("submitButton").click();
}

}
