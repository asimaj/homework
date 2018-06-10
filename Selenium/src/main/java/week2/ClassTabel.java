package week2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTabel {

	public static void main(String[] args) {
		//System.setProperty("http:///leafground.com");

		//Enter the URL
		ChromeDriver drivers =new ChromeDriver();
		drivers.manage().window().maximize();
		drivers.get("http://leaftaps.com/opentaps/control/main");
		drivers.findElementById("username").sendKeys("DemoSalesManager");
		drivers.findElementById("password").sendKeys("crmsfa");
		drivers.findElementByClassName("decorativeSubmit").click(); 	
		drivers.findElementByLinkText("CRM/SFA").click();
		drivers.findElementByLinkText("Create Lead").click();
		drivers.findElementById("createLeadForm_birthDate-button").click();
		//Defining a rows
		List<WebElement> rows = drivers.findElements(By.className("daysrow"));				
		WebElement row = rows.get(3);
		System.out.println(row.getText());
		//Defining a column
		List<WebElement> col = row.findElements(By.tagName("td"));
		WebElement cols = col.get(1);
		System.out.println(cols.getText());
		cols.click();
		
	}

}
