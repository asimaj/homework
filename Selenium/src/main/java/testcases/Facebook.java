package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException{
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
driver.findElementById("email").sendKeys("barbiee.dream05@gmail.com");
driver.findElementById("pass").sendKeys("");
driver.findElementById("loginbutton").click();
Thread.sleep(3000);
driver.switchTo().alert().dismiss();
driver.findElementByXPath("//*[@id=\'u_a_2\']/input[2]").sendKeys("TestLeaf");


}

	private static void SwitchtoAlert() {
		// TODO Auto-generated method stub
		
	}
}
