package week2;
import java.util.*;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class9thMay {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//get the url
		ChromeDriver drivers =new ChromeDriver();
		drivers.manage().window().maximize();
		drivers.get("http://leafground.com/");
		drivers.findElementByXPath("//*[@id='post-153']/div[2]/div/ul/li[5]/a").click();
		WebElement Source = drivers.findElementById("dropdown1");
		Select dd =new Select(Source);
		List<WebElement> allOptions = dd.getOptions();
		int count = allOptions.size();
		dd.selectByIndex(count-1);



	}
}