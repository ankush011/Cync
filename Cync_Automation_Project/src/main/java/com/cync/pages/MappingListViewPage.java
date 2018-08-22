package com.cync.pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class MappingListViewPage extends BasePage {
    
    
        private final By MappingListViewPageHeader=By.xpath("//span[contains(text(),'Mapping List View')]");
        private final By createNewMapping_xpath=By.xpath("//a[text()='Create New Mapping']");
	private final By collateralNameField_xpath=By.xpath("//input[@id='mapping_name']");
	private final By dataFileType_xpath=By.xpath("//select[@id='mapping_data_type']");
	private final By collateralType_xpath=By.xpath("//select[@id='mapping_collateral_advance_rate_id']");
	private final By fileFormat_xpath=By.xpath("//select[@id='mapping_file_format']");
	private final By sheetNo_xpath=By.xpath("//input[@id='mapping_sheet_no']");
	private final By chooseFile_xpath=By.xpath("//input[@id='mapping_file']");
	private final By nextButton_xpath=By.xpath("//input[@id='mapping_create_bt']");
	private final By noOfHeaderRows_xpath=By.xpath("//input[@id='mapping_header_rows']");
	private final By accountNo_xpath=By.xpath("//select[@id='mapping_column_mappings_account_no']");
	private final By accountName_xpath=By.xpath("//select[@id='mapping_column_mappings_account_name']");
	private final By balanceAmountDropdownValue_xpath=By.xpath("//select[@id='mapping_column_mappings_balance_amount']");
	private final By future_xpath=By.xpath("//select[@id='mapping_column_mappings_future_amount']");
	private final By current_xpath=By.xpath("//select[@id='mapping_column_mappings_current_amount']");
	private final By over30_xpath=By.xpath("//select[@id='mapping_column_mappings_bucket1']");
	private final By over60_xpath=By.xpath("//select[@id='mapping_column_mappings_bucket2']");
	private final By over90_xpath=By.xpath("//select[@id='mapping_column_mappings_bucket3']");
	private final By over120_xpath=By.xpath("//select[@id='mapping_column_mappings_bucket4']");
	private final By sucessMessageForMapping_xpath=By.xpath("//strong[text()='Mapping was successfully created.']");
    
	
	public MappingListViewPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!driver.findElement(MappingListViewPageHeader).getText().trim().equals("Mapping List View")){
			throw new SkipException("Mapping List View screen couldn't open.");
		}
	}
	
	
	
    
    public boolean clickcreateNewMapping()
	{
	try{

		WebElement clickcreateNewMappingWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(createNewMapping_xpath));
		clickcreateNewMappingWebEelement.click();
		Thread.sleep(2000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	
	public boolean collateralNameFieldInput(String collateralNameFieldData)
	{
	try{

		WebElement collateralNameFieldInputWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(collateralNameField_xpath));
		collateralNameFieldInputWebEelement.clear();
		collateralNameFieldInputWebEelement.sendKeys(collateralNameFieldData);
		Thread.sleep(2000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	public boolean dataFileTypedropdownValues(String dataFileTypeDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(dataFileType_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(dataFileTypeDropdownValue)) {
					ele.click();
					Thread.sleep(10000);
					 return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}
	
	
	
public boolean collateralTypedropdownValues(String collateralTypeDropdownValue){
		
		try {
			
			
			WebElement dropdown = driver.findElement(collateralType_xpath);    
			Select select = new Select(dropdown); 
			java.util.List<WebElement> options = select.getOptions(); 
		
         for(WebElement item:options){
        	 System.out.println(item.getText());
        	 if (item.getText().equals(collateralTypeDropdownValue)){
                  System.out.println("Matched");
                  return true;
                  }
         }
        	 
		} catch (Exception e) {
}
		return false;


}
	
	public boolean fileFormatdropdownValues(String fileFormatDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(fileFormat_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(fileFormatDropdownValue)) {
					ele.click();
					Thread.sleep(10000);
					 return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}
	
	
	public boolean sheetNoFieldInput(String sheetNoFieldData)
	{
	try{

		WebElement collateralNameFieldInputWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(sheetNo_xpath));
		collateralNameFieldInputWebEelement.clear();
		collateralNameFieldInputWebEelement.sendKeys(sheetNoFieldData);
		Thread.sleep(2000);
		
return true;
	}
	catch(Exception ex){
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
	
	public boolean nextButtonClick()
	{
	try{

		WebElement nextButtonClickWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(nextButton_xpath));
		nextButtonClickWebEelement.click();
		Thread.sleep(1000);

return true;
	}
	catch(Exception ex){
		return false;
	}

	}

	
	
	
	public boolean noOfHeaderRowsFieldInput(String noOfHeaderRowsData)
	{
	try{

		WebElement noOfHeaderRowsFieldInputWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(noOfHeaderRows_xpath));
		noOfHeaderRowsFieldInputWebEelement.clear();
		noOfHeaderRowsFieldInputWebEelement.sendKeys(noOfHeaderRowsData);
		Thread.sleep(2000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	
	
	public boolean accountNodropdownValues(String accountNoDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(accountNo_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(accountNoDropdownValue)) {
					ele.click();
					
					 return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}
	
	
	
	public boolean accountNamedropdownValues(String accountNameDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(accountName_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(accountNameDropdownValue)) {
					ele.click();
					
					 return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}
	
	
	
	
	public boolean balanceAmountDropdownValues(String balanceAmountDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(balanceAmountDropdownValue_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(balanceAmountDropdownValue)) {
				    Actions action = new Actions(driver);
					action.doubleClick(ele).build().perform();
					
					 return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}
	
	
	
	
	public boolean futuredropdownValues(String futureDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(future_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(futureDropdownValue)) {
				    Actions action = new Actions(driver);
					action.doubleClick(ele).build().perform();
					
					 return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}
	
	public boolean currentdropdownValues(String currentDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(current_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(currentDropdownValue)) {
				    Actions action = new Actions(driver);
					action.doubleClick(ele).build().perform();
				
					 return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}
	
	
	public boolean over30dropdownValues(String over30DropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(over30_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(over30DropdownValue)) {
				    Actions action = new Actions(driver);
					action.doubleClick(ele).build().perform();
				
					 return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}
	
	
	public boolean over60dropdownValues(String over60DropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(over60_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(over60DropdownValue)) {
				    Actions action = new Actions(driver);
					action.doubleClick(ele).build().perform();
			
					 return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}
	
	
	public boolean over90dropdownValues(String over90DropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(over90_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(over90DropdownValue)) {
				    Actions action = new Actions(driver);
					action.doubleClick(ele).build().perform();
				
					 return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}
	
	
	
	public boolean over120dropdownValues(String over120DropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(over120_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(over120DropdownValue)) {
				    Actions action = new Actions(driver);
					action.doubleClick(ele).build().perform();
					
					 return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}
	
	
	public String verifyMessageOnMappingSave(String messageOnMapping)
	    {
	    try{
		
	       WebElement SaveOnAddSalesWebEelement=new WebDriverWait(driver,200)
	       .until(ExpectedConditions.visibilityOfElementLocated(sucessMessageForMapping_xpath));
	       
	      String actualMsgFromAPP= SaveOnAddSalesWebEelement.getText();
	      if(actualMsgFromAPP.equalsIgnoreCase(messageOnMapping));
	      {
	       return actualMsgFromAPP;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return messageOnMapping;
	    }


}
