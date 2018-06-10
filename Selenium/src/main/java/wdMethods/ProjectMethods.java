package wdMethods;

import java.io.IOException;

import org.testng.annotations.*;

import lead_Parameters.Workbook;

public class ProjectMethods extends SeMethods {
	@Parameters({"url","username","password"})//oder not mandaotry nut naming convention is mandatory 
	@BeforeMethod
	public void login (String url,String uname,String pwd) { //oder is amndatory and names
		startApp("chrome", url);
		type(locateElement("id", "username"), uname);
		type(locateElement("id", "password"), pwd);
		click(locateElement("className", "decorativeSubmit"));
		click(locateElement("linkText", "CRM/SFA"));

		/*startApp("chrome", "http://leaftaps.com/opentaps");
		type(locateElement("id", "username"), "DemoSalesManager");
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("className", "decorativeSubmit"));
		click(locateElement("linkText", "CRM/SFA"));*/
	}

	@AfterMethod()
	public void closeApp() {
		closeBrowser();
	}

@DataProvider(name="fetchData")
public Object[][] fetchData() throws Exception{
	Workbook excel= new Workbook();
	return excel.readExcel();
}
}



