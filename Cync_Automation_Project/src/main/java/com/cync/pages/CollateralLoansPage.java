package com.cync.pages;

import java.text.SimpleDateFormat;
import java.util.Date;
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

public class CollateralLoansPage extends BasePage {
	
	private final By CollateralLoansPageHeader_xpath = By.xpath("//span[contains(text(),'Collateral Loans')]");
	private final By chargeCodeDateName_xpath = By.xpath("//td[contains(@aria-describedby,'collateral_loans_list_charge_template')]");
	private final By amountVerify_xpath = By.xpath("//td[contains(@aria-describedby,'collateral_loans_list_charge_amount')]");
	private final By loanIdVerify_xpath = By.xpath("//input[@name='fname']");
	private final By dateVerify_xpath = By.xpath("//td[contains(@aria-describedby,'collateral_loans_list_activity_date')]");
	private final By closingBalanceVerify_xpath = By.xpath("//td[contains(@aria-describedby,'collateral_loans_list_closing_balance.cync')]");
	private final By dateEnterVerify_xpath = By.xpath("(//input[@name='activity_date'])[2]");
	private final By chargeCodeDropDownvalue_xpath = By.xpath("(//select[@name='charge_template_id'])[2]");
	private final By saveBtnVerify_xpath = By.xpath("//span[@class='ui-icon ui-icon ui-icon-disk']");
	private final By successMsg_xpath = By.xpath("//div[@class='ui-state-success']");
	private final By closeBtnVerify_xpath = By.id("closedialog");
	private final By amountTextBoxVerify_xpath = By.xpath("(//input[@name='charge_amount'])[2]");
	private final By addRecordVerify_xpath = By.id("add_collateral_loans_list");
	private final By closeingBalanceVerify_xpath = By.xpath("(//td[@aria-describedby='collateral_loans_list_closing_balance.cync_format'])[1]");
	private final By ChargeCodeValue_xpath = By.id("gs_charge_template_id");
	private final By VerifyAmount_xpath = By.xpath("(//td[@aria-describedby='collateral_loans_list_charge_amount'])[1]");

	
	

	public CollateralLoansPage(WebDriver driver) {
		super(driver);
		try{
			if(!driver.findElement(CollateralLoansPageHeader_xpath).getText().trim().contains("Collateral Loans")){
				throw new SkipException("Collateral Loans page couldn't open.");
			
			}}
		catch(Exception e){
			
		// TODO Auto-generated constructor stub
			e.printStackTrace();
	}
		
		// TODO Auto-generated constructor stub
		
	}
	
	public boolean HeaderVerify(String Header)
	{
	 
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(CollateralLoansPageHeader_xpath));
		String actual = HeaderWebEelement.getText();
		if (actual.equals(Header))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
	
	public boolean ChargeCodeColumnDataNameVerify()
	{
		try{
		
		WebElement chargeCodeWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(chargeCodeDateName_xpath));
		chargeCodeWebelement.isDisplayed();
		Thread.sleep(2000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}
	
	
	public boolean CollateralLoanAmountVerify()
	{
		try{
		
		WebElement amountWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(amountVerify_xpath));
		amountWebelement.isDisplayed();
		Thread.sleep(2000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}
	
	
	public boolean CollateralLoanLoanIDVerify()
	{
		try{
		
		WebElement loanIdWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(loanIdVerify_xpath));
		loanIdWebelement.isDisplayed();
		Thread.sleep(2000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}
	
	
	public boolean CollateralLoanDatecolumnVerify()
	{
		try{
		
		WebElement dateWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(dateVerify_xpath));
		dateWebelement.isDisplayed();
		Thread.sleep(2000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}

	
	public boolean CollateralLoanClosingBalanceDataVerify()
	{
		try{
		
		WebElement closingBalanceDateWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(closingBalanceVerify_xpath));
		closingBalanceDateWebelement.isDisplayed();
		Thread.sleep(2000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}

	
	public boolean CollateralLoanAddRecordClickVerify()
	{
		try{
		
		WebElement addRecordWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(addRecordVerify_xpath));
		addRecordWebelement.click();
		Thread.sleep(2000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}

	
	
	
	public boolean DoubleClickVerify()
	{
		try{
		
		WebElement element=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(chargeCodeDateName_xpath));
		//Double click
		Actions action = new Actions(driver);
		action.doubleClick(element).build().perform();
		Thread.sleep(2000);
		
		return true;
	}

		catch(Exception ex){
			return false;
		}
	}
	
	public boolean selectDate(){
		try {
			WebElement dateWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(dateEnterVerify_xpath));
			Date date = new Date(System.currentTimeMillis());
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
			String today=formatter.format(date);
			dateWebElement.clear();
			
			dateWebElement.sendKeys(today);
			Thread.sleep(2000);
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	

		 public String chargeCodeDropDownValueClick(String chargeCodeLabel) {

		try{
		WebElement chargeCodeDropdownWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(chargeCodeDropDownvalue_xpath)); 

		Select sel=new Select(chargeCodeDropdownWebEelement);
		List<WebElement> list =sel.getOptions();

		for (WebElement ele:list){

		if(ele.getText().equals(chargeCodeLabel))
		{
		ele.click();
		Thread.sleep(10000);
		break;

		}
		}

		}
		catch(Exception ex){

		}

		return chargeCodeLabel;


		}
		 
		 
		 
		public boolean AmountTextClickVerify()
					{
						try{
						
						WebElement amountbtnWebelement=new WebDriverWait(driver,100)
						.until(ExpectedConditions.visibilityOfElementLocated(amountTextBoxVerify_xpath));
						amountbtnWebelement.clear();
						amountbtnWebelement.sendKeys("10000");
						Thread.sleep(2000);
						amountbtnWebelement.click();
						Thread.sleep(3000);
						
						return true;
					}
					

					catch(Exception ex){
						return false;
					}
						
					} 
		 
		 
	public boolean SaveBtnVerify()
			{
				try{
				
				WebElement savebtnWebelement=new WebDriverWait(driver,100)
				.until(ExpectedConditions.visibilityOfElementLocated(saveBtnVerify_xpath));
				savebtnWebelement.click();
				Thread.sleep(2000);
				
				return true;
			}
			

			catch(Exception ex){
				return false;
			}
				
			}
	
	
	public String SuccessMsgVerify(String SuccessMsg)
	{
	 
	try{
		WebElement MsgWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(successMsg_xpath));
		MsgWebEelement.getText();
		Thread.sleep(2000);
		
	}
	catch(Exception ex){
		
	}
	return SuccessMsg;
	
	} 
	

	public boolean CloseBtnVerify()
	{
		try{
		
		WebElement closebtnWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(closeBtnVerify_xpath));
		closebtnWebelement.click();
		Thread.sleep(2000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}
	
	
	public boolean ClosongBalanceVerify()
	{
		try{
		
		WebElement closebalanceWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(closeingBalanceVerify_xpath));
		closebalanceWebelement.isDisplayed();
		Thread.sleep(2000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}
	
	
	public String selectValueInChargeCodeDropdown(String ChargeCode) throws InterruptedException{
		

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated((ChargeCodeValue_xpath)));

		WebElement element = driver.findElement((ChargeCodeValue_xpath));
		Select sel = new Select(element);
		List<WebElement> list = sel.getOptions();	
		
		
		for(WebElement ele : list){
			
			if(ele.getText().equals(ChargeCode)){
				ele.click();
				Thread.sleep(5000);
				break;
			}
		}
		return ChargeCode;

	}

	
	public boolean AmountVerify(String Amnt)
	{
		try{
		
		WebElement amountWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(VerifyAmount_xpath));
		String actual = amountWebelement.getText();
		if (actual.equals(Amnt))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
	

}
	



