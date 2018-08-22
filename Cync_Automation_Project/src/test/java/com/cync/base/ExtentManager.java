package com.cync.base;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
static ExtentReports reports;
	
	public static ExtentReports getReporter(){
		if(reports == null) {
			reports = new ExtentReports("Reports/TestReport.html", Boolean.valueOf(true));
			reports.addSystemInfo("Idexcel.com", "QA Enviroment");
			reports.addSystemInfo("Author ", "CYNC Automation QA");
			reports.loadConfig(new File("Reports/ExtentConfig.xml"));
	}
		return reports;

}
}