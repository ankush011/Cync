package com.cync.ABLPageBreak;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.cync.base.BaseTest;
import com.cync.base.ExtentTestManager;
import com.cync.pages.CyncHomePage;
import com.cync.pages.LoginPage;
import com.cync.utility.TestGroups;
import com.relevantcodes.extentreports.LogStatus;

public class Adminpagebreak extends BaseTest {
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Administration:Verify the navigation to Basic Details Screen")
	public void navigateBasicDetails() {

		ExtentTestManager.getTest().getTest().setName("Administration:Verify the navigation to Basic Details Screen");
		ExtentTestManager.getTest().assignCategory("Module:Administration");

		LoginPage loginPage = new LoginPage(driver);
		
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");

		AdministrationPageBreak admin=cyncHomePage.getCyncMenus().openBasicDetailsPageBreak();
		ExtentTestManager.getTest().log(LogStatus.PASS,"navigate to Basic Details");
		
		String basicHeader = "Basic Details";
		Assert.assertEquals(admin.verifyBasicDetailsHeader(basicHeader),basicHeader);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified header",basicHeader);

	}
	
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Administration:Verify the navigation to Bank Details Screen")
	public void navigateBankDetails() {

		ExtentTestManager.getTest().getTest().setName("Administration:Verify the navigation to Bank Details Screen");
		ExtentTestManager.getTest().assignCategory("Module:Administration");

		LoginPage loginPage = new LoginPage(driver);
		
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");

		//cyncHomePage.getCyncMenus().openBankDetails();
		
		
		
		AdministrationPageBreak admin=cyncHomePage.getCyncMenus().openBankDetailsPageBreak();
		ExtentTestManager.getTest().log(LogStatus.PASS,"navigate to Bank Details");
		
		String bankHeader = "Bank Details";
		Assert.assertEquals(admin.verifyBankDetailsHeader(bankHeader),bankHeader);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified header",bankHeader);
	}
	
	

	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Administration:Verify the navigation to IP Addess Setup Screen")
	public void navigateToIPAddessSetup() {

		ExtentTestManager.getTest().getTest().setName("Administration:Verify the navigation to IP Addess Setup Screen");
		ExtentTestManager.getTest().assignCategory("Module:Administration");

		LoginPage loginPage = new LoginPage(driver);
		
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");

		AdministrationPageBreak admin=cyncHomePage.getCyncMenus().openIPAddessSetUp();
		ExtentTestManager.getTest().log(LogStatus.PASS,"navigate to IP Addess Setup");
		
		String ipHeader = "IP Address Setup - Summary";
		Assert.assertEquals(admin.verifyIPAddessSetupHeader(ipHeader),ipHeader);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified header",ipHeader);
	}
	
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Administration:Verify the navigation to Sales region Screen")
	public void navigateToSalesRegion() {

		ExtentTestManager.getTest().getTest().setName("Administration:Verify the navigation to Sales region Screen");
		ExtentTestManager.getTest().assignCategory("Module:Administration");

		LoginPage loginPage = new LoginPage(driver);
		
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");

		AdministrationPageBreak admin=cyncHomePage.getCyncMenus().openSalesRegionPageBreak();
		ExtentTestManager.getTest().log(LogStatus.PASS,"navigate to  Sales Regions");
		
		String salesregionHeader = " Sales Regions";
		Assert.assertEquals(admin.verifySalesRegionHeader(salesregionHeader),salesregionHeader);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified header",salesregionHeader);
	}
	
	

	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Administration:Verify the navigation to NAICS Codes Screen")
	public void navigateToNAICSCodes() {

		ExtentTestManager.getTest().getTest().setName("Administration:Verify the navigation to NAICS Codes Screen");
		ExtentTestManager.getTest().assignCategory("Module:Administration");

		LoginPage loginPage = new LoginPage(driver);
		
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");

		AdministrationPageBreak admin=cyncHomePage.getCyncMenus().openNAICSCodes();
		ExtentTestManager.getTest().log(LogStatus.PASS,"navigate to  NAICS Codes");
		
		String naicsCodesHeader = "NAICS Codes Summary";
		Assert.assertEquals(admin.verifyNAICSCodesHeader(naicsCodesHeader),naicsCodesHeader);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified header",naicsCodesHeader);
	}
	
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Administration:Verify the navigation to Comment Types Screen")
	public void navigateToCommentTypes() {

		ExtentTestManager.getTest().getTest().setName("Administration:Verify the navigation to Comment Types Screen");
		ExtentTestManager.getTest().assignCategory("Module:Administration");

		LoginPage loginPage = new LoginPage(driver);
		
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");

		AdministrationPageBreak admin=cyncHomePage.getCyncMenus().openCommentsTypePageBreak();
		ExtentTestManager.getTest().log(LogStatus.PASS,"navigate to  NAICS Codes");
		
		String commentsHeader = "Comments Type Summary";
		Assert.assertEquals(admin.verifyCommentTypesHeader(commentsHeader), commentsHeader);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified header",commentsHeader);
	}
	
	

	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Administration:Verify the navigation to System Parameters Screen")
	public void navigateToSystemParameters() {

		ExtentTestManager.getTest().getTest().setName("Administration:Verify the navigation to System Parameters Screen");
		ExtentTestManager.getTest().assignCategory("Module:Administration");

		LoginPage loginPage = new LoginPage(driver);
		
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");

		AdministrationPageBreak admin=cyncHomePage.getCyncMenus().openSystemParametersPageBreak();
		ExtentTestManager.getTest().log(LogStatus.PASS,"navigate to  System Parameters");
		
		String systemParametersHeader = "System Parameters Summary";
		Assert.assertEquals(admin.verifySystemParametersHeader(systemParametersHeader), systemParametersHeader);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified header",systemParametersHeader);
	}
	
	
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Administration:Verify the navigation to Adjustment Reasons Screen")
	public void navigateToAdjustmentReasons() {

		ExtentTestManager.getTest().getTest().setName("Administration:Verify the navigation to Adjustment Reasons Screen");
		ExtentTestManager.getTest().assignCategory("Module:Administration");

		LoginPage loginPage = new LoginPage(driver);
		
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");

		AdministrationPageBreak admin=cyncHomePage.getCyncMenus().openAdjustmentReasons();
		ExtentTestManager.getTest().log(LogStatus.PASS,"navigate to  Adjustment Reasons");
		
		String adjustmentReasonsHeader = "Adjustment Reasons";
		Assert.assertEquals(admin.verifyAdjustmentReasonsHeader(adjustmentReasonsHeader), adjustmentReasonsHeader);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified header",adjustmentReasonsHeader);
	}
	
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Administration:Verify the navigation to Interest Calendar Screen")
	public void navigateToInterestCalendar() {

		ExtentTestManager.getTest().getTest().setName("Administration:Verify the navigation to Interest Calendar Screen");
		ExtentTestManager.getTest().assignCategory("Module:Administration");

		LoginPage loginPage = new LoginPage(driver);
		
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");

		AdministrationPageBreak admin=cyncHomePage.getCyncMenus().openInterestCalendar();
		ExtentTestManager.getTest().log(LogStatus.PASS,"navigate to Interest Calendar");
		
		String interestCalendarHeader = "Interest Calendar  | ";
		Assert.assertEquals(admin.verifyInterestCalendarHeader(interestCalendarHeader), interestCalendarHeader);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified header",interestCalendarHeader);
	}
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Administration:Verify the navigation to content Screen")
	public void navigateToContent() {

		ExtentTestManager.getTest().getTest().setName("Administration:Verify the navigation to content Screen");
		ExtentTestManager.getTest().assignCategory("Module:Administration");

		LoginPage loginPage = new LoginPage(driver);
		
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");

		AdministrationPageBreak admin=cyncHomePage.getCyncMenus().openContentPagePageBreak();
		ExtentTestManager.getTest().log(LogStatus.PASS,"navigate to  Content");
		
		String contentHeader = "Content";
		Assert.assertEquals(admin.verifyContentHeader(contentHeader), contentHeader);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified header",contentHeader);
	}
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Administration:Verify the navigation to Report Templates Screen")
	public void navigateToReportTemplates() {

		ExtentTestManager.getTest().getTest().setName("Administration:Verify the navigation to Report Templates Screen");
		ExtentTestManager.getTest().assignCategory("Module:Administration");

		LoginPage loginPage = new LoginPage(driver);
		
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");

		AdministrationPageBreak admin=cyncHomePage.getCyncMenus().openReportTemplates();
		ExtentTestManager.getTest().log(LogStatus.PASS,"navigate to Report Templates");
		
		String reportHeader = "Report Templates";
		Assert.assertEquals(admin.verifyReportTemplateHeader(reportHeader), reportHeader);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified header",reportHeader);
	}
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Administration:Verify the navigation to Currency Code Screen")
	public void navigateToCurrencyCode() {

		ExtentTestManager.getTest().getTest().setName("Administration:Verify the navigation to Currency Code Screen");
		ExtentTestManager.getTest().assignCategory("Module:Administration");

		LoginPage loginPage = new LoginPage(driver);
		
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");

		AdministrationPageBreak admin=cyncHomePage.getCyncMenus().openCurrencyCode();
		ExtentTestManager.getTest().log(LogStatus.PASS,"navigate to Currency Code");
		
		String currencyHeader = "Currency Code";
		Assert.assertEquals(admin.verifyCurrencyCodeHeader(currencyHeader), currencyHeader);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified header",currencyHeader);
	}
	
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Administration:Verify the navigation to user list Screen")
	public void navigateToUserList() {

		ExtentTestManager.getTest().getTest().setName("Administration:Verify the navigation to user list Screen");
		ExtentTestManager.getTest().assignCategory("Module:Administration");

		LoginPage loginPage = new LoginPage(driver);
		
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");

		AdministrationPageBreak admin=cyncHomePage.getCyncMenus().openUserList();
		ExtentTestManager.getTest().log(LogStatus.PASS,"navigate to User List");
		
		String userListHeader = "User List";
		Assert.assertEquals(admin.verifyUserListHeader(userListHeader), userListHeader);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified header",userListHeader);
	}
	
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Administration:Verify the navigation to Roles Permissions Screen")
	public void navigateToRolesPermissions() {

		ExtentTestManager.getTest().getTest().setName("Administration:Verify the navigation to Roles Permissions Screen");
		ExtentTestManager.getTest().assignCategory("Module:Administration");

		LoginPage loginPage = new LoginPage(driver);
		
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");

		AdministrationPageBreak admin=cyncHomePage.getCyncMenus().openRolesPermission();
		ExtentTestManager.getTest().log(LogStatus.PASS,"navigate to Roles & Permissions");
		
		String rolesHeader = "Roles & Permissions";
		Assert.assertEquals(admin.verifyRolesPermissionHeader(rolesHeader), rolesHeader);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified header",rolesHeader);
	}
	
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Administration:Verify the navigation to Client Assignment Screen")
	public void navigateToClientAssignment() {

		ExtentTestManager.getTest().getTest().setName("Administration:Verify the navigation to Client Assignment Screen");
		ExtentTestManager.getTest().assignCategory("Module:Administration");

		LoginPage loginPage = new LoginPage(driver);
		
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");

		AdministrationPageBreak admin=cyncHomePage.getCyncMenus().openClientAssignment();
		ExtentTestManager.getTest().log(LogStatus.PASS,"navigate to Client Assignment");
		
		String clientHeader = "Client Assignment";
		Assert.assertEquals(admin.verifyClientAssignmentHeader(clientHeader), clientHeader);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified header",clientHeader);
	}
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Administration:Verify the navigation to User Defined Field Screen")
	public void navigateToUserDefinedField() {

		ExtentTestManager.getTest().getTest().setName("Administration:Verify the navigation to User Defined Field Screen");
		ExtentTestManager.getTest().assignCategory("Module:Administration");

		LoginPage loginPage = new LoginPage(driver);
		
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");

		AdministrationPageBreak admin=cyncHomePage.getCyncMenus().openUserDefinedFieldPageBreak();
		
		String userHeader = "User Defined Field";
		Assert.assertEquals(admin.verifyUserDefinedFieldHeader(userHeader), userHeader);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified header",userHeader);
	}
	
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Administration:Verify the navigation to Audit Logs Screen")
	public void navigateToAuditLogs() {

		ExtentTestManager.getTest().getTest().setName("Administration:Verify the navigation to Audit Logs Screen");
		ExtentTestManager.getTest().assignCategory("Module:Administration");

		LoginPage loginPage = new LoginPage(driver);
		
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");

		AdministrationPageBreak admin=cyncHomePage.getCyncMenus().openAuditLogsPageBreak();
		ExtentTestManager.getTest().log(LogStatus.PASS,"navigate to Audit Logs"); 
		
		String auditHeader = "Audit Logs";
		Assert.assertEquals(admin.verifyAuditLogsHeader(auditHeader), auditHeader);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified header",auditHeader);
	}
	
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Administration:Verify the navigation to Automated Task Logs Screen")
	public void navigateToAutomatedTaskLogs() {

		ExtentTestManager.getTest().getTest().setName("Administration:Verify the navigation to Automated Task Logs Screen");
		ExtentTestManager.getTest().assignCategory("Module:Administration");

		LoginPage loginPage = new LoginPage(driver);
		
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");

		AdministrationPageBreak admin=cyncHomePage.getCyncMenus().openAutomatedTaskLogsPageBreak();
		ExtentTestManager.getTest().log(LogStatus.PASS,"navigate to Automated Task Logs"); 
		
		String automatedTaskHeader = "Automated Task Logs";
		Assert.assertEquals(admin.verifyAutomatedTaskLogsHeader(automatedTaskHeader), automatedTaskHeader);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified header",automatedTaskHeader);
	}
	
	

	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Administration:Verify the navigation to Notification Logs Screen")
	public void navigateToNotificationLogs() {

		ExtentTestManager.getTest().getTest().setName("Administration:Verify the navigation to Notification Logs Screen");
		ExtentTestManager.getTest().assignCategory("Module:Administration");

		LoginPage loginPage = new LoginPage(driver);
		
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");

		AdministrationPageBreak admin=cyncHomePage.getCyncMenus().openNotificationLogsPageBreak();
		ExtentTestManager.getTest().log(LogStatus.PASS,"navigate to Notification Logs"); 
		
		String notificationHeader = "Notification Logs";
		Assert.assertEquals(admin.verifyNotificationLogsHeader(notificationHeader), notificationHeader);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified header",notificationHeader);
	}
	
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Administration:Verify the navigation to Notification Settings Screen")
	public void navigateToNotificationSettings() {

		ExtentTestManager.getTest().getTest().setName("Administration:Verify the navigation to Notification Settings Screen");
		ExtentTestManager.getTest().assignCategory("Module:Administration");

		LoginPage loginPage = new LoginPage(driver);
		
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");

		AdministrationPageBreak admin=cyncHomePage.getCyncMenus().openNotificationSettingsPageBreak();
		ExtentTestManager.getTest().log(LogStatus.PASS,"navigate to Notification Settings"); 
		
		String notificationSettingsHeader = "Notification Settings";
		Assert.assertEquals(admin.verifyNotificationSettingsHeader(notificationSettingsHeader), notificationSettingsHeader);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified header",notificationSettingsHeader);
	}
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Administration:Verify the navigation to Templates Screen")
	public void navigateToTemplates() {

		ExtentTestManager.getTest().getTest().setName("Administration:Verify the navigation to Templates Screen");
		ExtentTestManager.getTest().assignCategory("Module:Administration");

		LoginPage loginPage = new LoginPage(driver);
		
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");

		AdministrationPageBreak admin=cyncHomePage.getCyncMenus().openTemplatePageBreak();
		ExtentTestManager.getTest().log(LogStatus.PASS,"navigate to Templates"); 
		
		String notificationSettingsHeader = "Notification Settings";
		Assert.assertEquals(admin.verifyNotificationSettingsHeader(notificationSettingsHeader), notificationSettingsHeader);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step2:Successfully verified header",notificationSettingsHeader);
	}

	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

