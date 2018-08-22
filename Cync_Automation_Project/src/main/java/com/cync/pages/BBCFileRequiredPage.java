package com.cync.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class BBCFileRequiredPage extends BasePage {

        private final By BBCFileRequiredHeader_xpath=By.xpath("//span[contains(text(),'BBC Files Required')]");
        private final By addIconBBCFilesRequired_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-plus']");
	private final By collateralNameDropdown_xpath=By.xpath("(//select[@name='mapping_id'])[2]");
	private final By saveIconBBCFilesRequired_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-disk']");
	private final By saveBBCFilesRequiredSuccessmsg_xpath=By.xpath("//div[text()='BBC Files Required was successfully created.']");
	private final By closeMsgDialog_xpath=By.xpath("//a[@id='closedialog']");
    
    
    
    
    
    
    
    public BBCFileRequiredPage(WebDriver driver) {
	super(driver);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(!driver.findElement(BBCFileRequiredHeader_xpath).getText().trim().equals("BBC Files Required")){
		throw new SkipException("sales region couldn't open.");
	}
}

    
    
    public boolean clickaddIconBBCFilesRequired()
	{
	try{

		WebElement clickaddIconBBCFilesRequiredWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(addIconBBCFilesRequired_xpath));
		clickaddIconBBCFilesRequiredWebEelement.click();
		Thread.sleep(5000);

		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
    
	public boolean collateralNameDropdownValues(String collateralNameDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(collateralNameDropdown_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(collateralNameDropdownValue)) {
					ele.click();
					
					return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}
	
	
	public boolean saveIconBBCFilesRequired()
	{
	try{

		WebElement saveIconBBCFilesRequiredWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(saveIconBBCFilesRequired_xpath));
		saveIconBBCFilesRequiredWebEelement.click();
		Thread.sleep(5000);

		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	
	public String saveBBCFilesRequiredSuccessmsg(String messageOnBBCFileRequired)
	    {
	    try{
	       WebElement SaveWebEelement=new WebDriverWait(driver,200)
	       .until(ExpectedConditions.visibilityOfElementLocated(saveBBCFilesRequiredSuccessmsg_xpath));
	       
	      String actualMsgFromAPP= SaveWebEelement.getText();
	      if(actualMsgFromAPP.equalsIgnoreCase(messageOnBBCFileRequired))
	      {
	       return actualMsgFromAPP;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return messageOnBBCFileRequired;
	    }

	
	
	public boolean closeMsgDialog()
	{
	try{

		WebElement closeMsgDialogWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(closeMsgDialog_xpath));
		closeMsgDialogWebEelement.click();
		Thread.sleep(5000);

		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
    
}
