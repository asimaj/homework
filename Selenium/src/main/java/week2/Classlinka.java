package week2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classlinka {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver drivers=new ChromeDriver();
		drivers.get("https://www.irctc.co.in/eticketing");
	//List<WebElement> PL = drivers.findElementsByPartialLinkText("a");
		//System.out.println(PL.size());
		 List<WebElement> Tagname = drivers.findElementsByTagName("a");
		 System.out.println(Tagname);

	}

}
