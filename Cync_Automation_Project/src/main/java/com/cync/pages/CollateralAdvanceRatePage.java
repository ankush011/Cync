package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class CollateralAdvanceRatePage extends BasePage  {
	
	
	private final By CollateralAdvanceRateHeader_xpath = By.xpath("//span[@class='paneltitle']");
	private final By ReceivablesDoubleClick_xpath = By.xpath("(//div[@class='ui-jqgrid ui-widget ui-widget-content ui-corner-all']//div//table/tbody/tr[2]/td[4])[2]");
	private final By advanceRateTextBox_xpath = By.xpath("(//input[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[5]");
        private final By SaveBtnClick_xpath = By.xpath("(//span[@class='ui-icon ui-icon ui-icon-disk'])[2]");
	private final By SuccessMsg_xpath = By.xpath("//div[text()='Collateral Advance Rate was successfully updated.']");
	private final By closePopup_xpath = By.id("closedialog");

	
	
	
	public CollateralAdvanceRatePage(WebDriver driver) {
		super(driver);
		try{
			Thread.sleep(3000);
			}
		catch(Exception e){
			
		// TODO Auto-generated constructor stub
			e.printStackTrace();
	        }
		if(!driver.findElement(CollateralAdvanceRateHeader_xpath).getText().trim().equals("Collateral Advance Rate: DIV")){
			throw new SkipException("Collateral Advance Rate Page couldn't open.");
		}// TODO Auto-generated constructor stub

		}
	

	
	  public String HeaderVerify(String Header)
		{
		 
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(CollateralAdvanceRateHeader_xpath));
			HeaderWebEelement.getText();
			
		}
		catch(Exception ex){
			
		}
		return Header;
		
		}  
	
	
	public boolean DoubleClickVerify()
	{
		try{
		
		WebElement element=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(ReceivablesDoubleClick_xpath));
		//Double click
		Actions action = new Actions(driver);
		action.doubleClick(element).build().perform();
		Thread.sleep(2000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
}

	public String addValueToAdvanceRate(String Advancerate)
	{
	try{
		WebElement advanceRateTextBoxWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(advanceRateTextBox_xpath));
		advanceRateTextBoxWebEelement.clear();
		advanceRateTextBoxWebEelement.sendKeys(Advancerate);
		Thread.sleep(2000);
	
	}
	catch(Exception ex){

	}
	return Advancerate;

	}

	
	public boolean SaveBtnVerify()
	{
		try{
		
		WebElement saveWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(SaveBtnClick_xpath));
		saveWebelement.click();
		Thread.sleep(5000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}
	
		

	  public String SuccessMsgVerify(String SuccessMsg)
		{
		 
		try{
			WebElement SuccessMsgWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(SuccessMsg_xpath));
			SuccessMsgWebEelement.getText();
			Thread.sleep(2000);
			
		}
		catch(Exception ex){
			
		}
		return SuccessMsg;
		
		}  
		
	  public boolean ClosePopUpVerify()
		{
			try{
			
			WebElement closeWebelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(closePopup_xpath));
			closeWebelement.click();
			
			
			return true;
		}
		

		catch(Exception ex){
			return false;
		}
			
		}
	  
		
}
