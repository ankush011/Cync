package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class BasicClientDetailPage extends BasePage {

    private final By editBtnClick_xpath = By.id("detail_parameter_edit");
   private final By activeCheck_xpath = By.id("borrower_active");
   private final By saveBtnClick_xpath = By.id("borrower_save_bt");
   private final By BasicClientDetailPageHeader_xpath = By.xpath("//span[contains(text(),'Basic Client Detail')]");
    
    
    
    
	public BasicClientDetailPage(WebDriver driver) {

		super(driver);
		try{
			if(!driver.findElement(BasicClientDetailPageHeader_xpath).getText().trim().contains("Basic Client Detail")){
				throw new SkipException("Basic Client Detail page couldn't open.");
			
			}}
		catch(Exception e){
			
		// TODO Auto-generated constructor stub
			e.printStackTrace();
	}
		
		// TODO Auto-generated constructor stub
		
	}
	

	public boolean ClickOnEditVerify()
	{
		try{
		
		WebElement editWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(editBtnClick_xpath));
		editWebelement.click();
		Thread.sleep(3000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}
	
	
	public boolean ClickOnActiveCheckBoxVerify()
	{
		try{
		
		WebElement activeCheckWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(activeCheck_xpath));
		activeCheckWebelement.click();
		Thread.sleep(2000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}
	
	
	public boolean ClickOnSaveBtnVerify()
	{
		try{
		
		WebElement saveBtnWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(saveBtnClick_xpath));
		saveBtnWebelement.click();
		Thread.sleep(10000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}}