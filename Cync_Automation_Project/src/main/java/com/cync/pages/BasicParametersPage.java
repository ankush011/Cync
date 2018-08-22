package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class BasicParametersPage extends BasePage {
	
	
	private final By BasicParametersPage = By.xpath("//span[text()='Basic Parameters']");
	private final By editBtn_xpath = By.id("parameter_edit");
	private final By maintainCurrentARCheckBox_xpath = By.id("parameter_maintain_current_ar");
	private final By saveBtn_xpath = By.id("parameter_submit");
	private final By basicParameterMsg_xpath = By.xpath("//strong[text()='Client Parameter was successfully updated.']");

	private final By selectClient_xpath = By.id("select2-choose_borrower-container");
	private final By searchClientTextBox_xpath = By.xpath("//input[@type='search']");
	private final By searchClient_xpath = By.xpath("//span[@class='select2-results']");
	private final By concentrationBasicParameters_xpath=By.xpath("//input[@id='parameter_concentration_pct']");
	

	private final By SummaryCheckBox_xpath = By.id("parameter_combine_summ_det_ar_yn");


	
	

	public BasicParametersPage(WebDriver driver) {
		super(driver);
		try{
			Thread.sleep(3000);
			}
		catch(Exception e){
			
		// TODO Auto-generated constructor stub
			e.printStackTrace();
	}
		if(!driver.findElement(BasicParametersPage).getText().trim().equals("Basic Parameters")){
			throw new SkipException("Basic Parameter page couldn't open.");
		}// TODO Auto-generated constructor stub
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
	

	/*public boolean MaintainCurrentARCheckBox()
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

	}*/
	
	
	
	public boolean MaintainCurrentARCheckBox(boolean flag){
		 try {
			   WebDriverWait wait = new WebDriverWait(driver, 60);
			   Thread.sleep(6000);
			   wait.until(ExpectedConditions.visibilityOfElementLocated((maintainCurrentARCheckBox_xpath)));			   
			   WebElement element = driver.findElement((maintainCurrentARCheckBox_xpath));
			   if(flag){
			    if(!element.isSelected() == true){
			     element.click();
			
			    }
			   }else if(!flag){
			    if(element.isSelected() == true){
			     element.click();
			    

			    }
			   }   
			  } catch (Exception e) {
			   System.out.println("Exception in clickOnCheckBox Method "+e.getCause());
			  }
		return flag; 
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
	
	
	public boolean SummaryCheckBox()
	{
	try{

		WebElement checkBoxWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(SummaryCheckBox_xpath));
		checkBoxWebEelement.click();
		Thread.sleep(2000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}	
	
}

