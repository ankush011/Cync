package com.cync.base;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.ABLPageBreak.ABLPageNavigation;
import com.cync.ABLPageBreak.AdministrationPageBreak;
import com.cync.ABLPageBreak.CashApplicationPageBreak;
import com.cync.ABLPageBreak.ChartsGraphsPageNavigation;
import com.cync.ABLPageBreak.ClientMaintenancePageBreak;
import com.cync.ABLPageBreak.DocumentManagementPageBreak;
import com.cync.ABLPageBreak.ExceptionAnalysisPageBreak;
import com.cync.ABLPageBreak.FileUploadPageBreak;
import com.cync.ABLPageBreak.LoanMaintenancePageBreakTest;
import com.cync.pages.ABLClientCreationPage;
import com.cync.pages.ABLFileUploadPage;
import com.cync.pages.ABL_GLTransactions_CashAppPage;
import com.cync.pages.AdjustmentReasonPage;
import com.cync.pages.ApproveBBCFundingPage;
import com.cync.pages.AuditLogPage;
import com.cync.pages.AutomatedTaskLogsPage;
import com.cync.pages.BBCAvailabilityPage;
import com.cync.pages.BBCAvailabilityVerificationPage;
import com.cync.pages.BBCFileRequiredPage;
import com.cync.pages.BBCReviewDataPage;
import com.cync.pages.BankDetailsPage;
import com.cync.pages.BasicClientDetailPage;
import com.cync.pages.BasicDetailsPage;
import com.cync.pages.BasicParametersPage;
import com.cync.pages.CashReceiptPage;
import com.cync.pages.CollateralAdvanceRatePage;
import com.cync.pages.CollateralLoansPage;
import com.cync.pages.CommentTypesPage;
import com.cync.pages.ContentPage;
import com.cync.pages.CreditLineChargesSetupPage;
import com.cync.pages.CreditLineCollateralSetupPage;
import com.cync.pages.CreditLineLoanCreationPage;
import com.cync.pages.CurrentReceivablesPage;
import com.cync.pages.DebtorsPage;
import com.cync.pages.DetailReceivablesPage;
import com.cync.pages.EnterNewSaleInvoicesPage;
import com.cync.pages.FundReleaseBBCPage;
import com.cync.pages.FundRequestPage;
import com.cync.pages.IneligiblePage;
import com.cync.pages.IneligibleSummaryPage;
import com.cync.pages.IneligibleUninsuiredReason;
import com.cync.pages.MappingListViewPage;
import com.cync.pages.NAICS_Codes_Page;
import com.cync.pages.NotificationAlertPage;
import com.cync.pages.NotificationCentrePage;
import com.cync.pages.NotificationLogsPage;
import com.cync.pages.PurgeClientPage;
import com.cync.pages.ReceivableAgingPage;
import com.cync.pages.ReceivablesRollforwardPage;
import com.cync.pages.ReportTemplatePage;
import com.cync.pages.ReportsPage;
import com.cync.pages.SalesRegion;
import com.cync.pages.SummaryReceivablesPage;
import com.cync.pages.SystemParametersPage;
import com.cync.pages.TemplatesPage;
import com.cync.pages.UserDefinedFieldPage;

public class CyncMenus {
	static Logger log = Logger.getLogger(AdjustmentReasonPage.class.getName());

    WebDriver driver;

    // private final By menuItem_xpath=By.xpath("//span[text()='Menu']");
    // private final By
    // menuItem_xpath=By.xpath("//div[@id='b_c_area']//descendant::div[@id='hamburger_icon']");
    private final By menuItem_xpath = By.id("top-menu");
       private final By salesRegions_xpath = By
	    .xpath("//a[text()='Sales Regions']");
  
    private final By Content_xpath=By.xpath("//a[contains(text(),'Content')]");
	private final By commentsType_xpath=By.xpath("//a[contains(text(),'Comment Types')]");
	private final By masterSearch_xpath=By.xpath("//div[@class='search_bar input-group']//descendant::input[@id='searchInputId']");
	private final By systemparameters_xpath=By.xpath("//a[contains(text(),'System Parameters')]");
	private final By notificationSettings_xpath=By.xpath("//a[contains(text(),'Notification Settings')]");
	private final By templates_xpath=By.xpath("//a[text()='Templates']");
	private final By auditLogs_xpath=By.xpath("//a[text()='Audit Logs']");
	private final By automatedTaskLogs_xpath=By.xpath("//a[text()='Automated Task Logs']");

	private final By NAICSCode_xpath=By
		    .xpath("//a[text()='NAICS Codes']");
	private final By basicDetails_xpath=By.xpath("//a[text()='Basic Details']");

	private final By notificationLogs_xpath=By.xpath("//a[text()='Notification Logs']");

	private final By createClient_xpath=By.xpath("//a[text()='Create ABL Client ']");
	private final By adjustmentReason_xpath=By.xpath("//a[text()='Adjustment Reasons']");
	private final By ReportTemplate_xpath=By.xpath("//a[contains(text(),'Report Templates')]");
	private final By bankDetails_xpath=By.xpath("//a[text()='Bank Details']");

	private final By ablClientCreation_xpath=By.xpath("//a[text()='Create ABL Client ']");
	private final By basicParameter_xpath=By.xpath("(//a[text()='Basic Parameters'])[1]");
	private final By collateralAdvanceRatePage_xpath=By.xpath("(//a[text()='Collateral Advance Rate'])[1]");


	private final By FundRequest_xpath=By.xpath("//a[text()='Fund Request']");
	
	 private final By selectClient_xpath = By.id("select2-choose_borrower-container");
	    private final By searchClientTextBox_xpath = By.xpath("//input[@type='search']");
	    private final By searchClient_xpath = By.xpath("//span[@class='select2-results']");
	
	    private final By ineligibleCalculations_xpath=By.xpath("//a[text()='Ineligible Calculations']");

	    // private final By SelectClient_xpath=By.xpath("//span[@id='select2-choose_borrower-container']");
	    private final By BBCAvailability_xpath=By.xpath("(//a[text()='BBC Availability'])[1]");

	    private final By ApproveBBCFundingPage_xpath=By.xpath("//a[contains(text(),'Approve BBC/Funding')]");
	    private final By FundReleaseBBCPage_xpath=By.xpath("//a[contains(text(),'Fund / Release BBC')]");

	
	    private final By BBCRecalculationProcessPage_xpath=By.xpath("(//a[text()='BBC Recalculation Process'])[1]");


	    private final By CollateralLoansPage_xpath=By.xpath("(//a[contains(text(),'Collateral Loans')])[1]");
	    private final By BasicClientDetailPage_xpath=By.xpath("(//a[text()='Basic Client Detail'])[1]");
	    private final By InactivrClientsPage_xpath=By.xpath("//a[text()='Inactive Clients']");


	    private final By currentReceivables_xpath = By
		    .xpath("//a[text()='Current Receivables']");

		    private final By summaryReceivables_xpath = By
		    .xpath("//a[text()='Summary Receivables']");

		    private final By bbcReviewData_xpath=By.xpath("//a[text()='BBC Review Data']");

		    private final By receivablesRollforward_xpath=By.xpath("//a[text()='Receivables Rollforward']");

		    private final By receivableAging_xpath=By.xpath("//a[text()='Receivable Aging']");
		    private final By enterNewSalesInvoices_xpath = By
		    .xpath("//a[text()='Enter New Sale Invoices']"); 

		    private final By detailReceivables_xpath = By
		    .xpath("//a[text()='Detail Receivables']");


	    private final By BatchCashPage_xpath=By.xpath("(//a[text()='Batch Cash Receipts Entry'])[1]");
	    private final By FundingStylePage_xpath=By.xpath("(//a[text()='Funding Style'])[1]");

	    

	    
	    
	    


		    private final By ineligibleSummary_xpath=By.xpath("//a[text()='Ineligible Summary']");
		    private final By debtors_xpath=By.xpath("//a[text()='Debtors']");


	
		    private final By ablFileUploads_xpath=By.xpath("//a[text()='ABL File Uploads']");
	

		    private final By mappingListView_xpath=By.xpath("(//a[text()='Mapping List View'])[1]");

	    private final By  bbcFilesRequired_xpath=By.xpath("//a[text()='BBC Files Required']");
    
	    		
	    private final By CheckRegisterPage_xpath=By.xpath("(//a[text()='Check Register'])[1]");
	    private final By BatchProcessPage_xpath=By.xpath("(//a[text()='Batch Process'])[1]");
	    private final By CashReceiptHistoryPage_xpath=By.xpath("(//a[text()='Cash Receipt History'])[1]");	

	    private final By userdefinedfield_xpath=By.xpath("//a[text()='User Defined Field']");

	  //Credit Line
	    private final By creditLineLoanS_xpath=By.xpath("//a[text()='Credit Line Loan Creation']");
	    private final By creditLineSetupS_xpath=By.xpath("//a[text()='Credit Line Charges Setup']");
	    private final By creditLineCollateralSetUpS_xpath=By.xpath("//a[text()='Credit Line Collateral Setup']");
	    private final By selectClientDropDown_xpath=By.xpath("//span[@class='select2-selection__rendered' and @title='Select Client']");	

	    ///////////////////////
	
		
		private final By ipAddessSetUp_xpath=By.xpath("//a[text()='IP Address Setup']");
		private final By naicsCodes_xpath=By.xpath("//a[text()='NAICS Codes']");
		private final By adjustmentReasons_xpath=By.xpath("//a[contains(text(),'Adjustment Reasons')]");
		private final By interestCalendar_xpath=By.xpath("//a[contains(text(),'Interest Calendar')]");
		private final By reportTemplates_xpath=By.xpath("//a[contains(text(),'Report Templates')]");
		private final By currencyCode_xpath=By.xpath("//a[contains(text(),'Currency Code')]");
		private final By userList_xpath=By.xpath("//a[contains(text(),'User List')]");
		private final By rolespermission_xpath=By.xpath("//a[contains(text(),'Roles & Permissions')]");
		private final By clientAssignment_xpath=By.xpath("//a[contains(text(),'Client Assignment')]");
		private final By userDefined_xpath=By.xpath("//a[contains(text(),'User Defined Field')]");
		
		
		
		
		private final By chargeTemplates_xpath=By.xpath("(//a[contains(text(),'Charges Templates')])[1]");
		private final By collateralLoanFeeSetup_xpath=By.xpath("//a[text()='Collateral Loan Fee Setup']");
		private final By ProcessOneTimeManualCharges_xpath=By.xpath("//a[text()='Process OneTime & Manual Charges']");
		private final By dailyTransactionReporting_xpath=By.xpath("//a[text()='Daily Transaction Reporting']");
		private final By interestRecalculation_xpath=By.xpath("//a[text()='Interest Recalculation']");
		private final By interestPayment_xpath=By.xpath("//a[text()=' Interest Payment ']");
		private final By interestPaymentRecalculation_xpath=By.xpath("//a[text()='Interest Payment Recalculation']");
		private final By letterofCredits_xpath=By.xpath("//a[contains(text(),'Letter of Credit')]");
		private final By PayoffInquiry_xpath=By.xpath("//a[contains(text(),'Payoff Inquiry')]");
		private final By autoHeader_xpath =By.xpath("//a[contains(text(),'  Auto Process Collateral Loan Settings')]");
		private final By TermLoanCreationHeader_xpath =By.xpath("//a[contains(text(),'Term Loan Creation')]");
		private final By TermLoanSetupHeader_xpath =By.xpath("//a[contains(text(),'Term Loan Setup')]");
		private final By TermLoanCollateralsHeader_xpath =By.xpath("//a[contains(text(),'Term Loan Collaterals')]");
		private final By TermLoansHeader_xpath =By.xpath("//a[contains(text(),'Term Loans')]");
		private final By CreditLineLoanCreationHeader_xpath =By.xpath("//a[contains(text(),'Credit Line Loan Creation')]");
		private final By CreditLineChargesSetupHeader_xpath =By.xpath("//a[contains(text(),'Credit Line Charges Setup')]");
		private final By CreditLineLoanCollateralSetupHeader_xpath =By.xpath("//a[contains(text(),'Credit Line Loan Collateral Setup')]");
		private final By CreditLineLoansHeader_xpath =By.xpath("//a[contains(text(),'Credit Line Loans')]");
		private final By  ParticipationPartiesHeader_xpath =By.xpath("//a[contains(text(),' Participation Parties')]");
		private final By  ParticipationLoanDetailsHeader_xpath =By.xpath("//a[contains(text(),' Participation Loan Details')]");
		private final By  ParticipationInquiryHeader_xpath =By.xpath("//a[contains(text(),' Participation Inquiry')]");
		private final By clientDropdown=By.xpath("//span[text()='Select Client']");
		private final By clientDropdownTextbox=By.xpath("//input[@class='select2-search__field']");
		private final By selectclientFromDropdown=By.xpath("//li[text()='AUTOMATIONCLIENT']");
		private final By collateralLoans_xpath=By.xpath("//a[text()='Collateral Loans']");
		private final By loanSummary_xpath=By.xpath("(//a[contains(text(),'Loan Summary')])[1]");
	    
		private final By openCashReceiptSourceCodesPageBreak_xpath=By.xpath("(//a[text()='Cash Receipt Source Codes'])[1]");
		private final By openUnprocessedChecksPageBreak_xpath=By.xpath("(//a[text()='Unprocessed Checks'])[1]");
		private final By openCheckRegisterPageBreak_xpath=By.xpath("(//a[text()='Check Register'])[1]");
		private final By openBatchProcessPageBreak_xpath=By.xpath("(//a[text()='Batch Process'])[1]");
		private final By openCashReceiptHistoryPageBreak_xpath=By.xpath("(//a[text()='Cash Receipt History'])[1]");
		private final By openDailyCashPostingPageBreak_xpath=By.xpath("(//a[text()='Daily Cash Posting'])[1]");
		private final By openDailyCashTransactionReportingPageBreak_xpath=By.xpath("(//a[text()='Daily Cash Transaction Reporting'])[1]");
		private final By openCreditMemoPageBreak_xpath=By.xpath("(//a[text()='Credit Memo'])[1]");
		private final By openCreditMemoHistoryPageBreak_xpath=By.xpath("(//a[text()='Credit Memo History'])[1]");
		
		private final By openDocumentMangmentPageBreak_xpath=By.xpath("(//a[text()='Document Management'])[1]");
		
		private final By openDocumentComplianceReportingPageBreak_xpath=By.xpath("(//a[text()='Document Compliance Reporting'])[1]");
		private final By openExceptionReportingPageBreak_xpath=By.xpath("(//a[text()='Exception Reporting'])[1]");
		private final By openWatchListStatisticsReportingPageBreak_xpath=By.xpath("(//a[text()='Watch List Statistics Reporting'])[1]");
		private final By openTicklerTasksPageBreak_xpath=By.xpath("(//a[text()='Tickler Tasks'])[1]");
		private final By openDilutionAnalysisPageBreak_xpath=By.xpath("(//a[text()='Dilution Analysis'])[1]");
		
		
		 private final By  ABLFileUploads_xpath=By.xpath("//a[text()='ABL File Uploads']");		
		    private final By  BBCDocuments_xpath=By.xpath("//a[text()='BBC Documents']");		
		    private final By  detailReceivablesPage_xpath=By.xpath("//a[text()='Detail Receivables']");		
		    private final By  summaryReceivablesPage_xpath=By.xpath("//a[text()='Summary Receivables']");	
		    private final By  detailPayablesPage_xpath=By.xpath("//a[text()='Detail Payables']");	
		    private final By  summaryPayablesPage_xpath=By.xpath("(//a[text()='Summary Payables'])[1]");	
		    private final By  assetsInventoryPage_xpath=By.xpath("(//a[text()='Assets / Inventory'])[1]");	
		    private final By  cashReceiptsHistoryPage_xpath=By.xpath("(//a[text()='Cash Receipts'])[1]");	
		    private final By  historyPage_xpath=By.xpath("//a[text()='History']");	
		    private final By  warningPage_xpath=By.xpath("//a[text()='Warning']");	
		    
		    private final By  openBatchCashReceiptsPage_xpath=By.xpath("//a[text()='Open Batch Cash Receipts']");	
		    private final By  BBCstobeApprovedPage_xpath=By.xpath("//a[text()='BBC's to be Approved']");	
		    private final By  BBCstobeMovedforfundingPage_xpath=By.xpath("//a[text()='BBC's to be Moved for Funding']");	
		    private final By  BBCstobeFundedPage_xpath=By.xpath("//a[text()='BBC's to be Funded']");	
		    private final By  BBCstobeProcessedPage_xpath=By.xpath("//a[text()='BBC's to be Processed']");	
		    private final By  fundRequestPage_xpath=By.xpath("//a[text()='Fund Request']");	
		    private final By  BBCReviewDataPage_xpath=By.xpath("//a[text()='BBC Review Data']");	
		    private final By  receivablesRollforwardPage_xpath=By.xpath("//a[text()='Receivables Rollforward']");	
		    private final By  receivableAgingPage_xpath=By.xpath("//a[text()='Receivable Aging']");	
		    private final By  ineligibleSummaryPage_xpath=By.xpath("//a[text()='Ineligible Summary']");	
		    private final By  DataassetsInventoryPage_xpath=By.xpath("(//a[text()='Assets / Inventory'])[2]");	
		    private final By  otherCollateral_xpath_xpath=By.xpath("//a[text()='Other Collateral']");	
		    private final By  lineReservesPage_xpath=By.xpath("//a[text()='Line Reserves']");	
		    private final By  BBCAvailabilityPage_xpath=By.xpath("//a[text()='BBC Availability']");	
		//    private final By  BBCRecalculationProcessPage_xpath=By.xpath("//a[text()='BBC Recalculation Process']");	
		    private final By  debtorsPage_xpath=By.xpath("//a[text()='Debtors']");	
		    private final By  vendorsPage_xpath=By.xpath("//a[text()='Vendors']");	
		    private final By  contrasPage_xpath=By.xpath("//a[text()='Contras']");	
		    private final By  globalAccountsPage_xpath=By.xpath("//a[text()='Global Accounts']");	
		    private final By  parentAssignmentPage_xpath=By.xpath("//a[text()='Parent Assignment']");	
		    
		    private final By  contraAssignmentPage_xpath=By.xpath("//a[text()='Contra Assignment']");	
		    private final By  debtorParentChildRelationPage_xpath=By.xpath("//a[text()='Debtor Parent Child Relation']");	
		    private final By  vendorParentChildRelationPage_xpath=By.xpath("//a[text()='Vendor Parent Child Relation']");	
		    private final By  dataReviewHistoryPage_xpath=By.xpath("//a[text()='Data Review History']");	
		    private final By  BBCDocumentsHistoryPage_xpath=By.xpath("//a[text()='BBC Documents']");	
		    private final By  detailReceivablesHistoryPage_xpath=By.xpath("//a[text()='Detail Receivables']");	
		    private final By  summaryReceivablesHistoryPage_xpath=By.xpath("//a[text()='Summary Receivables']");	
		    private final By  detailPayablesHistoryPage_xpath=By.xpath("//a[text()='Detail Payables']");	
		    private final By  summaryPayablesHistoryPage_xpath=By.xpath("//a[text()='Summary Payables']");	
		    private final By  assetsInventoryHistoryPage_xpath=By.xpath("//a[text()='Assets / Inventory']");	
		    private final By  cashRecieptsHistoryPage_xpath=By.xpath("//a[text()='Cash Receipts']");	
		    private final By  BBCReviewDataHistoryPage_xpath=By.xpath("//a[text()='BBC Review Data']");	
		    private final By  receivablesRollforwardHistoryPage_xpath=By.xpath("//a[text()='Receivables Rollforward']");	
		    private final By  receivableAgingHistoryPage_xpath=By.xpath("//a[text()='Receivable Aging']");	
		    private final By  ineligibleSummaryHistoryPage_xpath=By.xpath("//a[text()='Ineligible Summary']");	
		    private final By  assetsInventoryBBCHistoryPage_xpath=By.xpath("//a[text()='Assets / Inventory']");	
		    
		    private final By  otherCollateralHistoryPage_xpath=By.xpath("//a[text()='Other Collateral']");	
		    
		    private final By  lineReservesHistoryPage_xpath=By.xpath("//a[text()='Line Reserves']");	
		    private final By  BBCAvailabilityHistoryPage_xpath=By.xpath("//a[text()='BBC Availability']");	
		    private final By  amendDetailsHistoryPage_xpath=By.xpath("//a[text()='Amend Details']");	
		    private final By  enterNewSaleInvoicesPage_xpath=By.xpath("//a[text()='Enter New Sale Invoices']");	
		    private final By  currentReceivablesPage_xpath=By.xpath("//a[text()='Current Receivables']");	
		    private final By  cashReceiptsPage_xpath=By.xpath("//a[text()='Cash Receipts']");	
		    private final By  borrowerReceivablesPage_xpath=By.xpath("//a[text()='Compare Client Receivables']");	
		    
		    private final By  unapprovedBBCsPage_xpath=By.xpath("//a[text()='Unapproved BBCs']");	
		    private final By  signBBCPage_xpath=By.xpath("//a[text()='Sign BBC']");	
		    private final By  approveBBCFundingPage_xpath=By.xpath("//a[text()='Approve BBC/Funding']");	
		    private final By  fundReleaseBBCPage_xpath=By.xpath("//a[text()='Fund / Release BBC']");	
		    
		    private final By  ineligibilityReasonsPage_xpath=By.xpath("//a[text()='Ineligibility Reasons']");	
		    private final By  fileClassificationSummaryPage_xpath=By.xpath("//a[text()='File Classification']");	
		    private final By  exceptionsSummaryPage_xpath=By.xpath("//a[text()='Exceptions']");	
		    private final By  chargeCodesPage_xpath=By.xpath("//a[text()='Charge Codes']");	
		    
		    private final By  interestRateCodesPage_xpath=By.xpath("//a[text()='Interest Rate Codes']");	
		    
		    private final By  letterProcessingPage_xpath=By.xpath("//a[text()='Letter Processing']");	
		    private final By  letterTrackingPage_xpath=By.xpath("//a[text()='Letter Tracking']");	
		    private final By  letterInquiryPage_xpath=By.xpath("//a[text()='Letter Inquiry']");	
		    private final By  ACDebtorStatusPage_xpath=By.xpath("//a[text()='A/C Debtor Status']");	
		    
		    private final By  ABLGLSetupPage_xpath=By.xpath("//a[text()='ABL GL Setup']");	
		    private final By  ABLGLTransactionsPage_xpath=By.xpath("//a[text()='ABL GL Transactions']");
		    
		    
		    private final By  loanAvailabilitybyManagerPage_xpath=By.xpath("//a[text()='Loan Availability by Manager']");
		    private final By  loanAvailabilitybyClientPage_xpath=By.xpath("//a[text()='Loan Availability by Client']");
		    private final By  top10ARConcentrationsbyClientPage_xpath=By.xpath("//a[text()='Top 10 AR Concentrations by Client']");
		    private final By  top10APConcentrationsbyClientPage_xpath=By.xpath("//a[text()='Top 10 AP Concentrations by Client']");
		    private final By  ARAPComparisonbyClientPage_xpath=By.xpath("//a[text()='AR-AP Comparison by Client']");
		    private final By  BBCIneligiblesbyClientPage_xpath=By.xpath("//a[text()='BBC Ineligibles by Client']");
		    private final By  receivableBBCagingbyClientPage_xpath=By.xpath("//a[text()='Receivable BBC aging by Client']");
		    private final By  receivableSpreadsbyYearPage_xpath=By.xpath("//a[text()='Receivable Spreads by Year']");
		    private final By  payableSpreadsbyYearPage_xpath=By.xpath("//a[text()='Payable Spreads by Year']");
		    private final By  receivableAgingbyClientPage_xpath=By.xpath("//a[text()='Receivable Aging by Client']");
		    private final By  BBCAvailabilitybyClientPage_xpath=By.xpath("//a[text()='BBC Availability by Client']");
		    private final By  ARStatsDilutiononSalesPage_xpath=By.xpath("//a[text()='AR Stats - Dilution on Sales']");

		    private final By CreateSkippedBBC_Xpath=By.xpath("//a[contains(text(),'Create Skipped BBC')]");
			  private final By BBCHistoricalDataUpload_Xpath=By.xpath("//a[contains(text(),'BBC Historical Data Upload')]");
			  private final By MapAndUpload_Xpath=By.xpath("//a[contains(text(),'Map & Upload')]");
			  private final By CollateralLoanAutoFileUploads_Xpath=By.xpath("//a[contains(text(),'Collateral Loan Auto File Uploads')]");
			  private final By CollateralLoanUndo_Xpath=By.xpath("//a[contains(text(),'Collateral Loan Undo')]");
			  private final By MappingListView1_Xpath=By.xpath("//a[contains(text(),'Mapping List View')]");
			  private final By AllClientsUploadDepositFiles_Xpath=By.xpath("//a[contains(text(),'All Clients Upload Deposit Files')]");
			  
	/*		  private final By clientDropdown=By.xpath("//span[text()='Select Client']");
			  private final By clientDropdownTextbox=By.xpath("//input[@class='select2-search__field']");
			  private final By selectclientFromDropdown=By.xpath("//li[text()='AUTOMATIONCLIENT']");*/
			  
			  private final By basicParameters_xpath=By.xpath("//a[text()='Basic Parameters']");
			  
			  private final By ClientSummary_xpath=By.xpath("//a[contains(text(),'Client Summary')]");
			  private final By InactiveClients_xpath=By.xpath("//a[contains(text(),'Inactive Clients')]");
			  private final By BasicParameters_xpath=By.xpath("//a[contains(text(),'Basic Parameters')]");
			  private final By CollateralAdvanceRate_xpath=By.xpath("//a[contains(text(),'Collateral Advance Rate')]");
			  private final By IneligibleCalculations_xpath=By.xpath("//a[contains(text(),'Ineligible Calculations')]");
			  private final By SeasonalAdvanceRate_xpath=By.xpath("//a[contains(text(),'Seasonal Advance Rate')]");
			  private final By BucketAging_xpath=By.xpath("//a[contains(text(),'Bucket Aging')]");
			  private final By BBCFilesRequired_xpath=By.xpath("//a[contains(text(),'BBC Files Required')]");
			  private final By ClientBBCOptions_xpath=By.xpath("//a[contains(text(),'Client BBC Options')]");
			  private final By OtherFilesRequired_xpath=By.xpath("//a[contains(text(),'Other Files Required')]");
			  private final By ActivityTickler_xpath=By.xpath("//a[contains(text(),'Activity Tickler')]");
			  private final By Comments_xpath=By.xpath("//a[contains(text(),'Comments')]");
			  private final By ReportComments_xpath=By.xpath("//a[contains(text(),'Report Comments')]");
			  private final By Exceptions_xpath=By.xpath("//a[contains(text(),'Exceptions')]");
			  private final By FundingStyle_xpath=By.xpath("//a[contains(text(),'Funding Style')]");
			  private final By CollateralReserves_xpath=By.xpath("//a[contains(text(),'Collateral Reserves')]");
			  private final By AssetAmortization_xpath=By.xpath("//a[contains(text(),'Asset Amortization')]");
			  
			  private final By MappingListView_Xpath=By.xpath("//a[contains(text(),'Mapping List View')]");
			  private final By CreateABLClient_Xpath=By.xpath("//a[contains(text(),'Create ABL Client')]");
			  private final By CreateFactoringClient_Xpath=By.xpath("//a[contains(text(),'Create Factoring Client')]");
			  private final By BasicClientDetails_Xpath=By.xpath("//a[contains(text(),'Basic Client Detail')]");
			  private final By MailAddress_Xpath=By.xpath("//a[contains(text(),'Mail Address')]");
			  private final By Contacts_Xpath=By.xpath("//a[contains(text(),'Contacts')]");
			  private final By Miscellaneous_Xpath=By.xpath("//a[contains(text(),'Miscellaneous')]");
			  private final By LegalContent_Xpath=By.xpath("//a[contains(text(),'Legal Content')]");
			  private final By Guarantors_Xpath=By.xpath("//a[contains(text(),'Guarantors')]");	
			  private final By LoanFees_Xpath=By.xpath("//a[contains(text(),'Loan Fees')]");
			  private final By IneligibleAdvances_Xpath=By.xpath("//a[contains(text(),'Ineligible / Advances')]");
		
			   private final By DailyCashPostingPage_xpath=By.xpath("(//a[text()='Daily Cash Posting'])[1]");	
			    private final By DailyCashTransactionReportingPage_xpath=By.xpath("(//a[text()='Daily Cash Transaction Reporting'])[1]");	
			    private final By CashReceipt_xpath=By.xpath("(//a[text()='Cash Receipts'])[2]");	
			    private final By ablGLTranactions_xpath=By.xpath("(//a[text()='ABL GL Transactions'])[1]");	

			  private final By reports_xpath=By.xpath("//a[text()='Reports']");

	 public CyncMenus(WebDriver driver) {
	this.driver = driver;
    }

    public boolean MouseOverOnMenu() {
	try {
	    WebElement menuItemWebE = new WebDriverWait(driver, 10)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(menuItem_xpath));
	    new Actions(driver).moveToElement(menuItemWebE).perform();
	    return true;
	} catch (Exception ex) {
	    return false;
	}
    }

    public boolean moveToLeftNavigation(String navigation_Name) {
	try {
	    By menuContainerWebE_xpath = By.xpath("//ul[@id='menu']");
	    WebElement menuContainerWebE = new WebDriverWait(driver, 10)
	    		.until(ExpectedConditions.visibilityOfElementLocated(menuContainerWebE_xpath));
	    List<WebElement> menuWebL = menuContainerWebE.findElements(By
		    .tagName("li"));
	    for (WebElement option : menuWebL) {
		String title = option.getText();
		if (title.equals(navigation_Name)) {
		    new Actions(driver).moveToElement(option).perform();
		    return true;
		}

	    }
	    return false;
	} catch (Exception ex) {
	    return false;
	}

    }


    public boolean NavigateSalesRegion() {
	try {
	    WebElement salesRegionWebEelement = new WebDriverWait(driver, 10)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(salesRegions_xpath));
	    salesRegionWebEelement.click();
	    return true;
	} catch (Exception ex) {
	    return false;
	}

    }
    public SalesRegion openSalesRegion() {
	try {
	    this.MouseOverOnMenu();
	    this.moveToLeftNavigation("Administration");
	    WebElement salesRegionWebEelement = new WebDriverWait(driver, 1000)
		    .until(ExpectedConditions.elementToBeClickable(salesRegions_xpath));
	    salesRegionWebEelement.click();
	    Thread.sleep(10000);
	    return new SalesRegion(driver);
	} catch (Exception ex) {
	    return null;
	}
    }
    
    public SalesRegion MouseOverOnMenuSales() {
      	try {
      	    WebElement menuItemWebE = new WebDriverWait(driver, 10)
      		    .until(ExpectedConditions
      			    .visibilityOfElementLocated(menuItem_xpath));
      	    new Actions(driver).moveToElement(menuItemWebE).perform();
      	    return new SalesRegion(driver);
      	} catch (Exception ex) {
      	    return null;
      	}
          }

	
    public BankDetailsPage openBankDetails() {
        try {
             this.MouseOverOnMenu();
             this.moveToLeftNavigation("Administration");
             WebElement bankDetailsWebEelement = new WebDriverWait(driver, 1000)
              .until(ExpectedConditions.elementToBeClickable(bankDetails_xpath));
             bankDetailsWebEelement.click();
             Thread.sleep(10000);
             return new BankDetailsPage(driver);
        } catch (Exception ex) {
             return null;
        }

            }  



    
    
    
    
	public boolean navigateToContent(){
		try{
			WebElement ContentWebEelement=new WebDriverWait(driver,90)
				.until(ExpectedConditions.visibilityOfElementLocated(Content_xpath));
			ContentWebEelement.click();
			return true;
		}
	catch(Exception ex){
		return false;
	}
		
	}
	
	
	
	public ContentPage openContentPage() {
		 try {
		     this.MouseOverOnMenu();
		     this.moveToLeftNavigation("Administration");
		     WebElement salesRegionWebEelement = new WebDriverWait(driver, 1000)
		      .until(ExpectedConditions.elementToBeClickable(Content_xpath));
		     salesRegionWebEelement.click();
		     return new ContentPage(driver);
		 } catch (Exception ex) {
		     return null;
		 }

		    }
	 public CommentTypesPage openCommentsType() { 
		   try {     
		   this.MouseOverOnMenu();     
		   this.moveToLeftNavigation("Administration");     
		   WebElement commentsWebEelement = new WebDriverWait(driver, 1000)      
		   .until(ExpectedConditions.elementToBeClickable(commentsType_xpath));     
		   commentsWebEelement.click();     
		   Thread.sleep(10000);
		   return new CommentTypesPage(driver); } 
		   catch (Exception ex) {     
		   return null; }   
		   }   
	 // use above code to navigate to the page
	
	 public boolean masterSearchUI(){
			try {
				WebElement masterSearchUIWebE=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(masterSearch_xpath));
			//	masterSearchUIWebE.isDisplayed();
				return true;
			} catch (Exception e) {
				// TODO: handle exception
				return false;
			}
		}
	
	 public SystemParametersPage openSystemParameters() { 
		   try {     
		   this.MouseOverOnMenu();     
		   this.moveToLeftNavigation("Administration");     
		   WebElement SystemParametersWebEelement = new WebDriverWait(driver, 1000)      
		   .until(ExpectedConditions.elementToBeClickable(systemparameters_xpath));     
		   SystemParametersWebEelement.click();     
		   Thread.sleep(10000);
		   return new SystemParametersPage(driver); } 
		   catch (Exception ex) {     
		   return null; }   
		   } 

	
	 public boolean NavigateCommentsType(){
		 try{
		 WebElement CommentsTypeWebEelement=new WebDriverWait(driver,1000)
		 .until(ExpectedConditions.visibilityOfElementLocated(commentsType_xpath));
		 CommentsTypeWebEelement.click();
		 Thread.sleep(10000);
		 return true;
		 }catch(Exception ex){
			 
		 }
		return false;
		 }
	 public boolean NavigateNotificationSettings(){
		 try{
		 WebElement NotificationSettingsWebEelement=new WebDriverWait(driver,10)
		 .until(ExpectedConditions.visibilityOfElementLocated(notificationSettings_xpath));
		 NotificationSettingsWebEelement.click();
		 return true;
		 }catch(Exception ex){
			 
		 }
		return false;
		 }


	public boolean NavigateTemplates(){
		 try{
		 WebElement TemplatesWebEelement=new WebDriverWait(driver,10)
		 .until(ExpectedConditions.visibilityOfElementLocated(templates_xpath));
		 TemplatesWebEelement.click();
		 return true;
		 }catch(Exception ex){
			 
		 }
		return false;
		 }



	public TemplatesPage openTemplate() { 
		   try {     
		   this.MouseOverOnMenu();     
		   this.moveToLeftNavigation("Administration");     
		   WebElement TemplatessWebEelement = new WebDriverWait(driver, 1000)      
		   .until(ExpectedConditions.elementToBeClickable(templates_xpath));     
		   TemplatessWebEelement.click();     
		   Thread.sleep(10000);
		   return new TemplatesPage(driver); } 
		   catch (Exception ex) {     
		   return null; }   
		   }
	
	 public AuditLogPage openAuditLogs() {
		 try {
		     this.MouseOverOnMenu();
		     this.moveToLeftNavigation("Administration");
		     WebElement auditLogsWebEelement = new WebDriverWait(driver, 1000)
		      .until(ExpectedConditions.elementToBeClickable(auditLogs_xpath));
		     auditLogsWebEelement.click();
		     
		     return new AuditLogPage(driver);
		 } catch (Exception ex) {
		     return null;
		 }

		    }
	 public AutomatedTaskLogsPage openAutomatedTaskLogs() {
		 try {
		     this.MouseOverOnMenu();
		     this.moveToLeftNavigation("Administration");
		     WebElement auditLogsWebEelement = new WebDriverWait(driver, 1000)
		      .until(ExpectedConditions.elementToBeClickable(automatedTaskLogs_xpath));
		     auditLogsWebEelement.click();
		     
		     return new AutomatedTaskLogsPage(driver);
		 } catch (Exception ex) {
		     return null;
		 }


		    }  
	 
	 public NAICS_Codes_Page openNAICSCode() {
	   	try {
	   	    this.MouseOverOnMenu();
	   	    this.moveToLeftNavigation("Administration");
	   	    
	   	    WebElement NAICSCodeWebEelement = new WebDriverWait(driver, 100)
	   		    .until(ExpectedConditions.elementToBeClickable(NAICSCode_xpath));
	   	 
	   	 NAICSCodeWebEelement.click();
	   	Thread.sleep(10000);
	   	    return new NAICS_Codes_Page(driver);
	   	} catch (Exception ex) {
	   	    return null;
	   	}

	       }


	 
	 public NotificationCentrePage openNotificationSettings() {
		 try {
		     this.MouseOverOnMenu();
		     this.moveToLeftNavigation("Administration");
		     WebElement notificationSettingsWebEelement = new WebDriverWait(driver, 1000)
		      .until(ExpectedConditions.elementToBeClickable(notificationSettings_xpath));
		     notificationSettingsWebEelement.click();
		     
		     return new NotificationCentrePage(driver);


		    }  catch (Exception ex) {
			     return null;
			 }}
		
	 

 
	  
	 

	 public NotificationLogsPage openNotificationLogs() {
		 try {
		     this.MouseOverOnMenu();
		     this.moveToLeftNavigation("Administration");
		     WebElement auditLogsWebEelement = new WebDriverWait(driver, 1000)
		      .until(ExpectedConditions.elementToBeClickable(notificationLogs_xpath));
		     auditLogsWebEelement.click();
		     
		     return new NotificationLogsPage(driver);


		 } catch (Exception ex) {
		     return null;
		 }


		    }   


		

	 public NotificationLogsPage openClientCreation() {
		 try {
		     this.MouseOverOnMenu();
		     this.moveToLeftNavigation("Client Maintenance");
		     WebElement auditLogsWebEelement = new WebDriverWait(driver, 1000)
		      .until(ExpectedConditions.elementToBeClickable(createClient_xpath));
		     auditLogsWebEelement.click();
		     
		     return new NotificationLogsPage(driver);

		 } catch (Exception ex) {
		     return null;
		 }


		    }   
	 public BasicDetailsPage openBasicDetails() {
		 try {
		     this.MouseOverOnMenu();
		     this.moveToLeftNavigation("Administration");
		     WebElement basicDetailsWebEelement = new WebDriverWait(driver, 1000)
		      .until(ExpectedConditions.elementToBeClickable(basicDetails_xpath));
		     basicDetailsWebEelement.click();
		     Thread.sleep(10000);
		     return new BasicDetailsPage(driver);
		 } catch (Exception ex) {
		     return null;
		 }

		    }  
	 
	 public AdjustmentReasonPage openAdjustmentReason() { 
		 log.info("naviagting to the Adjustment reason");
         try {     
         this.MouseOverOnMenu();     
         this.moveToLeftNavigation("Administration");     
         WebElement AdjustmentReasonWebEelement = new WebDriverWait(driver, 1000)      
         .until(ExpectedConditions.elementToBeClickable(adjustmentReason_xpath));     
         AdjustmentReasonWebEelement.click();     
         Thread.sleep(10000);
         return new AdjustmentReasonPage(driver); } 
         catch (Exception ex) {     
         return null; }   
         }
	
	 

	 public ReportTemplatePage openReportTemplate() {
	   	try {
	   	    this.MouseOverOnMenu();
	   	    this.moveToLeftNavigation("Administration");
	   	    
	   	    WebElement ReportTemplateWebEelement = new WebDriverWait(driver, 100)
	   		    .until(ExpectedConditions.elementToBeClickable(ReportTemplate_xpath));
	   	 
	   	 ReportTemplateWebEelement.click();
	   	Thread.sleep(10000);
	   	    return new ReportTemplatePage(driver);
	   	} catch (Exception ex) {
	   	    return null;
	   	}

	       }


	 
	 public FundRequestPage openFundRequest() {
	   	try {
	   	    this.MouseOverOnMenu();
	   	    this.moveToLeftNavigation("ABL");
	   	    
	   	    WebElement FundRequestWebEelement = new WebDriverWait(driver, 100)
	   		    .until(ExpectedConditions.elementToBeClickable(FundRequest_xpath));
	   	 
	   	 FundRequestWebEelement.click();
	   	Thread.sleep(10000);
	   	    return new FundRequestPage(driver);
	   	} catch (Exception ex) {
	   	    return null;
	   	}}
	    public UserDefinedFieldPage openUserDefinedField() {
			 try {
			     this.MouseOverOnMenu();
			     this.moveToLeftNavigation("Administration");
			     WebElement userdefinedfieldWebEelement = new WebDriverWait(driver, 1000)
			      .until(ExpectedConditions.elementToBeClickable(userdefinedfield_xpath));
			     userdefinedfieldWebEelement.click();
			     
			     return new UserDefinedFieldPage(driver);


			 } catch (Exception ex) {
			     return null;
			 }


	    

	       }
	    
	  //Credit Line
		 public CreditLineLoanCreationPage openCreditLineLoanCreationS() {
			 try {
			     this.MouseOverOnMenu();
			     this.moveToLeftNavigation("Loan Maintenance");
			     WebElement CreditLineLoanCreationWebEelement = new WebDriverWait(driver, 1000)
			      .until(ExpectedConditions.elementToBeClickable(creditLineLoanS_xpath));
			     CreditLineLoanCreationWebEelement.click();
			     
			     return new CreditLineLoanCreationPage(driver);


			 } catch (Exception ex) {
			     return null;
			 }
	       }
		 
		 public CreditLineChargesSetupPage openCreditLineChargesSetupS() {
			 try {
			     this.MouseOverOnMenu();
			     this.moveToLeftNavigation("Loan Maintenance");
			     WebElement CreditLineChargesSetupWebEelement = new WebDriverWait(driver, 1000)
			      .until(ExpectedConditions.elementToBeClickable(creditLineSetupS_xpath));
			     CreditLineChargesSetupWebEelement.click();
			     
			     return new CreditLineChargesSetupPage(driver);


			 } catch (Exception ex) {
			     return null;
			 }
	       }

		 public CreditLineCollateralSetupPage openCreditLineCollateralSetupS() {
			 try {
			     this.MouseOverOnMenu();
			     this.moveToLeftNavigation("Loan Maintenance");
			     WebElement CreditLineCollateralSetupWebEelement = new WebDriverWait(driver, 1000)
			      .until(ExpectedConditions.elementToBeClickable(creditLineCollateralSetUpS_xpath));
			     CreditLineCollateralSetupWebEelement.click();
			     
			     return new CreditLineCollateralSetupPage(driver);


			 } catch (Exception ex) {
			     return null;
			 }
	       }
////////////////////////////////////////////////
public boolean SelectClientFunction()
{
try{
    Thread.sleep(2000);
WebElement selectClientWebEelement=new WebDriverWait(driver,100)
.until(ExpectedConditions.visibilityOfElementLocated(selectClient_xpath));
selectClientWebEelement.click();


return true;
}
catch(Exception ex){
return false;
}

}


public String addValueToSearch(String ClientData)
{
try{
WebElement searchClientTextBoxWebEelement=new WebDriverWait(driver,200)
.until(ExpectedConditions.visibilityOfElementLocated(searchClientTextBox_xpath));
searchClientTextBoxWebEelement.clear();
searchClientTextBoxWebEelement.sendKeys(ClientData);


}
catch(Exception ex){

}
return ClientData;

}


public boolean SearchClientClick()
{
try{

WebElement searchClientWebEelement=new WebDriverWait(driver,100)
.until(ExpectedConditions.visibilityOfElementLocated(searchClient_xpath));
searchClientWebEelement.click();


return true;
}
catch(Exception ex){
return false;
}

}


public boolean selectClientFromDropDown(String ClientData)
{
try{
this.SelectClientFunction();
this.addValueToSearch(ClientData);
this.SearchClientClick();

Thread.sleep(5000);

return true;
}
catch(Exception ex){
return false;
}

} 

	 /////////////////Admin End////////////////
	 
	
	 
	 public ABLClientCreationPage openABLClientCreation() { 
         try {     
         this.MouseOverOnMenu();     
         this.moveToLeftNavigation("Client Maintenance");     
         WebElement ABLClientCreationWebEelement = new WebDriverWait(driver, 1000)      
         .until(ExpectedConditions.elementToBeClickable(ablClientCreation_xpath));     
         ABLClientCreationWebEelement.click();     
         Thread.sleep(10000);
         return new ABLClientCreationPage(driver); } 
         catch (Exception ex) {     
         return null; }   
         }
	
	 public BasicParametersPage openBasicParameters() { 
         try {     
         this.MouseOverOnMenu();     
         this.moveToLeftNavigation("Client Maintenance");     
         WebElement BasicParametersWebEelement = new WebDriverWait(driver, 1000)      
         .until(ExpectedConditions.elementToBeClickable(basicParameter_xpath));     
         BasicParametersWebEelement.click();     
         Thread.sleep(10000);
         return new BasicParametersPage(driver); } 
         catch (Exception ex) {     
         return null; }   
         }
	 
	 public IneligiblePage openIneligibleBasicParameters() { 
         try {     
         this.MouseOverOnMenu();     
         this.moveToLeftNavigation("Client Maintenance");     
         WebElement BasicParametersWebEelement = new WebDriverWait(driver, 1000)      
         .until(ExpectedConditions.elementToBeClickable(basicParameter_xpath));     
         BasicParametersWebEelement.click();     
         Thread.sleep(10000);
         return new IneligiblePage(driver); } 
         catch (Exception ex) {     
         return null; }   
         }
	 
	 
	
	 public IneligiblePage openIneligibleCalculations() { 
         try {     
         this.MouseOverOnMenu();     
         this.moveToLeftNavigation("Client Maintenance");     
         WebElement IneligibleWebEelement = new WebDriverWait(driver, 1000)      
         .until(ExpectedConditions.elementToBeClickable(ineligibleCalculations_xpath));     
         IneligibleWebEelement.click();     
         Thread.sleep(10000);
         return new IneligiblePage(driver); } 
         catch (Exception ex) {     
         return null; }   
         }
	 
	 public IneligibleUninsuiredReason openIneligibleCalculationsPage() { 
         try {     
         this.MouseOverOnMenu();     
         this.moveToLeftNavigation("Client Maintenance");     
         WebElement IneligibleWebEelement = new WebDriverWait(driver, 1000)      
         .until(ExpectedConditions.elementToBeClickable(ineligibleCalculations_xpath));     
         IneligibleWebEelement.click();     
         Thread.sleep(10000);
         return new IneligibleUninsuiredReason(driver); } 
         catch (Exception ex) {     
         return null; }   
         }
	 
	 public IneligiblePage openABLFileUploads() { 
         try {     
         this.MouseOverOnMenu();     
         this.moveToLeftNavigation("File Uploads");     
         WebElement ABLFileUploadsWebEelement = new WebDriverWait(driver, 1000)      
         .until(ExpectedConditions.elementToBeClickable(ablFileUploads_xpath));     
         ABLFileUploadsWebEelement.click();     
         Thread.sleep(10000);
         return new IneligiblePage(driver); } 
         catch (Exception ex) {     
         return null; }   
         }
	 
	 public IneligiblePage openmappingListView() { 
         try {     
         this.MouseOverOnMenu();     
         this.moveToLeftNavigation("Client Maintenance");     
         WebElement mappingListViewWebEelement = new WebDriverWait(driver, 1000)      
         .until(ExpectedConditions.elementToBeClickable(mappingListView_xpath));     
         mappingListViewWebEelement.click();     
         Thread.sleep(10000);
         return new IneligiblePage(driver); } 
         catch (Exception ex) {     
         return null; }   
         }
	 
	 public IneligiblePage openbbcFilesRequired() { 
         try {     
         this.MouseOverOnMenu();     
         this.moveToLeftNavigation("Client Maintenance");     
         WebElement mappingListViewWebEelement = new WebDriverWait(driver, 1000)      
         .until(ExpectedConditions.elementToBeClickable(bbcFilesRequired_xpath));     
         mappingListViewWebEelement.click();     
         Thread.sleep(10000);
         return new IneligiblePage(driver); } 
         catch (Exception ex) {     
         return null; }   
         }
	 
	 
	 public CollateralAdvanceRatePage openCollateralAdvanceRate() { 
         try {     
         this.MouseOverOnMenu();     
         this.moveToLeftNavigation("Client Maintenance");     
         WebElement CollateralAdvanceRateWebEelement = new WebDriverWait(driver, 1000)      
         .until(ExpectedConditions.elementToBeClickable(collateralAdvanceRatePage_xpath));     
         CollateralAdvanceRateWebEelement.click();     
         Thread.sleep(10000);
         return new CollateralAdvanceRatePage(driver); } 
         catch (Exception ex) {     
         return null; }   
         }
	 


	 public BBCAvailabilityPage openBBCAvailability() {
	   	try {
	   	    this.MouseOverOnMenu();
	   	    this.moveToLeftNavigation("ABL");
	   	    
	   	    WebElement FundRequestWebEelement = new WebDriverWait(driver, 100)
	   		    .until(ExpectedConditions.elementToBeClickable(BBCAvailability_xpath));
	   	 
	   	 FundRequestWebEelement.click();
	   	Thread.sleep(10000);
	   	    return new BBCAvailabilityPage(driver);
	   	} catch (Exception ex) {
	   	    return null;
	   	}

	       }
	 
	 public BBCAvailabilityVerificationPage openBBCAvailabilityPage() {
		   	try {
		   	    this.MouseOverOnMenu();
		   	    this.moveToLeftNavigation("ABL");
		   	    
		   	    WebElement FundRequestWebEelement = new WebDriverWait(driver, 100)
		   		    .until(ExpectedConditions.elementToBeClickable(BBCAvailability_xpath));
		   	 
		   	 FundRequestWebEelement.click();
		   	Thread.sleep(10000);
		   	    return new BBCAvailabilityVerificationPage(driver);
		   	} catch (Exception ex) {
		   	    return null;
		   	}

		       }
	 
		
	 public ApproveBBCFundingPage openApproveBBCFundingPage() {
	   	try {
	   	    this.MouseOverOnMenu();
	   	    this.moveToLeftNavigation("ABL");
	   	    
	   	    WebElement ApproveBBCFundingWebEelement = new WebDriverWait(driver, 100)
	   		    .until(ExpectedConditions.elementToBeClickable(ApproveBBCFundingPage_xpath));
	   	 
	   	 ApproveBBCFundingWebEelement.click();
	   	Thread.sleep(10000);
	   	    return new ApproveBBCFundingPage(driver);
	   	} catch (Exception ex) {
	   	    return null;
	   	}

	       }
	 
	 
	 public FundReleaseBBCPage openFundReleaseBBCPage() {
	   	try {
	   	    this.MouseOverOnMenu();
	   	    this.moveToLeftNavigation("ABL");
	   	    
	   	    WebElement FundReleaseBBCWebEelement = new WebDriverWait(driver, 100)
	   		    .until(ExpectedConditions.elementToBeClickable(FundReleaseBBCPage_xpath));
	   	 
	   	 FundReleaseBBCWebEelement.click();
	   	Thread.sleep(10000);
	   	    return new FundReleaseBBCPage(driver);
	   	} catch (Exception ex) {
	   	    return null;
	   	}

	       }

	 public NotificationAlertPage openNotificationAlertPage() { 
         try {     
         this.MouseOverOnMenu();     
         this.moveToLeftNavigation("ABL");     
         WebElement NotificationAlertWebEelement = new WebDriverWait(driver, 1000)      
         .until(ExpectedConditions.elementToBeClickable(BBCRecalculationProcessPage_xpath));     
         NotificationAlertWebEelement.click();     
         Thread.sleep(10000);
         return new NotificationAlertPage(driver); } 
         catch (Exception ex) {     
         return null; }   
         }
	
	
	 public CollateralLoansPage openCollateralLoansPage() { 
         try {     
         this.MouseOverOnMenu();     
         this.moveToLeftNavigation("Loan Maintenance");     
         WebElement CollateralLoanWebEelement = new WebDriverWait(driver, 1000)      
         .until(ExpectedConditions.elementToBeClickable(CollateralLoansPage_xpath));     
         CollateralLoanWebEelement.click();     
         Thread.sleep(10000);
         return new CollateralLoansPage(driver); } 
         catch (Exception ex) {     
         return null; }   
         }
	 
	 
	 public BasicClientDetailPage openBasicDetailPage() { 
         try {     
         this.MouseOverOnMenu();     
         this.moveToLeftNavigation("Client Maintenance");     
         WebElement BasicClientDetailWebEelement = new WebDriverWait(driver, 1000)      
         .until(ExpectedConditions.elementToBeClickable(BasicClientDetailPage_xpath));     
         BasicClientDetailWebEelement.click();     
         Thread.sleep(10000);
         return new BasicClientDetailPage(driver); } 
         catch (Exception ex) {     
         return null; }   
         }
	 
	 
	 public PurgeClientPage openInactiveClientsPage() { 
         try {     
         this.MouseOverOnMenu();     
         this.moveToLeftNavigation("Client Maintenance");     
         WebElement BasicClientDetailWebEelement = new WebDriverWait(driver, 1000)      
         .until(ExpectedConditions.elementToBeClickable(InactivrClientsPage_xpath));     
         BasicClientDetailWebEelement.click();     
         Thread.sleep(10000);
         return new PurgeClientPage(driver); } 
         catch (Exception ex) {     
         return null; }   
         }

	 public SummaryReceivablesPage openSummaryReceivables() {
	     try {
	     this.MouseOverOnMenu();
	     this.moveToLeftNavigation("ABL");
	     WebElement summaryReceivablesWebEelement = new WebDriverWait(
	     driver, 1000).until(ExpectedConditions
	     .elementToBeClickable(summaryReceivables_xpath));
	     summaryReceivablesWebEelement.click();
	     return new SummaryReceivablesPage(driver);
	     } catch (Exception e) {
	     return null;
	     }
	     }
	     public BBCReviewDataPage openBBCReviewData(){
	     try {
	     this.MouseOverOnMenu();
	     this.moveToLeftNavigation("ABL");
	     WebElement BBCReviewDataWebEelement = new WebDriverWait(
	     driver, 1000).until(ExpectedConditions
	     .elementToBeClickable(bbcReviewData_xpath));
	     BBCReviewDataWebEelement.click();
	     return new BBCReviewDataPage(driver);
	     } catch (Exception e) {
	     return null;
	     }
	     }
	     public ReceivablesRollforwardPage openReceivablesRollforwardPage(){
	     try {
	     this.MouseOverOnMenu();
	     this.moveToLeftNavigation("ABL");
	     WebElement ReceivablesRollforwardWebEelement = new WebDriverWait(
	     driver, 1000).until(ExpectedConditions
	     .elementToBeClickable(receivablesRollforward_xpath));
	     ReceivablesRollforwardWebEelement.click();
	     return new ReceivablesRollforwardPage(driver);
	     } catch (Exception e) {
	     return null;
	     }
	     }
	     public ReceivableAgingPage openReceivableAgingPage(){
	     try {
	     this.MouseOverOnMenu();
	     this.moveToLeftNavigation("ABL");
	     WebElement receivableAgingWebEelement = new WebDriverWait(
	     driver, 1000).until(ExpectedConditions
	     .elementToBeClickable(receivableAging_xpath));
	     receivableAgingWebEelement.click();
	     return new ReceivableAgingPage(driver);
	     } catch (Exception e) {
	     return null;
	     }
	     }
	     public EnterNewSaleInvoicesPage openEnterNewSaleInvoicesPage() {
	     try {
	     this.MouseOverOnMenu();
	     this.moveToLeftNavigation("ABL");
	     WebElement rolesandPermissionsWebEelement = new WebDriverWait(
	     driver, 1000).until(ExpectedConditions
	     .elementToBeClickable(enterNewSalesInvoices_xpath));
	     rolesandPermissionsWebEelement.click();
	     return new EnterNewSaleInvoicesPage(driver);
	     } catch (Exception e) {
	     return null;
	     }
	     }
	     public CurrentReceivablesPage openCurrentReceivablesPage() {
	     try {
	     this.MouseOverOnMenu();
	     this.moveToLeftNavigation("ABL");
	     WebElement CurrentReceivableWebEelement = new WebDriverWait(driver,
	     1000).until(ExpectedConditions
	     .elementToBeClickable(currentReceivables_xpath));
	     CurrentReceivableWebEelement.click();
	     return new CurrentReceivablesPage(driver);
	     } catch (Exception e) {
	     return null;
	     }
	     }
	     public DetailReceivablesPage openDetailReceivablesPage() {
	     try {
	     this.MouseOverOnMenu();
	     this.moveToLeftNavigation("ABL");
	     WebElement rolesandPermissionsWebEelement = new WebDriverWait(
	     driver, 1000).until(ExpectedConditions
	     .elementToBeClickable(detailReceivables_xpath));
	     rolesandPermissionsWebEelement.click();
	     return new DetailReceivablesPage(driver);
	     } catch (Exception e) {
	     return null;
	     }
	     }
	     public IneligibleSummaryPage openIneligibleSummaryPage(){
		 try {
		 this.MouseOverOnMenu();
		 this.moveToLeftNavigation("ABL");
		 WebElement receivableAgingWebEelement = new WebDriverWait(
		 driver, 1000).until(ExpectedConditions
		 .elementToBeClickable(ineligibleSummary_xpath));
		 receivableAgingWebEelement.click();
		 return new IneligibleSummaryPage(driver);
		 } catch (Exception e) {
		 return null;
		 }
		 }
		 public DebtorsPage opendebtorsPage() {
		 try {
		 this.MouseOverOnMenu();
		 this.moveToLeftNavigation("ABL");
		 WebElement debtorsWebEelement = new WebDriverWait(
		 driver, 1000).until(ExpectedConditions
		 .elementToBeClickable(debtors_xpath));
		 debtorsWebEelement.click();
		 return new DebtorsPage(driver);
		 } catch (Exception e) {
		 return null;
		 }

		 }


	
	 
	 
	 public MappingListViewPage openmappingListViewPage() { 
	         try {     
	         this.MouseOverOnMenu();     
	         this.moveToLeftNavigation("Client Maintenance");     
	         WebElement mappingListViewWebEelement = new WebDriverWait(driver, 1000)      
	         .until(ExpectedConditions.elementToBeClickable(mappingListView_xpath));     
	         mappingListViewWebEelement.click();     
	         Thread.sleep(10000);
	         return new MappingListViewPage(driver); } 
	         catch (Exception ex) {     
	         return null; }   
	  
	 
	 }
	 
	 public BBCFileRequiredPage openbbcFilesRequiredPage() { 
	         try {     
	         this.MouseOverOnMenu();     
	         this.moveToLeftNavigation("Client Maintenance");     
	         WebElement mappingListViewWebEelement = new WebDriverWait(driver, 1000)      
	         .until(ExpectedConditions.elementToBeClickable(bbcFilesRequired_xpath));     
	         mappingListViewWebEelement.click();     
	         Thread.sleep(10000);
	         return new BBCFileRequiredPage(driver); } 
	         catch (Exception ex) {     
	         return null; }   
	         }
	 
	 public ABLFileUploadPage openABLFileUploadsPage() { 
	         try {     
	         this.MouseOverOnMenu();     
	         this.moveToLeftNavigation("ABL");     
	         WebElement ABLFileUploadsWebEelement = new WebDriverWait(driver, 1000)      
	         .until(ExpectedConditions.elementToBeClickable(ablFileUploads_xpath));     
	         ABLFileUploadsWebEelement.click();     
	         Thread.sleep(10000);
	         return new ABLFileUploadPage(driver); } 
	         catch (Exception ex) {     
	         return null; }   
	         }
	 
	/* 
	 public CheckRegisterPage openCheckRegister() { 
         try {     
         this.MouseOverOnMenu();     
         this.moveToLeftNavigation("Cash Application");     
         WebElement CheckRegisterWebEelement = new WebDriverWait(driver, 1000)      
         .until(ExpectedConditions.elementToBeClickable(CheckRegisterPage_xpath));     
         CheckRegisterWebEelement.click();     
         Thread.sleep(10000);
         return new CheckRegisterPage(driver); } 
         catch (Exception ex) {     
         return null; }   
         }
	 


	 public BatchProcessPage openBatchProcess() { 
         try {     
         this.MouseOverOnMenu();     
         this.moveToLeftNavigation("Cash Application");     
         WebElement BatchProcesWebEelement = new WebDriverWait(driver, 1000)      
         .until(ExpectedConditions.elementToBeClickable(BatchProcessPage_xpath));     
         BatchProcesWebEelement.click();     
         Thread.sleep(20000);
         return new BatchProcessPage(driver); } 
         catch (Exception ex) {     
         return null; }   
         }
	 
	 
	 public CashReceiptHistoryPage openCashReceiptHistory() { 
         try {     
         this.MouseOverOnMenu();     
         this.moveToLeftNavigation("Cash Application");     
         WebElement CashReceiptWebEelement = new WebDriverWait(driver, 1000)      
         .until(ExpectedConditions.elementToBeClickable(CashReceiptHistoryPage_xpath));     
         CashReceiptWebEelement.click();     
         Thread.sleep(10000);
         return new CashReceiptHistoryPage(driver); } 
         catch (Exception ex) {     
         return null; }   
         }*/

	
	
	 
	  
	 
	 
	 
	 public AdministrationPageBreak openBasicDetailsPageBreak() { 
	 	   try {     
	 	   this.MouseOverOnMenu();     
	 	   this.moveToLeftNavigation("Administration");     
	 	   WebElement basicWebEelement = new WebDriverWait(driver, 1000)      
	 	   .until(ExpectedConditions.elementToBeClickable(basicDetails_xpath));     
	 	  basicWebEelement.click();    
	 	   Thread.sleep(10000);
	 	   return new AdministrationPageBreak(driver); } 
	 	   catch (Exception ex) {     
	 	   return null; 
	 	   }   
	 	   }
	    
	    
	    public AdministrationPageBreak openBankDetailsPageBreak() { 
	  	   try {     
	  	   this.MouseOverOnMenu();     
	  	   this.moveToLeftNavigation("Administration");     
	  	   WebElement basicWebEelement = new WebDriverWait(driver, 1000)      
	  	   .until(ExpectedConditions.elementToBeClickable(bankDetails_xpath));     
	  	  basicWebEelement.click();    
	  	   Thread.sleep(10000);
	  	   return new AdministrationPageBreak(driver); } 
	  	   catch (Exception ex) {     
	  	   return null; 
	  	   }   
	  	   }
	    
	    
	    public AdministrationPageBreak openIPAddessSetUp() { 
	   	   try {     
	   	   this.MouseOverOnMenu();     
	   	   this.moveToLeftNavigation("Administration");     
	   	   WebElement basicWebEelement = new WebDriverWait(driver, 1000)      
	   	   .until(ExpectedConditions.elementToBeClickable(ipAddessSetUp_xpath));     
	   	  basicWebEelement.click();    
	   	   Thread.sleep(10000);
	   	   return new AdministrationPageBreak(driver); } 
	   	   catch (Exception ex) {     
	   	   return null; 
	   	   }   
	   	   }


	    public boolean NavigateSalesRegionPageBreak() {
		try {
		    WebElement salesRegionWebEelement = new WebDriverWait(driver, 1000)
			    .until(ExpectedConditions
				    .visibilityOfElementLocated(salesRegions_xpath));
		    salesRegionWebEelement.click();
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	    }
	    public AdministrationPageBreak openSalesRegionPageBreak() {
		try {
		    this.MouseOverOnMenu();
		    this.moveToLeftNavigation("Administration");
		    WebElement salesRegionWebEelement = new WebDriverWait(driver, 1000)
			    .until(ExpectedConditions.elementToBeClickable(salesRegions_xpath));
		    salesRegionWebEelement.click();
		    return new AdministrationPageBreak(driver);
		} catch (Exception ex) {
		    return null;
		}
	    }
	    
	    public AdministrationPageBreak openNAICSCodes() {
			 try {
			     this.MouseOverOnMenu();
			     this.moveToLeftNavigation("Administration");
			     WebElement salesRegionWebEelement = new WebDriverWait(driver, 1000)
			      .until(ExpectedConditions.elementToBeClickable(naicsCodes_xpath));
			     salesRegionWebEelement.click();
			     return new AdministrationPageBreak(driver);
			 } catch (Exception ex) {
			    
			 }
			return null;
	    }
	    
	    
	    public AdministrationPageBreak openCommentsTypePageBreak() { 
			   try {     
			   this.MouseOverOnMenu();     
			   this.moveToLeftNavigation("Administration");     
			   WebElement commentsWebEelement = new WebDriverWait(driver, 1000)      
			   .until(ExpectedConditions.elementToBeClickable(commentsType_xpath));     
			   commentsWebEelement.click();     
			   Thread.sleep(10000);
			   return new AdministrationPageBreak(driver); } 
			   catch (Exception ex) {     
			   return null; }   
			   }   
	    
	    public AdministrationPageBreak openSystemParametersPageBreak() { 
			   try {     
			   this.MouseOverOnMenu();     
			   this.moveToLeftNavigation("Administration");     
			   WebElement SystemParametersWebEelement = new WebDriverWait(driver, 1000)      
			   .until(ExpectedConditions.elementToBeClickable(systemparameters_xpath));     
			   SystemParametersWebEelement.click();     
			   Thread.sleep(10000);
			   return new AdministrationPageBreak(driver); } 
			   catch (Exception ex) {     
			   return null; }   
			   } 
		 
		 
		 public AdministrationPageBreak openAdjustmentReasons() { 
			   try {     
			   this.MouseOverOnMenu();     
			   this.moveToLeftNavigation("Administration");     
			   WebElement SystemParametersWebEelement = new WebDriverWait(driver, 1000)      
			   .until(ExpectedConditions.elementToBeClickable(adjustmentReasons_xpath));     
			   SystemParametersWebEelement.click();     
			   Thread.sleep(10000);
			   return new AdministrationPageBreak(driver); } 
			   catch (Exception ex) {     
			   return null; }   
			   } 
		 
		 
		 public AdministrationPageBreak openInterestCalendar() { 
			   try {     
			   this.MouseOverOnMenu();     
			   this.moveToLeftNavigation("Administration");     
			   WebElement SystemParametersWebEelement = new WebDriverWait(driver, 1000)      
			   .until(ExpectedConditions.elementToBeClickable(interestCalendar_xpath));     
			   SystemParametersWebEelement.click();     
			   Thread.sleep(10000);
			   return new AdministrationPageBreak(driver); } 
			   catch (Exception ex) {     
			   return null; }   
			   } 		
		
		public AdministrationPageBreak openContentPagePageBreak() {
			 try {
			     this.MouseOverOnMenu();
			     this.moveToLeftNavigation("Administration");
			     WebElement salesRegionWebEelement = new WebDriverWait(driver, 1000)
			      .until(ExpectedConditions.elementToBeClickable(Content_xpath));
			     salesRegionWebEelement.click();
			     return new AdministrationPageBreak(driver);
			 } catch (Exception ex) {
			     return null;
			 }

			    }
		
		
		public AdministrationPageBreak openReportTemplates() {
			 try {
			     this.MouseOverOnMenu();
			     this.moveToLeftNavigation("Administration");
			     WebElement salesRegionWebEelement = new WebDriverWait(driver, 1000)
			      .until(ExpectedConditions.elementToBeClickable(reportTemplates_xpath));
			     salesRegionWebEelement.click();
			     return new AdministrationPageBreak(driver);
			 } catch (Exception ex) {
			     return null;
			 }

			    }
		
		
		public AdministrationPageBreak openCurrencyCode() {
			 try {
			     this.MouseOverOnMenu();
			     this.moveToLeftNavigation("Administration");
			     WebElement salesRegionWebEelement = new WebDriverWait(driver, 1000)
			      .until(ExpectedConditions.elementToBeClickable(currencyCode_xpath));
			     salesRegionWebEelement.click();
			     return new AdministrationPageBreak(driver);
			 } catch (Exception ex) {
			     return null;
			 }
		}
			 
			 public AdministrationPageBreak openUserList() {
				 try {
				     this.MouseOverOnMenu();
				     this.moveToLeftNavigation("Administration");
				     WebElement salesRegionWebEelement = new WebDriverWait(driver, 1000)
				      .until(ExpectedConditions.elementToBeClickable(userList_xpath));
				     salesRegionWebEelement.click();
				     return new AdministrationPageBreak(driver);
				 } catch (Exception ex) {
				     return null;
				 }

			    }
			 
			 
			 public AdministrationPageBreak openRolesPermission() {
				 try {
				     this.MouseOverOnMenu();
				     this.moveToLeftNavigation("Administration");
				     WebElement salesRegionWebEelement = new WebDriverWait(driver, 1000)
				      .until(ExpectedConditions.elementToBeClickable(rolespermission_xpath));
				     salesRegionWebEelement.click();
				     return new AdministrationPageBreak(driver);
				 } catch (Exception ex) {
				     return null;
				 }

			    }
			 
			 
			 public AdministrationPageBreak openClientAssignment() {
				 try {
				     this.MouseOverOnMenu();
				     this.moveToLeftNavigation("Administration");
				     WebElement salesRegionWebEelement = new WebDriverWait(driver, 1000)
				      .until(ExpectedConditions.elementToBeClickable(clientAssignment_xpath));
				     salesRegionWebEelement.click();
				     return new AdministrationPageBreak(driver);
				 } catch (Exception ex) {
				     return null;
				 }

			    }
			 
			 
			 public AdministrationPageBreak openUserDefinedFieldPageBreak() {
				 try {
				     this.MouseOverOnMenu();
				     this.moveToLeftNavigation("Administration");
				     WebElement salesRegionWebEelement = new WebDriverWait(driver, 1000)
				      .until(ExpectedConditions.elementToBeClickable(userDefined_xpath));
				     salesRegionWebEelement.click();
				     return new AdministrationPageBreak(driver);
				 } catch (Exception ex) {
				     return null;
				 }

			    }
			 
			 
			 public AdministrationPageBreak openAuditLogsPageBreak() {
				 try {
				     this.MouseOverOnMenu();
				     this.moveToLeftNavigation("Administration");
				     WebElement auditLogsWebEelement = new WebDriverWait(driver, 1000)
				      .until(ExpectedConditions.elementToBeClickable(auditLogs_xpath));
				     auditLogsWebEelement.click();
				     
				     return new AdministrationPageBreak(driver);
				 } catch (Exception ex) {
				     
				 }
				return null;
			 }
			 
			 
			 public AdministrationPageBreak openAutomatedTaskLogsPageBreak() {
				 try {
				     this.MouseOverOnMenu();
				     this.moveToLeftNavigation("Administration");
				     WebElement auditLogsWebEelement = new WebDriverWait(driver, 1000)
				      .until(ExpectedConditions.elementToBeClickable(automatedTaskLogs_xpath));
				     auditLogsWebEelement.click();
				     
				     return new AdministrationPageBreak(driver);
				 } catch (Exception ex) {
				     return null;
				 }

				    }   
			 
			 

			 public AdministrationPageBreak openNotificationLogsPageBreak() {
				 try {
				     this.MouseOverOnMenu();
				     this.moveToLeftNavigation("Administration");
				     WebElement auditLogsWebEelement = new WebDriverWait(driver, 1000)
				      .until(ExpectedConditions.elementToBeClickable(notificationLogs_xpath));
				     auditLogsWebEelement.click();
				     
				     return new AdministrationPageBreak(driver);
				 } catch (Exception ex) {
				     return null;
				 }

				    }  
			 

			 public AdministrationPageBreak openNotificationSettingsPageBreak() {
				 try {
				     this.MouseOverOnMenu();
				     this.moveToLeftNavigation("Administration");
				     WebElement auditLogsWebEelement = new WebDriverWait(driver, 1000)
				      .until(ExpectedConditions.elementToBeClickable(notificationSettings_xpath));
				     auditLogsWebEelement.click();
				     
				     return new AdministrationPageBreak(driver);
				 } catch (Exception ex) {
				     return null;
				 }

				    }  
			 
			 
			 public AdministrationPageBreak openTemplatePageBreak() { 
				   try {     
				   this.MouseOverOnMenu();     
				   this.moveToLeftNavigation("Administration");     
				   WebElement TemplatessWebEelement = new WebDriverWait(driver, 1000)      
				   .until(ExpectedConditions.elementToBeClickable(templates_xpath));     
				   TemplatessWebEelement.click();     
				   Thread.sleep(10000);
				   return new AdministrationPageBreak(driver); } 
				   catch (Exception ex) {     
				   return null; }   
				   }
			 
			 
			 public LoanMaintenancePageBreakTest openLoanSummaryPage(String clientName) {
					try {     
						   this.selectClientFromDropdown(clientName);
						   this.MouseOverOnMenu();     
						   this.moveToLeftNavigation("Loan Maintenance");     
						   WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)      
						   .until(ExpectedConditions.elementToBeClickable(loanSummary_xpath));     
						   InterestcodesWebEelement.click();    
						   Thread.sleep(10000);
						   return new LoanMaintenancePageBreakTest(driver); } 
						   catch (Exception ex) {     
						   return null; 
						   }   
						   }

			 
			 
			 
			 
			/* public LoanMaintenancePageBreakTest openLoanSummaryPageBreak(String clientName) { 
				   try {   
				   this.selectClientFromDropdown(clientName);
				   this.MouseOverOnMenu();     
				   this.moveToLeftNavigation("Loan Maintenance");     
				   WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)      
				   .until(ExpectedConditions.elementToBeClickable(loanSummary_xpath));     
				   InterestcodesWebEelement.click();    
				   Thread.sleep(10000);
				   return new LoanMaintenancePageBreakTest(driver); 
				   } 
				   catch (Exception ex) {     
				   return null; 
				   }   
				   }*/
			 
			 
			 
			 public LoanMaintenancePageBreakTest openCollateralLoansPageBreak(String clientName) { 
				   try {    
					   this.selectClientFromDropdown(clientName);
				   this.MouseOverOnMenu();     
				   this.moveToLeftNavigation("Loan Maintenance");     
				   WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)      
				   .until(ExpectedConditions.elementToBeClickable(collateralLoans_xpath));     
				   InterestcodesWebEelement.click();    
				   Thread.sleep(10000);
				   return new LoanMaintenancePageBreakTest(driver); 
				   } 
				   catch (Exception ex) {     
				   return null; 
				   }   
				   }
			 
			 public LoanMaintenancePageBreakTest openChargeTemplatesPageBreak(String clientName) { 
				   try {
				   this.selectClientFromDropdown(clientName);
				   this.MouseOverOnMenu();     
				   this.moveToLeftNavigation("Loan Maintenance");     
				   WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)      
				   .until(ExpectedConditions.elementToBeClickable(chargeTemplates_xpath));     
				   InterestcodesWebEelement.click();    
				   Thread.sleep(10000);
				   return new LoanMaintenancePageBreakTest(driver); 
				   } 
				   catch (Exception ex) {     
				   return null; 
				   }   
				   }
			 
			 public LoanMaintenancePageBreakTest openCollateralLoanFeeSetupPageBreak(String clientName) { 
				   try {    
					   this.selectClientFromDropdown(clientName);
				   this.MouseOverOnMenu();     
				   this.moveToLeftNavigation("Loan Maintenance");     
				   WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)      
				   .until(ExpectedConditions.elementToBeClickable(collateralLoanFeeSetup_xpath));     
				   InterestcodesWebEelement.click();    
				   Thread.sleep(10000);
				   return new LoanMaintenancePageBreakTest(driver); 
				   } 
				   catch (Exception ex) {     
				   return null; 
				   }   
				   }
			 
			 public LoanMaintenancePageBreakTest openProcessOneTimeManualChargesPageBreak(String clientName) { 
				   try {  
					   this.selectClientFromDropdown(clientName);
				   this.MouseOverOnMenu();     
				   this.moveToLeftNavigation("Loan Maintenance");     
				   WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)      
				   .until(ExpectedConditions.elementToBeClickable(ProcessOneTimeManualCharges_xpath));     
				   InterestcodesWebEelement.click();    
				   Thread.sleep(10000);
				   return new LoanMaintenancePageBreakTest(driver); 
				   } 
				   catch (Exception ex) {     
				   return null; 
				   }   
				   }
			 
			 public LoanMaintenancePageBreakTest openDailyTransactionReportingPageBreak(String clientName) { 
				   try { 
					   this.selectClientFromDropdown(clientName);
				   this.MouseOverOnMenu();     
				   this.moveToLeftNavigation("Loan Maintenance");     
				   WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)      
				   .until(ExpectedConditions.elementToBeClickable(dailyTransactionReporting_xpath));     
				   InterestcodesWebEelement.click();    
				   Thread.sleep(10000);
				   return new LoanMaintenancePageBreakTest(driver); 
				   } 
				   catch (Exception ex) {     
				   return null; 
				   }   
				   }
			 
			 public LoanMaintenancePageBreakTest openInterestRecalculationPageBreak(String clientName) { 
				   try { 
					   this.selectClientFromDropdown(clientName);
				   this.MouseOverOnMenu();     
				   this.moveToLeftNavigation("Loan Maintenance");     
				   WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)      
				   .until(ExpectedConditions.elementToBeClickable(interestRecalculation_xpath));     
				   InterestcodesWebEelement.click();    
				   Thread.sleep(10000);
				   return new LoanMaintenancePageBreakTest(driver); 
				   } 
				   catch (Exception ex) {     
				   return null; 
				   }   
				   }
			 
			 public LoanMaintenancePageBreakTest openInterestPaymentPageBreak(String clientName) { 
				   try { 
					   this.selectClientFromDropdown(clientName);
				   this.MouseOverOnMenu();     
				   this.moveToLeftNavigation("Loan Maintenance");     
				   WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)      
				   .until(ExpectedConditions.elementToBeClickable(interestPayment_xpath));     
				   InterestcodesWebEelement.click();    
				   Thread.sleep(10000);
				   return new LoanMaintenancePageBreakTest(driver); 
				   } 
				   catch (Exception ex) {     
				   return null; 
				   }   
				   }
			 
			 public LoanMaintenancePageBreakTest openInterestPaymentRecalculationPageBreak(String clientName) { 
				   try { 
					   this.selectClientFromDropdown(clientName);
				   this.MouseOverOnMenu();     
				   this.moveToLeftNavigation("Loan Maintenance");     
				   WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)      
				   .until(ExpectedConditions.elementToBeClickable(interestPaymentRecalculation_xpath));     
				   InterestcodesWebEelement.click();    
				   Thread.sleep(10000);
				   return new LoanMaintenancePageBreakTest(driver); 
				   } 
				   catch (Exception ex) {     
				   return null; 
				   }   
				   }
			 
			 
			 public LoanMaintenancePageBreakTest openLetterOfCreditsPageBreak(String clientName) { 
				   try {  
					   this.selectClientFromDropdown(clientName);
				   this.MouseOverOnMenu();     
				   this.moveToLeftNavigation("Loan Maintenance");     
				   WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)      
				   .until(ExpectedConditions.elementToBeClickable(letterofCredits_xpath));     
				   InterestcodesWebEelement.click();    
				   Thread.sleep(10000);
				   return new LoanMaintenancePageBreakTest(driver); 
				   } 
				   catch (Exception ex) {     
				   return null; 
				   }   
				   }
			 
			 
			 public LoanMaintenancePageBreakTest openPayoffInquiryPageBreak(String clientName) { 
				   try {  
					   this.selectClientFromDropdown(clientName);
				   this.MouseOverOnMenu();     
				   this.moveToLeftNavigation("Loan Maintenance");     
				   WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)      
				   .until(ExpectedConditions.elementToBeClickable(PayoffInquiry_xpath));     
				   InterestcodesWebEelement.click();    
				   Thread.sleep(10000);
				   return new LoanMaintenancePageBreakTest(driver); 
				   } 
				   catch (Exception ex) {     
				   return null; 
				   }   
				   }
			 
			 
			 public LoanMaintenancePageBreakTest openAutoProcessCollateralLoanSettingsPageBreak(String clientName) { 
				   try {  
					   this.selectClientFromDropdown(clientName);
				   this.MouseOverOnMenu();     
				   this.moveToLeftNavigation("Loan Maintenance");     
				   WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)      
				   .until(ExpectedConditions.elementToBeClickable(autoHeader_xpath));     
				   InterestcodesWebEelement.click();    
				   Thread.sleep(10000);
				   return new LoanMaintenancePageBreakTest(driver); 
				   } 
				   catch (Exception ex) {     
				   return null; 
				   }   
				   }
			 
			 
			 public LoanMaintenancePageBreakTest openTermLoanCreationPageBreak(String clientName) { 
				   try {  
					   this.selectClientFromDropdown(clientName);
				   this.MouseOverOnMenu();     
				   this.moveToLeftNavigation("Loan Maintenance");     
				   WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)      
				   .until(ExpectedConditions.elementToBeClickable(TermLoanCreationHeader_xpath));     
				   InterestcodesWebEelement.click();    
				   Thread.sleep(10000);
				   return new LoanMaintenancePageBreakTest(driver); 
				   } 
				   catch (Exception ex) {     
				   return null; 
				   }   
				   }
			 
			 
			 public LoanMaintenancePageBreakTest openTermLoanSetupPageBreak(String clientName) { 
				   try {  
					   this.selectClientFromDropdown(clientName);
				   this.MouseOverOnMenu();     
				   this.moveToLeftNavigation("Loan Maintenance");     
				   WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)      
				   .until(ExpectedConditions.elementToBeClickable(TermLoanSetupHeader_xpath));     
				   InterestcodesWebEelement.click();    
				   Thread.sleep(10000);
				   return new LoanMaintenancePageBreakTest(driver); 
				   } 
				   catch (Exception ex) {     
				   return null; 
				   }   
				   }
			 
			 
			 public LoanMaintenancePageBreakTest openTermLoanCollateralsPageBreak(String clientName) { 
				   try {  
					   this.selectClientFromDropdown(clientName);
				   this.MouseOverOnMenu();     
				   this.moveToLeftNavigation("Loan Maintenance");     
				   WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)      
				   .until(ExpectedConditions.elementToBeClickable(TermLoanCollateralsHeader_xpath));     
				   InterestcodesWebEelement.click();    
				   Thread.sleep(10000);
				   return new LoanMaintenancePageBreakTest(driver); 
				   } 
				   catch (Exception ex) {     
				   return null; 
				   }   
				   }
			 
			 
			 public LoanMaintenancePageBreakTest openTermLoansPageBreak(String clientName) { 
				   try {  
					   this.selectClientFromDropdown(clientName);
				   this.MouseOverOnMenu();     
				   this.moveToLeftNavigation("Loan Maintenance");     
				   WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)      
				   .until(ExpectedConditions.elementToBeClickable(TermLoansHeader_xpath));     
				   InterestcodesWebEelement.click();    
				   Thread.sleep(10000);
				   return new LoanMaintenancePageBreakTest(driver); 
				   } 
				   catch (Exception ex) {     
				   return null; 
				   }   
				   }


			 public LoanMaintenancePageBreakTest openCreditLineLoanCreationPageBreak(String clientName) { 
				   try {  
					   this.selectClientFromDropdown(clientName);
				   this.MouseOverOnMenu();     
				   this.moveToLeftNavigation("Loan Maintenance");     
				   WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)      
				   .until(ExpectedConditions.elementToBeClickable(CreditLineLoanCreationHeader_xpath));     
				   InterestcodesWebEelement.click();    
				   Thread.sleep(10000);
				   return new LoanMaintenancePageBreakTest(driver); 
				   } 
				   catch (Exception ex) {     
				   return null; 
				   }   
				   }

			 
			 public LoanMaintenancePageBreakTest openCreditLineChargesSetupPageBreak(String clientName) { 
				   try {  
					   this.selectClientFromDropdown(clientName);
				   this.MouseOverOnMenu();     
				   this.moveToLeftNavigation("Loan Maintenance");     
				   WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)      
				   .until(ExpectedConditions.elementToBeClickable(CreditLineChargesSetupHeader_xpath));     
				   InterestcodesWebEelement.click();    
				   Thread.sleep(10000);
				   return new LoanMaintenancePageBreakTest(driver); 
				   } 
				   catch (Exception ex) {     
				   return null; 
				   }   
				   }

			 public LoanMaintenancePageBreakTest openCreditLineLoanCollateralSetupPageBreak(String clientName) { 
				   try {  
					   this.selectClientFromDropdown(clientName);
				   this.MouseOverOnMenu();     
				   this.moveToLeftNavigation("Loan Maintenance");     
				   WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)      
				   .until(ExpectedConditions.elementToBeClickable(CreditLineLoanCollateralSetupHeader_xpath));     
				   InterestcodesWebEelement.click();    
				   Thread.sleep(10000);
				   return new LoanMaintenancePageBreakTest(driver); 
				   } 
				   catch (Exception ex) {     
				   return null; 
				   }   
				   }
			 

			 public LoanMaintenancePageBreakTest openCreditLineLoansPageBreak(String clientName) { 
				   try {  
					   this.selectClientFromDropdown(clientName);
				   this.MouseOverOnMenu();     
				   this.moveToLeftNavigation("Loan Maintenance");     
				   WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)      
				   .until(ExpectedConditions.elementToBeClickable(CreditLineLoansHeader_xpath));     
				   InterestcodesWebEelement.click();    
				   Thread.sleep(10000);
				   return new LoanMaintenancePageBreakTest(driver); 
				   } 
				   catch (Exception ex) {     
				   return null; 
				   }   
				   }

			 
			 public LoanMaintenancePageBreakTest openParticipationPartiesPageBreak(String clientName) { 
				   try {  
					   this.selectClientFromDropdown(clientName);
				   this.MouseOverOnMenu();     
				   this.moveToLeftNavigation("Loan Maintenance");     
				   WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)      
				   .until(ExpectedConditions.elementToBeClickable(ParticipationPartiesHeader_xpath));     
				   InterestcodesWebEelement.click();    
				   Thread.sleep(10000);
				   return new LoanMaintenancePageBreakTest(driver); 
				   } 
				   catch (Exception ex) {     
				   return null; 
				   }   
				   }

			 
			 
			 public LoanMaintenancePageBreakTest openParticipationLoanDetailsPageBreak(String clientName) { 
				   try {  
					   this.selectClientFromDropdown(clientName);
				   this.MouseOverOnMenu();     
				   this.moveToLeftNavigation("Loan Maintenance");     
				   WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)      
				   .until(ExpectedConditions.elementToBeClickable(ParticipationLoanDetailsHeader_xpath));     
				   InterestcodesWebEelement.click();    
				   Thread.sleep(10000);
				   return new LoanMaintenancePageBreakTest(driver); 
				   } 
				   catch (Exception ex) {     
				   return null; 
				   }   
				   }

			 
			 public LoanMaintenancePageBreakTest openParticipationInquiryPageBreak(String clientName) { 
				   try {  
					   this.selectClientFromDropdown(clientName);
				   this.MouseOverOnMenu();     
				   this.moveToLeftNavigation("Loan Maintenance");     
				   WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)      
				   .until(ExpectedConditions.elementToBeClickable(ParticipationInquiryHeader_xpath));     
				   InterestcodesWebEelement.click();    
				   Thread.sleep(10000);
				   return new LoanMaintenancePageBreakTest(driver); 
				   } 
				   catch (Exception ex) {     
				   return null; 
				   }   
				   }

	 
	 
			 public boolean selectClientFromDropdown(String ClientData)
			 {
			     try{
				 this.SelectClientFunction();
				 this.addValueToSearch(ClientData);
				 this.SearchClientClick();

				 Thread.sleep(5000);

				 return true;
				 }
				 catch(Exception ex){
				 return false;
				 }

				 } 
			 
                        public CashApplicationPageBreak openCashReceiptSourceCodesPageBreak() { 
		         try {     
		         this.MouseOverOnMenu();     
		         this.moveToLeftNavigation("Cash Application");     
		         WebElement BatchCashWebEelement = new WebDriverWait(driver, 1000)      
		         .until(ExpectedConditions.elementToBeClickable(openCashReceiptSourceCodesPageBreak_xpath));     
		         BatchCashWebEelement.click();     
		         Thread.sleep(10000);
		         return new CashApplicationPageBreak(driver); } 
		         catch (Exception ex) {     
		         return null; }   
		         }
	 
                        
                        public CashApplicationPageBreak openUnprocessedChecksPageBreak() { 
   		         try {     
   		         this.MouseOverOnMenu();     
   		         this.moveToLeftNavigation("Cash Application");     
   		         WebElement BatchCashWebEelement = new WebDriverWait(driver, 1000)      
   		         .until(ExpectedConditions.elementToBeClickable(openUnprocessedChecksPageBreak_xpath));     
   		         BatchCashWebEelement.click();     
   		         Thread.sleep(10000);
   		         return new CashApplicationPageBreak(driver); } 
   		         catch (Exception ex) {     
   		         return null; }   
   		         }
                        
                        
                        
                        public CashApplicationPageBreak openBatchCashPageBreak() { 
   		         try {     
   		         this.MouseOverOnMenu();     
   		         this.moveToLeftNavigation("Cash Application");     
   		         WebElement BatchCashWebEelement = new WebDriverWait(driver, 1000)      
   		         .until(ExpectedConditions.elementToBeClickable(BatchCashPage_xpath));     
   		         BatchCashWebEelement.click();     
   		         Thread.sleep(10000);
   		         return new CashApplicationPageBreak(driver); } 
   		         catch (Exception ex) {     
   		         return null; }   
   		         }
                        
                        public CashApplicationPageBreak openCheckRegisterPageBreak() { 
   		         try {     
   		         this.MouseOverOnMenu();     
   		         this.moveToLeftNavigation("Cash Application");     
   		         WebElement BatchCashWebEelement = new WebDriverWait(driver, 1000)      
   		         .until(ExpectedConditions.elementToBeClickable(openCheckRegisterPageBreak_xpath));     
   		         BatchCashWebEelement.click();     
   		         Thread.sleep(10000);
   		         return new CashApplicationPageBreak(driver); } 
   		         catch (Exception ex) {     
   		         return null; }   
   		         }
                        
                        public CashApplicationPageBreak openBatchProcessPageBreak() { 
   		         try {     
   		         this.MouseOverOnMenu();     
   		         this.moveToLeftNavigation("Cash Application");     
   		         WebElement BatchCashWebEelement = new WebDriverWait(driver, 1000)      
   		         .until(ExpectedConditions.elementToBeClickable(openBatchProcessPageBreak_xpath));     
   		         BatchCashWebEelement.click();     
   		         Thread.sleep(10000);
   		         return new CashApplicationPageBreak(driver); } 
   		         catch (Exception ex) {     
   		         return null; }   
   		         }
                        
                        public CashApplicationPageBreak openCashReceiptHistoryPageBreak() { 
   		         try {     
   		         this.MouseOverOnMenu();     
   		         this.moveToLeftNavigation("Cash Application");     
   		         WebElement BatchCashWebEelement = new WebDriverWait(driver, 1000)      
   		         .until(ExpectedConditions.elementToBeClickable(openCashReceiptHistoryPageBreak_xpath));     
   		         BatchCashWebEelement.click();     
   		         Thread.sleep(10000);
   		         return new CashApplicationPageBreak(driver); } 
   		         catch (Exception ex) {     
   		         return null; }   
   		         }
                        
                        public CashApplicationPageBreak openDailyCashPostingPageBreak() { 
   		         try {     
   		         this.MouseOverOnMenu();     
   		         this.moveToLeftNavigation("Cash Application");     
   		         WebElement BatchCashWebEelement = new WebDriverWait(driver, 1000)      
   		         .until(ExpectedConditions.elementToBeClickable(openDailyCashPostingPageBreak_xpath));     
   		         BatchCashWebEelement.click();     
   		         Thread.sleep(10000);
   		         return new CashApplicationPageBreak(driver); } 
   		         catch (Exception ex) {     
   		         return null; }   
   		         }
                        
                        
                        public CashApplicationPageBreak openDailyCashTransactionReportingPageBreak() { 
   		         try {     
   		         this.MouseOverOnMenu();     
   		         this.moveToLeftNavigation("Cash Application");     
   		         WebElement BatchCashWebEelement = new WebDriverWait(driver, 1000)      
   		         .until(ExpectedConditions.elementToBeClickable(openDailyCashTransactionReportingPageBreak_xpath));     
   		         BatchCashWebEelement.click();     
   		         Thread.sleep(10000);
   		         return new CashApplicationPageBreak(driver); } 
   		         catch (Exception ex) {     
   		         return null; }   
   		         }
                        
                        public CashApplicationPageBreak openCreditMemoPageBreak() { 
   		         try {     
   		         this.MouseOverOnMenu();     
   		         this.moveToLeftNavigation("Cash Application");     
   		         WebElement BatchCashWebEelement = new WebDriverWait(driver, 1000)      
   		         .until(ExpectedConditions.elementToBeClickable(openCreditMemoPageBreak_xpath));     
   		         BatchCashWebEelement.click();     
   		         Thread.sleep(10000);
   		         return new CashApplicationPageBreak(driver); } 
   		         catch (Exception ex) {     
   		         return null; }   
   		         }
                        
                        public CashApplicationPageBreak openCreditMemoHistoryPageBreak() { 
      		         try {     
      		         this.MouseOverOnMenu();     
      		         this.moveToLeftNavigation("Cash Application");     
      		         WebElement BatchCashWebEelement = new WebDriverWait(driver, 1000)      
      		         .until(ExpectedConditions.elementToBeClickable(openCreditMemoHistoryPageBreak_xpath));     
      		         BatchCashWebEelement.click();     
      		         Thread.sleep(10000);
      		         return new CashApplicationPageBreak(driver); } 
      		         catch (Exception ex) {     
      		         return null; }   
      		         }
                        
                        public DocumentManagementPageBreak openDocumentManagementPageBreak() { 
         		         try {     
         		         this.MouseOverOnMenu();     
         		         WebElement documentMangmentWebEelement = new WebDriverWait(driver, 1000)      
         		         .until(ExpectedConditions.elementToBeClickable(openDocumentMangmentPageBreak_xpath));     
         		        documentMangmentWebEelement.click();     
         		         Thread.sleep(10000);
         		         return new DocumentManagementPageBreak(driver); } 
         		         catch (Exception ex) {     
         		         return null; }   
         		         }
                        
                        
                        public ExceptionAnalysisPageBreak openDocumentComplianceReportingPageBreak() { 
         		         try {     
         		         this.MouseOverOnMenu();     
         		         this.moveToLeftNavigation("Exception Analysis");     
         		         WebElement BatchCashWebEelement = new WebDriverWait(driver, 1000)      
         		         .until(ExpectedConditions.elementToBeClickable(openDocumentComplianceReportingPageBreak_xpath));     
         		         BatchCashWebEelement.click();     
         		         Thread.sleep(10000);
         		         return new ExceptionAnalysisPageBreak(driver); } 
         		         catch (Exception ex) {     
         		         return null; }   
         		         }
                        
                        
                        
                        public ExceptionAnalysisPageBreak openExceptionReportingPageBreak() { 
         		         try {     
         		         this.MouseOverOnMenu();     
         		         this.moveToLeftNavigation("Exception Analysis");     
         		         WebElement BatchCashWebEelement = new WebDriverWait(driver, 1000)      
         		         .until(ExpectedConditions.elementToBeClickable(openExceptionReportingPageBreak_xpath));     
         		         BatchCashWebEelement.click();     
         		         Thread.sleep(10000);
         		         return new ExceptionAnalysisPageBreak(driver); } 
         		         catch (Exception ex) {     
         		         return null; }   
         		         }
                        
                        
                        public ExceptionAnalysisPageBreak openWatchListStatisticsReportingPageBreak() { 
    		         try {     
    		         this.MouseOverOnMenu();     
    		         this.moveToLeftNavigation("Exception Analysis");     
    		         WebElement BatchCashWebEelement = new WebDriverWait(driver, 1000)      
    		         .until(ExpectedConditions.elementToBeClickable(openWatchListStatisticsReportingPageBreak_xpath));     
    		         BatchCashWebEelement.click();     
    		         Thread.sleep(10000);
    		         return new ExceptionAnalysisPageBreak(driver); } 
    		         catch (Exception ex) {     
    		         return null; }   
    		         }
                   
                        
                        public ExceptionAnalysisPageBreak openTicklerTasksPageBreak() { 
    		         try {     
    		         this.MouseOverOnMenu();     
    		         this.moveToLeftNavigation("Exception Analysis");     
    		         WebElement BatchCashWebEelement = new WebDriverWait(driver, 1000)      
    		         .until(ExpectedConditions.elementToBeClickable(openTicklerTasksPageBreak_xpath));     
    		         BatchCashWebEelement.click();     
    		         Thread.sleep(10000);
    		         return new ExceptionAnalysisPageBreak(driver); } 
    		         catch (Exception ex) {     
    		         return null; }   
    		         }
                   
                        
                        public ExceptionAnalysisPageBreak openDilutionAnalysisPageBreak() { 
       		         try {     
       		         this.MouseOverOnMenu();     
       		         this.moveToLeftNavigation("Exception Analysis");     
       		         WebElement BatchCashWebEelement = new WebDriverWait(driver, 1000)      
       		         .until(ExpectedConditions.elementToBeClickable(openDilutionAnalysisPageBreak_xpath));     
       		         BatchCashWebEelement.click();     
       		         Thread.sleep(10000);
       		         return new ExceptionAnalysisPageBreak(driver); } 
       		         catch (Exception ex) {     
       		         return null; }   
       		         }
                        
                        
                        
                        public ABLPageNavigation openBBCDocumentsPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement ABLFileUploadsWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(BBCDocuments_xpath));     
                            ABLFileUploadsWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ABLPageNavigation opendetailReceivablesPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement ABLFileUploadsWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(detailReceivablesPage_xpath));     
                            ABLFileUploadsWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ABLPageNavigation opensummaryReceivablesPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement ABLFileUploadsWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(summaryReceivablesPage_xpath));     
                            ABLFileUploadsWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation opendetailPayablesPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement ABLFileUploadsWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(detailPayablesPage_xpath));     
                            ABLFileUploadsWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ABLPageNavigation opensummaryPayablesPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement ABLFileUploadsWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(summaryPayablesPage_xpath));     
                            ABLFileUploadsWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ABLPageNavigation openassetsInventoryPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement ABLFileUploadsWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(assetsInventoryPage_xpath));     
                            ABLFileUploadsWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ABLPageNavigation opencashReceiptsPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement ABLFileUploadsWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(cashReceiptsPage_xpath));     
                            ABLFileUploadsWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	
                   	 public ABLPageNavigation openhistoryPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement ABLFileUploadsWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(historyPage_xpath));     
                            ABLFileUploadsWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ABLPageNavigation openwarningPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement ABLFileUploadsWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(warningPage_xpath));     
                            ABLFileUploadsWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ABLPageNavigation openBatchCashReceiptsPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement openBatchCashReceiptsPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(openBatchCashReceiptsPage_xpath));     
                            openBatchCashReceiptsPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 
                   	 public ABLPageNavigation BBCstobeApprovedPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement BBCstobeApprovedPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(BBCstobeApprovedPage_xpath));     
                            BBCstobeApprovedPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation BBCstobeMovedforfundingPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement BBCstobeMovedforfundingPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(BBCstobeMovedforfundingPage_xpath));     
                            BBCstobeMovedforfundingPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation BBCstobeFundedPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement BBCstobeFundedPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(BBCstobeFundedPage_xpath));     
                            BBCstobeFundedPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation BBCstobeProcessedPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement BBCstobeProcessedPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(BBCstobeProcessedPage_xpath));     
                            BBCstobeProcessedPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ABLPageNavigation fundRequestPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement fundRequestPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(fundRequestPage_xpath));     
                            fundRequestPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ABLPageNavigation BBCReviewDataPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement BBCReviewDataPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(BBCReviewDataPage_xpath));     
                            BBCReviewDataPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ABLPageNavigation receivablesRollforwardPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement receivablesRollforwardPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(receivablesRollforwardPage_xpath));     
                            receivablesRollforwardPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation receivableAgingPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement receivableAgingPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(receivableAgingPage_xpath));     
                            receivableAgingPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation ineligibleSummaryPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement ineligibleSummaryPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(ineligibleSummaryPage_xpath));     
                            ineligibleSummaryPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ABLPageNavigation assetsInventoryPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement assetsInventoryPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(assetsInventoryPage_xpath));     
                            assetsInventoryPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation otherCollateralPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement otherCollateralPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(otherCollateral_xpath_xpath));     
                            otherCollateralPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ABLPageNavigation lineReservesPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement lineReservesPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(lineReservesPage_xpath));     
                            lineReservesPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation BBCAvailabilityPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement BBCAvailabilityPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(BBCAvailabilityPage_xpath));     
                            BBCAvailabilityPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation BBCRecalculationProcessPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement BBCRecalculationProcessPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(BBCRecalculationProcessPage_xpath));     
                            BBCRecalculationProcessPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ABLPageNavigation debtorsPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement debtorsPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(debtorsPage_xpath));     
                            debtorsPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation vendorsPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement vendorsPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(vendorsPage_xpath));     
                            vendorsPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ABLPageNavigation contrasPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement contrasPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(contrasPage_xpath));     
                            contrasPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ABLPageNavigation globalAccountsPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement globalAccountsPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(globalAccountsPage_xpath));     
                            globalAccountsPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation parentAssignmentPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement parentAssignmentPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(parentAssignmentPage_xpath));     
                            parentAssignmentPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation contraAssignmentPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement contraAssignmentPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(contraAssignmentPage_xpath));     
                            contraAssignmentPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 
                   	 public ABLPageNavigation debtorParentChildRelationPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement debtorParentChildRelationPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(debtorParentChildRelationPage_xpath));     
                            debtorParentChildRelationPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation vendorParentChildRelationPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement vendorParentChildRelationPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(vendorParentChildRelationPage_xpath));     
                            vendorParentChildRelationPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation dataReviewHistoryPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement dataReviewHistoryPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(dataReviewHistoryPage_xpath));     
                            dataReviewHistoryPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation BBCDocumentsHistoryPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement BBCDocumentsHistoryPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(BBCDocumentsHistoryPage_xpath));     
                            BBCDocumentsHistoryPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation detailReceivablesHistoryPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement detailReceivablesHistoryPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(detailReceivablesHistoryPage_xpath));     
                            detailReceivablesHistoryPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation summaryReceivablesHistoryPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement summaryReceivablesHistoryPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(summaryReceivablesHistoryPage_xpath));     
                            summaryReceivablesHistoryPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation detailPayablesHistoryPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement detailPayablesHistoryPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(detailPayablesHistoryPage_xpath));     
                            detailPayablesHistoryPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation summaryPayablesHistoryPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement summaryPayablesHistoryPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(summaryPayablesHistoryPage_xpath));     
                            summaryPayablesHistoryPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ABLPageNavigation assetsInventoryHistoryPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement assetsInventoryHistoryPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(assetsInventoryHistoryPage_xpath));     
                            assetsInventoryHistoryPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation cashRecieptsHistoryPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement cashRecieptsHistoryPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(cashRecieptsHistoryPage_xpath));     
                            cashRecieptsHistoryPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation BBCReviewDataHistoryPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement BBCReviewDataHistoryPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(BBCReviewDataHistoryPage_xpath));     
                            BBCReviewDataHistoryPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation receivablesRollforwardHistoryPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement receivablesRollforwardHistoryPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(receivablesRollforwardHistoryPage_xpath));     
                            receivablesRollforwardHistoryPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation receivableAgingHistoryPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement receivableAgingHistoryPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(receivableAgingHistoryPage_xpath));     
                            receivableAgingHistoryPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ABLPageNavigation ineligibleSummaryHistoryPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement ineligibleSummaryHistoryPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(ineligibleSummaryHistoryPage_xpath));     
                            ineligibleSummaryHistoryPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ABLPageNavigation assetsInventoryBBCHistoryPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement assetsInventoryBBCHistoryPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(assetsInventoryBBCHistoryPage_xpath));     
                            assetsInventoryBBCHistoryPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ABLPageNavigation otherCollateralHistoryPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement otherCollateralHistoryPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(otherCollateralHistoryPage_xpath));     
                            otherCollateralHistoryPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ABLPageNavigation lineReservesHistoryPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement lineReservesHistoryPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(lineReservesHistoryPage_xpath));     
                            lineReservesHistoryPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation BBCAvailabilityHistoryPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement BBCAvailabilityHistoryPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(BBCAvailabilityHistoryPage_xpath));     
                            BBCAvailabilityHistoryPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation amendDetailsHistoryPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement amendDetailsHistoryPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(amendDetailsHistoryPage_xpath));     
                            amendDetailsHistoryPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ABLPageNavigation enterNewSaleInvoicesPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement enterNewSaleInvoicesPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(enterNewSaleInvoicesPage_xpath));     
                            enterNewSaleInvoicesPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ABLPageNavigation currentReceivablesPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement currentReceivablesPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(currentReceivablesPage_xpath));     
                            currentReceivablesPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ABLPageNavigation cashReceiptsPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement cashReceiptsPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(cashReceiptsPage_xpath));     
                            cashReceiptsPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ABLPageNavigation borrowerReceivablesPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement borrowerReceivablesPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(borrowerReceivablesPage_xpath));     
                            borrowerReceivablesPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation unapprovedBBCsPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement unapprovedBBCsPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(unapprovedBBCsPage_xpath));     
                            unapprovedBBCsPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ABLPageNavigation signBBCPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement signBBCPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(signBBCPage_xpath));     
                            signBBCPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ABLPageNavigation approveBBCFundingPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement approveBBCFundingPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(approveBBCFundingPage_xpath));     
                            approveBBCFundingPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation fundReleaseBBCPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement fundReleaseBBCPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(fundReleaseBBCPage_xpath));     
                            fundReleaseBBCPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation ineligibilityReasonsPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement ineligibilityReasonsPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(ineligibilityReasonsPage_xpath));     
                            ineligibilityReasonsPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation fileClassificationSummaryPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement fileClassificationSummaryPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(fileClassificationSummaryPage_xpath));     
                            fileClassificationSummaryPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation exceptionsSummaryPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement exceptionsSummaryPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(exceptionsSummaryPage_xpath));     
                            exceptionsSummaryPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation chargeCodesPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement chargeCodesPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(chargeCodesPage_xpath));     
                            chargeCodesPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation interestRateCodesPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement interestRateCodesPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(interestRateCodesPage_xpath));     
                            interestRateCodesPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ABLPageNavigation letterProcessingPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement letterProcessingPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(letterProcessingPage_xpath));     
                            letterProcessingPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation letterTrackingPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement letterTrackingPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(letterTrackingPage_xpath));     
                            letterTrackingPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation letterInquiryPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement letterInquiryPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(letterInquiryPage_xpath));     
                            letterInquiryPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation ACDebtorStatusPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement ACDebtorStatusPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(ACDebtorStatusPage_xpath));     
                            ACDebtorStatusPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation ABLGLSetupPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement ABLGLSetupPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(ABLGLSetupPage_xpath));     
                            ABLGLSetupPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ABLPageNavigation ABLGLTransactionsPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("ABL");     
                            WebElement ABLGLTransactionsPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(ABLGLTransactionsPage_xpath));     
                            ABLGLTransactionsPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ABLPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ChartsGraphsPageNavigation loanAvailabilitybyManagerPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("Charts and Graphs");     
                            WebElement loanAvailabilitybyManagerPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(loanAvailabilitybyManagerPage_xpath));     
                            loanAvailabilitybyManagerPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ChartsGraphsPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ChartsGraphsPageNavigation loanAvailabilitybyClientPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("Charts and Graphs");     
                            WebElement loanAvailabilitybyClientPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(loanAvailabilitybyClientPage_xpath));     
                            loanAvailabilitybyClientPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ChartsGraphsPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ChartsGraphsPageNavigation top10ARConcentrationsbyClientPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("Charts and Graphs");     
                            WebElement top10ARConcentrationsbyClientPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(top10ARConcentrationsbyClientPage_xpath));     
                            top10ARConcentrationsbyClientPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ChartsGraphsPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ChartsGraphsPageNavigation top10APConcentrationsbyClientPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("Charts and Graphs");     
                            WebElement top10APConcentrationsbyClientPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(top10APConcentrationsbyClientPage_xpath));     
                            top10APConcentrationsbyClientPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ChartsGraphsPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ChartsGraphsPageNavigation ARAPComparisonbyClientPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("Charts and Graphs");     
                            WebElement ARAPComparisonbyClientPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(ARAPComparisonbyClientPage_xpath));     
                            ARAPComparisonbyClientPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ChartsGraphsPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ChartsGraphsPageNavigation BBCIneligiblesbyClientPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("Charts and Graphs");     
                            WebElement BBCIneligiblesbyClientPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(BBCIneligiblesbyClientPage_xpath));     
                            BBCIneligiblesbyClientPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ChartsGraphsPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ChartsGraphsPageNavigation receivableBBCagingbyClientPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("Charts and Graphs");     
                            WebElement receivableBBCagingbyClientPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(receivableBBCagingbyClientPage_xpath));     
                            receivableBBCagingbyClientPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ChartsGraphsPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ChartsGraphsPageNavigation receivableSpreadsbyYearPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("Charts and Graphs");     
                            WebElement receivableSpreadsbyYearPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(receivableSpreadsbyYearPage_xpath));     
                            receivableSpreadsbyYearPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ChartsGraphsPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 public ChartsGraphsPageNavigation payableSpreadsbyYearPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("Charts and Graphs");     
                            WebElement payableSpreadsbyYearPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(payableSpreadsbyYearPage_xpath));     
                            payableSpreadsbyYearPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ChartsGraphsPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ChartsGraphsPageNavigation receivableAgingbyClientPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("Charts and Graphs");     
                            WebElement receivableAgingbyClientPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(receivableAgingbyClientPage_xpath));     
                            receivableAgingbyClientPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ChartsGraphsPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ChartsGraphsPageNavigation BBCAvailabilitybyClientPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("Charts and Graphs");     
                            WebElement BBCAvailabilitybyClientPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(BBCAvailabilitybyClientPage_xpath));     
                            BBCAvailabilitybyClientPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ChartsGraphsPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }
                   	 
                   	 
                   	 public ChartsGraphsPageNavigation ARStatsDilutiononSalesPage() { 
                            try {     
                            this.MouseOverOnMenu();     
                            this.moveToLeftNavigation("Charts and Graphs");     
                            WebElement ARStatsDilutiononSalesPageWebEelement = new WebDriverWait(driver, 1000)      
                            .until(ExpectedConditions.elementToBeClickable(ARStatsDilutiononSalesPage_xpath));     
                            ARStatsDilutiononSalesPageWebEelement.click();     
                            Thread.sleep(10000);
                            return new ChartsGraphsPageNavigation(driver); } 
                            catch (Exception ex) {     
                            return null; }   
                            }


                        
                   	public FileUploadPageBreak openCreateSkippedBBC(String ClientData) {
                		try {
                    		this.selectClientFromDropDown(ClientData);
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("File Uploads");
                    	    WebElement FileUploadPageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(CreateSkippedBBC_Xpath));
                    	    FileUploadPageBreakWebEelement.click();
                    	    Thread.sleep(10000);
                    	    return new FileUploadPageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                	}
                    
                	public FileUploadPageBreak openBBCHistoricalDataUpload(String ClientData) {
                		try {
                    		this.selectClientFromDropDown(ClientData);
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("File Uploads");
                    	    WebElement FileUploadPageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(BBCHistoricalDataUpload_Xpath));
                    	    FileUploadPageBreakWebEelement.click();
                    	    Thread.sleep(10000);
                    	    return new FileUploadPageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                	}
                	public FileUploadPageBreak openMapAndUpload(String ClientData) {
                		try {
                    		this.selectClientFromDropdown(ClientData);
                
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("File Uploads");
                    	    WebElement FileUploadPageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(MapAndUpload_Xpath));
                    	    FileUploadPageBreakWebEelement.click();
                    	    Thread.sleep(10000);
                    	    return new FileUploadPageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                	}
                	public FileUploadPageBreak openCollateralLoanAutoFileUploads(String ClientData) {
                		try {
                    		this.selectClientFromDropdown(ClientData);
                			
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("File Uploads");
                    	    WebElement FileUploadPageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(CollateralLoanAutoFileUploads_Xpath));
                    	    FileUploadPageBreakWebEelement.click();
                    	    Thread.sleep(10000);
                    	    return new FileUploadPageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                	}
                	
                	public FileUploadPageBreak openCollateralLoanUndo(String ClientData) {
                		try {
                    		this.selectClientFromDropdown(ClientData);
                		
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("File Uploads");
                    	    WebElement FileUploadPageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(CollateralLoanUndo_Xpath));
                    	    FileUploadPageBreakWebEelement.click();
                    	    Thread.sleep(10000);
                    	    return new FileUploadPageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                	}
                	public FileUploadPageBreak openMappingListView1(String ClientData) {
                		try {
                    		this.selectClientFromDropdown(ClientData);
                		
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("File Uploads");
                    	    WebElement FileUploadPageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(MappingListView1_Xpath));
                    	    FileUploadPageBreakWebEelement.click();
                    	    Thread.sleep(10000);
                    	    return new FileUploadPageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                	}
                	public FileUploadPageBreak openAllClientsUploadDepositFiles(String ClientData) {
                		try {
                    		this.selectClientFromDropdown(ClientData);
                			
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("File Uploads");
                    	    WebElement FileUploadPageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(AllClientsUploadDepositFiles_Xpath));
                    	    FileUploadPageBreakWebEelement.click();
                    	    Thread.sleep(10000);
                    	    return new FileUploadPageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                	}
                        
                        
                	public ClientMaintenancePageBreak openClientSummary() {
                		try {
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("Client Maintenance");
                    	    WebElement ClientMaintenanceWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(ClientSummary_xpath));
                    	    ClientMaintenanceWebEelement.click();
                    	    Thread.sleep(5000);
                    	    return new ClientMaintenancePageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                        }
                	
                	public ClientMaintenancePageBreak openInactiveClients() {
                		try {
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("Client Maintenance");
                    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(InactiveClients_xpath));
                    	    ClientMaintenancePageBreakWebEelement.click();
                    	    Thread.sleep(2000);
                    	    return new ClientMaintenancePageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                        }

                	public ClientMaintenancePageBreak openBasicParameters(String ClientData) {
                		try {
                    		this.selectClientFromDropDown(ClientData);
                	
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("Client Maintenance");
                    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(BasicParameters_xpath));
                    	    ClientMaintenancePageBreakWebEelement.click();
                    	    Thread.sleep(5000);
                    	    return new ClientMaintenancePageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                        
                		
                	}

                	
              
                    public ClientMaintenancePageBreak openCollateralAdvanceRate(String ClientData) {
                    	try {
                    		this.selectClientFromDropdown(ClientData);
                		
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("Client Maintenance");
                    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(CollateralAdvanceRate_xpath));
                    	    ClientMaintenancePageBreakWebEelement.click();
                    	    Thread.sleep(5000);
                    	    return new ClientMaintenancePageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                        }
                    
                    public ClientMaintenancePageBreak openIneligibleCalculations(String ClientData) {
                    	try {
                    		this.selectClientFromDropdown(ClientData);
                		
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("Client Maintenance");
                    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(IneligibleCalculations_xpath));
                    	    ClientMaintenancePageBreakWebEelement.click();
                    	    Thread.sleep(5000);
                    	    return new ClientMaintenancePageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                        }
                		
                    
                    public ClientMaintenancePageBreak openSeasonalAdvanceRate(String ClientData) {
                    	try {
                    		this.selectClientFromDropdown(ClientData);
                	
                		
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("Client Maintenance");
                    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(SeasonalAdvanceRate_xpath));
                    	    ClientMaintenancePageBreakWebEelement.click();
                    	    Thread.sleep(5000);
                    	    return new ClientMaintenancePageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                        }
                    
                    public ClientMaintenancePageBreak openBucketAging(String ClientData) {
                    	try {
                    		this.selectClientFromDropdown(ClientData);
                		
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("Client Maintenance");
                    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(BucketAging_xpath));
                    	    ClientMaintenancePageBreakWebEelement.click();
                    	    Thread.sleep(5000);
                    	    return new ClientMaintenancePageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                        }
                    
                    public ClientMaintenancePageBreak openBBCFilesRequired(String ClientData) {
                    	try {
                    		this.selectClientFromDropdown(ClientData);
                
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("Client Maintenance");
                    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(BBCFilesRequired_xpath));
                    	    ClientMaintenancePageBreakWebEelement.click();
                    	    Thread.sleep(5000);
                    	    return new ClientMaintenancePageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                        }
                    
                    public ClientMaintenancePageBreak openClientBBCOptions(String ClientData) {
                    	try {
                    		this.selectClientFromDropdown(ClientData);
                		
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("Client Maintenance");
                    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(ClientBBCOptions_xpath));
                    	    ClientMaintenancePageBreakWebEelement.click();
                    	    Thread.sleep(10000);
                    	    return new ClientMaintenancePageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                        }
                    
                    public ClientMaintenancePageBreak openOtherFilesRequired(String ClientData) {
                    	try {
                    		this.selectClientFromDropdown(ClientData);
                		
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("Client Maintenance");
                    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(OtherFilesRequired_xpath));
                    	    ClientMaintenancePageBreakWebEelement.click();
                    	    Thread.sleep(10000);
                    	    return new ClientMaintenancePageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                        }
                    
                    public ClientMaintenancePageBreak openActivityTickler(String ClientData) {
                    	try {
                    		this.selectClientFromDropdown(ClientData);
                		
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("Client Maintenance");
                    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(ActivityTickler_xpath));
                    	    ClientMaintenancePageBreakWebEelement.click();
                    	    Thread.sleep(10000);
                    	    return new ClientMaintenancePageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                        }
                    
                    public ClientMaintenancePageBreak openComments(String ClientData) {
                    	try {
                    		this.selectClientFromDropdown(ClientData);
                		
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("Client Maintenance");
                    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(Comments_xpath));
                    	    ClientMaintenancePageBreakWebEelement.click();
                    	    Thread.sleep(10000);
                    	    return new ClientMaintenancePageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                        }
                    
                    public ClientMaintenancePageBreak openReportComments(String ClientData) {
                    	try {
                    		this.selectClientFromDropdown(ClientData);
                	
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("Client Maintenance");
                    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(ReportComments_xpath));
                    	    ClientMaintenancePageBreakWebEelement.click();
                    	    Thread.sleep(10000);
                    	    return new ClientMaintenancePageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                        }
                    
                    public ClientMaintenancePageBreak openExceptions(String ClientData) {
                    	try {
                    		this.selectClientFromDropdown(ClientData);
                		
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("Client Maintenance");
                    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(Exceptions_xpath));
                    	    ClientMaintenancePageBreakWebEelement.click();
                    	    Thread.sleep(10000);
                    	    return new ClientMaintenancePageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                        }
                    
                    public ClientMaintenancePageBreak openFundingStyle(String ClientData) {
                    	try {
                    		this.selectClientFromDropdown(ClientData);
                	
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("Client Maintenance");
                    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(FundingStyle_xpath));
                    	    ClientMaintenancePageBreakWebEelement.click();
                    	    Thread.sleep(10000);
                    	    return new ClientMaintenancePageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                        }
                    
                    public ClientMaintenancePageBreak openCollateralReserves(String ClientData) {
                    	try {
                    		this.selectClientFromDropdown(ClientData);
                		
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("Client Maintenance");
                    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(CollateralReserves_xpath));
                    	    ClientMaintenancePageBreakWebEelement.click();
                    	    Thread.sleep(10000);
                    	    return new ClientMaintenancePageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                        }
                    
                    public ClientMaintenancePageBreak openAssetAmortization(String ClientData) {
                    	try {
                    		this.selectClientFromDropdown(ClientData);
                			
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("Client Maintenance");
                    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(AssetAmortization_xpath));
                    	    ClientMaintenancePageBreakWebEelement.click();
                    	    Thread.sleep(10000);
                    	    return new ClientMaintenancePageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                        }
                    
                    public ClientMaintenancePageBreak openMappingListView(String ClientData) {
                    	try {
                    		this.selectClientFromDropdown(ClientData);
                			
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("Client Maintenance");
                    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(MappingListView_Xpath));
                    	    ClientMaintenancePageBreakWebEelement.click();
                    	    Thread.sleep(10000);
                    	    return new ClientMaintenancePageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                        }
                    
                    public ClientMaintenancePageBreak openCreateABLClient(String ClientData) {
                    	try {
                    		this.selectClientFromDropdown(ClientData);
                			
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("Client Maintenance");
                    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(CreateABLClient_Xpath));
                    	    ClientMaintenancePageBreakWebEelement.click();
                    	    Thread.sleep(10000);
                    	    return new ClientMaintenancePageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                        }
                    
                    public ClientMaintenancePageBreak openCreateFactoringClient(String ClientData) {
                    	try {
                    		this.selectClientFromDropdown(ClientData);
                			
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("Client Maintenance");
                    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(CreateFactoringClient_Xpath));
                    	    ClientMaintenancePageBreakWebEelement.click();
                    	    Thread.sleep(10000);
                    	    return new ClientMaintenancePageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                        }
                    
                    public ClientMaintenancePageBreak openBasicClientDetails(String ClientData) {
                    	try {
                    		this.selectClientFromDropdown(ClientData);
                		
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("Client Maintenance");
                    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(BasicClientDetails_Xpath));
                    	    ClientMaintenancePageBreakWebEelement.click();
                    	    Thread.sleep(10000);
                    	    return new ClientMaintenancePageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                        }
                    
                    public ClientMaintenancePageBreak openMailAddress(String ClientData) {
                    	try {
                    		this.selectClientFromDropdown(ClientData);
                		
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("Client Maintenance");
                    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(MailAddress_Xpath));
                    	    ClientMaintenancePageBreakWebEelement.click();
                    	    Thread.sleep(10000);
                    	    return new ClientMaintenancePageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                        }
                    
                    public ClientMaintenancePageBreak openContacts(String ClientData) {
                    	try {
                    		this.selectClientFromDropdown(ClientData);
                		
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("Client Maintenance");
                    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(Contacts_Xpath));
                    	    ClientMaintenancePageBreakWebEelement.click();
                    	    Thread.sleep(10000);
                    	    return new ClientMaintenancePageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                        }
                    
                    public ClientMaintenancePageBreak openMiscellaneous(String ClientData) {
                    	try {
                    		this.selectClientFromDropdown(ClientData);
                		
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("Client Maintenance");
                    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(Miscellaneous_Xpath));
                    	    ClientMaintenancePageBreakWebEelement.click();
                    	    Thread.sleep(10000);
                    	    return new ClientMaintenancePageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                        }
                    
                    public ClientMaintenancePageBreak openLegalContent(String ClientData) {
                    	try {
                    		this.selectClientFromDropdown(ClientData);
                		
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("Client Maintenance");
                    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(LegalContent_Xpath));
                    	    ClientMaintenancePageBreakWebEelement.click();
                    	    Thread.sleep(10000);
                    	    return new ClientMaintenancePageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                        }
                    
                    public ClientMaintenancePageBreak openGuarantors(String ClientData) {
                    	try {
                    		this.selectClientFromDropdown(ClientData);
                		
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("Client Maintenance");
                    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(Guarantors_Xpath));
                    	    ClientMaintenancePageBreakWebEelement.click();
                    	    Thread.sleep(10000);
                    	    return new ClientMaintenancePageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                        }
                    
                    public ClientMaintenancePageBreak openLoanFees(String ClientData) {
                    	try {
                    		this.selectClientFromDropdown(ClientData);
                			
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("Client Maintenance");
                    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(LoanFees_Xpath));
                    	    ClientMaintenancePageBreakWebEelement.click();
                    	    Thread.sleep(10000);
                    	    return new ClientMaintenancePageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                        }
                    
                    public ClientMaintenancePageBreak openIneligibleAdvances(String ClientData) {
                    	try {
                    		this.selectClientFromDropdown(ClientData);
                		
                    	    this.MouseOverOnMenu();
                    	    this.moveToLeftNavigation("Client Maintenance");
                    	    WebElement ClientMaintenancePageBreakWebEelement = new WebDriverWait(driver, 1000)
                    		.until(ExpectedConditions.elementToBeClickable(IneligibleAdvances_Xpath));
                    	    ClientMaintenancePageBreakWebEelement.click();
                    	    Thread.sleep(10000);
                    	    return new ClientMaintenancePageBreak(driver);
                    	} catch (Exception ex) {
                    	    return null;
                    	}
                        }
                        
                        

                   
               	 
               	 public ABL_GLTransactions_CashAppPage openABL_GLTransactionsPage() { 
                        try {     
                        this.MouseOverOnMenu();     
                        this.moveToLeftNavigation("ABL");     
                        WebElement AblGLWebEelement = new WebDriverWait(driver, 1000)      
                        .until(ExpectedConditions.elementToBeClickable(ablGLTranactions_xpath));     
                        AblGLWebEelement.click();     
                        Thread.sleep(10000);
                        return new ABL_GLTransactions_CashAppPage(driver); } 
                        catch (Exception ex) {     
                        return null; }   
                        }
                        
                    public ReportsPage openReports() { 
                        try {     
                        this.MouseOverOnMenu();     
                        this.moveToLeftNavigation("Client Maintenance");     
                        WebElement ABLClientCreationWebEelement = new WebDriverWait(driver, 1000)      
                        .until(ExpectedConditions.elementToBeClickable(reports_xpath));     
                        ABLClientCreationWebEelement.click();     
                        Thread.sleep(10000);
                        return new ReportsPage(driver); } 
                        catch (Exception ex) {     
                        return null; }   
                        }

                        
                 public CashReceiptPage openCashReceiptsPage() {
            	     try {
            	     this.MouseOverOnMenu();
            	     this.moveToLeftNavigation("ABL");
            	     WebElement CashReceipWebEelement = new WebDriverWait(driver,
            	     1000).until(ExpectedConditions
            	     .elementToBeClickable(CashReceipt_xpath));
            	     CashReceipWebEelement.click();
            	     return new CashReceiptPage(driver);
            	     } catch (Exception e) {
            	     return null;
            	     }
            	     }
}


	 