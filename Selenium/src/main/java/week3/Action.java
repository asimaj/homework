package week3;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver drivers=new ChromeDriver();
		//get the url
		drivers.get("https://jqueryui.com/draggable/");
		drivers.manage().window().maximize();
		WebDriver frame = drivers.switchTo().frame(0);
		WebElement Drag = drivers.findElementById("draggable");
		 int xpoint = Drag.getLocation().getX();
		 int ypoint = Drag.getLocation().getY();
		 int newxpoint= xpoint+400;
		 int newypoint= ypoint+152;
		Actions builder =new Actions (drivers);
		builder.dragAndDropBy(Drag, newxpoint, newypoint).perform();
		

	}

}
