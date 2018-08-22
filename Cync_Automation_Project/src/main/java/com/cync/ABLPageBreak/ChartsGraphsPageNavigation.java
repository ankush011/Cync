package com.cync.ABLPageBreak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class ChartsGraphsPageNavigation extends BasePage {

	
	private final By  loanAvailabilitybyManagerPageHeader_xpath=By.xpath("(//a[text()='Loan Availability by Manager'])[2]");
    private final By  loanAvailabilitybyClientPageHeader_xpath=By.xpath("(//a[text()='Loan Availability by Client'])[2]");
    private final By  top10ARConcentrationsbyClientPageHeader_xpath=By.xpath("(//a[text()='Top 10 AR Concentrations by Client'])[2]");
    private final By  top10APConcentrationsbyClientPageHeader_xpath=By.xpath("(//a[text()='Top 10 AP Concentrations by Client'])[2]");
    private final By  ARAPComparisonbyClientPageHeader_xpath=By.xpath("(//a[text()='AR-AP Comparison by Client'])[2]");
    private final By  BBCIneligiblesbyClientPageHeader_xpath=By.xpath("(//a[text()='BBC Ineligibles by Client'])[2]");
    private final By  receivableBBCagingbyClientPageHeader_xpath=By.xpath("(//a[text()='Receivable BBC aging by Client'])[2]");
    private final By  receivableSpreadsbyYearPageHeader_xpath=By.xpath("(//a[text()='Receivable Spreads by Year'])[2]");
    private final By  payableSpreadsbyYearPageHeader_xpath=By.xpath("(//a[text()='Payable Spreads by Year'])[2]");
    private final By  receivableAgingbyClientPageHeader_xpath=By.xpath("(//a[text()='Receivable Aging by Client'])[2]");
    private final By  BBCAvailabilitybyClientPageHeader_xpath=By.xpath("(//a[text()='BBC Availability by Client'])[2]");
    private final By  ARStatsDilutiononSalesPageHeader_xpath=By.xpath("(//a[text()='AR Stats - Dilution on Sales'])[2]");
	
	
	
	public ChartsGraphsPageNavigation(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public boolean loanAvailabilitybyManagerPageHeader() {
		try {     
			WebElement loanAvailabilitybyManagerPageHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(loanAvailabilitybyManagerPageHeader_xpath));
			loanAvailabilitybyManagerPageHeaderWebEelement.isDisplayed();
				return true;
			
		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
}
}	
	
	public boolean loanAvailabilitybyClientPageHeader() {
		try {     
			WebElement loanAvailabilitybyClientPageHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(loanAvailabilitybyClientPageHeader_xpath));
			loanAvailabilitybyClientPageHeaderWebEelement.isDisplayed();
				return true;
			
		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
}
}	
	
	
	public boolean top10ARConcentrationsbyClientPageHeader() {
		try {     
			WebElement top10ARConcentrationsbyClientPageHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(top10ARConcentrationsbyClientPageHeader_xpath));
			top10ARConcentrationsbyClientPageHeaderWebEelement.isDisplayed();
				return true;
			
		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
}
}	
	
	public boolean top10APConcentrationsbyClientPageHeader() {
		try {     
			WebElement top10APConcentrationsbyClientPageHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(top10APConcentrationsbyClientPageHeader_xpath));
			top10APConcentrationsbyClientPageHeaderWebEelement.isDisplayed();
				return true;
			
		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
}
}	
	
	
	public boolean ARAPComparisonbyClientPageHeader() {
		try {     
			WebElement ARAPComparisonbyClientPageHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(ARAPComparisonbyClientPageHeader_xpath));
			ARAPComparisonbyClientPageHeaderWebEelement.isDisplayed();
				return true;
		
		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
}
}	
	
	public boolean BBCIneligiblesbyClientPageHeader() {
		try {     
			WebElement BBCIneligiblesbyClientPageHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(BBCIneligiblesbyClientPageHeader_xpath));
			BBCIneligiblesbyClientPageHeaderWebEelement.isDisplayed();
				return true;
		
		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
}
}	
	
	public boolean receivableBBCagingbyClientPageHeader() {
		try {     
			WebElement receivableBBCagingbyClientPageHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(receivableBBCagingbyClientPageHeader_xpath));
			receivableBBCagingbyClientPageHeaderWebEelement.isDisplayed();
				return true;
		
		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
}
}	
	
	public boolean receivableSpreadsbyYearPageHeader() {
		try {     
			WebElement receivableSpreadsbyYearPageHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(receivableSpreadsbyYearPageHeader_xpath));
			receivableSpreadsbyYearPageHeaderWebEelement.isDisplayed();
				return true;
			
		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
}
}	
	
	public boolean payableSpreadsbyYearPageHeader() {
		try {     
			WebElement payableSpreadsbyYearPageHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(payableSpreadsbyYearPageHeader_xpath));
			payableSpreadsbyYearPageHeaderWebEelement.isDisplayed();
				return true;
			
		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
}
}	
	
	public boolean receivableAgingbyClientPageHeader() {
		try {     
			WebElement receivableAgingbyClientPageHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(receivableAgingbyClientPageHeader_xpath));
			receivableAgingbyClientPageHeaderWebEelement.isDisplayed();
				return true;
		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
}
}	
	
	public boolean BBCAvailabilitybyClientPageHeader() {
		try {     
			WebElement receivableAgingbyClientPageHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(BBCAvailabilitybyClientPageHeader_xpath));
			receivableAgingbyClientPageHeaderWebEelement.isDisplayed();
				return true;
		
		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
}
}	
	
	
	public boolean ARStatsDilutiononSalesPageHeader() {
		try {     
			WebElement ARStatsDilutiononSalesPageHeaderWebEelement=new WebDriverWait(driver,60)
			 .until(ExpectedConditions.visibilityOfElementLocated(ARStatsDilutiononSalesPageHeader_xpath));
			ARStatsDilutiononSalesPageHeaderWebEelement.isDisplayed();
				return true;
			
		}
	catch(Exception ex)
	{
		System.out.println("Test case Failed");
		return false;
}
}	
	
}
