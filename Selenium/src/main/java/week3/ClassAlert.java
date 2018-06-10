package week3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassAlert {
	public static void main(String[] args) {
		//Launch browser
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver drivers=new ChromeDriver();
		//get the url
		drivers.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		drivers.switchTo().frame("iframeResult");
		WebElement button = drivers.findElementByXPath("//button[contains(text(),'Try it')]");
		button.click();
		drivers.switchTo().alert().sendKeys("Asima");
		drivers.switchTo().alert().accept();
		String alert = drivers.findElementById("demo").getText();
		if(alert.contains("Asima"))
			System.out.println("Matching Values");
		else
			System.out.println("not Matching Values");
	}
}