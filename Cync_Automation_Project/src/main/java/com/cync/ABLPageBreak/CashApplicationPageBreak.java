package com.cync.ABLPageBreak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class CashApplicationPageBreak extends BasePage {

    public CashApplicationPageBreak(WebDriver driver) {
	super(driver);
	// TODO Auto-generated constructor stub
    }

    private final By CasReceiptSourceCodesPageHeader_xpath = By.xpath("//span[contains(text(),'Cash Receipt Source Codes')]");
    private final By BatchCashReceiptsEntryPageHeader_xpath = By.xpath("//span[contains(text(),'Batch Cash Receipts Entry')]");
    private final By CheckRegisterPageHeader_xpath = By.xpath("//span[contains(text(),'Check Register')]");
    private final By BatchProcessPageHeader_xpath = By.xpath("//span[contains(text(),'Batch Process')]");
    private final By CashReceiptHistoryPageHeader_xpath = By.xpath("//span[contains(text(),' Cash Receipt History ')]");
    private final By DailyCashPostingPageHeader_xpath = By.xpath("//span[contains(text(),'Daily Cash Posting')]");
    private final By DailyCashTransactionReportingPageHeader_xpath = By.xpath("//span[contains(text(),'Daily Cash Transaction Reporting')]");
    private final By CreditMemoPageHeader_xpath = By.xpath("//span[contains(text(),'Credit Memo')]");
    private final By CreditMemoHistoryPageHeader_xpath = By.xpath("//span[contains(text(),'Credit Memo History')]");
    private final By UnprocessedChecksPageHeader_xpath = By.xpath("//span[contains(text(),' Unprocessed checks')]");
    
    
   /* public CashApplicationPageBreak(WebDriver driver) {
	super(driver);
	try{
		if(!driver.findElement(CasReceiptSourceCodesPageHeader_xpath).getText().trim().contains("Cash Receipt Source Codes")){
			throw new SkipException("ABL Client Creation page couldn't open.");
		
		}}
	catch(Exception e){
		
	// TODO Auto-generated constructor stub
		e.printStackTrace();
}
	
	// TODO Auto-generated constructor stub

}*/


    public boolean CasReceiptSourceCodesPageHeader(String expected) {
	try {
		WebElement firstAccountNoWebElement = new WebDriverWait(driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(CasReceiptSourceCodesPageHeader_xpath));

		String actual = firstAccountNoWebElement.getText();
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
   
    public boolean UnprocessedChecksPageHeader(String expected) {
	try {
		WebElement firstAccountNoWebElement = new WebDriverWait(driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(UnprocessedChecksPageHeader_xpath));

		String actual = firstAccountNoWebElement.getText();
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
    
    
    
    
    
    
    
    
    
    public boolean BatchCashReceiptsEntryPageHeader(String expected) {
 	try {
 		WebElement firstAccountNoWebElement = new WebDriverWait(driver, 100)
 				.until(ExpectedConditions
 						.visibilityOfElementLocated(BatchCashReceiptsEntryPageHeader_xpath));

 		String actual = firstAccountNoWebElement.getText().trim();
 		if (actual.equals(expected))
 			return true;
 		else
 			return false;

 	} catch (Exception e) {
 		return false;
 	}
 }
    
    
    public boolean CheckRegisterPageHeader(String expected) {
 	try {
 		WebElement firstAccountNoWebElement = new WebDriverWait(driver, 100)
 				.until(ExpectedConditions
 						.visibilityOfElementLocated(CheckRegisterPageHeader_xpath));

 		String actual = firstAccountNoWebElement.getText();
 		if (actual.equals(expected))
 			return true;
 		else
 			return false;

 	} catch (Exception e) {
 		return false;
 	}
 }
    
    
    public boolean BatchProcessPageHeader(String expected) {
 	try {
 		WebElement firstAccountNoWebElement = new WebDriverWait(driver, 100)
 				.until(ExpectedConditions
 						.visibilityOfElementLocated(BatchProcessPageHeader_xpath));

 		String actual = firstAccountNoWebElement.getText().trim();
 		if (actual.equals(expected))
 			return true;
 		else
 			return false;

 	} catch (Exception e) {
 		return false;
 	}
 }
  
    public boolean CashReceiptHistoryPageHeader(String expected) {
 	try {
 		WebElement firstAccountNoWebElement = new WebDriverWait(driver, 100)
 				.until(ExpectedConditions
 						.visibilityOfElementLocated(CashReceiptHistoryPageHeader_xpath));

 		String actual = firstAccountNoWebElement.getText().trim();
 		if (actual.equals(expected))
 			return true;
 		else
 			return false;

 	} catch (Exception e) {
 		return false;
 	}
 }
    
    public boolean DailyCashPostingPageHeader(String expected) {
 	try {
 		WebElement firstAccountNoWebElement = new WebDriverWait(driver, 100)
 				.until(ExpectedConditions
 						.visibilityOfElementLocated(DailyCashPostingPageHeader_xpath));

 		String actual = firstAccountNoWebElement.getText().trim();
 		if (actual.equals(expected))
 			return true;
 		else
 			return false;

 	} catch (Exception e) {
 		return false;
 	}
 }
    
    public boolean DailyCashTransactionReportingPageHeader(String expected) {
 	try {
 		WebElement firstAccountNoWebElement = new WebDriverWait(driver, 100)
 				.until(ExpectedConditions
 						.visibilityOfElementLocated(DailyCashTransactionReportingPageHeader_xpath));

 		String actual = firstAccountNoWebElement.getText().trim();
 		if (actual.equals(expected))
 			return true;
 		else
 			return false;

 	} catch (Exception e) {
 		return false;
 	}
 }
    
    public boolean CreditMemoPageHeader(String expected) {
 	try {
 		WebElement firstAccountNoWebElement = new WebDriverWait(driver, 100)
 				.until(ExpectedConditions
 						.visibilityOfElementLocated(CreditMemoPageHeader_xpath));

 		String actual = firstAccountNoWebElement.getText().trim();
 		if (actual.equals(expected))
 			return true;
 		else
 			return false;

 	} catch (Exception e) {
 		return false;
 	}
 }
 
    public boolean CreditMemoHistoryPageHeader(String expected) {
 	try {
 		WebElement firstAccountNoWebElement = new WebDriverWait(driver, 100)
 				.until(ExpectedConditions
 						.visibilityOfElementLocated(CreditMemoHistoryPageHeader_xpath));

 		String actual = firstAccountNoWebElement.getText().trim();
 		if (actual.equals(expected))
 			return true;
 		else
 			return false;

 	} catch (Exception e) {
 		return false;
 	}
 }
    
}
