package spicejet_ultility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Spicejet_extentreports {

public static ExtentReports getreports() {
		
		ExtentSparkReporter report=new ExtentSparkReporter("./reports/report.html");
		report.config().setReportName("SPICE_JET");
		report.config().setDocumentTitle("SPICE_JET_TITLE");
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(report);
		return extent;
		
	}

}
