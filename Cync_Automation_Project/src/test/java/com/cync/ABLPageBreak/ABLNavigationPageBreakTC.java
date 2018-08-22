package com.cync.ABLPageBreak;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cync.base.BaseTest;
import com.cync.base.ExtentTestManager;
import com.cync.pages.ABLFileUploadPage;
import com.cync.pages.CyncHomePage;
import com.cync.pages.LoginPage;
import com.cync.utility.TestGroups;
import com.relevantcodes.extentreports.LogStatus;

public class ABLNavigationPageBreakTC extends BaseTest{

	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Page Break:File Upload Navigation")
	    public void FileUploadNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("Page Break:File Upload Navigation");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLFileUploadPage ABLFileUploadPage = cyncHomePage.getCyncMenus()
			.openABLFileUploadsPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");
		
		

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Page Break:BBC Documents")
	    public void BBCDocumentsPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("Page Break:BBC Documents");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().openBBCDocumentsPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Page Break:detail Receivables")
	    public void detailReceivablesPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("Page Break:detail Receivables");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().opendetailReceivablesPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Page Break:summary Receivables")
	    public void summaryReceivablesPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("Page Break:summary Receivables");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().opensummaryReceivablesPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Page Break:detailPayables")
	    public void detailPayablesPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("Page Break:detailPayables");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().opendetailPayablesPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Page Break:summaryPayables")
	    public void summaryPayablesPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("Page Break:summaryPayables");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().opensummaryPayablesPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Page Break:openhistory")
	    public void openhistoryPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("Page Break:openhistory");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().openhistoryPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Page Break:warningPage")
	    public void warningPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("Page Break:warningPage");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().openwarningPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Page Break:opencashReceipts")
	    public void opencashReceiptsPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("Page Break:opencashReceipts");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().opencashReceiptsPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Page Break:BBCstobeApproved")
	    public void BBCstobeApprovedPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("Page Break:BBCstobeApproved");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().BBCstobeApprovedPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Page Break:BBCstobeMovedforfunding")
	    public void BBCstobeMovedforfundingPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("Page Break:BBCstobeMovedforfunding");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().BBCstobeMovedforfundingPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Page Break:BBCstobeFunded")
	    public void BBCstobeFundedPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("Page Break:BBCstobeFunded");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().BBCstobeFundedPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Page Break:BBCstobeProcessed")
	    public void BBCstobeProcessedPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("Page Break:BBCstobeProcessed");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().BBCstobeProcessedPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Page Break:fundRequest")
	    public void fundRequestPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("Page Break:fundRequest");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().fundRequestPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Page Break:BBCReviewData")
	    public void BBCReviewDataPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("Page Break:BBCReviewData");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().BBCReviewDataPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Page Break:receivablesRollforward")
	    public void receivablesRollforwardPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("Page Break:receivablesRollforward");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().receivablesRollforwardPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Page Break:Navigate to  receivable Aging Page")
	    public void receivableAgingPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("Page Break:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().receivableAgingPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Page Break:Navigate to  ineligible Summary Page")
	    public void ineligibleSummaryPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("Page Break:Navigate to  ineligible Summary Page");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().ineligibleSummaryPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Page Break:Navigate to  assets Inventory Page")
	    public void assetsInventoryPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("Page Break:Navigate to  assets Inventory Page");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().assetsInventoryPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  other Collateral Page")
	    public void otherCollateralPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().otherCollateralPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  line Reserves Page")
	    public void lineReservesPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().lineReservesPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  BBC Availability Page")
	    public void BBCAvailabilityPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().BBCAvailabilityPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  BBC Recalculation Process Page")
	    public void BBCRecalculationProcessPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().BBCRecalculationProcessPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  debtors Page")
	    public void debtorsPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().debtorsPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  vendors Page")
	    public void vendorsPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().vendorsPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  contras Page")
	    public void contrasPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().contrasPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  global Accounts Page")
	    public void globalAccountsPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().globalAccountsPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	  
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  parent Assignment Page")
	    public void parentAssignmentPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().parentAssignmentPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  contra Assignment Page")
	    public void contraAssignmentPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().contraAssignmentPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }

	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  debtor Parent Child Relation Page")
	    public void debtorParentChildRelationPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().debtorParentChildRelationPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  vendor Parent Child Relation Page")
	    public void vendorParentChildRelationPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().vendorParentChildRelationPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  data Review History Page")
	    public void dataReviewHistoryPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().dataReviewHistoryPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  data Review History Page")
	    public void BBCDocumentsHistoryPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().BBCDocumentsHistoryPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  detail Receivables History Page")
	    public void detailReceivablesHistoryPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().detailReceivablesHistoryPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  summary Receivables History Page")
	    public void summaryReceivablesHistoryPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().summaryReceivablesHistoryPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	  
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  detail Payables History Page")
	    public void detailPayablesHistoryPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().detailPayablesHistoryPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  summary Payables History Page")
	    public void summaryPayablesHistoryPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().summaryPayablesHistoryPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  assets Inventory History Page")
	    public void assetsInventoryHistoryPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().assetsInventoryHistoryPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	    
	    
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  cash Reciepts History Page")
	    public void cashRecieptsHistoryPagePageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().cashRecieptsHistoryPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  BBC Review Data History Page")
	    public void BBCReviewDataHistoryPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().BBCReviewDataHistoryPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  receivables Rollforward History Page")
	    public void receivablesRollforwardHistoryPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().receivablesRollforwardHistoryPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  receivable Aging History Page")
	    public void receivableAgingHistoryPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().receivableAgingHistoryPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  ineligible Summary History Page")
	    public void ineligibleSummaryHistoryPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().ineligibleSummaryHistoryPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  assets Inventory BBC History Page")
	    public void assetsInventoryBBCHistoryPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().assetsInventoryBBCHistoryPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  other Collateral History Page")
	    public void otherCollateralHistoryPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().otherCollateralHistoryPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  line Reserves History Page")
	    public void lineReservesHistoryPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().lineReservesHistoryPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  BBC Availability History Page")
	    public void BBCAvailabilityHistoryPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().BBCAvailabilityHistoryPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  amend Details History Page")
	    public void amendDetailsHistoryPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().amendDetailsHistoryPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  enter New Sale Invoices Page")
	    public void enterNewSaleInvoicesPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().enterNewSaleInvoicesPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  current Receivables Page")
	    public void currentReceivablesPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().currentReceivablesPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  cash Receipts Page")
	    public void cashReceiptsPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().cashReceiptsPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  borrower Receivables Page")
	    public void borrowerReceivablesPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().borrowerReceivablesPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  unapproved BBCs Page")
	    public void unapprovedBBCsPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().unapprovedBBCsPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  sign BBC Page")
	    public void signBBCPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().signBBCPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  approve BBC Funding Page")
	    public void approveBBCFundingPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().approveBBCFundingPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  fund Release BBC Page")
	    public void fundReleaseBBCPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().fundReleaseBBCPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  ineligibility Reasons Page")
	    public void ineligibilityReasonsPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().ineligibilityReasonsPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  file Classification Summary Page")
	    public void fileClassificationSummaryPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().fileClassificationSummaryPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  exceptions Page")
	    public void exceptionsPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().exceptionsSummaryPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  charge Codes Page")
	    public void chargeCodesPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().chargeCodesPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  interest Rate Codes Page")
	    public void interestRateCodesPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().interestRateCodesPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }

	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  letter Processing Page")
	    public void letterProcessingPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().letterProcessingPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  letter Tracking Page")
	    public void letterTrackingPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().letterTrackingPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  letter Inquiry Page")
	    public void letterInquiryPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().letterInquiryPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  AC Debtor Status Page")
	    public void ACDebtorStatusPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().ACDebtorStatusPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	    
	    
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  ABL GL Setup Page")
	    public void ABLGLSetupPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().ABLGLSetupPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "SUMMARY _006:Navigate to  ABL GL Transactions Page")
	    public void ABLGLTransactionsPageNavigation() {

		ExtentTestManager.getTest().getTest()
			.setName("SUMMARY _006:Navigate to file upload screen");
		ExtentTestManager.getTest().assignCategory("Module:ABL");
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
		ABLPageNavigation ABLPageNavigation = cyncHomePage.getCyncMenus().ABLGLTransactionsPage();
		ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step2:navigate to ABL File upload screen");

	    }
	   
	   
	   
}
