package week2;

import org.openqa.selenium.chrome.ChromeDriver;

public class ClassCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//get the url
		ChromeDriver drivers =new ChromeDriver();
		drivers.manage().window().maximize();
		drivers.get("http://leafground.com/");
		drivers.findElementByXPath("//*[@id='post-153']/div[2]/div/ul/li[7]/a").click();
		System.out.println(drivers.findElementByXPath("//*[@id='contentblock']/section/div[2]/input").isSelected());


	}

}
