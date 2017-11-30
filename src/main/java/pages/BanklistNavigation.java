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




public class BanklistNavigation extends ExtentManager {
	
	public RemoteWebDriver driver;
	
	
	
	
	public By employmentType=By.id("loan-profession");
	
	public By personalDetailContinueBtn=By.id("signup");
	
	public By custEmail=By.id("contactemail");
	
	public By custMobile=By.id("contactmobile");
	
	public By PNBHousing8_6=By.xpath("//div[@class='banklistslot']//div[@class='lw-eo-7 lw-wid150']/button[1]");
	
	public By PNBHousing8_35=By.xpath("//div[@class='banklistslot']//div[@class='lw-eo-7 lw-wid150']/button[2]");
	
	public By IDFCBank8_65=By.xpath("//div[@class='banklistslot']//div[@class='lw-eo-7 lw-wid150']/button[3]");
	
	public By IDFCBank8_5=By.xpath("//div[@class='banklistslot']//div[@class='lw-eo-7 lw-wid150']/button[4]");
	
	public By IndiaBullsHomeLoans8_35=By.xpath("//div[@class='banklistslot']//div[@class='lw-eo-7 lw-wid150']/button[5]");
	
	public By YESBank8_5=By.xpath("//div[@class='banklistslot']//div[@class='lw-eo-7 lw-wid150']/button[6]");
	
	public By YESBank8_9=By.xpath("//div[@class='banklistslot']//div[@class='lw-eo-7 lw-wid150']/button[7]");
	
	
	
	
	//div[@class='banklistslot']//div[@class='lw-eo-7 lw-wid150']/button[1]
	
	
	
	public BanklistNavigation(RemoteWebDriver driver) throws InterruptedException{
		test=extent.startTest("Apply Home Loan Navigation");
		Thread.sleep(3000);
		this.driver=driver;
	}
	
	public BanklistNavigation applyPNBHousing8_6() throws InterruptedException, IOException{
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		jse.executeScript("window.scrollBy(0,-250)", "");		
		
		//((JavascriptExecutor) driver).executeScript( "arguments[0].scrollIntoView();", PNBHousing8_6);
		
		Thread.sleep(3000);
		
		
		driver.findElement(PNBHousing8_6).click();
		
		
		test.log(LogStatus.INFO, "User sucessfully Land to Document upload Page ");
		
		screenShotPath=ExtentManager.capture(driver, "Pass");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
		
		return this;
		
		
	}
	

public BanklistNavigation pageScroll(){
	
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,100)", "");
	
	return this;
	
	
	
}


public BanklistNavigation closeBrowsers(){
	
	
	driver.quit();
	
	return this;
	
	
	
}



}


