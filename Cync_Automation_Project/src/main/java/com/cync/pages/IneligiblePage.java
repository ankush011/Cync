package com.cync.pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class IneligiblePage extends BasePage {
	
	private final By BasicParametersPage = By
			.xpath("//span[text()='Basic Parameters']");
	private final By editBtn_xpath = By.xpath("//a[@id='parameter_edit']");
	private final By maintainCurrentARCheckBox_xpath = By
			.id("parameter_maintain_current_ar");
	private final By saveBtn_xpath = By.id("parameter_submit");
	private final By basicParameterMsg_xpath = By
			.xpath("//strong[text()='Client Parameter was successfully updated.']");
	private final By selectClient_xpath = By
			.id("select2-choose_borrower-container");
	private final By searchClientTextBox_xpath = By
			.xpath("//input[@type='search']");
	private final By searchClient_xpath = By
			.xpath("//span[@class='select2-results']");
	private final By ineligibleCalculationsHeader=By.xpath("//span[text()='Ineligible Calculations']");
	private final By removeAll_xpath=By.xpath("//button[@title='Remove them all!']");
	private final By filter1_xpath=By.xpath("(//input[@class='filter'])[1]");
	private final By moveAll_xpath=By.xpath("//button[@title='Move all the elements!!!']");
	private final By saveButton_xpath=By.xpath("//a[@id='apply_calculations']");
	private final By concentrationBasicParameters_xpath=By.xpath("//input[@id='parameter_concentration_pct']");
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
	private final By invoiceNo_xpath=By.xpath("//select[@id='mapping_column_mappings_invoice_no']");
	private final By originalDate_xpath=By.xpath("//select[@id='mapping_column_mappings_original_date']");
	private final By future_xpath=By.xpath("//select[@id='mapping_column_mappings_future_amount']");
	private final By current_xpath=By.xpath("//select[@id='mapping_column_mappings_current_amount']");
	private final By over30_xpath=By.xpath("//select[@id='mapping_column_mappings_bucket1']");
	private final By over60_xpath=By.xpath("//select[@id='mapping_column_mappings_bucket2']");
	private final By over90_xpath=By.xpath("//select[@id='mapping_column_mappings_bucket3']");
	private final By over120_xpath=By.xpath("//select[@id='mapping_column_mappings_bucket4']");
	
	private final By addIconBBCFilesRequired_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-plus']");
	private final By collateralNameDropdown_xpath=By.xpath("(//select[@name='mapping_id'])[2]");
	private final By saveIconBBCFilesRequired_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-disk']");
	private final By saveBBCFilesRequiredSuccessmsg_xpath=By.xpath("//div[text()='BBC Files Required was successfully created.']");
	private final By closeMsgDialog_xpath=By.xpath("//a[@id='closedialog']");
	

	public IneligiblePage(WebDriver driver) {
		super(driver);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(!driver.findElement(ineligibleCalculationsHeader).getText().trim().equals("Ineligible Calculations")){
			throw new SkipException("Ineligible calculations screen couldn't open.");
		}
	}
	
	public boolean HeaderVerify()
	{
	try{

		WebElement headerWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(BasicParametersPage));
		headerWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	

	public boolean EditBtnClick()
	{
	try{

		WebElement editWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(editBtn_xpath));
		editWebEelement.click();
		Thread.sleep(2000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	

	public boolean MaintainCurrentARCheckBox()
	{
	try{

		WebElement checkBoxWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(maintainCurrentARCheckBox_xpath));
		checkBoxWebEelement.click();
		Thread.sleep(2000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean concentrationInput(String concentrationData)
	{
	try{

		WebElement concentrationInputWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(concentrationBasicParameters_xpath));
		concentrationInputWebEelement.clear();
		concentrationInputWebEelement.sendKeys(concentrationData);
		Thread.sleep(2000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	
	public boolean clickRemoveAllIcon()
	{
	try{

		WebElement clickRemoveAllIconWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(removeAll_xpath));
		clickRemoveAllIconWebEelement.click();
		Thread.sleep(2000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	
	public boolean filter1Input(String filter1InputData)
	{
	try{

		WebElement filter1InputWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(filter1_xpath));
		filter1InputWebEelement.clear();
		filter1InputWebEelement.sendKeys(filter1InputData);
		Thread.sleep(2000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	public boolean clickMoveAllIcon()
	{
	try{

		WebElement clickMoveAllIconWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(moveAll_xpath));
		clickMoveAllIconWebEelement.click();
		Thread.sleep(2000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}
	}

	public boolean clickIneligibleSaveButton()
	{
	try{

		WebElement clickIneligibleSaveButtonWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(saveButton_xpath));
		clickIneligibleSaveButtonWebEelement.click();
		Thread.sleep(2000);
		
return true;
	}
	catch(Exception ex){
		return false;
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
					break;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}
	
	
	/*public String collateralTypedropdownValues(String collateralTypeDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(collateralType_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(collateralTypeDropdownValue)) {
					ele.click();
					Thread.sleep(10000);
					break;
				}
			}
		} catch (Exception ex) {
		}
		return collateralTypeDropdownValue;
	}*/
	
	
/*public boolean collateralTypedropdownValues(String collateralTypeDropdownValue){
		
		try {
			
			WebElement dropdown = driver.findElement(collateralType_xpath);    
			Select select = new Select(dropdown); 
			java.util.List<WebElement> options = select.getOptions(); 
		
             for(WebElement item:options){
            	 System.out.println(item.getText());
            	 if (item.getText().equals(collateralTypeDropdownValue)){
            		 item.click();
 					Thread.sleep(10000);
 					break;
                      }
             }
            	 
		} catch (Exception e) {
}
		return false;
}*/

public boolean collateralTypedropdownValues(String collateralTypeDropdownValue) {
	try {
		WebElement productTypeDropdownWebEelement = new WebDriverWait(
				driver, 10).until(ExpectedConditions
				.visibilityOfElementLocated(collateralType_xpath));
		Select sel = new Select(productTypeDropdownWebEelement);
		List<WebElement> list = sel.getOptions();
		for (WebElement ele : list) {
			if (ele.getText().equals(collateralTypeDropdownValue)) {
				ele.click();
				Thread.sleep(10000);
				break;
			}
		}
	} catch (Exception ex) {
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
					break;
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
			StringSelection ss = new StringSelection("D:\\AutoUpload\\AR Summary-Ineligible1.xlsx");
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
			
		}
		return false;
		
	}
	
	public boolean nextButtonClick()
	{
	try{

		WebElement nextButtonClickWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(nextButton_xpath));
		nextButtonClickWebEelement.click();
		Thread.sleep(5000);

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
					Thread.sleep(10000);
					break;
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
					Thread.sleep(10000);
					break;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}
	
	
	public boolean invoiceNodropdownValues(String invoiceNoDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(invoiceNo_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(invoiceNoDropdownValue)) {
					ele.click();
					Thread.sleep(10000);
					break;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}
	
	public boolean originalDatedropdownValues(String originalDateDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(originalDate_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(originalDateDropdownValue)) {
					ele.click();
					Thread.sleep(10000);
					break;
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
					ele.click();
					Thread.sleep(10000);
					break;
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
					ele.click();
					Thread.sleep(10000);
					break;
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
					ele.click();
					Thread.sleep(10000);
					break;
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
					ele.click();
					Thread.sleep(10000);
					break;
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
					ele.click();
					Thread.sleep(10000);
					break;
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
					ele.click();
					Thread.sleep(10000);
					break;
				}
			}
		} catch (Exception ex) {
		}
		return false;
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
					Thread.sleep(10000);
					break;
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
	
	public boolean saveBBCFilesRequiredSuccessmsg()
	{
	try{

		WebElement saveBBCFilesRequiredSuccessmsgWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(saveBBCFilesRequiredSuccessmsg_xpath));
		saveBBCFilesRequiredSuccessmsgWebEelement.isDisplayed();
		Thread.sleep(5000);

		
return true;
	}
	catch(Exception ex){
		return false;
	}

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
	
	public boolean SaveFunction()
	{
	try{

		WebElement saveWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(saveBtn_xpath));
		saveWebEelement.click();
		Thread.sleep(5000);

		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public String verifyMessageOnBasicParameterAfterSave(String successMsg)
    {
    try{
       WebElement SaveWebEelement=new WebDriverWait(driver,10)
       .until(ExpectedConditions.visibilityOfElementLocated(basicParameterMsg_xpath));
       
      String actualMsg= SaveWebEelement.getText();
      if(actualMsg.equalsIgnoreCase(successMsg))
      {
       return actualMsg;
      }
       
    }
    catch(Exception ex){
     
    }
 return successMsg;
    }
			
}
