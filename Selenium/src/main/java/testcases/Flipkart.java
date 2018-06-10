package testcases;
import java.util.ArrayList;

import java.util.List;

import java.util.Set;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {

		// launch browser

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		//ignore the login window

		driver.getKeyboard().sendKeys(Keys.ESCAPE);

		//select the samsung option under the tv link

		WebElement TVlink = driver.findElementByXPath("//*[@id='container']/div/header/div[3]/div/ul/li[2]/a/span");

		WebElement Samsungopt = driver.findElementByXPath("//*[@id='container']/div/header/div[3]/div/ul/li[2]/ul/li/ul/li[1]/ul/li[8]/a/span");

		Actions builde = new Actions(driver);

		builde.moveToElement(TVlink).perform();

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.elementToBeClickable(Samsungopt));

		builde.click(Samsungopt).perform();

		//selecting the price value

		WebElement Minvalue = driver.findElementByXPath("//span[text()='Price']/following::select");

		//Minvalue.click();

		Thread.sleep(3000);

		Select Minval= new Select(Minvalue);

		Minval.selectByValue("25000");

		//selecting the Max price value

		WebElement Maxvalue = driver.findElementByXPath("(//span[text()='Price']/following::select)[2]");

		//Maxvalue.click();

		Thread.sleep(3000);

		Select Maxval= new Select(Maxvalue);

		Maxval.selectByValue("60000");

		//select screen size

		WebElement screensize = driver.findElementByXPath("//div[text()='Screen Size']");

		screensize.click();

		Thread.sleep(3000);

		WebElement selvalue = driver.findElementByXPath("//div[text()='48 - 55']");

		selvalue.click();

		Thread.sleep(3000);

		//selecting the 1st product

		WebElement prod1 = driver.findElementByXPath("//div[text()='Samsung Series 6 123cm (49 inch) Full HD Curved LED Smart TV']");

		prod1.click();

		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//Switch to new window

		Set<String> allwindow = driver.getWindowHandles();

		List<String> winList = new ArrayList<String>();

		winList.addAll(allwindow);

		//Selecting the price

		WebElement frsprice = driver.findElementByXPath("//div[text()='58,999']");

		String frsprice1=frsprice.getText();

		System.out.println("Price of tv in second page is "+frsprice1);

		//		Moving to second window

		driver.switchTo().window(winList.get(1));

		System.out.println(driver.getTitle());

		WebElement secprice = driver.findElementByXPath("//div[@class='_1vC4OE _37U4_g']");

		String secprice2=secprice.getText();

		System.out.println("Price of tv in second page is "+secprice2);

		//compare the prices in both the screens

		if (frsprice1.equals(secprice2))

			System.out.println("Price in both the page are same");

		else

			System.out.println("Prices are not same");

		//close the 2nd tab

		driver.close();

		//Moving to 1st window

		driver.switchTo().window(winList.get(0));

		System.out.println(driver.getTitle());

		//Select compare for 1st option

		WebElement Addcomp1 = driver.findElementByXPath("//span[text()='Add to Compare']");

		Addcomp1.click();

		WebElement Addcomp2 = driver.findElementByXPath("(//span[text()='Add to Compare'])[2]");

		Thread.sleep(3000);

		Addcomp2.click();

		//select compare

		WebElement compare = driver.findElementByClassName("G934d8");

		compare.click();

		Thread.sleep(3000);

		WebElement text = driver.findElementByXPath("//span[text()='Compare']");

		String Value =text.getText();

		if(Value.equalsIgnoreCase("Compare"))

			System.out.println("Vaue is compare");

		else

			System.out.println("Compare not available");

		WebElement price1 = driver.findElementByXPath("//div[text()='58,999']");

		String fprice1=price1.getText();

		String s1=fprice1.replaceAll(",","");

		System.out.println(s1.substring(1));

		int a=Integer.parseInt(s1.substring(1));

		WebElement price2 = driver.findElementByXPath("//div[text()='44,999']");

		String fprice2=price2.getText();

		String s2=fprice2.replaceAll(",","");

		System.out.println(s2.substring(1));

		int b=Integer.parseInt(s2.substring(1));

		if(a<=b)

			System.out.println("Lowest price is "+a);

		else

			System.out.println("Lowest price is "+b);

	}

}

