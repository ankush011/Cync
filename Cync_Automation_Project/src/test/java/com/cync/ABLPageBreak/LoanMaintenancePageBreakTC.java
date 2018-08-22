package com.cync.ABLPageBreak;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;


import com.cync.base.BaseTest;
import com.cync.base.ExtentTestManager;
import com.cync.pages.CyncHomePage;
import com.cync.pages.LoginPage;
import com.cync.utility.TestGroups;
import com.relevantcodes.extentreports.LogStatus;

public class LoanMaintenancePageBreakTC extends BaseTest {
	
static final Logger logger = Logger.getLogger(LoginPage.class);
	
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Verify the navigation to the Loan Summary Screen")
	public void navigateToLoanSummaryScreen() {

		ExtentTestManager.getTest().getTest().setName("Verify the navigation to the Loan Summary Screen");
		ExtentTestManager.getTest().assignCategory("Module: Loan Maintenance");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		logger.info("login done moving to next step");
		logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
		
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		
		String clientName ="ABLPAGEBREAKAUTOMATION";
		LoanMaintenancePageBreakTest LoanMaintenance = cyncHomePage.getCyncMenus().openLoanSummaryPage(clientName);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Loan Summary Screen is done sucessfully");
		
		String HeaderData ="Loan Summary";
		Assert.assertTrue(LoanMaintenance.verifyLoanSummaryHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Loan Summary Screen Header is verified sucessfully",HeaderData);
	
	}
	
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Loan Maintenance:Verify the navigation to Collateral Loans Screen")
	public void navigateToCollateralLoans() {

		ExtentTestManager.getTest().getTest().setName("Loan Maintenance:Verify the navigation to Collateral Loans Screen");
		ExtentTestManager.getTest().assignCategory("Module: Loan Maintenance");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		logger.info("login done moving to next step");
		logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
		
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		
		String clientName ="ABLPAGEBREAKAUTOMATION";
		LoanMaintenancePageBreakTest LoanMaintenance = cyncHomePage.getCyncMenus().openCollateralLoansPageBreak(clientName);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Collateral Loans Screen is done sucessfully");
		
		String HeaderData ="Collateral Loans";
		Assert.assertTrue(LoanMaintenance.verifyCollateralLoansHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Collateral Loans Screen Header is verified sucessfully",HeaderData);
	
	}
	
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Loan Maintenance:Verify the navigation to Charge Templates Screen")
	public void navigateToChargeTemplates() {

		ExtentTestManager.getTest().getTest().setName("Loan Maintenance:Verify the navigation to Charge Templates Screen");
		ExtentTestManager.getTest().assignCategory("Module: Loan Maintenance");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		logger.info("login done moving to next step");
		logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
		
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		
		String clientName ="ABLPAGEBREAKAUTOMATION";
		LoanMaintenancePageBreakTest LoanMaintenance = cyncHomePage.getCyncMenus().openChargeTemplatesPageBreak(clientName);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Charge Templates Screen is done sucessfully");
		
		String HeaderData ="Charge Templates";
		Assert.assertTrue(LoanMaintenance.verifyChargeTemplatesHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Charge Templates Screen Header is verified sucessfully",HeaderData);
	
	}
	
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Loan Maintenance:Verify the navigation to Collateral Loan Fee Setup Screen")
	public void navigateToCollateralLoanFeeSetup() {

		ExtentTestManager.getTest().getTest().setName("Loan Maintenance:Verify the navigation to Collateral Loan Fee Setup Screen");
		ExtentTestManager.getTest().assignCategory("Module: Loan Maintenance");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		logger.info("login done moving to next step");
		logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
		
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		
		String clientName ="ABLPAGEBREAKAUTOMATION";
		LoanMaintenancePageBreakTest LoanMaintenance = cyncHomePage.getCyncMenus().openCollateralLoanFeeSetupPageBreak(clientName);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Collateral Loan Fee Setup Screen is done sucessfully");
		
		String HeaderData ="Collateral Loan Fee Setup";
		Assert.assertTrue(LoanMaintenance.verifyCollateralLoanFeeSetupHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Collateral Loan Fee Setup Screen Header is verified sucessfully",HeaderData);
	
	}
	
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Loan Maintenance:Verify the navigation to Process OneTime & Manual Charges Screen")
	public void navigateToProcessOneTimeManualCharges() {

		ExtentTestManager.getTest().getTest().setName("Loan Maintenance:Verify the navigation to Process OneTime & Manual Charges Screen");
		ExtentTestManager.getTest().assignCategory("Module: Loan Maintenance");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		logger.info("login done moving to next step");
		logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
		
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		
		String clientName ="ABLPAGEBREAKAUTOMATION";
		LoanMaintenancePageBreakTest LoanMaintenance = cyncHomePage.getCyncMenus().openProcessOneTimeManualChargesPageBreak(clientName);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Process OneTime & Manual Charges Screen is done sucessfully");
		
		String HeaderData ="Process OneTime & Manual Charges";
		Assert.assertTrue(LoanMaintenance.verifyProcessOneTimeManualChargesHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Process OneTime & Manual Charges Screen Header is verified sucessfully",HeaderData);
	
	}
	
	

	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Loan Maintenance:Verify the navigation to Daily Transaction Reporting Screen")
	public void navigateToDailyTransactionReporting() {

		ExtentTestManager.getTest().getTest().setName("Loan Maintenance:Verify the navigation to Daily Transaction Reporting Screen");
		ExtentTestManager.getTest().assignCategory("Module: Loan Maintenance");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		logger.info("login done moving to next step");
		logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
		
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		
		String clientName ="ABLPAGEBREAKAUTOMATION";
		LoanMaintenancePageBreakTest LoanMaintenance = cyncHomePage.getCyncMenus().openDailyTransactionReportingPageBreak(clientName);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Daily Transaction Reporting Screen is done sucessfully");
		
		String HeaderData ="Daily Transaction Reporting";
		Assert.assertTrue(LoanMaintenance.verifyDailyTransactionReportingHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Daily Transaction Reporting Screen Header is verified sucessfully",HeaderData);
	
	}
	
	

	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Loan Maintenance:Verify the navigation to Interest Recalculation Screen")
	public void navigateToInterestRecalculation() {

		ExtentTestManager.getTest().getTest().setName("Loan Maintenance:Verify the navigation to Interest Recalculation Screen");
		ExtentTestManager.getTest().assignCategory("Module: Loan Maintenance");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		logger.info("login done moving to next step");
		logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
		
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		
		String clientName ="ABLPAGEBREAKAUTOMATION";
		LoanMaintenancePageBreakTest LoanMaintenance = cyncHomePage.getCyncMenus().openInterestRecalculationPageBreak(clientName);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Interest Recalculation Screen is done sucessfully");
		
		String HeaderData ="Interest Recalculation";
		Assert.assertTrue(LoanMaintenance.verifyInterestRecalculationHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Interest Recalculation Screen Header is verified sucessfully",HeaderData);
	
	}
	
	
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Loan Maintenance:Verify the navigation to  Interest Payment Screen")
	public void navigateToInterestPayment() {

		ExtentTestManager.getTest().getTest().setName("Loan Maintenance:Verify the navigation to  Interest Payment Screen");
		ExtentTestManager.getTest().assignCategory("Module: Loan Maintenance");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		logger.info("login done moving to next step");
		logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
		
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		
		String clientName ="ABLPAGEBREAKAUTOMATION";
		LoanMaintenancePageBreakTest LoanMaintenance = cyncHomePage.getCyncMenus().openInterestPaymentPageBreak(clientName);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the  Interest Payment Screen is done sucessfully");
		
		String HeaderData =" Interest Payment ";
		Assert.assertTrue(LoanMaintenance.verifyInterestPaymentHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2: Interest Payment Screen Header is verified sucessfully",HeaderData);
	
	}
	
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Loan Maintenance:Verify the navigation to Interest Payment Recalculation Screen")
	public void navigateToInterestPaymentRecalculation() {

		ExtentTestManager.getTest().getTest().setName("Loan Maintenance:Verify the navigation to Interest Payment Recalculation Screen");
		ExtentTestManager.getTest().assignCategory("Module: Loan Maintenance");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		logger.info("login done moving to next step");
		logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
		
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		
		String clientName ="ABLPAGEBREAKAUTOMATION";
		LoanMaintenancePageBreakTest LoanMaintenance = cyncHomePage.getCyncMenus().openInterestPaymentRecalculationPageBreak(clientName);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the  Interest Payment Screen is done sucessfully");
		
		String HeaderData ="Interest Payment Recalculation";
		Assert.assertTrue(LoanMaintenance.verifyInterestPaymentRecalculationHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Interest Payment Recalculation Screen Header is verified sucessfully",HeaderData);
	
	}
	
	
	

	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Loan Maintenance:Verify the navigation to  Letter of Credits Screen")
	public void navigateToLetterofCredits() {

		ExtentTestManager.getTest().getTest().setName("Loan Maintenance:Verify the navigation to  Letter of Credits Screen");
		ExtentTestManager.getTest().assignCategory("Module: Loan Maintenance");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		logger.info("login done moving to next step");
		logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
		
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		
		String clientName ="ABLPAGEBREAKAUTOMATION";
		LoanMaintenancePageBreakTest LoanMaintenance = cyncHomePage.getCyncMenus().openLetterOfCreditsPageBreak(clientName);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the  Letter of Credits Screen is done sucessfully");
		
		String HeaderData ="Letter of Credits";
		Assert.assertTrue(LoanMaintenance.verifyLetterofCreditsHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Letter of Credits Screen Header is verified sucessfully",HeaderData);
	
	}
	
	

	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Loan Maintenance:Verify the navigation to Payoff Inquiry Screen")
	public void navigateToPayoffInquiry() {

		ExtentTestManager.getTest().getTest().setName("Loan Maintenance:Verify the navigation to Payoff Inquiry Screen");
		ExtentTestManager.getTest().assignCategory("Module: Loan Maintenance");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		logger.info("login done moving to next step");
		logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
		
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		
		String clientName ="ABLPAGEBREAKAUTOMATION";
		LoanMaintenancePageBreakTest LoanMaintenance = cyncHomePage.getCyncMenus().openPayoffInquiryPageBreak(clientName);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the  Payoff Inquiry Screen is done sucessfully");
		
		String HeaderData ="Payoff Inquiry";
		Assert.assertTrue(LoanMaintenance.verifyPayoffInquiryHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Payoff Inquiry Screen Header is verified sucessfully",HeaderData);
	
	}
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Loan Maintenance:Verify the navigation to Auto Process Collateral Loan Settings Screen")
	public void navigateToAutoProcessCollateralLoanSettings() {

		ExtentTestManager.getTest().getTest().setName("Loan Maintenance:Verify the navigation to Auto Process Collateral Loan Settings Screen");
		ExtentTestManager.getTest().assignCategory("Module: Loan Maintenance");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		logger.info("login done moving to next step");
		logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
		
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		
		String clientName ="ABLPAGEBREAKAUTOMATION";
		LoanMaintenancePageBreakTest LoanMaintenance = cyncHomePage.getCyncMenus().openAutoProcessCollateralLoanSettingsPageBreak(clientName);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Auto Process Collateral Loan Settings Screen is done sucessfully");
		
		String HeaderData ="Auto Process Collateral Loan Settings";
		Assert.assertTrue(LoanMaintenance.verifyAutoProcessCollateralLoanSettingsHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Auto Process Collateral Loan Settings Screen Header is verified sucessfully",HeaderData);
	
	}
	
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Loan Maintenance:Verify the navigation to Term Loan Creation  Screen")
	public void navigateToTermLoanCreation() {

		ExtentTestManager.getTest().getTest().setName("Loan Maintenance:Verify the navigation to Term Loan Creation Screen");
		ExtentTestManager.getTest().assignCategory("Module: Loan Maintenance");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		logger.info("login done moving to next step");
		logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
		
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		
		String clientName ="ABLPAGEBREAKAUTOMATION";
		LoanMaintenancePageBreakTest LoanMaintenance = cyncHomePage.getCyncMenus().openTermLoanCreationPageBreak(clientName);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Term Loan Creation Screen is done sucessfully");
		
		String HeaderData ="Term Loan Creation";
		Assert.assertTrue(LoanMaintenance.verifyTermLoanCreationHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Term Loan Creation Screen Header is verified sucessfully",HeaderData);
	
	}
	
	
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Loan Maintenance:Verify the navigation to Term Loan Setup Screen")
	public void navigateToTermLoanSetup() {

		ExtentTestManager.getTest().getTest().setName("Loan Maintenance:Verify the navigation to Term Loan Setup Screen");
		ExtentTestManager.getTest().assignCategory("Module: Loan Maintenance");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		logger.info("login done moving to next step");
		logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
		
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		
		String clientName ="ABLPAGEBREAKAUTOMATION";
		LoanMaintenancePageBreakTest LoanMaintenance = cyncHomePage.getCyncMenus().openTermLoanSetupPageBreak(clientName);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Term Loan Setup Screen is done sucessfully");
		
		String HeaderData ="Term Loan Setup";
		Assert.assertTrue(LoanMaintenance.verifyTermLoanSetupHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Term Loan Setup Screen Header is verified sucessfully",HeaderData);
	
	}
	
	

	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Loan Maintenance:Verify the navigation to Term Loan Collaterals Screen")
	public void navigateToTermLoanCollaterals() {

		ExtentTestManager.getTest().getTest().setName("Loan Maintenance:Verify the navigation to Term Loan Collaterals Screen");
		ExtentTestManager.getTest().assignCategory("Module: Loan Maintenance");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		logger.info("login done moving to next step");
		logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
		
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		
		String clientName ="ABLPAGEBREAKAUTOMATION";
		LoanMaintenancePageBreakTest LoanMaintenance = cyncHomePage.getCyncMenus().openTermLoanCollateralsPageBreak(clientName);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Term Loan Collaterals Screen is done sucessfully");
		
		String HeaderData ="Term Loan Collaterals";
		Assert.assertTrue(LoanMaintenance.verifyTermLoanCollateralsHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Term Loan Collaterals Screen Header is verified sucessfully",HeaderData);
	
	}
	
	

	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Loan Maintenance:Verify the navigation to Term Loans Screen")
	public void navigateToTermLoans() {

		ExtentTestManager.getTest().getTest().setName("Loan Maintenance:Verify the navigation to Term Loans Screen");
		ExtentTestManager.getTest().assignCategory("Module: Loan Maintenance");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		logger.info("login done moving to next step");
		logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
		
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		
		String clientName ="ABLPAGEBREAKAUTOMATION";
		LoanMaintenancePageBreakTest LoanMaintenance = cyncHomePage.getCyncMenus().openTermLoansPageBreak(clientName);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Term Loans Screen is done sucessfully");
		
		String HeaderData ="Term Loans";
		Assert.assertTrue(LoanMaintenance.verifyTermLoansHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Term Loans Screen Header is verified sucessfully",HeaderData);
	
	}

	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Loan Maintenance:Verify the navigation to Credit Line Loan Creation Screen")
	public void navigateToCreditLineLoanCreation() {

		ExtentTestManager.getTest().getTest().setName("Loan Maintenance:Verify the navigation to Credit Line Loan Creation Screen");
		ExtentTestManager.getTest().assignCategory("Module: Loan Maintenance");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		logger.info("login done moving to next step");
		logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
		
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		
		String clientName ="ABLPAGEBREAKAUTOMATION";
		LoanMaintenancePageBreakTest LoanMaintenance = cyncHomePage.getCyncMenus().openCreditLineLoanCreationPageBreak(clientName);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Credit Line Loan Creation Screen is done sucessfully");
		
		String HeaderData ="Credit Line Loan Creation";
		Assert.assertTrue(LoanMaintenance.verifyCreditLineLoanCreationHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Credit Line Loan Creation Screen Header is verified sucessfully",HeaderData);
	
	}


	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Loan Maintenance:Verify the navigation to Credit Line Charges Setup Screen")
	public void navigateToCreditLineChargesSetup() {

		ExtentTestManager.getTest().getTest().setName("Loan Maintenance:Verify the navigation to Credit Line Charges Setup Screen");
		ExtentTestManager.getTest().assignCategory("Module: Loan Maintenance");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		logger.info("login done moving to next step");
		logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
		
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		
		String clientName ="ABLPAGEBREAKAUTOMATION";
		LoanMaintenancePageBreakTest LoanMaintenance = cyncHomePage.getCyncMenus().openCreditLineChargesSetupPageBreak(clientName);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Credit Line Charges Setup Screen is done sucessfully");
		
		String HeaderData ="Credit Line Charges Setup";
		Assert.assertTrue(LoanMaintenance.verifyCreditLineChargesSetupHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Credit Line Charges Setup Screen Header is verified sucessfully",HeaderData);
	
	}


	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Loan Maintenance:Verify the navigation to Credit Line Loan Collateral Setup Screen")
	public void navigateToCreditLineLoanCollateralSetup() {

		ExtentTestManager.getTest().getTest().setName("Loan Maintenance:Verify the navigation to Credit Line Loan Collateral Setup Screen");
		ExtentTestManager.getTest().assignCategory("Module: Loan Maintenance");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		logger.info("login done moving to next step");
		logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
		
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		
		String clientName ="ABLPAGEBREAKAUTOMATION";
		LoanMaintenancePageBreakTest LoanMaintenance = cyncHomePage.getCyncMenus().openCreditLineLoanCollateralSetupPageBreak(clientName);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Credit Line Loan Collateral Setup Screen is done sucessfully");
		
		String HeaderData ="Credit Line Loan Collateral Setup";
		Assert.assertTrue(LoanMaintenance.verifyCreditLineLoanCollateralSetupHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Credit Line Loan Collateral Setup Screen Header is verified sucessfully",HeaderData);
	
	}
	
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Loan Maintenance:Verify the navigation to Credit Line Loan Screen")
	public void navigateToCreditLineLoans() {

		ExtentTestManager.getTest().getTest().setName("Loan Maintenance:Verify the navigation to Credit Line Loans Screen");
		ExtentTestManager.getTest().assignCategory("Module: Loan Maintenance");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		logger.info("login done moving to next step");
		logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
		
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		
		String clientName ="ABLPAGEBREAKAUTOMATION";
		LoanMaintenancePageBreakTest LoanMaintenance = cyncHomePage.getCyncMenus().openCreditLineLoansPageBreak(clientName);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the Credit Line Loans Screen is done sucessfully");
		
		String HeaderData ="Credit Line Loans";
		Assert.assertTrue(LoanMaintenance.verifyCreditLineLoansHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2:Credit Line Loans Screen Header is verified sucessfully",HeaderData);
	
	}


	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Loan Maintenance:Verify the navigation to  Participation Parties Screen")
	public void navigateToParticipationParties() {

		ExtentTestManager.getTest().getTest().setName("Loan Maintenance:Verify the navigation to  Participation Parties Screen");
		ExtentTestManager.getTest().assignCategory("Module: Loan Maintenance");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		logger.info("login done moving to next step");
		logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
		
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		
		String clientName ="ABLPAGEBREAKAUTOMATION";
		LoanMaintenancePageBreakTest LoanMaintenance = cyncHomePage.getCyncMenus().openParticipationPartiesPageBreak(clientName);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the  Participation Parties Screen is done sucessfully");
		
		String HeaderData =" Participation Parties";
		Assert.assertTrue(LoanMaintenance.verifyParticipationPartiesHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2: Participation Parties Screen Header is verified sucessfully",HeaderData);
	
	}


	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Loan Maintenance:Verify the navigation to Participation Loan Details Screen")
	public void navigateToParticipationLoanDetails() {

		ExtentTestManager.getTest().getTest().setName("Loan Maintenance:Verify the navigation to Participation Loan Details Screen");
		ExtentTestManager.getTest().assignCategory("Module: Loan Maintenance");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		logger.info("login done moving to next step");
		logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
		
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		
		String clientName ="ABLPAGEBREAKAUTOMATION";
		LoanMaintenancePageBreakTest LoanMaintenance = cyncHomePage.getCyncMenus().openParticipationLoanDetailsPageBreak(clientName);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the  Participation Parties Screen is done sucessfully");
		
		String HeaderData ="Participation Loan Details";
		Assert.assertTrue(LoanMaintenance.verifyParticipationLoanDetailsHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2: Participation Parties Screen Header is verified sucessfully",HeaderData);
	
	}

	

	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION },testName ="Loan Maintenance:Verify the navigation to Participation Inquiry Screen")
	public void navigateToParticipationInquiry() {

		ExtentTestManager.getTest().getTest().setName("Loan Maintenance:Verify the navigation to Participation Inquiry Screen");
		ExtentTestManager.getTest().assignCategory("Module: Loan Maintenance");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		logger.info("login done moving to next step");
		logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
		
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		
		String clientName ="ABLPAGEBREAKAUTOMATION";
		LoanMaintenancePageBreakTest LoanMaintenance = cyncHomePage.getCyncMenus().openParticipationInquiryPageBreak(clientName);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step1:Navigation to the  Participation Inquiry Screen is done sucessfully");
		
		String HeaderData ="Participation Inquiry";
		Assert.assertTrue(LoanMaintenance.verifyParticipationInquiryHeader(HeaderData));
		ExtentTestManager.getTest().log(LogStatus.PASS,"Step2: Participation Inquiry Screen Header is verified sucessfully",HeaderData);
	
	}

}
