package vmtpoc.vmtautopoc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PocAuto {
	
//	ExtentReports extent;
	
	
//	@BeforeTest
//	public void Config() {
//		// ExtentReports, ExtentSparkReporter
//		String path = System.getProperty("user.dir") + "\\reports\\index.html";
//		
//		//For configuration of the report
//		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
//		reporter.config().setReportName("Web Automation Results");
//		reporter.config().setDocumentTitle("Test Results");
//		
//		// Main class that generates the report
//		extent = new ExtentReports();
//		extent.attachReporter(reporter);
//		extent.setSystemInfo("Test Engineer", "Abraham Ora");
//	}
	
	@Test
	public void ExtentReports() {
		
		// ExtentTest test = extent.createTest("Initial Demo");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
//		test.fail("Result do not match!");
//		
//		test.addScreenCaptureFromBase64String("Sample");
		
		driver.close();
		
//		extent.flush(); // Report will not listen anymore to the execution
		
	}
	
	

}
