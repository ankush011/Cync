package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class BBCAvailabilityPage extends BasePage {
 
    private final By BBCAvailabilityHeader_xpath=By.xpath("//span[contains(text(),'BBC Availability')]");
    private final By BBCAvailabilityHeaderWebEelementHeader_xpath=By.xpath("//span[contains(text(),'BBC Availability')]");
    private final By fundRequestedAmount_xpath=By.xpath("//td[contains(text(),' 10,000.00')]");
    private final By netBorrowingBaseAmount_xpath=By.xpath("//td[contains(text(),' 20,000.00')]");
    private final By ApproveBBCButton_xpath=By.xpath("(//a[contains(text(),'Approve BBC')])[2]");
    private final By SendToApproverButton_xpath=By.xpath("//a[contains(text(),'Send to Approver')]");
    private final By BBCPrintButton_xpath=By.xpath("//a[contains(text(),'BBC Print')]");
    private final By SkipBBCButton_xpath=By.xpath("//a[contains(text(),'Skip BBC')]");
    
    
    
    
    public BBCAvailabilityPage(WebDriver driver) {
	super(driver);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(!driver.findElement(BBCAvailabilityHeader_xpath).getText().trim().equals("BBC Availability")){
		throw new SkipException("Fund Request couldn't open.");
	}
}
 
    
    
    public String BBCAvailabilitytHeader(String BBCAvailabilityHeader)
	{
	try{
		WebElement BBCAvailabilityHeaderWebEelement=new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(BBCAvailabilityHeaderWebEelementHeader_xpath));
		BBCAvailabilityHeaderWebEelement.getText();
		
	}
	catch(Exception ex){
		
	}
	return BBCAvailabilityHeader;
	
	}
	 
    
    
    public boolean fundRequestedAmount()
	{
	try{
		WebElement fundRequestedAmountWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(fundRequestedAmount_xpath));
		fundRequestedAmountWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
    
    
    public boolean netBorrowingBaseAmount()
	{
	try{
		WebElement  netBorrowingBaseWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAmount_xpath));
		netBorrowingBaseWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}

    public boolean ApproveBBCButtonVerify()
	{
	try{
		WebElement  netBorrowingBaseWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(ApproveBBCButton_xpath));
		netBorrowingBaseWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
    

    public boolean SendToApproverButtonVerify()
	{
	try{
		WebElement  netBorrowingBaseWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(SendToApproverButton_xpath));
		netBorrowingBaseWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
    
    
    public boolean BBCPrintButtonVerify()
	{
	try{
		WebElement  netBorrowingBaseWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(BBCPrintButton_xpath));
		netBorrowingBaseWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
    
    public boolean SkipBBCButtonVerify()
	{
	try{
		WebElement  netBorrowingBaseWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(SkipBBCButton_xpath));
		netBorrowingBaseWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
    
    public SignBBCPage ApproveBBCButtonClick()
	{
	try{
		WebElement  netBorrowingBaseWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(ApproveBBCButton_xpath));
		netBorrowingBaseWebEelement.click();
		return new SignBBCPage(driver);
	}
	catch(Exception ex){
	
	}
	return null;
	}
    
}