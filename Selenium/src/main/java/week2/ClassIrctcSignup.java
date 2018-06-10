package week2;
import java.util.*;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassIrctcSignup {
	public static void main(String[] args) {
		//Launch browser
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver drivers=new ChromeDriver();
		//get the url
		drivers.get("https://www.irctc.co.in/eticketing");
		//Click on sign up link
		drivers.findElementByLinkText("Sign up").click();
		drivers.findElementById("userRegistrationForm:userName").sendKeys("asima_Urooj");
		drivers.findElementById("userRegistrationForm:password").sendKeys("Selenium!1");
		drivers.findElementById("userRegistrationForm:confpasword").sendKeys("Selenium!1");
		WebElement securityQ=drivers.findElementById("userRegistrationForm:securityQ");
		Select secdd =new Select(securityQ);
		secdd.selectByVisibleText("Who was your Childhood hero?");
		drivers.findElementById("userRegistrationForm:securityAnswer").sendKeys("Actor");
		WebElement preflang=drivers.findElementById("userRegistrationForm:prelan");
		Select langdd =new Select(preflang);
		langdd.selectByIndex(0);
		//Personal details
		drivers.findElementById("userRegistrationForm:firstName").sendKeys("Asima");
		drivers.findElementById("userRegistrationForm:middleName").sendKeys(" ");
		drivers.findElementById("userRegistrationForm:lastName").sendKeys("Jamsheed");
		drivers.findElementById("userRegistrationForm:gender:1").click();
		drivers.findElementById("userRegistrationForm:maritalStatus:1").click();
		WebElement dobdate=drivers.findElementById("userRegistrationForm:dobDay");
		Select dobddd =new Select(dobdate);
		dobddd.selectByValue("05");
		WebElement dobmonth=drivers.findElementById("userRegistrationForm:dobMonth");
		Select mntdd =new Select(dobmonth);
		mntdd.selectByValue("08");
		WebElement dobyear=drivers.findElementById("userRegistrationForm:dateOfBirth");
		Select yrdd =new Select(dobyear);
		yrdd.selectByIndex(10);
		WebElement Occ=drivers.findElementById("userRegistrationForm:occupation");
		Select Occdd =new Select(Occ);
		Occdd.selectByIndex(4);
		drivers.findElementById("userRegistrationForm:uidno").sendKeys("A0dPA54789");
		drivers.findElementById("userRegistrationForm:idno").sendKeys("");
		WebElement cntry=drivers.findElementById("userRegistrationForm:countries");
		Select cntrydd=new Select(cntry);
		System.out.println(cntrydd.getOptions().size());
		List<WebElement> allOptions = cntrydd.getOptions();
		for (WebElement eachOption : allOptions) {

			System.out.println(eachOption.getText());
		}
		drivers.findElementById("userRegistrationForm:email").sendKeys("auto123@gmail.com");
		System.out.println(drivers.findElementById("userRegistrationForm:isdCode").isEnabled());
		drivers.findElementById("userRegistrationForm:mobile").sendKeys("9856331578");
		WebElement nationality=drivers.findElementById("userRegistrationForm:nationalityId");
		Select nationdd =new Select(nationality);
		nationdd.selectByValue("94");
		//Residential details
		drivers.findElementById("userRegistrationForm:address").sendKeys("20/5");
		drivers.findElementById("userRegistrationForm:street").sendKeys("Park Street");
		drivers.findElementById("userRegistrationForm:area").sendKeys("",Keys.TAB);
		drivers.findElementById("userRegistrationForm:pincode").sendKeys("6200001");
		drivers.findElementById("userRegistrationForm:statesName").sendKeys("TAMILNADU",Keys.TAB);
		WebElement city=drivers.findElementById("userRegistrationForm:cityName");
		Select citydd =new Select(city);
		citydd.selectByIndex(1);

	}
}