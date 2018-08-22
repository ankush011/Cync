package com.cync.ABLPageBreak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class ExceptionAnalysisPageBreak extends BasePage {

    public ExceptionAnalysisPageBreak(WebDriver driver) {
	super(driver);
	// TODO Auto-generated constructor stub
    }



    private final By DocumentComplianceReportingPageHeader_xpath = By.xpath("//span[contains(text(),' Document Compliance Reporting ')]");
    private final By ExceptionReportingPageHeader_xpath = By.xpath("//span[contains(text(),'  Exception Reporting ')]");
    private final By WatchListStatisticsReportingPageHeader_xpath = By.xpath("//span[contains(text(),' Watch List Statistics Reporting ')]");
    private final By TicklerTasksPageHeader_xpath = By.xpath("//span[contains(text(),'Tickler Tasks ')]");
    private final By DilutionAnalysisPageHeader_xpath = By.xpath("//span[contains(text(),'Dilution Analysis ')]");
    
    
    
   
    
    public boolean  DocumentComplianceReportingPageHeader(String expected) {
   	try {
   		WebElement firstAccountNoWebElement = new WebDriverWait(driver, 100)
   				.until(ExpectedConditions
   						.visibilityOfElementLocated(DocumentComplianceReportingPageHeader_xpath));

   		String actual = firstAccountNoWebElement.getText().trim();
   		if (actual.equals(expected))
   			return true;
   		else
   			return false;

   	} catch (Exception e) {
   		return false;
   	}
   }
    
    
    
    public boolean  ExceptionReportingPageHeader(String expected) {
   	try {
   		WebElement firstAccountNoWebElement = new WebDriverWait(driver, 100)
   				.until(ExpectedConditions
   						.visibilityOfElementLocated(ExceptionReportingPageHeader_xpath));

   		String actual = firstAccountNoWebElement.getText().trim();
   		if (actual.equals(expected))
   			return true;
   		else
   			return false;

   	} catch (Exception e) {
   		return false;
   	}
   }  
    
    
    
    public boolean  WatchListStatisticsReportingPageHeader(String expected) {
   	try {
   		WebElement firstAccountNoWebElement = new WebDriverWait(driver, 100)
   				.until(ExpectedConditions
   						.visibilityOfElementLocated(WatchListStatisticsReportingPageHeader_xpath));

   		String actual = firstAccountNoWebElement.getText().trim();
   		if (actual.equals(expected))
   			return true;
   		else
   			return false;

   	} catch (Exception e) {
   		return false;
   	}
   }  
    
    
    
    
    public boolean  TicklerTasksPageHeader(String expected) {
   	try {
   		WebElement firstAccountNoWebElement = new WebDriverWait(driver, 100)
   				.until(ExpectedConditions
   						.visibilityOfElementLocated(TicklerTasksPageHeader_xpath));

   		String actual = firstAccountNoWebElement.getText().trim();
   		if (actual.equals(expected))
   			return true;
   		else
   			return false;

   	} catch (Exception e) {
   		return false;
   	}
   }  
    
    
    
    public boolean  DilutionAnalysisPageHeader(String expected) {
   	try {
   		WebElement firstAccountNoWebElement = new WebDriverWait(driver, 100)
   				.until(ExpectedConditions
   						.visibilityOfElementLocated(DilutionAnalysisPageHeader_xpath));

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

