package com.cync.ABLPageBreak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class DocumentManagementPageBreak extends BasePage {

   
    private final By DocumentManagementPageHeader_xpath = By.xpath("//span[contains(text(),'Document Management')]");
    
    
    
    public DocumentManagementPageBreak(WebDriver driver) {
	super(driver);
	try{
		if(!driver.findElement(DocumentManagementPageHeader_xpath).getText().trim().contains("Document Management")){
			throw new SkipException("ABL Client Creation page couldn't open.");
		
		}}
	catch(Exception e){
		
	// TODO Auto-generated constructor stub
		e.printStackTrace();
}
	
	// TODO Auto-generated constructor stub

}
  
    public boolean DocumentManagementPageHeader(String expected) {
   	try {
   		WebElement firstAccountNoWebElement = new WebDriverWait(driver, 100)
   				.until(ExpectedConditions
   						.visibilityOfElementLocated(DocumentManagementPageHeader_xpath));

   		String actual = firstAccountNoWebElement.getText();
   		if (actual.equals(expected))
   			return true;
   		else
   			return false;

   	} catch (Exception e) {
   		return false;
   	}
   }   
}