package com.cync.ABLPageBreak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class ABLPageNavigation extends BasePage {
	
	private final By ABLFileUploadPageHeader_xpath = By.xpath("//h3[contains(text(),'ABL File Uploads')]");
	private final By BBCDocumentsPageHeader_xpath = By.xpath("//h3[contains(text(),' BBC Documents ')]");
	private final By detailReceivablesPageHeader_xpath = By.xpath("//h3[contains(text(),' Detail Receivables')]");
	private final By summaryReceivablesPageHeader_xpath = By.xpath("//h3[contains(text(),' Summary Receivables')]");
	private final By detailPayableseHeader_xpath = By.xpath("//h3[contains(text(),' Detail Payables')]");
	private final By summaryPayablesHeader_xpath = By.xpath("//h3[contains(text(),' Summary Payables')]");
	private final By historyPageHeader_xpath = By.xpath("//h3[contains(text(),'History')]");
	private final By warningPageHeader_xpath = By.xpath("//h3[contains(text(),' Warning ')]");
	private final By openBatchCashReceiptsPageHeader_xpath = By.xpath("//h3[contains(text(),' Open Batch Cash Receipts ')]");
	private final By unapprovedBBCsPageHeader_xpath = By.xpath("//h3[contains(text(),' Unapproved BBCs ')]");
	private final By BBCstobeMovedforfundingHeader_xpath = By.xpath("//h3[contains(text(),' BBC's to be Moved for funding  ')]");
	private final By BBCstobeFundedHeader_xpath = By.xpath("//h3[contains(text(),' BBC's to be Funded  ')]");
	private final By BBCstobeProcessedHeader_xpath = By.xpath("//h3[contains(text(),' BBC's to be Processed')]");
	private final By fundRequestHeader_xpath = By.xpath("//h3[contains(text(),'Fund Request')]");
	private final By BBCReviewDataHeader_xpath = By.xpath("//h3[contains(text(),' BBC Review Data ')]");
	private final By receivablesRollforwardHeader_xpath = By.xpath("//h3[contains(text(),' Receivables Rollforward ')]");
	private final By receivableAgingHeader_xpath = By.xpath("//h3[contains(text(),'Receivable Aging ')]");
	private final By ineligibleSummaryHeader_xpath = By.xpath("//h3[contains(text(),' Ineligible Summary ')]");
	private final By assetsInventoryHeader_xpath = By.xpath("//span[contains(text(),'Assets/Inventory ')]");
	private final By otherCollateralHeader_xpath = By.xpath("//span[contains(text(),'Other Collateral')]");
	private final By lineReservesPageHeader_xpath = By.xpath("//span[contains(text(),'Line Reserves ')]");
	private final By BBCAvailabilityHeader_xpath = By.xpath("//span[contains(text(),'BBC Availability ')]");
	private final By BBCRecalculationProcessHeader_xpath = By.xpath("//span[contains(text(),'BBC Recalculation Process ')]");
	private final By debtorsHeader_xpath = By.xpath("//span[contains(text(),'Debtors')]");
	private final By vendorsHeader_xpath = By.xpath("//span[contains(text(),'Vendors')]");
	private final By contrasHeader_xpath = By.xpath("//span[contains(text(),'Contras')]");
	private final By globalAccountsHeader_xpath = By.xpath("//span[contains(text(),'Global Accounts')]");
	private final By parentAssignmentHeader_xpath = By.xpath("//span[contains(text(),'Parent Assignment')]");
	private final By contraAssignmentHeader_xpath = By.xpath("//span[contains(text(),' Contra Assignment ')]");
	private final By debtorParentChildRelationHeader_xpath = By.xpath("//span[contains(text(),'Debtor Parent Child Relation ')]");
	private final By vendorParentChildRelationHeader_xpath = By.xpath("//span[contains(text(),' Vendor Parent Child Relation ')]");
	private final By dataReviewHistoryHeader_xpath = By.xpath("//span[contains(text(),'Data Review History')]");
	private final By BBCDocumentsHistoryPageHeader_xpath = By.xpath("//h3[contains(text(),' BBC Documents ')]");
	private final By detailReceivablesHistoryPageHeader_xpath = By.xpath("//h3[contains(text(),' Detail Receivables')]");
	private final By summaryReceivablesHistoryPageHeader_xpath = By.xpath("//h3[contains(text(),' Summary Receivables')]");
	private final By detailPayablesHistoryHeader_xpath = By.xpath("//h3[contains(text(),' Detail Payables')]");
	private final By summaryPayablesHistoryHeader_xpath = By.xpath("//h3[contains(text(),' Summary Payables')]");
	private final By assetsInventoryHistoryHeader_xpath = By.xpath("//span[contains(text(),'Assets/Inventory ')]");
	private final By cashRecieptsHistoryHeader_xpath = By.xpath("//span[contains(text(),'Cash Reciepts')]");
	private final By BBCReviewDataHistoryHeader_xpath = By.xpath("//h3[contains(text(),' BBC Review Data ')]");
	private final By receivablesRollforwardHistoryHeader_xpath = By.xpath("//h3[contains(text(),' Receivables Rollforward ')]");
	private final By receivableAgingHistoryHeader_xpath = By.xpath("//h3[contains(text(),'Receivable Aging ')]");
	private final By ineligibleSummaryHistoryHeader_xpath = By.xpath("//h3[contains(text(),' Ineligible Summary ')]");
	private final By assetsInventoryBBCHistoryHeader_xpath = By.xpath("//span[contains(text(),'Assets/Inventory ')]");
	private final By otherCollateralHistoryHeader_xpath = By.xpath("//span[contains(text(),'Other Collateral')]");
	private final By lineReservesHistoryPageHeader_xpath = By.xpath("//span[contains(text(),'Line Reserves ')]");
	private final By BBCAvailabilityHistoryHeader_xpath = By.xpath("//span[contains(text(),'BBC Availability ')]");
	private final By amendDetailsHistoryHeader_xpath = By.xpath("//span[contains(text(),' Amend Details ')]");
	
	private final By enterNewSaleInvoicesHeader_xpath = By.xpath("//span[contains(text(),' Enter New Sale Invoices')]");
	private final By currentReceivablesHeader_xpath = By.xpath("//span[contains(text(),' Current Receivables ')]");
	private final By cashReceiptsHeader_xpath = By.xpath("//span[contains(text(),' Cash Receipts ')]");
	private final By borrowerReceivablesHeader_xpath = By.xpath("//span[contains(text(),'Borrower Receivables ')]");
	
	private final By unapprovedBBCsHeader_xpath = By.xpath("//span[contains(text(),' Unapproved BBCs ')]");
	private final By signBBCHeader_xpath = By.xpath("//span[contains(text(),' Sign BBC')]");
	private final By approveBBCFundingHeader_xpath = By.xpath("//span[contains(text(),'  Approve BBC/Funding')]");
	private final By fundReleaseBBCHeader_xpath = By.xpath("//span[contains(text(),' Fund / Release BBC')]");
	
	private final By ineligibilityReasonsHeader_xpath = By.xpath("//h3[contains(text(),'Ineligibility Reasons ')]");
	private final By fileClassificationSummaryHeader_xpath = By.xpath("//h3[contains(text(),'File Classification - Summary')]");
	private final By exceptionsSummaryHeader_xpath = By.xpath("//h3[contains(text(),'Exceptions Summary')]");
	private final By chargeCodesHeader_xpath = By.xpath("//h3[contains(text(),'Charge Codes')]");
	private final By interestRateCodesHeader_xpath = By.xpath("//h3[contains(text(),'Interest Rate Codes')]");
	
	private final By letterProcessingHeader_xpath = By.xpath("//span[contains(text(),'Letter Processing ')]");
	private final By letterTrackingHeader_xpath = By.xpath("//span[contains(text(),'Letter Tracking')]");
	private final By letterInquiryHeader_xpath = By.xpath("//span[contains(text(),'Letter Inquiry')]");
	private final By ACDebtorStatusHeader_xpath = By.xpath("//span[contains(text(),'A/C Debtor Status')]");
	private final By ABLGLSetupHeader_xpath = By.xpath("//span[contains(text(),' ABL - GL Setup')]");
	private final By ABLGLTransactionsHeader_xpath = By.xpath("//span[contains(text(),' ABL GL Transactions')]");
	
	public ABLPageNavigation(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
 	
	
	public boolean ABLFileUploadPageHeader(String HeaderData) {
		try {     
			WebElement ABLFileUploadPageHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(ABLFileUploadPageHeader_xpath));
		     String data = ABLFileUploadPageHeaderWebEelement.getText().trim(); 
			if(data.equalsIgnoreCase(HeaderData))
			{
				System.out.println(data);
				return true;
			}
			
			else{
				return false;
			}

		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
	
}

}
	
	public boolean detailReceivablesPageHeader(String HeaderData) {
		try {     
			WebElement detailReceivablesPageHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(detailReceivablesPageHeader_xpath));
		     String data = detailReceivablesPageHeaderWebEelement.getText().trim(); 
			if(data.equalsIgnoreCase(HeaderData))
			{
				System.out.println(data);
				return true;
			}
			
			else{
				return false;
			}

		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
	
}

}
	
	public boolean summaryReceivablesPageHeader(String HeaderData) {
		try {     
			WebElement summaryReceivablesPageHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(summaryReceivablesPageHeader_xpath));
		     String data = summaryReceivablesPageHeaderWebEelement.getText().trim(); 
			if(data.equalsIgnoreCase(HeaderData))
			{
				System.out.println(data);
				return true;
			}
			
			else{
				return false;
			}

		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
	
}

}
	public boolean detailPayableseHeader(String HeaderData) {
		try {     
			WebElement detailPayableseHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(detailPayableseHeader_xpath));
		     String data = detailPayableseHeaderWebEelement.getText().trim(); 
			if(data.equalsIgnoreCase(HeaderData))
			{
				System.out.println(data);
				return true;
			}
			
			else{
				return false;
			}

		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
	
}

}
	
	
	public boolean summaryPayablesHeader(String HeaderData) {
		try {     
			WebElement summaryPayablesHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(summaryPayablesHeader_xpath));
		     String data = summaryPayablesHeaderWebEelement.getText().trim(); 
			if(data.equalsIgnoreCase(HeaderData))
			{
				System.out.println(data);
				return true;
			}
			
			else{
				return false;
			}

		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
	
}

}
	
	
	public boolean historyPageHeader(String HeaderData) {
		try {     
			WebElement historyPageHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(historyPageHeader_xpath));
		     String data = historyPageHeaderWebEelement.getText().trim(); 
			if(data.equalsIgnoreCase(HeaderData))
			{
				System.out.println(data);
				return true;
			}
			
			else{
				return false;
			}

		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
	
}

}
	
	public boolean warningPageHeader(String HeaderData) {
		try {     
			WebElement warningPageHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(warningPageHeader_xpath));
		     String data = warningPageHeaderWebEelement.getText().trim(); 
			if(data.equalsIgnoreCase(HeaderData))
			{
				System.out.println(data);
				return true;
			}
			
			else{
				return false;
			}

		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
	
}

}
	
	public boolean openBatchCashReceiptsPageHeader(String HeaderData) {
		try {     
			WebElement openBatchCashReceiptsPageHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(openBatchCashReceiptsPageHeader_xpath));
		     String data = openBatchCashReceiptsPageHeaderWebEelement.getText().trim(); 
			if(data.equalsIgnoreCase(HeaderData))
			{
				System.out.println(data);
				return true;
			}
			
			else{
				return false;
			}

		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
	
}

}
	
	
	public boolean unapprovedBBCsPageHeader(String HeaderData) {
		try {     
			WebElement unapprovedBBCsPageHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(unapprovedBBCsPageHeader_xpath));
		     String data = unapprovedBBCsPageHeaderWebEelement.getText().trim(); 
			if(data.equalsIgnoreCase(HeaderData))
			{
				System.out.println(data);
				return true;
			}
			
			else{
				return false;
			}

		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
	
}

}
	
	public boolean BBCstobeMovedforfundingHeader(String HeaderData) {
		try {     
			WebElement BBCstobeMovedforfundingHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(BBCstobeMovedforfundingHeader_xpath));
		     String data = BBCstobeMovedforfundingHeaderWebEelement.getText().trim(); 
			if(data.equalsIgnoreCase(HeaderData))
			{
				System.out.println(data);
				return true;
			}
			
			else{
				return false;
			}

		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
	
}

}
	
	public boolean BBCstobeFundedHeader(String HeaderData) {
		try {     
			WebElement BBCstobeFundedHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(BBCstobeFundedHeader_xpath));
		     String data = BBCstobeFundedHeaderWebEelement.getText().trim(); 
			if(data.equalsIgnoreCase(HeaderData))
			{
				System.out.println(data);
				return true;
			}
			
			else{
				return false;
			}

		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
	
}

}
	
	
	public boolean BBCstobeProcessedHeader(String HeaderData) {
		try {     
			WebElement BBCstobeProcessedHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(BBCstobeProcessedHeader_xpath));
		     String data = BBCstobeProcessedHeaderWebEelement.getText().trim(); 
			if(data.equalsIgnoreCase(HeaderData))
			{
				System.out.println(data);
				return true;
			}
			
			else{
				return false;
			}

		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
	
}

}
	
	public boolean fundRequestHeader(String HeaderData) {
		try {     
			WebElement fundRequestHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(fundRequestHeader_xpath));
		     String data = fundRequestHeaderWebEelement.getText().trim(); 
			if(data.equalsIgnoreCase(HeaderData))
			{
				System.out.println(data);
				return true;
			}
			
			else{
				return false;
			}

		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
	
}

}
	
	public boolean BBCReviewDataHeader(String HeaderData) {
		try {     
			WebElement BBCReviewDataHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(BBCReviewDataHeader_xpath));
		     String data = BBCReviewDataHeaderWebEelement.getText().trim(); 
			if(data.equalsIgnoreCase(HeaderData))
			{
				System.out.println(data);
				return true;
			}
			
			else{
				return false;
			}

		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
	
}

}
	
	public boolean receivablesRollforwardHeader(String HeaderData) {
		try {     
			WebElement receivablesRollforwardHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(receivablesRollforwardHeader_xpath));
		     String data = receivablesRollforwardHeaderWebEelement.getText().trim(); 
			if(data.equalsIgnoreCase(HeaderData))
			{
				System.out.println(data);
				return true;
			}
			
			else{
				return false;
			}

		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
	
}

}
	
	
	public boolean receivableAgingHeader(String HeaderData) {
		try {     
			WebElement receivableAgingHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(receivableAgingHeader_xpath));
		     String data = receivableAgingHeaderWebEelement.getText().trim(); 
			if(data.equalsIgnoreCase(HeaderData))
			{
				System.out.println(data);
				return true;
			}
			
			else{
				return false;
			}

		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
	
}

}
	
	public boolean ineligibleSummaryHeader(String HeaderData) {
		try {     
			WebElement ineligibleSummaryHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(ineligibleSummaryHeader_xpath));
		     String data = ineligibleSummaryHeaderWebEelement.getText().trim(); 
			if(data.equalsIgnoreCase(HeaderData))
			{
				System.out.println(data);
				return true;
			}
			
			else{
				return false;
			}

		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
	
}

}
	
	public boolean assetsInventoryHeader(String HeaderData) {
		try {     
			WebElement assetsInventoryHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(assetsInventoryHeader_xpath));
		     String data = assetsInventoryHeaderWebEelement.getText().trim(); 
			if(data.equalsIgnoreCase(HeaderData))
			{
				System.out.println(data);
				return true;
			}
			
			else{
				return false;
			}

		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
	
}

}
	
	public boolean otherCollateralHeader(String HeaderData) {
		try {     
			WebElement otherCollateralHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(otherCollateralHeader_xpath));
		     String data = otherCollateralHeaderWebEelement.getText().trim(); 
			if(data.equalsIgnoreCase(HeaderData))
			{
				System.out.println(data);
				return true;
			}
			
			else{
				return false;
			}

		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
	
}

}
	
	public boolean lineReservesPageHeader(String HeaderData) {
		try {     
			WebElement lineReservesPageHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(lineReservesPageHeader_xpath));
		     String data = lineReservesPageHeaderWebEelement.getText().trim(); 
			if(data.equalsIgnoreCase(HeaderData))
			{
				System.out.println(data);
				return true;
			}
			
			else{
				return false;
			}

		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
	
}

}
	
	
	public boolean BBCAvailabilityHeader(String HeaderData) {
		try {     
			WebElement BBCAvailabilityHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(BBCAvailabilityHeader_xpath));
		     String data = BBCAvailabilityHeaderWebEelement.getText().trim(); 
			if(data.equalsIgnoreCase(HeaderData))
			{
				System.out.println(data);
				return true;
			}
			
			else{
				return false;
			}

		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
	
}

}
	
	public boolean BBCRecalculationProcessHeader(String HeaderData) {
		try {     
			WebElement BBCRecalculationProcessHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(BBCRecalculationProcessHeader_xpath));
		     String data = BBCRecalculationProcessHeaderWebEelement.getText().trim(); 
			if(data.equalsIgnoreCase(HeaderData))
			{
				System.out.println(data);
				return true;
			}
			
			else{
				return false;
			}

		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
	
}

}
	
	public boolean debtorsHeader(String HeaderData) {
		try {     
			WebElement debtorsHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(debtorsHeader_xpath));
		     String data = debtorsHeaderWebEelement.getText().trim(); 
			if(data.equalsIgnoreCase(HeaderData))
			{
				System.out.println(data);
				return true;
			}
			
			else{
				return false;
			}

		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
	
}

}
	
	public boolean vendorsHeader(String HeaderData) {
		try {     
			WebElement vendorsHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(vendorsHeader_xpath));
		     String data = vendorsHeaderWebEelement.getText().trim(); 
			if(data.equalsIgnoreCase(HeaderData))
			{
				System.out.println(data);
				return true;
			}
			
			else{
				return false;
			}

		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
	
}

}
	
	
	public boolean contrasHeader(String HeaderData) {
		try {     
			WebElement contrasHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(contrasHeader_xpath));
		     String data = contrasHeaderWebEelement.getText().trim(); 
			if(data.equalsIgnoreCase(HeaderData))
			{
				System.out.println(data);
				return true;
			}
			
			else{
				return false;
			}

		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
	
}

}
	
	public boolean globalAccountsHeader(String HeaderData) {
		try {     
			WebElement globalAccountsHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(globalAccountsHeader_xpath));
		     String data = globalAccountsHeaderWebEelement.getText().trim(); 
			if(data.equalsIgnoreCase(HeaderData))
			{
				System.out.println(data);
				return true;
			}
			
			else{
				return false;
			}

		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
	
}
	}
		
		public boolean parentAssignmentHeader(String HeaderData) {
			try {     
				WebElement parentAssignmentHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(parentAssignmentHeader_xpath));
			     String data = parentAssignmentHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}
		
		
		public boolean contraAssignmentHeader(String HeaderData) {
			try {     
				WebElement contraAssignmentHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(contraAssignmentHeader_xpath));
			     String data = contraAssignmentHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}
		
		
		public boolean debtorParentChildRelationHeader(String HeaderData) {
			try {     
				WebElement debtorParentChildRelationHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(debtorParentChildRelationHeader_xpath));
			     String data = debtorParentChildRelationHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}
		
		public boolean vendorParentChildRelationHeader(String HeaderData) {
			try {     
				WebElement vendorParentChildRelationHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(vendorParentChildRelationHeader_xpath));
			     String data = vendorParentChildRelationHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}
		
		
		public boolean dataReviewHistoryHeader(String HeaderData) {
			try {     
				WebElement dataReviewHistoryHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(dataReviewHistoryHeader_xpath));
			     String data = dataReviewHistoryHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}
		
		public boolean BBCDocumentsHistoryPageHeader(String HeaderData) {
			try {     
				WebElement BBCDocumentsHistoryPageHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(BBCDocumentsHistoryPageHeader_xpath));
			     String data = BBCDocumentsHistoryPageHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}
		
		public boolean detailReceivablesHistoryPageHeader(String HeaderData) {
			try {     
				WebElement detailReceivablesHistoryPageHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(detailReceivablesHistoryPageHeader_xpath));
			     String data = detailReceivablesHistoryPageHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}
		
		
		public boolean summaryReceivablesHistoryPageHeader(String HeaderData) {
			try {     
				WebElement summaryReceivablesHistoryPageHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(summaryReceivablesHistoryPageHeader_xpath));
			     String data = summaryReceivablesHistoryPageHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}
		
		
		public boolean detailPayablesHistoryHeader(String HeaderData) {
			try {     
				WebElement detailPayablesHistoryHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(detailPayablesHistoryHeader_xpath));
			     String data = detailPayablesHistoryHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}
		
		public boolean summaryPayablesHistoryHeader(String HeaderData) {
			try {     
				WebElement summaryPayablesHistoryHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(summaryPayablesHistoryHeader_xpath));
			     String data = summaryPayablesHistoryHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}
		
		
		public boolean assetsInventoryHistoryHeader(String HeaderData) {
			try {     
				WebElement assetsInventoryHistoryHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(assetsInventoryHistoryHeader_xpath));
			     String data = assetsInventoryHistoryHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}
		
		
		public boolean cashRecieptsHistoryHeader(String HeaderData) {
			try {     
				WebElement cashRecieptsHistoryHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(cashRecieptsHistoryHeader_xpath));
			     String data = cashRecieptsHistoryHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}
		
		
		public boolean BBCReviewDataHistoryHeader(String HeaderData) {
			try {     
				WebElement BBCReviewDataHistoryHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(BBCReviewDataHistoryHeader_xpath));
			     String data = BBCReviewDataHistoryHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}
		public boolean receivablesRollforwardHistoryHeader(String HeaderData) {
			try {     
				WebElement receivablesRollforwardHistoryHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(receivablesRollforwardHistoryHeader_xpath));
			     String data = receivablesRollforwardHistoryHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}
		
		
		public boolean receivableAgingHistoryHeader(String HeaderData) {
			try {     
				WebElement receivableAgingHistoryHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(receivableAgingHistoryHeader_xpath));
			     String data = receivableAgingHistoryHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}
		
		
		public boolean ineligibleSummaryHistoryHeader(String HeaderData) {
			try {     
				WebElement ineligibleSummaryHistoryHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(ineligibleSummaryHistoryHeader_xpath));
			     String data = ineligibleSummaryHistoryHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}
		
		public boolean assetsInventoryBBCHistoryHeader(String HeaderData) {
			try {     
				WebElement assetsInventoryBBCHistoryHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(assetsInventoryBBCHistoryHeader_xpath));
			     String data = assetsInventoryBBCHistoryHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}
		
		
		public boolean otherCollateralHistoryHeader(String HeaderData) {
			try {     
				WebElement otherCollateralHistoryHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(otherCollateralHistoryHeader_xpath));
			     String data = otherCollateralHistoryHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}
		
		public boolean lineReservesHistoryPageHeader(String HeaderData) {
			try {     
				WebElement lineReservesHistoryPageHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(lineReservesHistoryPageHeader_xpath));
			     String data = lineReservesHistoryPageHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}


		public boolean BBCAvailabilityHistoryHeader(String HeaderData) {
			try {     
				WebElement BBCAvailabilityHistoryHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(BBCAvailabilityHistoryHeader_xpath));
			     String data = BBCAvailabilityHistoryHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}		
		
		
		public boolean amendDetailsHistoryHeader(String HeaderData) {
			try {     
				WebElement amendDetailsHistoryHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(amendDetailsHistoryHeader_xpath));
			     String data = amendDetailsHistoryHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}		
		
		public boolean enterNewSaleInvoicesHeader(String HeaderData) {
			try {     
				WebElement enterNewSaleInvoicesHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(enterNewSaleInvoicesHeader_xpath));
			     String data = enterNewSaleInvoicesHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}		
		
		public boolean currentReceivablesHeader(String HeaderData) {
			try {     
				WebElement currentReceivablesHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(currentReceivablesHeader_xpath));
			     String data = currentReceivablesHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}		
		
		public boolean cashReceiptsHeader(String HeaderData) {
			try {     
				WebElement cashReceiptsHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(cashReceiptsHeader_xpath));
			     String data = cashReceiptsHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}		
		
		public boolean borrowerReceivablesHeader(String HeaderData) {
			try {     
				WebElement borrowerReceivablesHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(borrowerReceivablesHeader_xpath));
			     String data = borrowerReceivablesHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}		
		
		public boolean unapprovedBBCsHeader(String HeaderData) {
			try {     
				WebElement unapprovedBBCsHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(unapprovedBBCsHeader_xpath));
			     String data = unapprovedBBCsHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}		
		
		public boolean signBBCHeader(String HeaderData) {
			try {     
				WebElement signBBCHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(signBBCHeader_xpath));
			     String data = signBBCHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}		
		
		
		
		public boolean approveBBCFundingHeader(String HeaderData) {
			try {     
				WebElement approveBBCFundingHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(approveBBCFundingHeader_xpath));
			     String data = approveBBCFundingHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}		
		
		public boolean fundReleaseBBCHeader(String HeaderData) {
			try {     
				WebElement fundReleaseBBCHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(fundReleaseBBCHeader_xpath));
			     String data = fundReleaseBBCHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}		
		
		public boolean ineligibilityReasonsHeader(String HeaderData) {
			try {     
				WebElement ineligibilityReasonsHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(ineligibilityReasonsHeader_xpath));
			     String data = ineligibilityReasonsHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}		
		
		public boolean fileClassificationSummaryHeader(String HeaderData) {
			try {     
				WebElement fileClassificationSummaryHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(fileClassificationSummaryHeader_xpath));
			     String data = fileClassificationSummaryHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}		
		
		public boolean exceptionsSummaryHeader(String HeaderData) {
			try {     
				WebElement exceptionsSummaryHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(exceptionsSummaryHeader_xpath));
			     String data = exceptionsSummaryHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}
		
		
		public boolean chargeCodesHeader(String HeaderData) {
			try {     
				WebElement chargeCodesHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(chargeCodesHeader_xpath));
			     String data = chargeCodesHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}		
		
		public boolean interestRateCodesHeader(String HeaderData) {
			try {     
				WebElement interestRateCodesHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(interestRateCodesHeader_xpath));
			     String data = interestRateCodesHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}		
		
		public boolean letterProcessingHeader(String HeaderData) {
			try {     
				WebElement letterProcessingHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(letterProcessingHeader_xpath));
			     String data = letterProcessingHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}		
		
		public boolean letterTrackingHeader(String HeaderData) {
			try {     
				WebElement letterTrackingHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(letterTrackingHeader_xpath));
			     String data = letterTrackingHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}		
		
		public boolean letterInquiryHeader(String HeaderData) {
			try {     
				WebElement letterInquiryHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(letterInquiryHeader_xpath));
			     String data = letterInquiryHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}		
	
		public boolean ACDebtorStatusHeader(String HeaderData) {
			try {     
				WebElement ACDebtorStatusHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(ACDebtorStatusHeader_xpath));
			     String data = ACDebtorStatusHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}	
		
		
		public boolean ABLGLSetupHeader(String HeaderData) {
			try {     
				WebElement ABLGLSetupHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(ABLGLSetupHeader_xpath));
			     String data = ABLGLSetupHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}	
		
		public boolean ABLGLTransactionsHeader(String HeaderData) {
			try {     
				WebElement ABLGLTransactionsHeaderWebEelement=new WebDriverWait(driver,60)
				 .until(ExpectedConditions.visibilityOfElementLocated(ABLGLTransactionsHeader_xpath));
			     String data = ABLGLTransactionsHeaderWebEelement.getText().trim(); 
				if(data.equalsIgnoreCase(HeaderData))
				{
					System.out.println(data);
					return true;
				}
				
				else{
					return false;
				}

			}
		catch(Exception ex)
		{
			System.out.println("Test case Failed");
			return false;
		
	}

}	
}
