package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class ReceivableAgingPage extends BasePage {
	private final By receivableAgingPage_xpath=By.xpath("//span[@class='paneltitle']");
	private final By bbcDate_xpath=By.xpath("//div[@class='control-group bbc_sum_lbls']//label[3]");
	private final By future_xpath=By.xpath("//label[text()='Future']");
	private final By current_xpath=By.xpath("//label[text()='Current']");
	private final By over30_xpath=By.xpath("//label[text()='Over 30']");
	private final By over60_xpath=By.xpath("//label[text()='Over 60']");
	private final By over90_xpath=By.xpath("//label[text()='Over 90']");
	private final By over120_xpath=By.xpath("//label[text()='Over 120']");
	//private final By retention_xpath=By.xpath("//label[text()='Retention']");
	private final By total_xpath=By.xpath("//label[text()='Total']");
	private final By futureAmount_xpath=By.id("Future");
	private final By currentAmount_xpath=By.id("Current");
	private final By over30Amount_xpath=By.id("Over_30");
	private final By over60Amount_xpath=By.id("Over_60");
	private final By over90Amount_xpath=By.id("Over_90");
	private final By over120Amount_xpath=By.id("Over_120");
	//private final By retentionAmount_xpath=By.xpath("//label[text()='Retention']");
	private final By totalAmount_xpath=By.id("total");





public ReceivableAgingPage(WebDriver driver) {
	super(driver);

	try {
		Thread.sleep(1000);
	} catch (Exception e) {

		e.printStackTrace();
	}
	if (!driver.findElement(receivableAgingPage_xpath).getText().trim()
			.equals("Receivable Aging")) {
		throw new SkipException("Receivable Aging couldn't open.");
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

public boolean verifyFutureAmount(String expected) {
	try {
		WebElement futureAmountWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(futureAmount_xpath));
		WebElement futureWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(future_xpath));

		futureWebElement.isDisplayed();
		String actual = futureAmountWebElement.getAttribute("value");
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
public boolean verifyCurrentAmount(String expected) {
	try {
		WebElement currentAmountWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(currentAmount_xpath));
		WebElement currentWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(current_xpath));

		currentWebElement.isDisplayed();
		String actual = currentAmountWebElement.getAttribute("value");
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
public boolean verifyOver30Amount(String expected) {
	try {
		WebElement over30AmountWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(over30Amount_xpath));
		WebElement over30WebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(over30_xpath));

		over30WebElement.isDisplayed();
		String actual = over30AmountWebElement.getAttribute("value");
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
public boolean verifyOver60Amount(String expected) {
	try {
		WebElement Over60AmountWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(over60Amount_xpath));
		WebElement Over60WebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(over60_xpath));

		Over60WebElement.isDisplayed();
		String actual = Over60AmountWebElement.getAttribute("value");
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
public boolean verifyOver90Amount(String expected) {
	try {
		WebElement Over90AmountWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(over90Amount_xpath));
		WebElement Over90WebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(over90_xpath));

		Over90WebElement.isDisplayed();
		String actual = Over90AmountWebElement.getAttribute("value");
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
public boolean verifyOver120Amount(String expected) {
	try {
		WebElement Over120AmountWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(over120Amount_xpath));
		WebElement Over120WebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(over120_xpath));

		Over120WebElement.isDisplayed();
		String actual = Over120AmountWebElement.getAttribute("value");
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
public boolean verifyTotalAmount(String expected) {
	try {
		WebElement totalAmountWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(totalAmount_xpath));
		WebElement totalWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(total_xpath));

		totalWebElement.isDisplayed();
		String actual = totalAmountWebElement.getAttribute("value");
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
}
