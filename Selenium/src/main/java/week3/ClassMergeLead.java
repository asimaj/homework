package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassMergeLead {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//get the url
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Login 
		driver.findElementByName("USERNAME").sendKeys("demosalesmanager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		//Click crm/sfa link
		driver.findElementByClassName("crmsfa").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("//input[@name='partyIdFrom']/following::a").click();
		//Move to new window
		Set<String> cntwind = driver.getWindowHandles();
		Set<String> cntwinsize = driver.getWindowHandles();
		int size1= cntwinsize.size();
		List<String> windvalue= new ArrayList<String> ();
		windvalue.addAll(cntwinsize);
		//Moving to second window
		String secwin = windvalue.get(1);
		driver.switchTo().window(secwin);
		System.out.println(driver.getCurrentUrl());
		WebElement leadid = driver.findElementByName("id");
		leadid.sendKeys("100");
		WebElement findlead = driver.findElementByXPath("//button[text()='Find Leads']");
		findlead.click();
		WebElement tabel = driver.findElement(By.className("x-grid3-row-table"));	
		List<WebElement> rows = tabel.findElements(By.tagName("tr"));
		WebElement row = rows.get(0);
		System.out.println(row.getText());
		List<WebElement> col = row.findElements(By.tagName("td"));
		WebElement cols = col.get(0);
		System.out.println(cols.getText());
		
		
}
}