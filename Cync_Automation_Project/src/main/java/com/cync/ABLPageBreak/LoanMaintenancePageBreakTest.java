package com.cync.ABLPageBreak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class LoanMaintenancePageBreakTest extends BasePage {

	public LoanMaintenancePageBreakTest(WebDriver driver) {
		super(driver);
	}
		// TODO Auto-generated constructor stub
	
	
	private final By LoanSummary_xpath=By.xpath("//span[contains(text(),'Loan Summary')]");
	private final By collateralLoansHeader=By.xpath("//span[contains(text(),'Collateral Loans')]");
	private final By chargeTemplatesHeader=By.xpath("//span[contains(text(),'Charge Templates')]");
	private final By collateralLoanFeeSetupHeader=By.xpath("//span[contains(text(),'Collateral Loan Fee Setup')]");
	private final By processOneTimeManualCharges=By.xpath("//span[contains(text(),'Process OneTime & Manual Charges')]");
	private final By dailyTransactionReportingHeader=By.xpath("//span[contains(text(),'Daily Transaction Reporting')]");
	private final By interestRecalculation=By.xpath("//span[contains(text(),'Interest Recalculation')]");
	private final By interestPaymentHeader =By.xpath("//span[contains(text(),' Interest Payment ')]");
	private final By interestPaymentRecalculationHeader =By.xpath("//span[contains(text(),' Interest Payment Recalculation ')]");
	private final By letterOfCreditHeader =By.xpath("//span[contains(text(),' Letter of Credits ')]");
	private final By payoffInquirytHeader =By.xpath("//span[contains(text(),' Payoff Inquiry')]");
	private final By autoHeader_xpath =By.xpath("//span[contains(text(),'  Auto Process Collateral Loan Settings')]");
	private final By TermLoanCreationHeader_xpath =By.xpath("//span[contains(text(),'  Auto Process Collateral Loan Settings')]");
	private final By TermLoanSetupHeader_xpath =By.xpath("//span[contains(text(),'Term Loan Setup')]");
	private final By TermLoanCollateralsHeader_xpath =By.xpath("//span[contains(text(),'Term Loan Collaterals')]");
	private final By TermLoansHeader_xpath =By.xpath("//span[contains(text(),'Term Loans')]");
	private final By CreditLineLoanCreationHeader_xpath =By.xpath("//span[contains(text(),'Credit Line Loan Creation')]");
	private final By CreditLineChargesSetupHeader_xpath =By.xpath("//span[contains(text(),'Credit Line Charges Setup')]");
	private final By CreditLineLoanCollateralSetupHeader_xpath =By.xpath("//span[contains(text(),'Credit Line Loan Collateral Setup')]");
	private final By CreditLineLoansHeader_xpath =By.xpath("//span[contains(text(),'Credit Line Loans')]");
	private final By  ParticipationPartiesHeader_xpath =By.xpath("//span[contains(text(),' Participation Parties')]");
	private final By  ParticipationLoanDetailsHeader_xpath =By.xpath("//span[contains(text(),' Participation Loan Details')]");
	private final By  ParticipationInquiryHeader_xpath =By.xpath("//span[contains(text(),' Participation Inquiry')]");
	
	

	public boolean verifyLoanSummaryHeader(String LoanSummaryHeader){
			try{
				WebElement headerWebE=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(LoanSummary_xpath));
				String actual_header=headerWebE.getText().trim();
				
				if(actual_header.equalsIgnoreCase(LoanSummaryHeader))
				{
					System.out.println(actual_header);
					return true;
				}
				else
				{
					return false;
				}
				
			}
			catch(Exception ex){
				System.out.println("Failed");
				return false;
			}
			
			
			}
	
	
	public boolean verifyCollateralLoansHeader(String CollateralLoansHeader){
		try{
			WebElement headerWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(collateralLoansHeader));
			String actual_header=headerWebE.getText().trim();
			
			if(actual_header.equals(CollateralLoansHeader))
			{
				System.out.println(actual_header);
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception ex){
			System.out.println("Failed");
			return false;
		}
		
		
		}
	
	
	public boolean verifyChargeTemplatesHeader(String ChargeTemplatesHeader){
		try{
			WebElement headerWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(chargeTemplatesHeader));
			String actual_header=headerWebE.getText().trim();
			
			if(actual_header.equals(ChargeTemplatesHeader))
			{
				System.out.println(actual_header);
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception ex){
			System.out.println("Failed");
			return false;
		}
		
		
		}
	
	
	public boolean verifyCollateralLoanFeeSetupHeader(String CollateralLoanFeeSetupHeader){
		try{
			WebElement headerWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(collateralLoanFeeSetupHeader));
			String actual_header=headerWebE.getText().trim();
			
			if(actual_header.equals(CollateralLoanFeeSetupHeader))
			{
				System.out.println(actual_header);
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception ex){
			System.out.println("Failed");
			return false;
		}
		
		
		}
	
	
	

	public boolean verifyProcessOneTimeManualChargesHeader(String ProcessOneTimeanualChargesHeader){
		try{
			WebElement headerWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(processOneTimeManualCharges));
			String actual_header=headerWebE.getText().trim();
			
			if(actual_header.equals(ProcessOneTimeanualChargesHeader))
			{
				System.out.println(actual_header);
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception ex){
			System.out.println("Failed");
			return false;
		}
		
		
		}
	
	
	public boolean verifyDailyTransactionReportingHeader(String DailyTransactionReportingHeader){
		try{
			WebElement headerWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(dailyTransactionReportingHeader));
			String actual_header=headerWebE.getText().trim();
			
			if(actual_header.equals(DailyTransactionReportingHeader))
			{
				System.out.println(actual_header);
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception ex){
			System.out.println("Failed");
			return false;
		}
		
		
		}
	
	
	
	public boolean verifyInterestRecalculationHeader(String InterestRecalculationHeader){
		try{
			WebElement headerWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(interestRecalculation));
			String actual_header=headerWebE.getText().trim();
			
			if(actual_header.equals(InterestRecalculationHeader))
			{
				System.out.println(actual_header);
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception ex){
			System.out.println("Failed");
			return false;
		}
		
		
		}
	
	
	

	public boolean verifyInterestPaymentHeader(String InterestPaymentHeader){
		try{
			WebElement headerWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(interestPaymentHeader));
			String actual_header=headerWebE.getText().trim();
			
			if(actual_header.equals(InterestPaymentHeader))
			{
				System.out.println(actual_header);
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception ex){
			System.out.println("Failed");
			return false;
		}
		
		
		}
	
	
	public boolean verifyInterestPaymentRecalculationHeader(String InterestPaymentRecalculationHeader){
		try{
			WebElement headerWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(interestPaymentRecalculationHeader));
			String actual_header=headerWebE.getText().trim();
			
			if(actual_header.equals(InterestPaymentRecalculationHeader))
			{
				System.out.println(actual_header);
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception ex){
			System.out.println("Failed");
			return false;
		}
		
		
		}
	
	
	
	public boolean verifyLetterofCreditsHeader(String letterofCreditsHeader){
		try{
			WebElement headerWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(letterOfCreditHeader));
			String actual_header=headerWebE.getText().trim();
			
			if(actual_header.equals(letterofCreditsHeader))
			{
				System.out.println(actual_header);
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception ex){
			System.out.println("Failed");
			return false;
		}
		
		
		}
	
	

	public boolean verifyPayoffInquiryHeader(String payoffInquiryHeader){
		try{
			WebElement headerWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(payoffInquirytHeader));
			String actual_header=headerWebE.getText().trim();
			
			if(actual_header.equals(payoffInquiryHeader))
			{
				System.out.println(actual_header);
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception ex){
			System.out.println("Failed");
			return false;
		}
		
		
		}
	
	
	public boolean verifyAutoProcessCollateralLoanSettingsHeader(String autoHeader){
		try{
			WebElement headerWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(autoHeader_xpath));
			String actual_header=headerWebE.getText().trim();
			
			if(actual_header.equals(autoHeader))
			{
				System.out.println(actual_header);
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception ex){
			System.out.println("Failed");
			return false;
		}
		
		
		}
	
	
	public boolean verifyTermLoanCreationHeader(String TermLoanCreationHeader){
		try{
			WebElement headerWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(TermLoanCreationHeader_xpath));
			String actual_header=headerWebE.getText().trim();
			
			if(actual_header.equals(TermLoanCreationHeader))
			{
				System.out.println(actual_header);
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception ex){
			System.out.println("Failed");
			return false;
		}
		
		
		}
	
	
	public boolean verifyTermLoanSetupHeader(String TermLoanSetupHeader){
		try{
			WebElement headerWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(TermLoanSetupHeader_xpath));
			String actual_header=headerWebE.getText().trim();
			
			if(actual_header.equals(TermLoanSetupHeader))
			{
				System.out.println(actual_header);
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception ex){
			System.out.println("Failed");
			return false;
		}
		
		
		}
	
	
	public boolean verifyTermLoanCollateralsHeader(String TermLoanCollateralsHeader){
		try{
			WebElement headerWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(TermLoanCollateralsHeader_xpath));
			String actual_header=headerWebE.getText().trim();
			
			if(actual_header.equals(TermLoanCollateralsHeader))
			{
				System.out.println(actual_header);
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception ex){
			System.out.println("Failed");
			return false;
		}
		
		
		}
	
	public boolean verifyTermLoansHeader(String TermLoasHeader){
		try{
			WebElement headerWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(TermLoansHeader_xpath));
			String actual_header=headerWebE.getText().trim();
			
			if(actual_header.equals(TermLoasHeader))
			{
				System.out.println(actual_header);
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception ex){
			System.out.println("Failed");
			return false;
		}
		
		
		}
	
	
	public boolean verifyCreditLineLoanCreationHeader(String CreditLineLoanCreationHeader){
		try{
			WebElement headerWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(CreditLineLoanCreationHeader_xpath));
			String actual_header=headerWebE.getText().trim();
			
			if(actual_header.equals(CreditLineLoanCreationHeader))
			{
				System.out.println(actual_header);
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception ex){
			System.out.println("Failed");
			return false;
		}
		
		
		}
	
	public boolean verifyCreditLineChargesSetupHeader(String CreditLineChargesSetupHeader){
		try{
			WebElement headerWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(CreditLineChargesSetupHeader_xpath));
			String actual_header=headerWebE.getText().trim();
			
			if(actual_header.equals(CreditLineChargesSetupHeader))
			{
				System.out.println(actual_header);
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception ex){
			System.out.println("Failed");
			return false;
		}
		
		
		}
	
	
	public boolean verifyCreditLineLoanCollateralSetupHeader(String CreditLineLoanCollateralSetupHeader){
		try{
			WebElement headerWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(CreditLineLoanCollateralSetupHeader_xpath));
			String actual_header=headerWebE.getText().trim();
			
			if(actual_header.equals(CreditLineLoanCollateralSetupHeader))
			{
				System.out.println(actual_header);
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception ex){
			System.out.println("Failed");
			return false;
		}
		
		
		}
	
	

	public boolean verifyCreditLineLoansHeader(String CreditLineLoansHeader){
		try{
			WebElement headerWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(CreditLineLoansHeader_xpath));
			String actual_header=headerWebE.getText().trim();
			
			if(actual_header.equals(CreditLineLoansHeader))
			{
				System.out.println(actual_header);
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception ex){
			System.out.println("Failed");
			return false;
		}
		
		
		}
	
	public boolean verifyParticipationPartiesHeader(String  ParticipationPartiesHeader){
		try{
			WebElement headerWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ParticipationPartiesHeader_xpath));
			String actual_header=headerWebE.getText().trim();
			
			if(actual_header.equals(ParticipationPartiesHeader))
			{
				System.out.println(actual_header);
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception ex){
			System.out.println("Failed");
			return false;
		}
		
		
		}
	
	

	public boolean verifyParticipationLoanDetailsHeader(String  ParticipationLoanDetailsHeader){
		try{
			WebElement headerWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ParticipationLoanDetailsHeader_xpath));
			String actual_header=headerWebE.getText().trim();
			
			if(actual_header.equals(ParticipationLoanDetailsHeader))
			{
				System.out.println(actual_header);
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception ex){
			System.out.println("Failed");
			return false;
		}
		
		
		}
	
	
	public boolean verifyParticipationInquiryHeader(String  ParticipationInquiryHeader){
		try{
			WebElement headerWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ParticipationInquiryHeader_xpath));
			String actual_header=headerWebE.getText().trim();
			
			if(actual_header.equals(ParticipationInquiryHeader))
			{
				System.out.println(actual_header);
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception ex){
			System.out.println("Failed");
			return false;
		}
		
		
		}
	
	
	
	
	
	
		
		

	}
	
