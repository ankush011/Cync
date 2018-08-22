package com.cync.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class NotificationAlertPage extends BasePage {

	
	private final By BBCRecalculationProcessPageHeader_xpath = By.xpath("//span[contains(text(),'BBC Recalculation Process')]");
	private final By notificationAlertBtn_xpath = By.id("show_notification");
	private final By ClearAllBtn_xpath = By.id("notify_clear");
	private final By notificationAlertPopUpClose_xpath = By.xpath("//button[@class='ui-dialog-titlebar-close']");
	private final By reCalculationBbcBtn_xpath = By.xpath("//a[@href='/borrowers/4999/bbc_start']");
	private final By BBCRecalculationSuccessMsg_xpath = By.xpath("//div[contains(@class,'justifiedContent')]");

	
	
	
	
	
	public NotificationAlertPage(WebDriver driver) {
		super(driver);
		try{
			if(!driver.findElement(BBCRecalculationProcessPageHeader_xpath).getText().trim().contains("BBC Recalculation Process")){
				throw new SkipException("BBC Recalculation Process page couldn't open.");
			
			}}
		catch(Exception e){
			
		// TODO Auto-generated constructor stub
			e.printStackTrace();
	}
		
		// TODO Auto-generated constructor stub
		
	}
	
	
	public String HeaderVerify(String Header)
	{
	 
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(BBCRecalculationProcessPageHeader_xpath));
		HeaderWebEelement.getText();
		
	}
	catch(Exception ex){
		
	}
	return Header;
	
	} 
	
	

	public boolean NotificationAlertBtnVerify()
	{
		try{
		
		WebElement alertWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(notificationAlertBtn_xpath));
		alertWebelement.click();
		Thread.sleep(5000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}
	
	public boolean NotificationAlertClearAllBtnVerify()
	{
		try{
		
		WebElement alertClearAllWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(ClearAllBtn_xpath));
		alertClearAllWebelement.click();
		Thread.sleep(3000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}
	
	
	public boolean NotificationAlertClosePopUpBtnVerify()
	{
		try{
		
		WebElement alertCloseAllWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(notificationAlertPopUpClose_xpath));
		alertCloseAllWebelement.click();
		Thread.sleep(2000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}
	
		
	public boolean ProcessRecalculationBBCVerify()
	{
		try{
		
		WebElement reCalculationBbcWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(reCalculationBbcBtn_xpath));
		reCalculationBbcWebelement.click();
		Thread.sleep(3000);
		Alert alertOK = driver.switchTo().alert();
		alertOK.accept();
		Thread.sleep(3000);
		Alert alertOKK = driver.switchTo().alert();
		alertOKK.accept();
		Thread.sleep(5000);
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}
	
	
	public boolean AlertMsgVerify()
	{
	 
	try{
		WebElement SuccessMsgWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(BBCRecalculationSuccessMsg_xpath));
		SuccessMsgWebEelement.isDisplayed();
		Thread.sleep(2000);
		return true;
		
	}
	catch(Exception ex){
		return false;
		
	}
	
	}
	

	
}
