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

public class ReportsPage extends BasePage {

	private final By reportsHeader=By.xpath("//span[text()=' Reports ']");
	private final By bbcReport_xpath=By.xpath("//a[text()='BBC Report']");
	private final By htmlButton_xpath=By.xpath("//button[text()='HTML']");
	private final By concentrationTextReport_xpath=By.xpath("//td[contains(text(),'Concentration %')]");
	private final By concentrationTextReportValue_xpath=By.xpath("(//td[contains(text(),' 21,925.00')])[3]");
	private final By ineligibleReceivableAnalysis_xpath=By.xpath("//a[text()='Ineligible/Eligible Receivable Analysis']");
	private final By ineligibleReceivableAnalysisGroupBy_xpath=By.xpath("//select[@id='ineligible_style']");
	
	public ReportsPage(WebDriver driver) {
		super(driver);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(!driver.findElement(reportsHeader).getText().trim().equals("Reports")){
			throw new SkipException("Reports screen couldn't open.");
		}
	}
	
	public boolean clickBBCReport()
	{
		try{

			WebElement clickRemoveAllIconWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(bbcReport_xpath));
			clickRemoveAllIconWebEelement.click();
			Thread.sleep(2000);
			
	return true;
		}
		catch(Exception ex){
			return false;
		}
}
	
	public boolean clickIneligibleReceivableAnalysis()
	{
		try{

			WebElement clickRemoveAllIconWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(ineligibleReceivableAnalysis_xpath));
			clickRemoveAllIconWebEelement.click();
			Thread.sleep(2000);
			
	return true;
		}
		catch(Exception ex){
			return false;
		}
}
	
	public boolean clickHTMLButton()
	{
		try{

			WebElement clickRemoveAllIconWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
			clickRemoveAllIconWebEelement.click();
			Thread.sleep(2000);
			
	return true;
		}
		catch(Exception ex){
			return false;
		}
}
	public boolean concentrationValueInReport()
	{
		String winHandleBefore = driver.getWindowHandle();
	for(String winHandle : driver.getWindowHandles()){
		System.out.println("!!!!!!!!!!!"+winHandleBefore);
	    driver.switchTo().window(winHandle);
	}

	// Perform the actions on new window
	try{

		WebElement concentrationText=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(concentrationTextReport_xpath));
		
		WebElement concentrationValue=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(concentrationTextReportValue_xpath));
		Thread.sleep(2000);
return true;
	}
	catch(Exception ex){
		return false;
	}
	// Close the new window, if that window no more required


	// Switch back to original browser (first window)
	//driver.switchTo().window(winHandleBefore);

}

	public boolean ineligibleReceivableAnalysisdropdownValues(String dataFileTypeDropdownValue) {
		try {
			WebElement ineligibleReceivableAnalysisdropdownValuesWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(ineligibleReceivableAnalysisGroupBy_xpath));
			Select sel = new Select(ineligibleReceivableAnalysisdropdownValuesWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(dataFileTypeDropdownValue)) {
					ele.click();
					Thread.sleep(10000);
					break;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}

}
