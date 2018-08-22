package com.cync.pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class BasicDetailsPage extends BasePage {

	private final By basicDetailsHeader=By.xpath("//h4[text()='Lender Basic Details']");
	private final By breadcrumb_xpath=By.xpath("//ul[@class='breadcrumb']");
	private final By lenderBasicDetailsHeadLink_xpath=By.xpath("//a[text()='Lender Basic Details']");
	private final By addressHeadLink_xpath=By.xpath("//a[text()='Address']");
	private final By applicationLogoHeadLink_xpath=By.xpath("//a[text()='Application Logo']");
	private final By factoringFeeSetupHeadLink_xpath=By.xpath("//a[text()='Factoring Fee Setup']");
	private final By passwordPolicyHeadLink_xpath=By.xpath("//a[text()='Password Policy']");
	private final By footerLinksHeadLink_xpath=By.xpath("//a[text()='Footer Links']");
	private final By loginAccessLimitationHeadLink_xpath=By.xpath("//a[text()='Login Access Limitation']");
	private final By lenderBasicDetailsHeader_xpath=By.xpath("//h4[text()='Lender Basic Details']");
	private final By lenderNameLabel_xpath=By.xpath("//label[contains(text(),'Lender Name')]");
	private final By emailIDLabel_xpath=By.xpath("//label[text()='Email ID']");
	private final By phoneNoLabel_xpath=By.xpath("//label[text()='Phone No.']");
	
	private final By lenderNameField_xpath=By.xpath("//input[@formcontrolname='display_name']");
	private final By emailIDField_xpath=By.xpath("//input[@formcontrolname='email']");
	private final By phoneNoField_xpath=By.xpath("//input[@formcontrolname='phone_no']");
	private final By addressHeader_xpath=By.xpath("//h4[text()='Address']");
	private final By addressLine1Label_xpath=By.xpath("//label[text()='Address Line 1 ']");
	private final By addressLine2Label_xpath=By.xpath("//label[text()='Address Line 1 ']");
	private final By cityLabel_xpath=By.xpath("//label[text()='Address Line 1 ']");
	private final By countryLabel_xpath=By.xpath("//label[text()='Address Line 1 ']");
	private final By stateProvinceLabel_xpath=By.xpath("//label[text()='Address Line 1 ']");
	private final By zipPostalCodeLabel_xpath=By.xpath("//label[text()='Address Line 1 ']");
	private final By faxNoLabel_xpath=By.xpath("//label[text()='Address Line 1 ']");
	private final By timeZoneLabel_xpath=By.xpath("//label[text()='Address Line 1 ']");
	private final By addressLine1Field_xpath=By.xpath("//input[@formcontrolname='street_address']");
	private final By addressLine2Field_xpath=By.xpath("//input[@formcontrolname='other_address']");
	private final By cityField_xpath=By.xpath("//input[@formcontrolname='city']");
	private final By countryDropdown_xpath=By.xpath("//select[@formcontrolname='country']");
	private final By stateProvinceDropdown_xpath=By.xpath("//select[@formcontrolname='state_province']");
	private final By zipPostalCodeField_xpath=By.xpath("//input[@formcontrolname='zip_code']");
	private final By faxNoField_xpath=By.xpath("//input[@formcontrolname='fax_no']");
	private final By timeZoneField_xpath=By.xpath("//input[@formcontrolname='time_zone']");
	private final By applicationLogoHeader_xpath=By.xpath("//h4[text()='Application Logo']");
	private final By applicationLogoImage_xpath=By.xpath("//img[@id='preview']");
	
	private final By factoringFeeSetupHeader_xpath=By.xpath("//h4[text()='Factoring Fee Setup']");
	private final By earnedFeeRadioButton_xpath=By.xpath("(//input[@formcontrolname='factoring_fees_rule_is_accrued'])[1]");
	private final By accruedRadioButton_xpath=By.xpath("(//input[@formcontrolname='factoring_fees_rule_is_accrued'])[2]");
	
	private final By passwordPolicyHeader_xpath=By.xpath("//h4[text()='Password Policy']");
	private final By noOfUppercaseLabel_xpath=By.xpath("//label[contains(text(),'Number of Uppercase')]");
	private final By noOfLowercaseLabel_xpath=By.xpath("//label[text()='Number of Lowercase']");
	private final By noOfNumCharsLabel_xpath=By.xpath("//label[text()='Number of Numerical Characters']");
	private final By noOfSplCharsLabel_xpath=By.xpath("//label[text()='Number of special Characters']");
	private final By noOfFailedLoginAtmptsLabel_xpath=By.xpath("//label[text()='Number of failed Login Attempts']");
	private final By sameCharsAllowedRepetitionLabel_xpath=By.xpath("//label[text()='Same Characters allowed for Repetition']");
	private final By minimumPasswordLengthLabel_xpath=By.xpath("//label[text()='Minimum Password Length']");
	private final By maximumPasswordLengthLabel_xpath=By.xpath("//label[text()='Maximum password Length']");
	private final By passwordExpiryPeriodLabel_xpath=By.xpath("//label[text()='Passsword Expiry Period (Days)']");
	private final By previousPasswordsCannotBeReusedLabel_xpath=By.xpath("//label[text()='Previous Passwords that cannot be reused']");
	private final By restrictedWordsLabel_xpath=By.xpath("//label[text()='Restricted Words(Seperated by Comma)']");
	
	
	private final By noOfUppercaseField_xpath=By.xpath("//input[@formcontrolname='no_of_uppercase_in_passwrd']");
	private final By noOfLowercaseField_xpath=By.xpath("//input[@formcontrolname='no_of_lowercase_in_passwrd']");
	private final By noOfNumCharsField_xpath=By.xpath("//input[@formcontrolname='no_of_digit_in_passwrd']");
	private final By noOfSplCharsField_xpath=By.xpath("//input[@formcontrolname='no_of_special_character_for_passwrd']");
	private final By noOfFailedLoginAtmptsField_xpath=By.xpath("//input[@formcontrolname='no_of_login_attempt']");
	private final By sameCharsAllowedRepetitionField_xpath=By.xpath("//input[@formcontrolname='character_repitition_limit']");
	private final By minimumPasswordLengthField_xpath=By.xpath("//input[@formcontrolname='passwrd_minimum_length']");
	private final By maximumPasswordLengthField_xpath=By.xpath("//input[@formcontrolname='passwrd_maximum_length']");
	private final By passwordExpiryPeriodField_xpath=By.xpath("//input[@formcontrolname='passwrd_expire_in']");
	private final By previousPasswordsCannotBeReusedField_xpath=By.xpath("//input[@formcontrolname='passwrd_reuse_count']");
	private final By restrictedWordsField_xpath=By.xpath("//input[@formcontrolname='restricted_passwrd_words']");
	
	
	private final By footerLinksHeader_xpath=By.xpath("//h4[text()='Footer Links']");
	private final By displayLinksOnFooterLabel_xpath=By.xpath("//label[text()='Display links on footer']");
	private final By displayLinksOnFooterCheckbox_xpath=By.xpath("(//span[@class='ui-chkbox-icon ui-clickable fa fa-check'])[1]");
	private final By securityPolicyLabel_xpath=By.xpath("//label[text()='Security Policy']");
	private final By privacyPolicyLabel_xpath=By.xpath("//label[text()='Privacy Policy']");
	private final By termsAndConditionsLabel_xpath=By.xpath("//label[text()='Terms and Conditions']");
	private final By disclaimersLabel_xpath=By.xpath("//label[text()='Disclaimers']");
	private final By securityPolicyField_xpath=By.xpath("//input[@formcontrolname='security_link']");
	private final By privacyPolicyField_xpath=By.xpath("//input[@formcontrolname='privacy_link']");
	private final By termsAndConditionsField_xpath=By.xpath("//input[@formcontrolname='termsandconditions_link']");
	private final By disclaimersField_xpath=By.xpath("//input[@formcontrolname='disclaimers_link']");
	
	
	private final By loginAccessLimitationHeader_xpath=By.xpath("//h4[text()='Footer Links']");
	private final By accessLimitationLabel_xpath=By.xpath("//label[text()='Display links on footer']");
//	private final By accessLimitationCheckbox_xpath=By.xpath("(//span[@class='ui-chkbox-icon ui-clickable fa fa-check'])[1]");
	private final By accessLimitationCheckbox_xpath=By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-active']");
	
	private final By startTimeLabel_xpath=By.xpath("//label[text()='Security Policy']");
	private final By startMondayLabel_xpath=By.xpath("(//label[text()='Monday'])[1]");
	private final By startTuesdayLabel_xpath=By.xpath("(//label[text()='Tuesday'])[1]");
	private final By startWednesdayLabel_xpath=By.xpath("(//label[text()='Wednesday'])[1]");
	private final By startThursdayLabel_xpath=By.xpath("(//label[text()='Thursday'])[1]");
	private final By startFridayLabel_xpath=By.xpath("(//label[text()='Friday'])[1]");
	private final By startSaturdayLabel_xpath=By.xpath("(//label[text()='Saturday'])[1]");
	private final By startSundayLabel_xpath=By.xpath("(//label[text()='Sunday'])[1]");
	private final By endMondayLabel_xpath=By.xpath("(//label[text()='Monday'])[2]");
	private final By endTuesdayLabel_xpath=By.xpath("(//label[text()='Tuesday'])[2]");
	private final By endWednesdayLabel_xpath=By.xpath("(//label[text()='Wednesday'])[2]");
	private final By endThursdayLabel_xpath=By.xpath("(//label[text()='Thursday'])[2]");
	private final By endFridayLabel_xpath=By.xpath("(//label[text()='Friday'])[2]");
	private final By endSaturdayLabel_xpath=By.xpath("(//label[text()='Saturday'])[2]");
	private final By endSundayLabel_xpath=By.xpath("(//label[text()='Sunday'])[2]");
	
	private final By startMondayField_xpath=By.xpath("//input[@formcontrolname='mon_access_start_time']");
	private final By startTuesdayField_xpath=By.xpath("//input[@formcontrolname='tue_access_start_time']");
	private final By startWednesdayField_xpath=By.xpath("//input[@formcontrolname='wed_access_start_time']");
	private final By startThursdayField_xpath=By.xpath("//input[@formcontrolname='thur_access_start_time']");
	private final By startFridayField_xpath=By.xpath("//input[@formcontrolname='fri_access_start_time']");
	private final By startSaturdayField_xpath=By.xpath("//input[@formcontrolname='sat_access_start_time']");
	private final By startSundayField_xpath=By.xpath("//input[@formcontrolname='sun_access_start_time']");
	private final By endMondayField_xpath=By.xpath("//input[@formcontrolname='mon_access_end_time']");
	private final By endTuesdayField_xpath=By.xpath("//input[@formcontrolname='tue_access_end_time']");
	private final By endWednesdayField_xpath=By.xpath("//input[@formcontrolname='wed_access_end_time']");
	private final By endThursdayField_xpath=By.xpath("//input[@formcontrolname='thur_access_end_time']");
	private final By endFridayField_xpath=By.xpath("//input[@formcontrolname='fri_access_end_time']");
	private final By endSaturdayField_xpath=By.xpath("//input[@formcontrolname='sat_access_end_time']");
	private final By endSundayField_xpath=By.xpath("//input[@formcontrolname='sun_access_end_time']");
	
	private final By multiFactorAuthenticationLabel_xpath=By.xpath("//label[text()='Multi Factor Authentication(OTP)']");
	private final By multiFactorAuthenticationCheckbox_xpath=By.xpath("(//span[@class='ui-chkbox-icon ui-clickable'])[2]");
	
	
	private final By editIconBasicDetails_xpath=By.xpath("//span[@class='basic_details_edit_icon ng-star-inserted']");
	private final By cancelButtonDisabled_xpath=By.xpath("//button[@id='action_back' and @disabled]");
	private final By saveButtonDisabled_xpath=By.xpath("//button[@id='action_save' and @disabled]");
	
	private final By cancelButton_xpath=By.xpath("//span[text()='Cancel']");
	private final By saveButton_xpath=By.xpath("//span[text()='Save']");
	private final By recordMessage_xpath=By.id("cync_notifications_msg");
	
	
	
	public BasicDetailsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!driver.findElement(basicDetailsHeader).getText().trim().equals("Lender Basic Details")){
			throw new SkipException("comments types couldn't open.");
		}
	}
	
	public String BasicDetailsHeader(String systemparameterHeader)
	{
		
	try{
		
		WebElement BasicDetailsHeaderWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(basicDetailsHeader));
		BasicDetailsHeaderWebE.getText();
		
	}
	catch(Exception ex){
		
	}
	return systemparameterHeader;
	}
	
	public String breadcrumb(String basicDetailsBreadcrumb)
	{
		try{
			WebElement systemParametersBreadcrumbWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(breadcrumb_xpath));
			systemParametersBreadcrumbWebEelement.isDisplayed();
			
		}
		catch(Exception ex){
			
		}
		return basicDetailsBreadcrumb;

		}
	
	public boolean lenderBasicDetailsHeadLinkUI(){
		try{
			WebElement lenderBasicDetailsHeadLinkUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(lenderBasicDetailsHeadLink_xpath));
			lenderBasicDetailsHeadLinkUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean addressHeadLinkUI(){
		try{
			WebElement addressHeadLinkUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(addressHeadLink_xpath));
			addressHeadLinkUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean applicationLogoHeadLinkUI(){
		try{
			WebElement applicationLogoHeadLinkUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(applicationLogoHeadLink_xpath));
			applicationLogoHeadLinkUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean factoringFeeSetupHeadLinkUI(){
		try{
			WebElement factoringFeeSetupHeadLinkUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(factoringFeeSetupHeadLink_xpath));
			factoringFeeSetupHeadLinkUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean passwordPolicyHeadLinkUI(){
		try{
			WebElement passwordPolicyHeadLinkUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(passwordPolicyHeadLink_xpath));
			passwordPolicyHeadLinkUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean footerLinksHeadLinkUI(){
		try{
			WebElement footerLinksHeadLinkUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(footerLinksHeadLink_xpath));
			footerLinksHeadLinkUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean loginAccessLimitationHeadLinkUI(){
		try{
			WebElement loginAccessLimitationHeadLinkUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(loginAccessLimitationHeadLink_xpath));
			loginAccessLimitationHeadLinkUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean lenderBasicDetailsHeaderUI(){
		try{
			WebElement lenderBasicDetailsHeaderUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(lenderBasicDetailsHeader_xpath));
			lenderBasicDetailsHeaderUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	
	public boolean lenderBasicDetailsHeadLinkClick(){
		try{
			WebElement lenderBasicDetailsHeadLinkClickWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(lenderBasicDetailsHeadLink_xpath));
			lenderBasicDetailsHeadLinkClickWebE.isDisplayed();
			lenderBasicDetailsHeadLinkClickWebE.click();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean addressHeadLinkClick(){
		try{
			WebElement addressHeadLinkClickWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(addressHeadLink_xpath));
			addressHeadLinkClickWebE.isDisplayed();
			addressHeadLinkClickWebE.click();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean applicationLogoHeadLinkClick(){
		try{
			WebElement applicationLogoHeadLinkClickWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(applicationLogoHeadLink_xpath));
			applicationLogoHeadLinkClickWebE.isDisplayed();
			applicationLogoHeadLinkClickWebE.click();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean factoringFeeSetupHeadLinkClick(){
		try{
			WebElement factoringFeeSetupHeadLinkClickWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(factoringFeeSetupHeadLink_xpath));
			factoringFeeSetupHeadLinkClickWebE.isDisplayed();
			factoringFeeSetupHeadLinkClickWebE.click();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean passwordPolicyHeadLinkClick(){
		try{
			WebElement passwordPolicyHeadLinkClickWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(passwordPolicyHeadLink_xpath));
			passwordPolicyHeadLinkClickWebE.isDisplayed();
			passwordPolicyHeadLinkClickWebE.click();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean footerLinksHeadLinkClick(){
		try{
			WebElement footerLinksHeadLinkClickWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(footerLinksHeadLink_xpath));
			footerLinksHeadLinkClickWebE.isDisplayed();
			footerLinksHeadLinkClickWebE.click();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean loginAccessLimitationHeadLinkClick(){
		try{
			WebElement loginAccessLimitationHeadLinkClickWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(loginAccessLimitationHeadLink_xpath));
			loginAccessLimitationHeadLinkClickWebE.isDisplayed();
			loginAccessLimitationHeadLinkClickWebE.click();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean lenderNameLabel(){
		try{
			WebElement lenderNameLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(lenderNameLabel_xpath));
			lenderNameLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean emailIDLabel(){
		try{
			WebElement emailIDLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(emailIDLabel_xpath));
			emailIDLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean phoneNoLabel(){
		try{
			WebElement phoneNoLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(phoneNoLabel_xpath));
			phoneNoLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean lenderNameFieldUI(){
		try{
			WebElement lenderNameFieldUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(lenderNameField_xpath));
			lenderNameFieldUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean emailIDFieldUI(){
		try{
			WebElement emailIDFieldUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(emailIDField_xpath));
			emailIDFieldUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean phoneNoFieldUI(){
		try{
			WebElement phoneNoFieldUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(phoneNoField_xpath));
			phoneNoFieldUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean addressHeader(){
		try{
			WebElement addressHeaderWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(addressHeader_xpath));
			addressHeaderWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean addressLine1Label(){
		try{
			WebElement addressLine1LabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(addressLine1Label_xpath));
			addressLine1LabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean addressLine2Label(){
		try{
			WebElement addressLine2LabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(addressLine2Label_xpath));
			addressLine2LabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean cityLabel(){
		try{
			WebElement cityLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(cityLabel_xpath));
			cityLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean countryLabel(){
		try{
			WebElement countryLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(countryLabel_xpath));
			countryLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean stateProvinceLabel(){
		try{
			WebElement stateProvinceLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(stateProvinceLabel_xpath));
			stateProvinceLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean zipPostalCodeLabel(){
		try{
			WebElement zipPostalCodeLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(zipPostalCodeLabel_xpath));
			zipPostalCodeLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean faxNoLabel(){
		try{
			WebElement faxNoLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(faxNoLabel_xpath));
			faxNoLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean timeZoneLabel(){
		try{
			WebElement timeZoneLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(timeZoneLabel_xpath));
			timeZoneLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean addressLine1FieldUI(){
		try{
			WebElement addressLine1FieldUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(addressLine1Field_xpath));
			addressLine1FieldUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean addressLine2FieldUI(){
		try{
			WebElement addressLine2FieldUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(addressLine2Field_xpath));
			addressLine2FieldUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean cityFieldUI(){
		try{
			WebElement cityFieldUIUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(cityField_xpath));
			cityFieldUIUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}


	public boolean countryDropdownUI(){
		try{
			WebElement countryDropdownUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(countryDropdown_xpath));
			countryDropdownUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}

	
	public boolean stateProvinceDropdownUI(){
		try{
			WebElement stateProvinceDropdownUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(stateProvinceDropdown_xpath));
			stateProvinceDropdownUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}

	
	public boolean zipPostalCodeFieldUI(){
		try{
			WebElement zipPostalCodeFieldUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(zipPostalCodeField_xpath));
			zipPostalCodeFieldUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}


	public boolean faxNoFieldUI(){
		try{
			WebElement faxNoFieldUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(faxNoField_xpath));
			faxNoFieldUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean timeZoneFieldUI(){
		try{
			WebElement timeZoneFieldUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(timeZoneField_xpath));
			timeZoneFieldUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	
	public boolean applicationLogoHeader(){
		try{
			WebElement applicationLogoHeaderWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(applicationLogoHeader_xpath));
			applicationLogoHeaderWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean applicationLogoImage(){
		try{
			WebElement applicationLogoImageWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(applicationLogoImage_xpath));
			applicationLogoImageWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean earnedFeeRadioUI(){
		try{
			WebElement earnedFeeRadioUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(earnedFeeRadioButton_xpath));
			earnedFeeRadioUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean accruedRadioUI(){
		try{
			WebElement accruedRadioUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(accruedRadioButton_xpath));
			accruedRadioUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean passwordPolicyHeader(){
		try{
			WebElement passwordPolicyHeaderWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(passwordPolicyHeader_xpath));
			passwordPolicyHeaderWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean noOfUppercaseLabel(){
		try{
			WebElement noOfUppercaseLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(noOfUppercaseLabel_xpath));
			noOfUppercaseLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean noOfLowercaseLabel(){
		try{
			WebElement noOfLowercaseLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(noOfLowercaseLabel_xpath));
			noOfLowercaseLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean noOfNumCharsLabel(){
		try{
			WebElement noOfNumCharsLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(noOfNumCharsLabel_xpath));
			noOfNumCharsLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean noOfSplCharsLabel(){
		try{
			WebElement noOfSplCharsLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(noOfSplCharsLabel_xpath));
			noOfSplCharsLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean noOfFailedLoginAtmptsLabel(){
		try{
			WebElement noOfFailedLoginAtmptsLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(noOfFailedLoginAtmptsLabel_xpath));
			noOfFailedLoginAtmptsLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean sameCharsAllowedRepetitionLabel(){
		try{
			WebElement sameCharsAllowedRepetitionLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(sameCharsAllowedRepetitionLabel_xpath));
			sameCharsAllowedRepetitionLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean minimumPasswordLengthLabel(){
		try{
			WebElement minimumPasswordLengthLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(minimumPasswordLengthLabel_xpath));
			minimumPasswordLengthLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}

	
	public boolean maximumPasswordLengthLabel(){
		try{
			WebElement maximumPasswordLengthLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(maximumPasswordLengthLabel_xpath));
			maximumPasswordLengthLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}


	public boolean passwordExpiryPeriodLabel(){
		try{
			WebElement passwordExpiryPeriodLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(passwordExpiryPeriodLabel_xpath));
			passwordExpiryPeriodLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}


	public boolean previousPasswordsCannotBeReusedLabel(){
		try{
			WebElement previousPasswordsCannotBeReusedLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(previousPasswordsCannotBeReusedLabel_xpath));
			previousPasswordsCannotBeReusedLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}

	
	public boolean restrictedWordsLabel(){
		try{
			WebElement restrictedWordsLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(restrictedWordsLabel_xpath));
			restrictedWordsLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}


	
	public boolean noOfUppercaseFieldUI(){
		try{
			WebElement noOfUppercaseFieldUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(noOfUppercaseField_xpath));
			noOfUppercaseFieldUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean noOfLowercaseFieldUI(){
		try{
			WebElement noOfLowercaseFieldUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(noOfLowercaseField_xpath));
			noOfLowercaseFieldUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean noOfNumCharsFieldUI(){
		try{
			WebElement noOfNumCharsFieldUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(noOfNumCharsField_xpath));
			noOfNumCharsFieldUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean noOfSplCharsFieldUI(){
		try{
			WebElement noOfSplCharsFieldUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(noOfSplCharsField_xpath));
			noOfSplCharsFieldUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean noOfFailedLoginAtmptsFieldUI(){
		try{
			WebElement noOfFailedLoginAtmptsFieldUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(noOfFailedLoginAtmptsField_xpath));
			noOfFailedLoginAtmptsFieldUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean sameCharsAllowedRepetitionFieldUI(){
		try{
			WebElement sameCharsAllowedRepetitionFieldUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(sameCharsAllowedRepetitionField_xpath));
			sameCharsAllowedRepetitionFieldUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean minimumPasswordLengthFieldUI(){
		try{
			WebElement minimumPasswordLengthFieldUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(minimumPasswordLengthField_xpath));
			minimumPasswordLengthFieldUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}

	
	public boolean maximumPasswordLengthFieldUI(){
		try{
			WebElement maximumPasswordLengthFieldUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(maximumPasswordLengthField_xpath));
			maximumPasswordLengthFieldUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}


	public boolean passwordExpiryPeriodFieldUI(){
		try{
			WebElement passwordExpiryPeriodLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(passwordExpiryPeriodField_xpath));
			passwordExpiryPeriodLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}


	public boolean previousPasswordsCannotBeReusedFieldUI(){
		try{
			WebElement previousPasswordsCannotBeReusedFieldUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(previousPasswordsCannotBeReusedField_xpath));
			previousPasswordsCannotBeReusedFieldUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}

	
	public boolean restrictedWordsFieldUI(){
		try{
			WebElement restrictedWordsFieldUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(restrictedWordsField_xpath));
			restrictedWordsFieldUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean footerLinksHeader(){
		try{
			WebElement footerLinksHeaderWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(footerLinksHeader_xpath));
			footerLinksHeaderWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean displayLinksOnFooterLabel(){
		try{
			WebElement displayLinksOnFooterLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(displayLinksOnFooterLabel_xpath));
			displayLinksOnFooterLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean displayLinksOnFooterCheckbox(){
		try{
			WebElement displayLinksOnFooterCheckboxWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(displayLinksOnFooterCheckbox_xpath));
			displayLinksOnFooterCheckboxWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	

	public boolean securityPolicyLabel(){
		try{
			WebElement securityPolicyLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(securityPolicyLabel_xpath));
			securityPolicyLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean privacyPolicyLabel(){
		try{
			WebElement privacyPolicyLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(privacyPolicyLabel_xpath));
			privacyPolicyLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	public boolean termsAndConditionsLabel(){
		try{
			WebElement termsAndConditionsLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(termsAndConditionsLabel_xpath));
			termsAndConditionsLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	public boolean disclaimersLabel(){
		try{
			WebElement disclaimersLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(disclaimersLabel_xpath));
			disclaimersLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}

	public boolean securityPolicyField(){
		try{
			WebElement securityPolicyFieldWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(securityPolicyField_xpath));
			securityPolicyFieldWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean privacyPolicyField(){
		try{
			WebElement privacyPolicyFieldWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(privacyPolicyField_xpath));
			privacyPolicyFieldWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	public boolean termsAndConditionsField(){
		try{
			WebElement termsAndConditionsFieldWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(termsAndConditionsField_xpath));
			termsAndConditionsFieldWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	public boolean disclaimersField(){
		try{
			WebElement disclaimersFieldWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(disclaimersField_xpath));
			disclaimersFieldWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean loginAccessLimitationHeader(){
		try{
			WebElement loginAccessLimitationHeaderWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(loginAccessLimitationHeader_xpath));
			loginAccessLimitationHeaderWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}	
	
	public boolean accessLimitationLabel(){
		try{
			WebElement accessLimitationLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(accessLimitationLabel_xpath));
			accessLimitationLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}		
	
	public boolean accessLimitationCheckbox(){
		try{
			WebElement accessLimitationCheckboxWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(accessLimitationCheckbox_xpath));
			accessLimitationCheckboxWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}	
	
	public boolean accessLimitationCheckboxClick(){
		try{
			WebElement accessLimitationCheckboxClickWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(accessLimitationCheckbox_xpath));
			accessLimitationCheckboxClickWebE.click();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}	
	public boolean startTimeLabel(){
		try{
			WebElement startTimeLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(startTimeLabel_xpath));
			startTimeLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}		
	
	public boolean startMondayLabel(){
		try{
			WebElement startMondayLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(startMondayLabel_xpath));
			startMondayLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}		
	
	public boolean startTuesdayLabel(){
		try{
			WebElement startTuesdayLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(startTuesdayLabel_xpath));
			startTuesdayLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}	
	
	
	public boolean startWednesdayLabel(){
		try{
			WebElement startWednesdayLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(startWednesdayLabel_xpath));
			startWednesdayLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}	
	
	
	public boolean startThursdayLabel(){
		try{
			WebElement startThursdayLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(startThursdayLabel_xpath));
			startThursdayLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}	
	
	
	public boolean startFridayLabel(){
		try{
			WebElement startFridayLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(startFridayLabel_xpath));
			startFridayLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}	
	
	public boolean startSaturdayLabel(){
		try{
			WebElement startSaturdayLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(startSaturdayLabel_xpath));
			startSaturdayLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}	
	
	
	
	public boolean startSundayLabel(){
		try{
			WebElement startSundayLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(startSundayLabel_xpath));
			startSundayLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}	
	
	
	
	public boolean endMondayLabel(){
		try{
			WebElement endMondayLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(endMondayLabel_xpath));
			endMondayLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}	
	
	
	public boolean endTuesdayLabel(){
		try{
			WebElement endTuesdayLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(endTuesdayLabel_xpath));
			endTuesdayLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}	
	
	
	public boolean endWednesdayLabel(){
		try{
			WebElement endWednesdayLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(endWednesdayLabel_xpath));
			endWednesdayLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}	
	
	
	
	public boolean endThursdayLabel(){
		try{
			WebElement endThursdayLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(endThursdayLabel_xpath));
			endThursdayLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean endFridayLabel(){
		try{
			WebElement endFridayLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(endFridayLabel_xpath));
			endFridayLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean endSaturdayLabel(){
		try{
			WebElement endSaturdayLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(endSaturdayLabel_xpath));
			endSaturdayLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean endSundayLabel(){
		try{
			WebElement endSundayLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(endSundayLabel_xpath));
			endSundayLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean startMondayField(){
		try{
			WebElement startMondayFieldWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(startMondayField_xpath));
			startMondayFieldWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean startMondayFieldInput(String startMondayFieldData){
		try{
			WebElement startMondayFieldInputWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(startMondayField_xpath));
			startMondayFieldInputWebE.click();
			startMondayFieldInputWebE.clear();
			startMondayFieldInputWebE.sendKeys(startMondayFieldData);
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean startTuesdayField(){
		try{
			WebElement startTuesdayFieldWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(startTuesdayField_xpath));
			startTuesdayFieldWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean startWednesdayField(){
		try{
			WebElement startWednesdayFieldWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(startWednesdayField_xpath));
			startWednesdayFieldWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean startThursdayField(){
		try{
			WebElement startThursdayFieldWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(startThursdayField_xpath));
			startThursdayFieldWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	
	public boolean startFridayField(){
		try{
			WebElement startFridayFieldWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(startFridayField_xpath));
			startFridayFieldWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	
	public boolean startSaturdayField(){
		try{
			WebElement startSaturdayFieldWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(startSaturdayField_xpath));
			startSaturdayFieldWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean startSundayField(){
		try{
			WebElement startSundayFieldWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(startSundayField_xpath));
			startSundayFieldWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean endMondayField(){
		try{
			WebElement endMondayFieldWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(endMondayField_xpath));
			endMondayFieldWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean endTuesdayField(){
		try{
			WebElement endTuesdayFieldWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(endTuesdayField_xpath));
			endTuesdayFieldWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean endWednesdayField(){
		try{
			WebElement endWednesdayFieldWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(endWednesdayField_xpath));
			endWednesdayFieldWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean endThursdayField(){
		try{
			WebElement endThursdayFieldWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(endThursdayField_xpath));
			endThursdayFieldWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	
	public boolean endFridayField(){
		try{
			WebElement endFridayFieldWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(endFridayField_xpath));
			endFridayFieldWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	
	public boolean endSaturdayField(){
		try{
			WebElement endSaturdayFieldWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(endSaturdayField_xpath));
			endSaturdayFieldWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean endSundayField(){
		try{
			WebElement endSundayFieldWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(endSundayField_xpath));
			endSundayFieldWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean multiFactorAuthenticationLabel(){
		try{
			WebElement multiFactorAuthenticationLabelWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(multiFactorAuthenticationLabel_xpath));
			multiFactorAuthenticationLabelWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean multiFactorAuthenticationCheckbox(){
		try{
			WebElement multiFactorAuthenticationCheckboxWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(multiFactorAuthenticationCheckbox_xpath));
			multiFactorAuthenticationCheckboxWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	
	public boolean editIconUI(){
		try{
			WebElement editIconUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(editIconBasicDetails_xpath));
			editIconUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean cancelButtonDisabled(){
		try{
			WebElement cancelButtonDisabledWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(cancelButtonDisabled_xpath));
			cancelButtonDisabledWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean saveButtonDisabled(){
		try{
			WebElement saveButtonDisabledWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(saveButtonDisabled_xpath));
			saveButtonDisabledWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	
	public boolean editIconClick(){
		try{
			WebElement editIconClickWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(editIconBasicDetails_xpath));
			editIconClickWebE.click();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean lenderNameFieldInput(String lenderNameData){
		try{
			WebElement lenderNameFieldInputWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(lenderNameField_xpath));
			lenderNameFieldInputWebE.clear();
			lenderNameFieldInputWebE.sendKeys(lenderNameData);
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean emailIDFieldInput(String emailIDData){
		try{
			WebElement emailIDFieldInputWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(emailIDField_xpath));
			emailIDFieldInputWebE.clear();
			emailIDFieldInputWebE.sendKeys(emailIDData);
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean phoneNoFieldInput(String phonenoData){
		try{
			WebElement phoneNoFieldInputWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(phoneNoField_xpath));
			phoneNoFieldInputWebE.clear();
			phoneNoFieldInputWebE.sendKeys(phonenoData);
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean cancelButtonClick(){
		try{
			WebElement cancelButtonClickWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(cancelButton_xpath));
			cancelButtonClickWebE.click();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean saveButtonClick(){
		try{
			WebElement saveButtonClickWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(saveButton_xpath));
			saveButtonClickWebE.click();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public String verifyMessageOnAfterSave(String successMessageOnContent)
	   {
	   try{
	      WebElement SaveOnAddSalesWebEelement=new WebDriverWait(driver,10)
	      .until(ExpectedConditions.visibilityOfElementLocated(recordMessage_xpath));
	     String actualMsgFromAPP= SaveOnAddSalesWebEelement.getText();
	     if(actualMsgFromAPP.equalsIgnoreCase(successMessageOnContent))
	     {
	      return actualMsgFromAPP;
	     }
	      
	   }
	   catch(Exception ex){
	    
	   }
	return successMessageOnContent;
	   
	   
	   }
	
	
	
	public boolean addressLine1FieldInput(String addressLine1Data){
		try{
			WebElement addressLine1FieldInputWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(addressLine1Field_xpath));
			addressLine1FieldInputWebE.clear();
			addressLine1FieldInputWebE.sendKeys(addressLine1Data);
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean addressLine2FieldInput(String addressLin2Data){
		try{
			WebElement addressLine2FieldInputWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(addressLine2Field_xpath));
			addressLine2FieldInputWebE.clear();
			addressLine2FieldInputWebE.sendKeys(addressLin2Data);
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean cityFieldInput(String cityData){
		try{
			WebElement cityFieldUIInputWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(cityField_xpath));
			cityFieldUIInputWebE.clear();
			cityFieldUIInputWebE.sendKeys(cityData);
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}


	public boolean countrydropdownValues(String countryDropdownValue){
		
		try {
			//productTypesDropdown_xpath
			
			WebElement dropdown = driver.findElement(countryDropdown_xpath);    
			Select select = new Select(dropdown); 
			java.util.List<WebElement> options = select.getOptions(); 
		
             for(WebElement item:options){
            	 System.out.println(item.getText());
            	 if (item.getText().equals(countryDropdownValue)){
                      System.out.println("Matched");
                      return true;
                      }
             }
            	 
		} catch (Exception e) {
}
		return false;


}

public boolean stateProvinceDropdownInput(String stateProvinceDropdown){
		
		try {
			//productTypesDropdown_xpath
			
			WebElement dropdown = driver.findElement(stateProvinceDropdown_xpath);    
			Select select = new Select(dropdown); 
			java.util.List<WebElement> options = select.getOptions(); 
		
             for(WebElement item:options){
            	 System.out.println(item.getText());
            	 if (item.getText().equals(stateProvinceDropdown)){
                      System.out.println("Matched");
                      return true;
                      }
             }
            	 
		} catch (Exception e) {
}
		return false;


}
	
	public boolean zipPostalCodeFieldInput(String zipPostalCodeData){
		try{
			WebElement zipPostalCodeFieldInputWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(zipPostalCodeField_xpath));
			zipPostalCodeFieldInputWebE.clear();
			zipPostalCodeFieldInputWebE.sendKeys(zipPostalCodeData);
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}


	public boolean faxNoFieldInput(String faxNoFieldData){
		try{
			WebElement faxNoFieldInputWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(faxNoField_xpath));
			faxNoFieldInputWebE.clear();
			faxNoFieldInputWebE.sendKeys(faxNoFieldData);
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	
	public boolean clickOnBrowseLogo(){
		
		try{
			WebElement editIconValidationWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(applicationLogoImage_xpath));
			editIconValidationWebEelement.isDisplayed();
			editIconValidationWebEelement.click();
			Thread.sleep(5000);
			return true;
		}
		catch(Exception ex){
			return false;
		}

		}


	public boolean  fileUPload_CyncLogo(){
		
		
		try {	
			StringSelection ss = new StringSelection("D:\\AutomationCI\\Cync_Automation_Project\\cynclogo_fin.png");
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
	
	
	public boolean clickOnEarnedFeeRadioButton(){
		
		try{
			WebElement clickOnEarnedFeeRadioButtonWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(earnedFeeRadioButton_xpath));
			clickOnEarnedFeeRadioButtonWebEelement.isDisplayed();
			clickOnEarnedFeeRadioButtonWebEelement.click();
			Thread.sleep(5000);
			return true;
		}
		catch(Exception ex){
			return false;
		}
	}
	
		public boolean clickOnAccruedRadioButton(){
			
			try{
				WebElement clickOnAccruedRadioButtonWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(accruedRadioButton_xpath));
				clickOnAccruedRadioButtonWebEelement.isDisplayed();
				clickOnAccruedRadioButtonWebEelement.click();
				Thread.sleep(5000);
				return true;
			}
			catch(Exception ex){
				return false;
			}
	
}
		
		
		public boolean noOfUppercaseFieldInput(String noOfUppercaseData){
			try{
				WebElement noOfUppercaseFieldInputWebE=new WebDriverWait(driver,30)
					.until(ExpectedConditions.visibilityOfElementLocated(noOfUppercaseField_xpath));
				noOfUppercaseFieldInputWebE.clear();
				noOfUppercaseFieldInputWebE.sendKeys(noOfUppercaseData);
				return true;
			}catch(Exception ex){
				
			}
			return false;
		}
		
		
		public boolean noOfLowercaseFieldInput(String noOfLowercaseData){
			try{
				WebElement noOfLowercaseFieldInputWebE=new WebDriverWait(driver,30)
					.until(ExpectedConditions.visibilityOfElementLocated(noOfLowercaseField_xpath));
				noOfLowercaseFieldInputWebE.clear();
				noOfLowercaseFieldInputWebE.sendKeys(noOfLowercaseData);
				return true;
			}catch(Exception ex){
				
			}
			return false;
		}
		
		
		public boolean noOfNumCharsFieldInput(String noOfNumCharsData){
			try{
				WebElement noOfNumCharsFieldInputWebE=new WebDriverWait(driver,30)
					.until(ExpectedConditions.visibilityOfElementLocated(noOfNumCharsField_xpath));
				noOfNumCharsFieldInputWebE.clear();
				noOfNumCharsFieldInputWebE.sendKeys(noOfNumCharsData);
				return true;
			}catch(Exception ex){
				
			}
			return false;
		}
		
		
		public boolean noOfSplCharsFieldInput(String noOfSplCharsData){
			try{
				WebElement noOfSplCharsFieldInputWebE=new WebDriverWait(driver,30)
					.until(ExpectedConditions.visibilityOfElementLocated(noOfSplCharsField_xpath));
				noOfSplCharsFieldInputWebE.clear();
				noOfSplCharsFieldInputWebE.sendKeys(noOfSplCharsData);
				return true;
			}catch(Exception ex){
				
			}
			return false;
		}
		
		public boolean noOfFailedLoginAtmptsFieldInput(String noOfFailedLoginAtmptsData){
			try{
				WebElement noOfFailedLoginAtmptsFieldInputWebE=new WebDriverWait(driver,30)
					.until(ExpectedConditions.visibilityOfElementLocated(noOfFailedLoginAtmptsField_xpath));
				noOfFailedLoginAtmptsFieldInputWebE.clear();
				noOfFailedLoginAtmptsFieldInputWebE.sendKeys(noOfFailedLoginAtmptsData);
				return true;
			}catch(Exception ex){
				
			}
			return false;
		}
		
		
		public boolean sameCharsAllowedRepetitionFieldInput(String sameCharsAllowedRepetitionData){
			try{
				WebElement sameCharsAllowedRepetitionFieldInputWebE=new WebDriverWait(driver,30)
					.until(ExpectedConditions.visibilityOfElementLocated(sameCharsAllowedRepetitionField_xpath));
				sameCharsAllowedRepetitionFieldInputWebE.clear();
				sameCharsAllowedRepetitionFieldInputWebE.sendKeys(sameCharsAllowedRepetitionData);
				return true;
			}catch(Exception ex){
				
			}
			return false;
		}
		
		
		public boolean minimumPasswordLengthFieldInput(String minimumPasswordLengthData){
			try{
				WebElement minimumPasswordLengthFieldInputWebE=new WebDriverWait(driver,30)
					.until(ExpectedConditions.visibilityOfElementLocated(minimumPasswordLengthField_xpath));
				minimumPasswordLengthFieldInputWebE.clear();
				minimumPasswordLengthFieldInputWebE.sendKeys(minimumPasswordLengthData);
				return true;
			}catch(Exception ex){
				
			}
			return false;
		}

		
		public boolean maximumPasswordLengthFieldInput(String maximumPasswordLengthData){
			try{
				WebElement maximumPasswordLengthFieldInputWebE=new WebDriverWait(driver,30)
					.until(ExpectedConditions.visibilityOfElementLocated(maximumPasswordLengthField_xpath));
				maximumPasswordLengthFieldInputWebE.clear();
				maximumPasswordLengthFieldInputWebE.sendKeys(maximumPasswordLengthData);
				return true;
			}catch(Exception ex){
				
			}
			return false;
		}


		public boolean passwordExpiryPeriodFieldInput(String passwordExpiryPeriodData){
			try{
				WebElement passwordExpiryPeriodInputWebE=new WebDriverWait(driver,30)
					.until(ExpectedConditions.visibilityOfElementLocated(passwordExpiryPeriodField_xpath));
				passwordExpiryPeriodInputWebE.clear();
				passwordExpiryPeriodInputWebE.sendKeys(passwordExpiryPeriodData);
				return true;
			}catch(Exception ex){
				
			}
			return false;
		}


		public boolean previousPasswordsCannotBeReusedFieldInput(String previousPasswordsCannotBeReusedData){
			try{
				WebElement previousPasswordsCannotBeReusedFieldInputWebE=new WebDriverWait(driver,30)
					.until(ExpectedConditions.visibilityOfElementLocated(previousPasswordsCannotBeReusedField_xpath));
				previousPasswordsCannotBeReusedFieldInputWebE.clear();
				previousPasswordsCannotBeReusedFieldInputWebE.sendKeys(previousPasswordsCannotBeReusedData);
				return true;
			}catch(Exception ex){
				
			}
			return false;
		}

		
		public boolean restrictedWordsFieldInput(String restrictedWordsData){
			try{
				WebElement restrictedWordsFieldInputWebE=new WebDriverWait(driver,30)
					.until(ExpectedConditions.visibilityOfElementLocated(restrictedWordsField_xpath));
				restrictedWordsFieldInputWebE.clear();
				restrictedWordsFieldInputWebE.sendKeys(restrictedWordsData);
				return true;
			}catch(Exception ex){
				
			}
			return false;
		}
		
		
		
		public boolean securityPolicyFieldInput(String securityPolicyFieldData){
			try{
				WebElement securityPolicyFieldInputWebE=new WebDriverWait(driver,30)
					.until(ExpectedConditions.visibilityOfElementLocated(securityPolicyField_xpath));
				securityPolicyFieldInputWebE.clear();
				securityPolicyFieldInputWebE.sendKeys(securityPolicyFieldData);
				return true;
			}catch(Exception ex){
				
			}
			return false;
		}
		
		public boolean privacyPolicyFieldInput(String privacyPolicyFieldData){
			try{
				WebElement privacyPolicyFieldInputWebE=new WebDriverWait(driver,30)
					.until(ExpectedConditions.visibilityOfElementLocated(privacyPolicyField_xpath));
				privacyPolicyFieldInputWebE.clear();
				privacyPolicyFieldInputWebE.sendKeys(privacyPolicyFieldData);
				return true;
			}catch(Exception ex){
				
			}
			return false;
		}
		public boolean termsAndConditionsFieldInput(String termsAndConditionsFieldData){
			try{
				WebElement termsAndConditionsFieldInputWebE=new WebDriverWait(driver,30)
					.until(ExpectedConditions.visibilityOfElementLocated(termsAndConditionsField_xpath));
				termsAndConditionsFieldInputWebE.clear();
				termsAndConditionsFieldInputWebE.sendKeys(termsAndConditionsFieldData);
				return true;
			}catch(Exception ex){
				
			}
			return false;
		}
		public boolean disclaimersFieldInput(String disclaimersFieldData){
			try{
				WebElement disclaimersFieldInputWebE=new WebDriverWait(driver,30)
					.until(ExpectedConditions.visibilityOfElementLocated(disclaimersField_xpath));
				disclaimersFieldInputWebE.clear();
				disclaimersFieldInputWebE.sendKeys(disclaimersFieldData);
				return true;
			}catch(Exception ex){
				
			}
			return false;
		}
		
		
		
		
		
		
		
		
}
	
	

	

