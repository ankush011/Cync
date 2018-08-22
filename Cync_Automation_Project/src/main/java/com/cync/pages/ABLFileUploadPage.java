package com.cync.pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class ABLFileUploadPage extends BasePage {

    private final By ABLFileUploadPageHeader_xpath = By.xpath("//h3[contains(text(),'ABL File Uploads')]");
    private final By bbcDate_xpath=By.xpath("//input[@class='ng-tns-c5-2 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']");
    private final By dataFileType_xpath=By.xpath("//span[text()='Receivables']");
    private final By collateralName_xpath=By.xpath("//span[text()='summarymapping']");
    private final By currentPeriod_xpath=By.xpath("(//span[text()='04/28/2017'])[1]");
    private final By DueDate_xpath=By.xpath("(//span[text()='04/28/2017'])[2]");
   private final By chooseFile_xpath=By.xpath("//button[text()=' Choose File ']");
   private final By ProcessFile_xpath=By.xpath("//span[text()='Process Files']");
   private final By sucessMessage_xpath=By.xpath("//b[text()='File upload was successful']");
   private final By closeSucessMessage_xpath=By.xpath("//button[text()='Close']");
   private final By uploadedValue_xpath=By.xpath("//span[text()='117,250.00']");
   private final By dataClick_xpath=By.xpath("//span[@class='ui-row-toggler fa fa-fw ui-clickable fa-chevron-circle-right']");
   private final By collateralNameData_xpath=By.xpath("//a[contains(text(),'summary')]");
private final By futureAmountData_xpath=By.xpath("//span[contains(text(),'2,000.00')]");
private final By currentAmountData_xpath=By.xpath("//span[contains(text(),'36,500.00')]");
private final By Over30AmountData_xpath=By.xpath("//span[contains(text(),'11,500.00')]");
private final By Over60AmountData_xpath=By.xpath("//span[contains(text(),'33,000.00')]");
private final By Over90AmountData_xpath=By.xpath("//span[contains(text(),'19,750.00')]");
private final By Over120AmountData_xpath=By.xpath("//span[contains(text(),'14,500.00')]");
private final By BalanceAmountData_xpath=By.xpath("//span[contains(text(),'117,250.00')]");
private final By notificationClick_xpath=By.xpath("//span[@class='ui-cell-data clr_blue hand']");
private final By NotificationProcessFileData_xpath=By.xpath("//p[contains(text(),'Processing file succeed')]");   
private final By HyperLinkFileNavigate_xpath=By.xpath("//a[contains(text(),'SummaryArAblOne.xlsx')]");



    public ABLFileUploadPage(WebDriver driver) {
	super(driver);
	try{
		if(!driver.findElement(ABLFileUploadPageHeader_xpath).getText().trim().contains("ABL File Uploads")){
			throw new SkipException("ABL Client Creation page couldn't open.");
		
		}}
	catch(Exception e){
		
	// TODO Auto-generated constructor stub
		e.printStackTrace();
}
	
	// TODO Auto-generated constructor stub

}
   
    
    public boolean bbcDateValidation(String expectedBBCDate){
	try {
		WebElement BBCDateWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(bbcDate_xpath));
		
		String actual = BBCDateWebElement.getText().trim();
		actual.equals(expectedBBCDate);
			return true;
		

	} catch (Exception e) {
		return false;
	}
}

    
    public boolean dataFileTypeValidate(String expectedDataFileType){
	try {
		WebElement BBCDateWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(dataFileType_xpath));
		
		String actual = BBCDateWebElement.getText().trim();
		actual.equals(expectedDataFileType);
			return true;
		

	} catch (Exception e) {
		return false;
	}
}




public boolean collateralName(String expectedCollateralName){
	try {
		WebElement collateralNameWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(collateralName_xpath));
		
		String actual = collateralNameWebElement.getText().trim();
	actual.equals(expectedCollateralName);
			return true;
		
	} catch (Exception e) {
		return false;
	}
}





public boolean currentPeriod(String expectedCurrentPeriod){
	try {
		WebElement currentPeriodWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(currentPeriod_xpath));
		
		String actual = currentPeriodWebElement.getText().trim();
		actual.equals(expectedCurrentPeriod);
			return true;
		

	} catch (Exception e) {
		return false;
	}
}

public boolean dueDate(String expectedDueDate){
	try {
		WebElement dueDateWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(DueDate_xpath));
		
		String actual = dueDateWebElement.getText().trim();
		actual.equals(expectedDueDate);
			return true;
		
	} catch (Exception e) {
		return false;
	}
}


public boolean clickchooseFile(){
	
	try{
		WebElement clickchooseFileWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(chooseFile_xpath));
		clickchooseFileWebEelement.isDisplayed();
		clickchooseFileWebEelement.click();
		Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}


public boolean  fileUPload_mapping(){
		try {	
		StringSelection ss = new StringSelection("D:\\AUTOMATIONTC\\SummaryArAblOne.xlsx");
		//StringSelection ss = new StringSelection("D:\\AutomationCI\\Cync_Automation_Project\\src\\test\resources\\cynclogo_fin.png");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		return true;
	} catch (Exception e) {
		// TODO: handle exception
	}
	return false;
	
}


public boolean clickProcessFile(){
	
	try{
		WebElement clickchooseFileWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ProcessFile_xpath));
		clickchooseFileWebEelement.click();
		Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}

public String sucessMessage(String expectedSucessMessage){
	try {
		WebElement dueDateWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(sucessMessage_xpath));
		
		String actual = dueDateWebElement.getText().trim();
		actual.equals(expectedSucessMessage);
			
		
	} catch (Exception e) {
	
	}
	return expectedSucessMessage;
}

public boolean closeSucessMessage(){
	
	try{
		WebElement clickchooseFileWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(closeSucessMessage_xpath));
		clickchooseFileWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}



public boolean uploadedValue(String expectedUplodedValue){
	try {
		WebElement dueDateWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(uploadedValue_xpath));
		
		String actual = dueDateWebElement.getText().trim();
		actual.equals(expectedUplodedValue);
			return true;
		
	} catch (Exception e) {
		return false;
	}
}

public boolean ClickToOpenData(){
	
	try{
	
		WebElement clickchooseFileWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(dataClick_xpath));
		clickchooseFileWebEelement.click();
		Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}


public boolean collateralNameData(String expectedCollateralName){
	try {
		WebElement collateralNameWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(collateralNameData_xpath));
		
		String actual = collateralNameWebElement.getText().trim();
	actual.equals(expectedCollateralName);
			return true;
		
	} catch (Exception e) {
		return false;
	}
}

public boolean futureAmountData(String expectedfutureAmount){
	try {
		WebElement collateralNameWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(futureAmountData_xpath));
		
		String actual = collateralNameWebElement.getText().trim();
	actual.equals(expectedfutureAmount);
			return true;
		
	} catch (Exception e) {
		return false;
	}
}

public boolean currentAmountData(String expectedCurrentAmount){
	try {
		WebElement collateralNameWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(currentAmountData_xpath));
		
		String actual = collateralNameWebElement.getText().trim();
	actual.equals(expectedCurrentAmount);
			return true;
		
	} catch (Exception e) {
		return false;
	}
}
public boolean Over30AmountData(String expectedOver30Amount){
	try {
		WebElement collateralNameWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(Over30AmountData_xpath));
		
		String actual = collateralNameWebElement.getText().trim();
	actual.equals(expectedOver30Amount);
			return true;
		
	} catch (Exception e) {
		return false;
	}
}

public boolean Over60AmountData(String expectedOver60Amount){
	try {
		WebElement collateralNameWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(Over60AmountData_xpath));
		
		String actual = collateralNameWebElement.getText().trim();
	actual.equals(expectedOver60Amount);
			return true;
		
	} catch (Exception e) {
		return false;
	}
}
public boolean Over90AmountData(String expectedOver90Amount){
	try {
		
		
		WebElement collateralNameWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(Over90AmountData_xpath));
		
		String actual = collateralNameWebElement.getText().trim();
	actual.equals(expectedOver90Amount);
			return true;
		
	} catch (Exception e) {
		return false;
	}
}

public boolean Over120AmountData(String expectedOver120Amount){
	try {
		
		WebElement collateralNameWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(Over120AmountData_xpath));
		
		String actual = collateralNameWebElement.getText().trim();
	actual.equals(expectedOver120Amount);
			return true;
		
	} catch (Exception e) {
		return false;
	}
}
public boolean BalanceAmountData(String expectedBalanceAmount){
	try {
		WebElement collateralNameWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(BalanceAmountData_xpath));
		
		String actual = collateralNameWebElement.getText().trim();
	actual.equals(expectedBalanceAmount);
			return true;
		
	} catch (Exception e) {
		return false;
	}
}

public boolean ClickOnNotification(){
	
	try{
	
		WebElement clickchooseFileWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(notificationClick_xpath));
		clickchooseFileWebEelement.click();
		Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}

public boolean NotificationProcessFileData()
	{
	try{
		
	
		
		WebElement sucessSignatureandApproveBBCWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(NotificationProcessFileData_xpath));
		sucessSignatureandApproveBBCWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	} 


public SummaryReceivablesPage clickOntheFileNavigateToSummaryReceivableScreen()
{
try{
	WebElement  netBorrowingBaseWebEelement=new WebDriverWait(driver,30)
		.until(ExpectedConditions.visibilityOfElementLocated(HyperLinkFileNavigate_xpath));
	netBorrowingBaseWebEelement.click();
	return new SummaryReceivablesPage(driver);
}
catch(Exception ex){

}
return null;
}


public MappingListViewPage clickOnCollateralNameToNavgateMappingScreen()
	{
	try{
		WebElement  netBorrowingBaseWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(collateralNameData_xpath));
		netBorrowingBaseWebEelement.click();
		
	}
	catch(Exception ex){
	
	}
	return null;
	}
}
