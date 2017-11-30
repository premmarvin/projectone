package FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Testcases.TestcaseSalariedWithoutCoapplicant;
import supportFiles.ExtentManager;

public class workFlow {
	
public static RemoteWebDriver driver;
	
	public static ExtentReports extent;

	public static  ExtentTest test;
	
	@BeforeMethod
	  public void beforeMethod() {
	
	
	
	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	  
	capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
	
	    
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	
	//driver=new FirefoxDriver(capabilities);
     driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);	  
     // WebDriverWait wait = (new WebDriverWait(driver, 60));
      
     extent = ExtentManager.Instance();
     	
}
	
	
	@AfterTest
	public void afterTest(){
		
		extent.endTest(test);
	
		
	}

	
	
	
	@AfterSuite
	public void afterSuiteMethod() {
	
		driver.quit();
		
	}
	

}
