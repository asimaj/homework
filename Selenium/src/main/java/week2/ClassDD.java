package week2;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver drivers=new ChromeDriver();
		drivers.get("https://www.irctc.co.in/eticketing");
		drivers.findElementByLinkText("Sign up").click();
		 WebElement cntry = drivers.findElementById("userRegistrationForm:countries");
		//cntrydd.sendKeys("E",Keys.ARROW_DOWN);
		//cntrydd.sendKeys("E",Keys.ARROW_UP);
		 Select cntrydd=new Select(cntry);
		 List<WebElement> allOptions = cntrydd.getOptions();
			for (WebElement eachOption : allOptions) {

				System.out.println(eachOption.getText());
			}

			
	}

}
