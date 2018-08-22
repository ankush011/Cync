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

public class CashApplicationPageBreakTC extends BaseTest {
    
    

    @Test( groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "cash application page break:Cash Receipt Source Codes ")
    public void CashReceiptSourceCodesPageBreak() 
    
    {
	ExtentTestManager.getTest().getTest()
		.setName("cash application page break:Cash Receipt Source Codes ");
	ExtentTestManager.getTest().assignCategory("Module:cash application page break");
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

	// Step2:navigate to Cash Receipt Source Codes screen
	CashApplicationPageBreak batchcash = cyncHomePage.getCyncMenus().openCashReceiptSourceCodesPageBreak();
	ExtentTestManager.getTest().log(LogStatus.PASS,"// Step2:navigate to Cash Receipt Source Codes screen");

	// Step3:verify the header for  Cash Receipt Source Codes screen
	String expected="Cash Receipt Source Codes";
	Assert.assertTrue(batchcash.CasReceiptSourceCodesPageHeader(expected));
	ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step3:verify the header for Cash Receipt Source Codes");
	
	
    }
    
    @Test( groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "cash application page break:Unprocessed Checks")
    public void unprocessedChecksPageBreak() 
    
    {
	ExtentTestManager.getTest().getTest()
		.setName("cash application page break:Unprocessed Checks");
	ExtentTestManager.getTest().assignCategory("Module:cash application page break");
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

	// Step2:navigate to Cash Receipt Source Codes screen
	CashApplicationPageBreak batchcash = cyncHomePage.getCyncMenus().openUnprocessedChecksPageBreak();
	ExtentTestManager.getTest().log(LogStatus.PASS,"// Step2:navigate to Cash Receipt Source Codes screen");

	// Step3:verify the header for  Cash Receipt Source Codes screen
	String expected="Unprocessed checks";
	Assert.assertTrue(batchcash.UnprocessedChecksPageHeader(expected));
	ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step3:verify the header for Cash Receipt Source Codes");
	
	
    }
    
    
    @Test( groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "cash application page break:Batch Cash Receipts Entry ")
    public void BatchCashReceiptsEntryPageBreak() 
    
    {
	ExtentTestManager.getTest().getTest()
		.setName("cash application page break:Batch Cash Receipts Entry ");
	ExtentTestManager.getTest().assignCategory("Module:cash application page break");
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

	// Step2:navigate to Batch Cash Receipts Entry screen
	CashApplicationPageBreak batchcash = cyncHomePage.getCyncMenus().openBatchCashPageBreak();
	ExtentTestManager.getTest().log(LogStatus.PASS,"// Step2:navigate to Batch Cash Receipts Entry screen");

	// Step3:verify the header for  Batch Cash Receipts Entry screen
	String expected="Batch Cash Receipts Entry";
	Assert.assertTrue(batchcash.BatchCashReceiptsEntryPageHeader(expected));
	ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step3:verify the header for Batch Cash Receipts Entry");
	
	
    }
    
    @Test( groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "cash application page break:Check Register")
    public void CheckRegisterPageBreak() 
    
    {
	ExtentTestManager.getTest().getTest()
		.setName("cash application page break:Check Register");
	ExtentTestManager.getTest().assignCategory("Module:cash application page break");
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

	// Step2:navigate to Check Register screen
	CashApplicationPageBreak batchcash = cyncHomePage.getCyncMenus().openCheckRegisterPageBreak();
	ExtentTestManager.getTest().log(LogStatus.PASS,"// Step2:navigate to Check Register screen");

	// Step3:verify the header for  Check Register screen
	String expected="Check Register";
	Assert.assertTrue(batchcash.CheckRegisterPageHeader(expected));
	ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step3:verify the header for Check Register");
	
}
    
    @Test( groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "cash application page break:Batch Process")
    public void BatchProcessPageBreak() 
    
    {
	ExtentTestManager.getTest().getTest()
		.setName("cash application page break:Batch Process");
	ExtentTestManager.getTest().assignCategory("Module:cash application page break");
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

	// Step2:navigate to Batch Process screen
	CashApplicationPageBreak batchcash = cyncHomePage.getCyncMenus().openBatchProcessPageBreak();
	ExtentTestManager.getTest().log(LogStatus.PASS,"// Step2:navigate to Batch Process screen");

	// Step3:verify the header for  Batch Process screen
	String expected="Batch Process";
	Assert.assertTrue(batchcash.BatchProcessPageHeader(expected));
	ExtentTestManager.getTest().log(LogStatus.PASS,"// Step3:verify the header for Batch Process");
	
}
    
    
    @Test( groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "cash application page break:Cash Receipt History ")
    public void  CashReceiptHistoryPageBreak() 
    
    {
	ExtentTestManager.getTest().getTest()
		.setName("cash application page break:Cash Receipt History ");
	ExtentTestManager.getTest().assignCategory("Module:cash application page break");
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

	// Step2:navigate to  Cash Receipt History  screen
	CashApplicationPageBreak batchcash = cyncHomePage.getCyncMenus().openCashReceiptHistoryPageBreak();
	ExtentTestManager.getTest().log(LogStatus.PASS,"// Step2:navigate to  Cash Receipt History  screen");

	// Step3:verify the header for   Cash Receipt History  screen
	String expected="Cash Receipt History";
	Assert.assertTrue(batchcash.CashReceiptHistoryPageHeader(expected));
	ExtentTestManager.getTest().log(LogStatus.PASS,"// Step3:verify the header for  Cash Receipt History ");
}
    
    @Test( groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "cash application page break:Daily Cash Posting")
    public void DailyCashPostingPageBreak() 
    
    {
	ExtentTestManager.getTest().getTest()
		.setName("cash application page break:Daily Cash Posting");
	ExtentTestManager.getTest().assignCategory("Module:cash application page break");
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

	// Step2:navigate to Daily Cash Posting screen
	CashApplicationPageBreak batchcash = cyncHomePage.getCyncMenus().openDailyCashPostingPageBreak();
	ExtentTestManager.getTest().log(LogStatus.PASS,"// Step2:navigate to Batch Process screen");

	// Step3:verify the header for  Daily Cash Posting screen
	String expected="Daily Cash Posting";
	Assert.assertTrue(batchcash.DailyCashPostingPageHeader(expected));
	ExtentTestManager.getTest().log(LogStatus.PASS,"// Step3:verify the header for Batch Process");
}
    
    
    
    @Test( groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "cash application page break:Daily Cash Transaction Reporting")
    public void DailyCashTransactionReportingPageBreak() 
    
    {
	ExtentTestManager.getTest().getTest()
		.setName("cash application page break:Daily Cash Transaction Reporting");
	ExtentTestManager.getTest().assignCategory("Module:cash application page break");
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

	// Step2:navigate to Daily Cash Transaction Reporting screen
	CashApplicationPageBreak batchcash = cyncHomePage.getCyncMenus().openDailyCashTransactionReportingPageBreak();
	ExtentTestManager.getTest().log(LogStatus.PASS,"// Step2:navigate to Batch Process screen");

	
	// Step3:verify the header for  Daily Cash Transaction Reporting screen
	String expected="Daily Cash Transaction Reporting";
	Assert.assertTrue(batchcash.DailyCashTransactionReportingPageHeader(expected));
	ExtentTestManager.getTest().log(LogStatus.PASS,"// Step3:verify the header for Batch Process");
}
    
    
    @Test( groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "cash application page break:Credit Memo")
    public void CreditMemoPageBreak() 
    
    {
	ExtentTestManager.getTest().getTest()
		.setName("cash application page break:Credit Memo");
	ExtentTestManager.getTest().assignCategory("Module:cash application page break");
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

	// Step2:navigate to Credit Memo screen
	CashApplicationPageBreak batchcash = cyncHomePage.getCyncMenus().openCreditMemoPageBreak();
	ExtentTestManager.getTest().log(LogStatus.PASS,"// Step2:navigate to Credit Memo screen");

	// Step3:verify the header for  Credit Memo screen
	String expected="Credit Memo";
	Assert.assertTrue(batchcash.CreditMemoPageHeader(expected),expected);
	ExtentTestManager.getTest().log(LogStatus.PASS,"// Step3:verify the header for Credit Memo");
}
    
    
    @Test( groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "cash application page break:Credit Memo History")
    public void CreditMemoHistoryPageBreak() 
    
    {
	ExtentTestManager.getTest().getTest()
		.setName("cash application page break:Credit Memo History");
	ExtentTestManager.getTest().assignCategory("Module:cash application page break");
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

	// Step2:navigate to Credit Memo History screen
	CashApplicationPageBreak batchcash = cyncHomePage.getCyncMenus().openCreditMemoHistoryPageBreak();
	ExtentTestManager.getTest().log(LogStatus.PASS,"// Step2:navigate to Credit Memo screen");

	// Step3:verify the header for  Credit Memo History screen
	String expected="Credit Memo History";
	Assert.assertTrue(batchcash.CreditMemoHistoryPageHeader(expected));
	ExtentTestManager.getTest().log(LogStatus.PASS,"// Step3:verify the header for Credit Memo");
}
}