package com.cync.base;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import com.relevantcodes.extentreports.LogStatus;


public abstract class BaseTest {
 public WebDriver driver=null;
 DesiredCapabilities capability=new DesiredCapabilities();
 ChromeOptions options=null;
 
 Map<WebDriver, String> drivers=new HashMap<>();

 
 @Parameters({"browserName","localBrowserPath","selGrid","nodeURL","url"})
 @BeforeMethod(alwaysRun=true)
 public void beforeMethod(@Optional ("chrome") String browserName,@Optional ("D:\\chromedriver.com") String localBrowserPath, 
   @Optional("false") Boolean selGrid,@Optional ("http://localhost::4444") String nodeURL,@Optional ("https://staging.cyncsoftware.com") String url,
   Method method
 ) throws MalformedURLException {
  
  
  String log4jConfPath = "log4j.properties";
  PropertyConfigurator.configure(log4jConfPath);
  
  
  String thread=Thread.currentThread().getName();
  switch(browserName.toUpperCase()){
  case "CHROME":
	 // /home/leo/Downloads/
   final String dir_localBrowserPath = System.getProperty("user.dir")+"/src/test/resources/"+localBrowserPath;
      
   System.setProperty("webdriver.chrome.driver", "/home/likewise-open/IDEXCEL/sankush/Downloads/chromedriver");

            capability=DesiredCapabilities.chrome();
            options=new ChromeOptions();
            options.addArguments("Web Test","start-maximizing","no-default-browser-check");
            capability.setCapability(ChromeOptions.CAPABILITY, options);
            capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
          //  capability.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, true);
            capability.setPlatform(Platform.ANY);
            if(selGrid){
             driver=new RemoteWebDriver(new URL(nodeURL),capability);
              //log.info("execution started in the CHROME browser");
            }else{
             driver=new ChromeDriver();
              //log.info("execution started in the CHROME browser");
            }
            
            
            drivers.put(driver, thread);
            break;
  case "FIREFOX":

            System.setProperty("webdriver.gecko.driver", localBrowserPath);
            capability=DesiredCapabilities.firefox();
            capability.setCapability("marionette", true);
            capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            capability.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, true);
            if(selGrid){
             driver=new RemoteWebDriver(new URL(nodeURL),capability);
            }else{
             driver=new FirefoxDriver();
            }
            drivers.put(driver, thread);
            break;
  case "IE":
            System.setProperty("webdriver.ie.driver", localBrowserPath);
            capability=DesiredCapabilities.internetExplorer();
            capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            capability.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, true);
            if(selGrid){
             driver=new RemoteWebDriver(new URL(nodeURL),capability);
            }else{
                driver=new InternetExplorerDriver();
            }
            drivers.put(driver, thread);
            break;
 }
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  
 // log.info("maximizing the Browser");
  driver.manage().window().maximize();  
 
  //log.info("Passing the APP URL");
  driver.get(url);
  System.out.println(url);
  ExtentTestManager.startTest(""+method.getName());
  ExtentTestManager.getTest().log(LogStatus.INFO, "Open Browser and navigate to " + url, "Browser Name: " + browserName);
 }
 
 
 @AfterMethod(alwaysRun=true)
 public void afterMethod(ITestResult result,Method method){
  //int testStatus;
        String fileName = "FAIL  - Error Message Generated on Details Reports";
        String failMsg = "";
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        Date endDateTime;
        String dateEndInString;
        byte testStatus;
        if(result.getStatus() == 2) {
            endDateTime = new Date();
            DateFormat shortDf = DateFormat.getDateTimeInstance(3, 3);
            String currentDate = shortDf.format(endDateTime).toString().replace("/", "_");
            currentDate = currentDate.toString().replace(" ", "_");
            currentDate = currentDate.toString().replace(":", "_");
            dateEndInString = "SC_error__" + currentDate;
            fileName = System.getProperty("user.dir") + "\\Reports\\failure_screenshots\\" + dateEndInString + ".png";
            takeScreenShot(this.driver, fileName);
            ExtentTestManager.getTest().log(LogStatus.FAIL, "Error Screenshort" + ExtentTestManager.getTest().addScreenCapture(fileName));
          //ExtentTestManager.getTest().log(LogStatus.FAIL, "Error Screenshort" + ExtentTestManager.getTest().addBase64ScreenShot(fileName));
            ExtentTestManager.getTest().log(LogStatus.FAIL, result.getThrowable());
            ExtentTestManager.getTest().log(LogStatus.FAIL, "Test Failed");
            testStatus = 2;
        } else if(result.getStatus() == 3) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
            testStatus = 3;
        } else {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test passed");
            testStatus = 1;
        }     
        ExtentManager.getReporter().endTest(ExtentTestManager.getTest());
        ExtentManager.getReporter().flush();
       // driver.quit();
        //ExtentTestManager.getTest().log(LogStatus.INFO, "Browser Closed");
        
        driver.close();
        driver.quit();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Browser Closed");
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
  
 }
 
 public static void takeScreenShot(WebDriver driver, String filePath){
  TakesScreenshot scrShot = (TakesScreenshot)driver;
        File srcFile = (File)scrShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(filePath);
        try {
   FileUtils.copyFile(srcFile, destFile);
  } catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
  
 }
 /*public static String takeScreenShott111(WebDriver driver,String filePath){
 TakesScreenshot newScreen = (TakesScreenshot) driver;
 String scnShot = newScreen.getScreenshotAs(OutputType.BASE64);
 return "data:image/jpg;base64, " + scnShot ;
}
*/

}