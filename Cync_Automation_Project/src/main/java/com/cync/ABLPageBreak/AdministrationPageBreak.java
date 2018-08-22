package com.cync.ABLPageBreak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class AdministrationPageBreak extends BasePage{
	
	
	public AdministrationPageBreak(WebDriver driver) {
	super(driver);
	// TODO Auto-generated constructor stub
    }

	private final By basicDetailsHeader=By.xpath("//h3[contains(text(),'Basic Details')]");
	private final By bankDetailsHeader=By.xpath("//h3[contains(text(),'Bank Details')]");
	private final By ipHeader_xpath=By.xpath("//h3[contains(text(),'IP Address Setup - Summary')]");
	
	private final By salesRegionHeader_xpath=By.xpath("//h3[contains(text(),'Sales Region')]");
	private final By naicsCodesHeader_xpath=By.xpath("//h3[contains(text(),'NAICS Codes Summary')]");
	private final By systemParameters_xpath=By.xpath("//h3[contains(text(),'System Parameters Summary')]");
	private final By AdjustmentReasonsHeader_xpath=By.xpath("//h3[contains(text(),'Adjustment Reasons')]");
	private final By interestCalendarHeader_xpath=By.xpath("//h3[contains(text(),'Interest Calendar  | ')]");
	private final By contentHeader_xpath=By.xpath("//h3[contains(text(),'Content')]");
	private final By reportTemplatesHeader_xpath=By.xpath("//h3[contains(text(),'Report Templates')]");
	private final By currencyCodeHeader_xpath=By.xpath("//h3[contains(text(),'Currency Code')]");
	private final By userListHeader_xpath=By.xpath("//h3[contains(text(),'User List')]");
	private final By rolesHeader_xpath=By.xpath("//h3[contains(text(),'Roles & Permissions')]");
	private final By clientHeader_xpath=By.xpath("//h3[contains(text(),'Client Assignment')]");
	private final By userDefinedHeader_xpath=By.xpath("//h3[contains(text(),'User Defined Field')]");
	private final By auditHeader_xpath=By.xpath("//h3[contains(text(),'Audit Logs')]");
	private final By automatedTaskHeader_xpath=By.xpath("//h3[contains(text(),'Automated Task Logs')]");
	private final By notificationHeader_xpath=By.xpath("//h3[contains(text(),'Notification Logs')]");
	private final By notificationSettingsHeader_xpath=By.xpath("//h3[contains(text(),'Notification Settings')]");
	private final By templatesHeader_xpath=By.xpath("//h3[contains(text(),'Templates')]");
	
	  	
	
	
	
	
	
	public String verifyBasicDetailsHeader(String basicHeader){
		try{
			WebElement bankHeaderWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(basicDetailsHeader));
			String actual_header=bankHeaderWebE.getText().trim();
			
			if(actual_header.equals(basicHeader));
			
		}
		catch(Exception ex){
		}
		return basicHeader;
		}
	
	
	

	public String verifyBankDetailsHeader(String bankHeader){
		try{
			WebElement bankHeaderWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(bankDetailsHeader));
			String actual_header=bankHeaderWebE.getText().trim();
			
			if(actual_header.equals(bankHeader));
		}
		catch(Exception ex){
		}
		return bankHeader;
		}
	
	
	public String verifyIPAddessSetupHeader(String ipHeader){
		try{
			WebElement bankHeaderWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ipHeader_xpath));
			String actual_header=bankHeaderWebE.getText().trim();
			
			if(actual_header.equals(ipHeader));
		}
		catch(Exception ex){
		}
		return ipHeader;
		}
	
	public String verifySalesRegionHeader(String salesregionHeader)
	{
	try{
		WebElement salesRegionSearchWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(salesRegionHeader_xpath));
		String actual_header=salesRegionSearchWebEelement.getText().trim();
		if(actual_header.equals(salesregionHeader));
	}
	catch(Exception ex){
		
	}
	return salesregionHeader;
	
	}
	
	public String verifyNAICSCodesHeader(String naicsCodesHeader)
	{
	try{
		WebElement naicsCodesHeaderWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(naicsCodesHeader_xpath));
		String actual_header=naicsCodesHeaderWebEelement.getText().trim();
		if(actual_header.equals(naicsCodesHeader));
	}
	catch(Exception ex){
		
	}
	return naicsCodesHeader;
	
	}
	
	
	public String verifyCommentTypesHeader(String commentsHeader)
	{
	try{
		WebElement commentsHeaderWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(naicsCodesHeader_xpath));
		String actual_header=commentsHeaderWebE.getText().trim();
		if(actual_header.equals(commentsHeader));
	}
	catch(Exception ex){
		
	}
	return commentsHeader;
	
	}
	
	public String verifySystemParametersHeader(String systemParametersHeader)
	{
	try{
		WebElement systemParametersWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(systemParameters_xpath));
		String actual_header=systemParametersWebE.getText().trim();
		if(actual_header.equals(systemParametersHeader));
		
	}
	catch(Exception ex){
		
	}
	return systemParametersHeader;
	
	}
	
	public String verifyAdjustmentReasonsHeader(String adjustmentReasonsHeader)
	{
	try{
		WebElement systemParametersWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(AdjustmentReasonsHeader_xpath));
		String actual_header=systemParametersWebE.getText().trim();
		if(actual_header.equals(adjustmentReasonsHeader));
	}
	catch(Exception ex){
		
	}
	return adjustmentReasonsHeader;
	
	}
	
	
	public String verifyInterestCalendarHeader(String interestCalendarHeader)
	{
	try{
		WebElement systemParametersWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(interestCalendarHeader_xpath));
		String actual_header=systemParametersWebE.getText().trim();
		if(actual_header.equals(interestCalendarHeader));
	}
	catch(Exception ex){
		
	}
	return interestCalendarHeader;
	
	}
	

	public String verifyContentHeader(String contentHeader)
	{
	try{
		WebElement systemParametersWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(contentHeader_xpath));
		String actual_header=systemParametersWebE.getText().trim();
		if(actual_header.equals(contentHeader));
	}
	catch(Exception ex){
		
	}
	return contentHeader;
	
	}
	
	public String verifyReportTemplateHeader(String reportHeader)
	{
	try{
		WebElement systemParametersWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(reportTemplatesHeader_xpath));
		String actual_header=systemParametersWebE.getText().trim();
		if(actual_header.equals(reportHeader));
	}
	catch(Exception ex){
		
	}
	return reportHeader;
	
	}
	
	
	public String verifyCurrencyCodeHeader(String currencyHeader)
	{
	try{
		WebElement systemParametersWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(currencyCodeHeader_xpath));
		String actual_header=systemParametersWebE.getText().trim();
		if(actual_header.equals(currencyHeader));
	}
	catch(Exception ex){
		
	}
	return currencyHeader;
	
	}
	
	public String verifyUserListHeader(String userListHeader)
	{
	try{
		WebElement systemParametersWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(userListHeader_xpath));
		String actual_header=systemParametersWebE.getText().trim();
		if(actual_header.equals(userListHeader));
	}
	catch(Exception ex){
		
	}
	return userListHeader;
	
	}
	
	public String verifyRolesPermissionHeader(String rolesHeader)
	{
	try{
		WebElement systemParametersWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(rolesHeader_xpath));
		String actual_header=systemParametersWebE.getText().trim();
		if(actual_header.equals(rolesHeader));
	}
	catch(Exception ex){
		
	}
	return rolesHeader;
	
	}
	
	
	public String verifyClientAssignmentHeader(String clientHeader)
	{
	try{
		WebElement systemParametersWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(clientHeader_xpath));
		String actual_header=systemParametersWebE.getText().trim();
		if(actual_header.equals(clientHeader));
	}
	catch(Exception ex){
		
	}
	return clientHeader;
	
	}
	
	
	public String verifyUserDefinedFieldHeader(String userHeader)
	{
	try{
		WebElement userHeaderWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(userDefinedHeader_xpath));
		String actual_header=userHeaderWebE.getText().trim();
		if(actual_header.equals(userHeader));
	}
	catch(Exception ex){
		
	}
	return userHeader;
	
	}
	
	
	public String verifyAuditLogsHeader(String auditHeader)
	{
	try{
		WebElement userHeaderWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(auditHeader_xpath));
		String actual_header=userHeaderWebE.getText().trim();
		if(actual_header.equals(auditHeader));
	}
	catch(Exception ex){
		
	}
	return auditHeader;
	
	}
	
	
	public String verifyAutomatedTaskLogsHeader(String automatedTaskHeader)
	{
	try{
		WebElement userHeaderWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(automatedTaskHeader_xpath));
		String actual_header=userHeaderWebE.getText().trim();
		if(actual_header.equals(automatedTaskHeader));
	}
	catch(Exception ex){
		
	}
	return automatedTaskHeader;
	
	}
	
	
	public String verifyNotificationLogsHeader(String notificationHeader)
	{
	try{
		WebElement userHeaderWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(notificationHeader_xpath));
		String actual_header=userHeaderWebE.getText().trim();
		if(actual_header.equals(notificationHeader));
	}
	catch(Exception ex){
		
	}
	return notificationHeader;
	
	}
	
	
	public String verifyNotificationSettingsHeader(String notificationSettingsHeader)
	{
	try{
		WebElement userHeaderWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(notificationSettingsHeader_xpath));
		String actual_header=userHeaderWebE.getText().trim();
		if(actual_header.equals(notificationSettingsHeader));
	}
	catch(Exception ex){
		
	}
	return notificationSettingsHeader;
	
	}
	
	public String verifyTemplatesHeader(String templatesHeader)
	{
	try{
		WebElement userHeaderWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(templatesHeader_xpath));
		String actual_header=userHeaderWebE.getText().trim();
		if(actual_header.equals(templatesHeader));
	}
	catch(Exception ex){
		
	}
	return templatesHeader;
	
	}
	
}
//////////////////////////////////////////////////////////////////////////////////////////////

