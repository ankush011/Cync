package com.cync.ABLPageBreak;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cync.base.BaseTest;
import com.cync.base.ExtentTestManager;
import com.cync.pages.CyncHomePage;
import com.cync.pages.LoginPage;
import com.cync.utility.TestGroups;
import com.relevantcodes.extentreports.LogStatus;

public class ExceptionAnalysisTC extends BaseTest {

    @Test( groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Document Compliance Reporting page break")
    public void DocumentComplianceReportingPageBreak() 
    
    {
	ExtentTestManager.getTest().getTest()
		.setName("Document Compliance Reporting page break");
	ExtentTestManager.getTest().assignCategory("Module:Exception Analysis");
	LoginPage loginPage = new LoginPage(driver);
	CyncHomePage cyncHomePage = loginPage.doLogin();
	Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),
		"Signed in Successfully");

	// Step1:select the client from the drop down list
	String clientname="ABLPAGEBREAKAUTOMATION";
	Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(
		clientname));
	ExtentTestManager.getTest().log(LogStatus.PASS,
		"Step1:Successful clicked client from the dropdown list");

	// Step2:navigate to Document Compliance Reporting page Break screen
	ExceptionAnalysisPageBreak ExceptionAnalysis = cyncHomePage.getCyncMenus().openDocumentComplianceReportingPageBreak();
	ExtentTestManager.getTest().log(LogStatus.PASS,"// Step2:navigate to Document Compliance Reporting screen");

	// Step3:verify the header for  Document Compliance Reporting screen
	String expected="Document Compliance Reporting";
	Assert.assertTrue(ExceptionAnalysis.DocumentComplianceReportingPageHeader(expected));
	ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step3:verify the header for Document Compliance Reporting");
	
	
    }
    
    
    @Test( groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Exception Reporting page break")
    public void ExceptionReportingPageBreak() 
    
    {
	ExtentTestManager.getTest().getTest()
		.setName("Exception Reporting page break");
	ExtentTestManager.getTest().assignCategory("Module:Exception Analysis");
	LoginPage loginPage = new LoginPage(driver);
	CyncHomePage cyncHomePage = loginPage.doLogin();
	Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),
		"Signed in Successfully");

	// Step1:select the client from the drop down list
	String clientname="ABLPAGEBREAKAUTOMATION";
	Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(
		clientname));
	ExtentTestManager.getTest().log(LogStatus.PASS,
		"Step1:Successful clicked client from the dropdown list");

	// Step2:navigate to Exception Reporting page Break screen
	ExceptionAnalysisPageBreak ExceptionAnalysis = cyncHomePage.getCyncMenus().openExceptionReportingPageBreak();
	ExtentTestManager.getTest().log(LogStatus.PASS,"// Step2:navigate to Exception Reporting screen");

	// Step3:verify the header for  Exception Reporting screen
	String expected="Exception Reporting";
	Assert.assertTrue(ExceptionAnalysis.ExceptionReportingPageHeader(expected));
	ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step3:verify the header for Exception Reporting");
	
	
    }
    @Test( groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Watch List Statistics Reporting")
    public void WatchListStatisticsReportingPageBreak() 
    
    {
	ExtentTestManager.getTest().getTest()
		.setName("Watch List Statistics Reporting");
	ExtentTestManager.getTest().assignCategory("Module:Exception Analysis");
	LoginPage loginPage = new LoginPage(driver);
	CyncHomePage cyncHomePage = loginPage.doLogin();
	Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),
		"Signed in Successfully");

	// Step1:select the client from the drop down list
	String clientname="ABLPAGEBREAKAUTOMATION";
	Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(
		clientname));
	ExtentTestManager.getTest().log(LogStatus.PASS,
		"Step1:Successful clicked client from the dropdown list");

	// Step2:navigate to Watch List Statistics Reporting page Break screen
	ExceptionAnalysisPageBreak ExceptionAnalysis = cyncHomePage.getCyncMenus().openWatchListStatisticsReportingPageBreak();
	ExtentTestManager.getTest().log(LogStatus.PASS,"// Step2:navigate to Watch List Statistics Reporting screen");

	// Step3:verify the header for  Watch List Statistics Reporting screen
	String expected="Watch List Statistics Reporting";
	Assert.assertTrue(ExceptionAnalysis.WatchListStatisticsReportingPageHeader(expected));
	ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step3:verify the header for Watch List Statistics Reporting");
	
	
    }
    
    @Test( groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Tickler Tasks page break")
    public void TicklerTasksPageBreak() 
    
    {
	ExtentTestManager.getTest().getTest()
		.setName("Tickler Tasks page break");
	ExtentTestManager.getTest().assignCategory("Module:Exception Analysis");
	LoginPage loginPage = new LoginPage(driver);
	CyncHomePage cyncHomePage = loginPage.doLogin();
	Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),
		"Signed in Successfully");

	// Step1:select the client from the drop down list
	String clientname="ABLPAGEBREAKAUTOMATION";
	Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(
		clientname));
	ExtentTestManager.getTest().log(LogStatus.PASS,
		"Step1:Successful clicked client from the dropdown list");

	// Step2:navigate to Tickler Tasks page Break screen
	ExceptionAnalysisPageBreak ExceptionAnalysis = cyncHomePage.getCyncMenus().openTicklerTasksPageBreak();
	ExtentTestManager.getTest().log(LogStatus.PASS,"// Step2:navigate to Tickler Tasks screen");

	// Step3:verify the header for  Tickler Tasks screen
	String expected="Tickler Tasks";
	Assert.assertTrue(ExceptionAnalysis.TicklerTasksPageHeader(expected));
	ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step3:verify the header for Tickler Tasks");
	
	
    }
    
    @Test( groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Dilution Analysis page break")
    public void DilutionAnalysisPageBreak() 
    
    {
	ExtentTestManager.getTest().getTest()
		.setName("Dilution Analysis page break");
	ExtentTestManager.getTest().assignCategory("Module:Exception Analysis");
	LoginPage loginPage = new LoginPage(driver);
	CyncHomePage cyncHomePage = loginPage.doLogin();
	Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),
		"Signed in Successfully");

	// Step1:select the client from the drop down list
	String clientname="ABLPAGEBREAKAUTOMATION";
	Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(
		clientname));
	ExtentTestManager.getTest().log(LogStatus.PASS,
		"Step1:Successful clicked client from the dropdown list");

	// Step2:navigate to Dilution Analysis page Break screen
	ExceptionAnalysisPageBreak ExceptionAnalysis = cyncHomePage.getCyncMenus().openDilutionAnalysisPageBreak();
	ExtentTestManager.getTest().log(LogStatus.PASS,"// Step2:navigate to Dilution Analysis  screen");

	// Step3:verify the header for  Dilution Analysis screen
	String expected="Dilution Analysis";
	Assert.assertTrue(ExceptionAnalysis.DilutionAnalysisPageHeader(expected));
	ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step3:verify the header for Dilution Analysis ");
	
	
    }
}
