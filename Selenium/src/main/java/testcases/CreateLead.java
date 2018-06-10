package testcases;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import wdMethods.SeMethods;

public class CreateLead extends SeMethods{
	@Test
	public void Lead()
	{
		startApp("Chrome","http://leaftaps.com/opentaps");
		WebElement Usname = locateElement("username");
		type(Usname,"DemoSalesManager");
		WebElement Pwd = locateElement("password");
		type(Pwd,"crmsfa");
		WebElement Logbut = locateElement("class","decorativeSubmit");
		click(Logbut);
		WebElement CRM = locateElement("link","CRM/SFA");
		click(CRM);
		WebElement Leadlk = locateElement("link","Create Lead");
		click(Leadlk);
		WebElement Cmpyname = locateElement("createLeadForm_companyName");
		type(Cmpyname,"Virtusa");
		WebElement Frstname = locateElement("createLeadForm_firstName");
		type(Frstname,"Asima");
		WebElement Surname = locateElement("createLeadForm_lastName");
		type(Surname,"Jams");
		WebElement IndDD = locateElement("createLeadForm_industryEnumId");
		selectDropDownUsingText(IndDD,"Computer Software");
		click(IndDD);
		WebElement CCYDD = locateElement("createLeadForm_currencyUomId");
		selectDropDownUsingIndex(CCYDD,20);
		click(CCYDD);
		WebElement Submitlead = locateElement("class","smallSubmit");
		click(Submitlead);
	}
}
