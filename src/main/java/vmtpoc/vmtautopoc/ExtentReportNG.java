package vmtpoc.vmtautopoc;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {

	public void getReportObject() {
		// ExtentReports, ExtentSparkReporter
				String path = System.getProperty("user.dir") + "\\reports\\index.html";
				
				//For configuration of the report
				ExtentSparkReporter reporter = new ExtentSparkReporter(path);
				reporter.config().setReportName("Web Automation Results");
				reporter.config().setDocumentTitle("Test Results");
				
				// Main class that generates the report
				ExtentReports extent = new ExtentReports();
				extent.attachReporter(reporter);
				extent.setSystemInfo("Test Engineer", "Abraham Ora");
	}
	
}
