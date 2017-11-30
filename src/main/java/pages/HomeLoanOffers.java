package pages;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Verify;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.Assert;
import supportFiles.ExtentManager;




public class HomeLoanOffers extends ExtentManager {
	
	public RemoteWebDriver driver;
	
	
	
	
	public By employmentType=By.id("loan-profession");
	
	public By personalDetailContinueBtn=By.id("signup");
	
	public By custEmail=By.id("contactemail");
	
	public By custMobile=By.id("contactmobile");
	
	
	
	public static String emailId;
	public static String mobileNumber;
	
	
	
	
	public HomeLoanOffers(RemoteWebDriver driver) throws InterruptedException{
		test=extent.startTest("Home Loan Offers Entries");
		Thread.sleep(3000);
		this.driver=driver;
	}
	
	
	public HomeLoanOffers contactEmailValue(String email) throws InterruptedException, IOException{
		
		driver.findElement(custEmail).sendKeys(email);
		
		
		Thread.sleep(3000);
		
		emailId=email;
		
		 test.log(LogStatus.INFO, "Customer Email Entered  Sucessfully " +" " + email);
			
			screenShotPath=ExtentManager.capture(driver, "Pass");
			
			test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
		
		return this;
		
		
		
	}
	
	
public HomeLoanOffers contactMobileValue(String mobile) throws InterruptedException, IOException{
		
		driver.findElement(custMobile).sendKeys(mobile);
		
		Thread.sleep(3000);
		
		mobileNumber=mobile;
		
		 test.log(LogStatus.INFO, "Customer Mobile Number Entered  Sucessfully " +" " + mobile);
			
			screenShotPath=ExtentManager.capture(driver, "Pass");
			
			test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
		
		return this;
		
		
		
	}
	

public HomeLoanOffers personalDetailsContinueBtn() throws InterruptedException{
	
	driver.findElement(personalDetailContinueBtn).click();
	
	Thread.sleep(5000);
	
	return this;
	
	
	
}

public HomeLoanOffers bankList() throws InterruptedException, IOException{
	 
	
	 test.log(LogStatus.INFO, "Listed of Eligible Banks ");
		
		screenShotPath=ExtentManager.capturefull(driver, "screenshotout");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
	
	Thread.sleep(5000);
	

	
	return this;
	
	
	
}


public HomeLoanOffers salariedWithoutCoappbankList() throws InterruptedException, IOException{
	 
	
	 test.log(LogStatus.INFO, "Listed of Eligible Banks ");
		
		screenShotPath=ExtentManager.capturefull(driver, "screenshotout");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
	
	Thread.sleep(5000);
	

	
	return this;
	
	
	
}

public HomeLoanOffers pageScroll(){
	
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,100)", "");
	
	return this;
	
	
	
}


public HomeLoanOffers closeBrowsers(){
	
	
	driver.quit();
	
	return this;
	
	
	
}



}


