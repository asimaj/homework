package Lead;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class reports {
	
	@Test
public void sample() throws Exception {
		
		ExtentHtmlReporter html = new ExtentHtmlReporter("./Report/result.html");
		html.setAppendExisting(true);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		ExtentTest test =extent.createTest("TC001_create Lead","Creation of Lead");
		test.assignCategory("smoke");
		test.assignAuthor("Asima");
		test.pass("User name is entered sucessfully",
				MediaEntityBuilder
				.createScreenCaptureFromPath("F:\\Selenium\\Selenium\\snaps\\img1.png")
				.build());
	
		extent.flush();
		
	}
}
