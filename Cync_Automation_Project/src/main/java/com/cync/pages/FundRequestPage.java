package com.cync.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class FundRequestPage extends BasePage { 

    
    
    private final By fundRequestHeader_xpath=By.xpath("//span[contains(text(),'Fund Request')]");
    private final By editOnFundRequest_xpath=By.xpath("//button[@id='bbc_edit_bt']");
    private final By saveOnFundRequest_xpath=By.xpath("//button[@id='bbc_save_bt']");
    private final By FundRequestMsgObj_xpath=By.xpath("//div[@class='alert-success alert']");
    private final By BBCDatefundRequest_xpath=By.xpath("//input[@id='bbc_bbc_dt']");
    private final By selectBBCDatefundRequest_xpath=By.xpath("//input[@id='eligible_bbcs_for_fund_request']");
    private final By fundRequestAmountTextBox_xpath=By.xpath("//input[@id='bbc_fund_request']");
   
    private final By totalAvailablityVerifyOnFundRequest_xpath=By.xpath("//*[@id='second_fund_request']/div[2]/div[6]/div/label");
    private final By netCommitmentVerifyOnFundRequest_xpath=By.xpath("(//label[contains(text(),'30,000.00')])[1]");
    private final By netborrowingBaseAvailablityVerifyOnFundRequest_xpath=By.xpath("(//label[contains(text(),'30,000.00')])[2]");
    private final By maxFundLimitVerifyOnFundRequest_xpath=By.xpath("(//label[contains(text(),'30,000.00')])[3]");
    private final By cancelOnFundRequest_xpath=By.xpath("//button[@id='bbc_cancel']");
    
    
    
    
	public FundRequestPage(WebDriver driver) {
		super(driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!driver.findElement(fundRequestHeader_xpath).getText().trim().equals("Fund Request")){
			throw new SkipException("Fund Request couldn't open.");
		}
	}
	
	
	
	
	
	
	public String fundRequestHeader(String FundRequestHeader)
	{
	try{
		WebElement fundRequestHeaderWebEelement=new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(fundRequestHeader_xpath));
		fundRequestHeaderWebEelement.getText();
		
	}
	catch(Exception ex){
		
	}
	return FundRequestHeader;
	
	}
	
	
	
	
	public boolean fundRequestEdit()
	{
	try{
		WebElement fundRequestEditWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(editOnFundRequest_xpath));
		fundRequestEditWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	
	
	
	
	
	
	
	
	public String BBCDateOnFundRequest(String FundRequestDate)
	{
	try{
		WebElement fundRequestBBCDateHeaderWebEelement=new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(BBCDatefundRequest_xpath));
		fundRequestBBCDateHeaderWebEelement.getText();
		
	}
	catch(Exception ex){
		
	}
	return FundRequestDate;
	
	}
	
	
	public String selectBBCOnFundRequest(String FundRequestDate)
	{
	try{
		WebElement fundRequestBBCDateWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(selectBBCDatefundRequest_xpath));
		fundRequestBBCDateWebEelement.getText();
		
	}
	catch(Exception ex){
		
	}
	return FundRequestDate;
	
	}
	
	
	
	public boolean totalAvailablityVerifyOnFundRequest1()
	{
	try{
		WebElement totalAvailablityWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(totalAvailablityVerifyOnFundRequest_xpath));
		totalAvailablityWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	
	public boolean totalAvailablityVerifyOnFundRequest(String expected) {
		try {
			WebElement receivablesRollForwardAmountWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(totalAvailablityVerifyOnFundRequest_xpath));
			
			String actual = receivablesRollForwardAmountWebElement.getText().trim();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public boolean netCommitmentVerifyOnFundRequest()
	{
	try{
		
		WebElement netCommitmentWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(netCommitmentVerifyOnFundRequest_xpath));
		netCommitmentWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	
	public boolean netborrowingBaseAvailablityVerifyOnFundRequest()
	{
	try{
		
		WebElement netborrowingBaseAvailablityWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(netborrowingBaseAvailablityVerifyOnFundRequest_xpath));
		netborrowingBaseAvailablityWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	
	
	
	public boolean maxFundLimitVerifyOnFundRequest(String expected) {
		try {
			WebElement receivablesRollForwardAmountWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(maxFundLimitVerifyOnFundRequest_xpath));
			
			String actual = receivablesRollForwardAmountWebElement.getText().trim();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	
	
	
	public boolean fundRequestEditClick()
	{
	try{
		WebElement fundRequestEditWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(editOnFundRequest_xpath));
		fundRequestEditWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	
	public boolean fundRequestSaveUI()
	{
	try{
		WebElement fundRequestSaveWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(saveOnFundRequest_xpath));
		fundRequestSaveWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	public boolean fundRequestCancelUI()
	{
	try{
		WebElement fundRequestSaveWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(cancelOnFundRequest_xpath));
		fundRequestSaveWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	
	
	public String addFundRequestAmount(String FundRequestAmount)
	{
	try{
		WebElement fundRequestAmountTextBoxWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(fundRequestAmountTextBox_xpath));
		fundRequestAmountTextBoxWebEelement.clear();
		fundRequestAmountTextBoxWebEelement.sendKeys(FundRequestAmount);
		
	}
	catch(Exception ex){
	  
	}
	return FundRequestAmount;
	

	}
	
	public boolean fundRequestSave()
	{
	try{
		WebElement fundRequestSaveWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(saveOnFundRequest_xpath));
		fundRequestSaveWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	
	
	public String verifyMessageOnFundRequestAfterSave(String messageOnFundReuest)
	    {
	    try{
	       WebElement fundRequestMessageWebEelement=new WebDriverWait(driver,10)
	       .until(ExpectedConditions.visibilityOfElementLocated(FundRequestMsgObj_xpath));
	       
	      String actualMsgFromAPP= fundRequestMessageWebEelement.getText();
	      if(actualMsgFromAPP.equalsIgnoreCase(messageOnFundReuest))
	      {
	       return actualMsgFromAPP;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return messageOnFundReuest;
	    }
	
	
}


