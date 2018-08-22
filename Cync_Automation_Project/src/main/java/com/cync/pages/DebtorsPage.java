package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class DebtorsPage extends BasePage
{ 
	private final By debtors_xpath=By.xpath("//span[@class='paneltitle']");
	private final By firstAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_no'])[1]");
	private final By secondAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_no'])[2]");
	private final By thirdAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_no'])[3]");
	private final By fourthAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_no'])[4]");
	private final By fifthAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_no'])[5]");
	private final By sixthAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_no'])[6]");
	private final By seventhAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_no'])[7]");
	private final By eighthAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_no'])[8]");
	private final By firstAccountName_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_name'])[1]");
	private final By secondAccountName_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_name'])[2]");
	private final By thirdAccountName_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_name'])[3]");
	private final By fourthAccountName_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_name'])[4]");
	private final By fifthAccountName_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_name'])[5]");
	private final By sixthAccountName_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_name'])[6]");
	private final By seventhAccountName_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_name'])[7]");
	private final By eighthAccountName_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_name'])[8]");
	
	public DebtorsPage(WebDriver driver) {
		super(driver);

		try {
			Thread.sleep(1000);
		} catch (Exception e) {

			e.printStackTrace();
		}
		if (!driver.findElement(debtors_xpath).getText().trim()
				.equals("Debtors")) {
			throw new SkipException("Ineligible Summary couldn't open.");
		}
	}
	
	public boolean firstAccountNoValidation(String expected) {
		try {
			WebElement firstAccountNoWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(firstAccountNo_xpath));

			String actual = firstAccountNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean secondAccountNoValidation(String expected) {
		try {
			WebElement secondAccountNoWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(secondAccountNo_xpath));

			String actual = secondAccountNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean thirdAccountNoValidation(String expected) {
		try {
			WebElement thirdAccountNoWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(thirdAccountNo_xpath));

			String actual = thirdAccountNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean fourthAccountNoValidation(String expected) {
		try {
			WebElement fourthAccountNoWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(fourthAccountNo_xpath));

			String actual = fourthAccountNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean fifthAccountNoValidation(String expected) {
		try {
			WebElement fifthAccountNoWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(fifthAccountNo_xpath));

			String actual = fifthAccountNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean sixthAccountNoValidation(String expected) {
		try {
			WebElement sixthAccountNoWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(sixthAccountNo_xpath));

			String actual = sixthAccountNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean seventhAccountNoValidation(String expected) {
		try {
			WebElement seventhAccountNoWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(seventhAccountNo_xpath));

			String actual = seventhAccountNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean eighthAccountNoValidation(String expected) {
		try {
			WebElement eighthAccountNoWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(eighthAccountNo_xpath));

			String actual = eighthAccountNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean firstAccountNameValidation(String expected) {
		try {
			WebElement firstAccountNameWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(firstAccountName_xpath));

			String actual = firstAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean secondAccountNameValidation(String expected) {
		try {
			WebElement secondAccountNameWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(secondAccountName_xpath));

			String actual = secondAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean thirdAccountNameValidation(String expected) {
		try {
			WebElement thirdAccountNameWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(thirdAccountName_xpath));

			String actual = thirdAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean fourthAccountNameValidation(String expected) {
		try {
			WebElement fourthAccountNameWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(fourthAccountName_xpath));

			String actual = fourthAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean fifthAccountNameValidation(String expected) {
		try {
			WebElement fifthAccountNameWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(fifthAccountName_xpath));

			String actual = fifthAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean sixthAccountNameValidation(String expected) {
		try {
			WebElement sixthAccountNameWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(sixthAccountName_xpath));

			String actual = sixthAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean seventhAccountNameValidation(String expected) {
		try {
			WebElement seventhAccountNameWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(seventhAccountName_xpath));

			String actual = seventhAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean eighthAccountNameValidation(String expected) {
		try {
			WebElement eighthAccountNameWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(eighthAccountName_xpath));

			String actual = eighthAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	
}
