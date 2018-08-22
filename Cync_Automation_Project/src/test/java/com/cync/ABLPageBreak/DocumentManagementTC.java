package com.cync.ABLPageBreak;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cync.base.BaseTest;
import com.cync.base.ExtentTestManager;
import com.cync.pages.CyncHomePage;
import com.cync.pages.LoginPage;
import com.cync.utility.TestGroups;
import com.relevantcodes.extentreports.LogStatus;

public class DocumentManagementTC extends BaseTest {

    @Test( groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Document Management page Break")
    public void DocumentManagementPageBreak() 
    
    {
	ExtentTestManager.getTest().getTest()
		.setName("Document Management page Break");
	ExtentTestManager.getTest().assignCategory("Module:Document Management");
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

	// Step2:navigate to Document Management page Break screen
	DocumentManagementPageBreak DocumentManagement = cyncHomePage.getCyncMenus().openDocumentManagementPageBreak();
	ExtentTestManager.getTest().log(LogStatus.PASS,"// Step2:navigate to Document Management screen");

	// Step3:verify the header for  Document Management screen
	String expected="Document Management";
	Assert.assertTrue(DocumentManagement.DocumentManagementPageHeader(expected));
	ExtentTestManager.getTest().log(LogStatus.PASS,
			"// Step3:verify the header for Document Management");
	
	
    }
    
}
