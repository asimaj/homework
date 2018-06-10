package lead_Parameters;

import org.testng.annotations.*;

import wdMethods.ProjectMethods;
import wdMethods.ProjectMethods;
public class CreateLead extends ProjectMethods{
	@Test(dataProvider="fetchData")
	public void createLead(String compname,String fname,String lname,String email,int phonenum) {	
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"),compname);
		type(locateElement("id", "createLeadForm_firstName"), fname);
		type(locateElement("id", "createLeadForm_lastName"), lname);
		type(locateElement("id", "createLeadForm_primaryEmail"),email);
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"),""+phonenum);
		click(locateElement("name", "submitButton"));

	}
}








