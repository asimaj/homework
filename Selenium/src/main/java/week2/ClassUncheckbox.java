package week2;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClassUncheckbox {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//get the url
		ChromeDriver drivers =new ChromeDriver();
		drivers.manage().window().maximize();
		drivers.get("http://testleaf.herokuapp.com/");
		drivers.findElementByXPath("//*[@id='post-153']/div[2]/div/ul/li[7]/a/img").click();
		if (drivers.findElementByXPath("//*[@id='contentblock']/section/div[2]/input").isSelected()==true)
		{
			drivers.findElementByXPath("//*[@id='contentblock']/section/div[2]/input").click();
			System.out.println("Check box is unchecked");
		}
		else
			System.out.println("Check box is not checked");
	}

}
