package com.cync.ABLPageBreak;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cync.base.BaseTest;
import com.cync.base.ExtentTestManager;
import com.cync.pages.CyncHomePage;
import com.cync.pages.LoginPage;
import com.cync.utility.TestGroups;
import com.relevantcodes.extentreports.LogStatus;

public class ChartsAndGraphsNavigationPageBreak extends BaseTest {

	 @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  loan Availability by Manager Page")
	    public void loanAvailabilitybyManagerPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:Charts And Graph page break");
		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),
			"Signed in Successfully");

		// Step1:select the client from the drop down list
		String ClientData = "ABLPAGEBREAKAUTOMATION";
		Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(
			ClientData));
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"Step1:Successful clicked client from the dropdown list");

		// Step2:navigate to ABL File upload screen
		ChartsGraphsPageNavigation ChartsGraphsPageNavigation = cyncHomePage.getCyncMenus().loanAvailabilitybyManagerPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");
		
		
		Assert.assertTrue(ChartsGraphsPageNavigation.loanAvailabilitybyManagerPageHeader());
		ExtentTestManager.getTest().log(LogStatus.PASS,
				"Successful verified breadcrumb");
		

	    }
	 
	 
	 @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  loan Availability by Client Page")
	    public void loanAvailabilitybyClientPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:Charts And Graph page break");
		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),
			"Signed in Successfully");

		// Step1:select the client from the drop down list
		String ClientData = "ABLPAGEBREAKAUTOMATION";
		Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(
			ClientData));
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"Step1:Successful clicked client from the dropdown list");

		// Step2:navigate to ABL File upload screen
		ChartsGraphsPageNavigation ChartsGraphsPageNavigation = cyncHomePage.getCyncMenus().loanAvailabilitybyClientPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");
	
		
		Assert.assertTrue(ChartsGraphsPageNavigation.loanAvailabilitybyClientPageHeader());
		ExtentTestManager.getTest().log(LogStatus.PASS,
				"Successful verified breadcrumb");
		

	    }
	 
	 @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  top 10 AR Concentrations by Client Page")
	    public void top10ARConcentrationsbyClientPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:Charts And Graph page break");
		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),
			"Signed in Successfully");

		// Step1:select the client from the drop down list
		String ClientData = "ABLPAGEBREAKAUTOMATION";
		Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(
			ClientData));
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"Step1:Successful clicked client from the dropdown list");

		// Step2:navigate to ABL File upload screen
		ChartsGraphsPageNavigation ChartsGraphsPageNavigation = cyncHomePage.getCyncMenus().top10ARConcentrationsbyClientPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");
		
		
		Assert.assertTrue(ChartsGraphsPageNavigation.loanAvailabilitybyClientPageHeader());
		ExtentTestManager.getTest().log(LogStatus.PASS,
				"Successful verified breadcrumb");
		

	    }
	 
	 @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  top 10 AP Concentrations by Client Page")
	    public void top10APConcentrationsbyClientPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:Charts And Graph page break");
		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),
			"Signed in Successfully");

		// Step1:select the client from the drop down list
		String ClientData = "ABLPAGEBREAKAUTOMATION";
		Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(
			ClientData));
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"Step1:Successful clicked client from the dropdown list");

		// Step2:navigate to ABL File upload screen
		ChartsGraphsPageNavigation ChartsGraphsPageNavigation = cyncHomePage.getCyncMenus().top10APConcentrationsbyClientPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");
		
		Assert.assertTrue(ChartsGraphsPageNavigation.loanAvailabilitybyClientPageHeader());
		ExtentTestManager.getTest().log(LogStatus.PASS,
				"Successful verified breadcrumb");
		

	    }
	 
	 @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  AR AP Comparison by Client Page")
	    public void ARAPComparisonbyClientPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:Charts And Graph page break");
		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),
			"Signed in Successfully");

		// Step1:select the client from the drop down list
		String ClientData = "ABLPAGEBREAKAUTOMATION";
		Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(
			ClientData));
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"Step1:Successful clicked client from the dropdown list");

		// Step2:navigate to ABL File upload screen
		ChartsGraphsPageNavigation ChartsGraphsPageNavigation = cyncHomePage.getCyncMenus().ARAPComparisonbyClientPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");
	
		
		Assert.assertTrue(ChartsGraphsPageNavigation.loanAvailabilitybyClientPageHeader());
		ExtentTestManager.getTest().log(LogStatus.PASS,
				"Successful verified breadcrumb");
		

	    }
	 
	 
	 @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  BBC Ineligibles by Client Page")
	    public void BBCIneligiblesbyClientPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:Charts And Graph page break");
		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),
			"Signed in Successfully");

		// Step1:select the client from the drop down list
		String ClientData = "ABLPAGEBREAKAUTOMATION";
		Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(
			ClientData));
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"Step1:Successful clicked client from the dropdown list");

		// Step2:navigate to ABL File upload screen
		ChartsGraphsPageNavigation ChartsGraphsPageNavigation = cyncHomePage.getCyncMenus().BBCIneligiblesbyClientPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

		
		Assert.assertTrue(ChartsGraphsPageNavigation.loanAvailabilitybyClientPageHeader());
		ExtentTestManager.getTest().log(LogStatus.PASS,
				"Successful verified breadcrumb");
		

	    }
	 
	 
	 @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  receivable BBC aging by Client Page")
	    public void receivableBBCagingbyClientPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:Charts And Graph page break");
		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),
			"Signed in Successfully");

		// Step1:select the client from the drop down list
		String ClientData = "ABLPAGEBREAKAUTOMATION";
		Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(
			ClientData));
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"Step1:Successful clicked client from the dropdown list");

		// Step2:navigate to ABL File upload screen
		ChartsGraphsPageNavigation ChartsGraphsPageNavigation = cyncHomePage.getCyncMenus().receivableBBCagingbyClientPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");
		
		Assert.assertTrue(ChartsGraphsPageNavigation.receivableBBCagingbyClientPageHeader());
		ExtentTestManager.getTest().log(LogStatus.PASS,
				"Successful verified breadcrumb");
		

	    }
	 
	 
	 @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  receivable Spreads by Year Page")
	    public void receivableSpreadsbyYearPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:Charts And Graph page break");
		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),
			"Signed in Successfully");

		// Step1:select the client from the drop down list
		String ClientData = "ABLPAGEBREAKAUTOMATION";
		Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(
			ClientData));
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"Step1:Successful clicked client from the dropdown list");

		// Step2:navigate to ABL File upload screen
		ChartsGraphsPageNavigation ChartsGraphsPageNavigation = cyncHomePage.getCyncMenus().receivableSpreadsbyYearPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");
		
		Assert.assertTrue(ChartsGraphsPageNavigation.receivableSpreadsbyYearPageHeader());
		ExtentTestManager.getTest().log(LogStatus.PASS,
				"Successful verified breadcrumb");
		

	    }
	 
	 
	 @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  payable Spreads by Year Page")
	    public void payableSpreadsbyYearPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:Charts And Graph page break");
		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),
			"Signed in Successfully");

		// Step1:select the client from the drop down list
		String ClientData = "ABLPAGEBREAKAUTOMATION";
		Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(
			ClientData));
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"Step1:Successful clicked client from the dropdown list");

		// Step2:navigate to ABL File upload screen
		ChartsGraphsPageNavigation ChartsGraphsPageNavigation = cyncHomePage.getCyncMenus().payableSpreadsbyYearPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");
		
		Assert.assertTrue(ChartsGraphsPageNavigation.payableSpreadsbyYearPageHeader());
		ExtentTestManager.getTest().log(LogStatus.PASS,
				"Successful verified breadcrumb");
		

	    }
	 
	 
	 @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  receivable Aging by Client Page")
	    public void receivableAgingbyClientPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:Charts And Graph page break");
		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),
			"Signed in Successfully");

		// Step1:select the client from the drop down list
		String ClientData = "ABLPAGEBREAKAUTOMATION";
		Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(
			ClientData));
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"Step1:Successful clicked client from the dropdown list");

		// Step2:navigate to ABL File upload screen
		ChartsGraphsPageNavigation ChartsGraphsPageNavigation = cyncHomePage.getCyncMenus().receivableAgingbyClientPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

		Assert.assertTrue(ChartsGraphsPageNavigation.receivableAgingbyClientPageHeader());
		ExtentTestManager.getTest().log(LogStatus.PASS,
				"Successful verified breadcrumb");
		

	    }
	 
	 
	 @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  BBC Availability by Client Page")
	    public void BBCAvailabilitybyClientPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:Charts And Graph page break");
		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),
			"Signed in Successfully");

		// Step1:select the client from the drop down list
		String ClientData = "ABLPAGEBREAKAUTOMATION";
		Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(
			ClientData));
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"Step1:Successful clicked client from the dropdown list");

		// Step2:navigate to ABL File upload screen
		ChartsGraphsPageNavigation ChartsGraphsPageNavigation = cyncHomePage.getCyncMenus().BBCAvailabilitybyClientPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");
		
		Assert.assertTrue(ChartsGraphsPageNavigation.BBCAvailabilitybyClientPageHeader());
		ExtentTestManager.getTest().log(LogStatus.PASS,
				"Successful verified breadcrumb");
		

	    }
	 
	 
	 
	 @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  AR Stats Dilution on Sales Page")
	    public void ARStatsDilutiononSalesPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:Charts And Graph page break");
		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),
			"Signed in Successfully");

		// Step1:select the client from the drop down list
		String ClientData = "ABLPAGEBREAKAUTOMATION";
		Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(
			ClientData));
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"Step1:Successful clicked client from the dropdown list");

		// Step2:navigate to ABL File upload screen
		ChartsGraphsPageNavigation ChartsGraphsPageNavigation = cyncHomePage.getCyncMenus().ARStatsDilutiononSalesPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");
		
		Assert.assertTrue(ChartsGraphsPageNavigation.ARStatsDilutiononSalesPageHeader());
		ExtentTestManager.getTest().log(LogStatus.PASS,
				"Successful verified breadcrumb");
		

	    }
	 
	 
	 
	 
	 
}
