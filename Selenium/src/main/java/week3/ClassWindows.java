package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWindows {
	public static void main(String[] args) {
		//Launch browser
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver drivers=new ChromeDriver();
		//get the url
		drivers.get("https://www.irctc.co.in/eticketing");
		drivers.findElementByLinkText("Contact Us").click();
		//getting the count of windows
Set<String> cntwinsize = drivers.getWindowHandles();
int size1= cntwinsize.size();
System.out.println(size1);
// creating list & and adding the 
List<String> lstval=new ArrayList<String>();
lstval.addAll(cntwinsize);
//Moving to 2nd window and printing the URL
String secwin = lstval.get(1);
drivers.switchTo().window(secwin);
System.out.println(drivers.getCurrentUrl());
drivers.quit();

}
}