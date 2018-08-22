package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class ReceivablesRollforwardPage extends BasePage
{
	private final By receivablesRollforward_xpath=By.xpath("//span[@class='paneltitle']");
	private final By bbcDate_xpath=By.xpath("(//label[@class='control-label'])[2]");
	private final By newSalesAdditions_xpath=By.xpath("//label[text()='New Sales (Additions)']");
	private final By newSalesAdditionsAmount_xpath=By.id("ns");
	private final By eopTotal_xpath=By.xpath("//label[text()='EOP Total']");
	private final By eopTotalAmount_xpath=By.id("et");
	private final By Unreconciled_xpath=By.xpath("//label[text()='Unreconciled']");
	private final By UnreconciledTotalAmount_xpath=By.xpath("(//label[text()='117,250.00'])[1]");
	
	public ReceivablesRollforwardPage(WebDriver driver) {
		super(driver);

		try {
			Thread.sleep(1000);
		} catch (Exception e) {

			e.printStackTrace();
		}
		if (!driver.findElement(receivablesRollforward_xpath).getText().trim()
				.equals("Receivables Rollforward")) {
			throw new SkipException("Receivables Rollforward couldn't open.");
		}
	}
	
	public boolean bbcDateValidation(String expected){
		try {
			WebElement BBCDateWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(bbcDate_xpath));
			
			String actual = BBCDateWebElement.getText().trim();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	
	
	
	
	
	public boolean newSalesValidation(String expected){
	try {
		WebElement newSalesAdditionsWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(newSalesAdditions_xpath));
		WebElement newSalesAdditionsAmountWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(newSalesAdditionsAmount_xpath));

		newSalesAdditionsWebElement.isDisplayed();
		String actual = newSalesAdditionsAmountWebElement.getAttribute("value");
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
	
	}
	
	public boolean EOPTotalValidation(String expected){
		try {
			WebElement EOPTotalWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(eopTotal_xpath));
			WebElement EOPTotalAmountWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(eopTotalAmount_xpath));

			EOPTotalWebElement.isDisplayed();
			String actual = EOPTotalAmountWebElement.getText().trim();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
		
		}
	
	
	
	
	public boolean UnreconciledValidation(String expected){
		try {
			WebElement EOPTotalWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Unreconciled_xpath));
			WebElement EOPTotalAmountWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(UnreconciledTotalAmount_xpath));

			EOPTotalWebElement.isDisplayed();
			String actual = EOPTotalAmountWebElement.getText().trim();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
		
		}
	
	
}
