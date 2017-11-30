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
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Verify;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import supportFiles.ExtentManager;




public class HomeLoanPersonalDetail extends ExtentManager {
	
	public RemoteWebDriver driver;
	
	
	
	
	public By personalDetailFName=By.id("firstname");
	
	public By personalDetailLName=By.id("lastname");
	
	
	public By personalDetailContinueBtn=By.id("continue");
	
	public By personalDetailDOB=By.id("dobdate");
	
	public By personalDetailGenderMale=By.xpath("//div[@id='gender']/div/div/div/div/following::label[@name='demo_lbl_1'][1]");
	public By personalDetailGenderFemale=By.xpath("//div[@id='gender']/div/div/div/div/following::label[@name='demo_lbl_1'][2]");
	
	//public By personalDetailMaleGender=By.xpath("//label[@name='demo_lbl_1'][1]");
	//public By personalDetailMaleGender=By.xpath("//input[@class='css-radio floatleft genderinput']/following::label");
	
	public By personalDetailFemaleGender=By.xpath("//label[@name='demo_lbl_1'][2]");
	
	//public By personalDetailPANNumber=By.id("paninput");
	
	public By personalDetailPANNumber=By.xpath("//input[@id='paninput']");
	
	//public By personalDetailPANNumber=By.xpath("//input[@class='textbox-align padding142013 success']");
	
	
		
	public By personalDetailcityName=By.id("cityselect");
	
	public By personalDetailLivingCity=By.className("ui-menu-item");
	
	
	public By personalDetailResidency=By.xpath("//input[@class='css-radio floatleft nriinput']/following::label[@class='css-label1'][1]");
	
	//public By malegender=By.cssSelector("#gender > div > div:nth-child(1) > div.lw-gen-radio-box.lw-input > label");
	
	
	public static String FName;
	
	
	
	
	public HomeLoanPersonalDetail(RemoteWebDriver driver) throws InterruptedException, IOException{
		test=extent.startTest("Home Loan Page Landing");
		Thread.sleep(3000);
		this.driver=driver;
		
	 String HomeLoanTilte="Home Loan, apply online and get instant e-approval";
	 
		System.out.println("HomeLoanTilte"+HomeLoanTilte);
		
		System.out.println("get title" + driver.getTitle());
	
	 
	 if(driver.getTitle().equalsIgnoreCase(HomeLoanTilte)){
		 
		 System.out.println("User sucessfully land to Home Loan Page");
		 
		 
		 test.log(LogStatus.PASS, "Check whether user navigated to the Home Loan Page", "User sucessfully land to the Home Loan Page");
	        
	       
         screenShotPath=ExtentManager.capture(driver, "Strip");
		
		test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));	
	 }
	
	 
	 else{
		 
		 System.out.println("User unable to land to Home Loan Page");
		 
		 test.log(LogStatus.PASS, "Check whether user navigated to the Home Loan Page", "User unable to Land Home Loan Page");
	        
	       
         screenShotPath=ExtentManager.capture(driver, "Strip");
		
		test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));	
		
		 //driver.quit();
	 }
		
	}
	








public HomeLoanPersonalDetail personalDetailsFNameenty(String FirstName) throws InterruptedException, IOException{
	
	
	try {
		test=extent.startTest("Personal Detail Entries");
		driver.findElement(personalDetailFName).sendKeys(FirstName);
		
		System.out.println("First Name Entered Sucessfully" +" " +  FirstName );
		
		FName=FirstName;
		
		test.log(LogStatus.INFO, "First Name Entered Sucessfully "+" " + FirstName);
		
		screenShotPath=ExtentManager.capture(driver, "Pass");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
		
		Thread.sleep(3000);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	test.log(LogStatus.FAIL, e);
	
	
	}
	
	return this;
	
	
	
	
}

public HomeLoanPersonalDetail personalDetailsLNameenty(String LastName) throws InterruptedException, IOException{
	
	try {
		driver.findElement(personalDetailLName).sendKeys(LastName);
		
		System.out.println("Last Name Entered Sucessfully" + LastName );
		
		 test.log(LogStatus.INFO, "Last Name Entered Sucessfully " +" " + LastName);
		
		screenShotPath=ExtentManager.capture(driver, "Pass");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
		
		Thread.sleep(3000);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
		test.log(LogStatus.FAIL, e);
	}
	
	return this;
		
	
}


public HomeLoanPersonalDetail personalDetailsContinueBtn() throws InterruptedException{
	
	driver.findElement(personalDetailContinueBtn).click();
	
	Thread.sleep(5000);
	
	return this;
	
	
	
}




public HomeLoanPersonalDetail  DOB(String dateOfBirth) throws InterruptedException, IOException{
	
	driver.findElement(personalDetailDOB).sendKeys(dateOfBirth,Keys.TAB);
	
	 test.log(LogStatus.INFO, "Date Of Birth Entered Sucessfully " + " "+ dateOfBirth);
		
		/*screenShotPath=ExtentManager.capture(driver, "Pass");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));*/
	
	//driver.findElementByXPath("//div[@class='lw-gender-head']").click();
	Thread.sleep(3000);
	return this;

	
}


public HomeLoanPersonalDetail  genderMale() throws InterruptedException, IOException{
		
	Thread.sleep(5000);
	WebElement genderValue=driver.findElement(personalDetailGenderMale);
	
	Actions action=new Actions(driver);
	
	action.moveToElement(genderValue);
	
	action.click();
		
	action.perform();
	
test.log(LogStatus.INFO, "Male Gender Selected Sucessfully");
	
	/*screenShotPath=ExtentManager.capture(driver, "Pass");
	
	test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));*/
	return this;

	
}


public HomeLoanPersonalDetail  genderFemale() throws InterruptedException, IOException{
	
	Thread.sleep(5000);
	driver.findElement(personalDetailGenderFemale).click();
	
	
	
test.log(LogStatus.INFO, "Male Gender Selected Sucessfully");
	
	/*screenShotPath=ExtentManager.capture(driver, "Pass");
	
	test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));*/
	return this;

	
}



public HomeLoanPersonalDetail residencyRI() throws InterruptedException, IOException{
	
	Thread.sleep(5000);
				
	driver.findElement(personalDetailResidency).click();
	
test.log(LogStatus.INFO, "Residency RI Selected Sucessfully ");
	
	/*screenShotPath=ExtentManager.capture(driver, "Pass");
	
	test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
	*/

	//driver.findElementByClassName("icon-dir-left").click();
	
	
	return this;
	
	
	
}

public HomeLoanPersonalDetail panNumber(String panNumber) throws InterruptedException, IOException{
	
	Thread.sleep(10000);
	
	WebDriverWait wait = (new WebDriverWait(driver, 60));
	
	wait.until(ExpectedConditions.elementToBeClickable(personalDetailPANNumber));
	
	//driver.findElement(personalDetailPANNumber).click();
	
	driver.findElement(personalDetailPANNumber).sendKeys(panNumber);
	
	
test.log(LogStatus.INFO, "PAN Number Entered Sucessfully " + " "+ panNumber );
	
	screenShotPath=ExtentManager.capture(driver, "Pass");
	
	test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
	
	Thread.sleep(5000);
	
	driver.findElementByClassName("icon-dir-right").click();
	
	return this;
	
	
	
}


public HomeLoanPersonalDetail livingCity(String livingCityName) throws InterruptedException, IOException{
	Thread.sleep(5000);
	driver.findElement(personalDetailcityName).sendKeys(livingCityName);
	
	List<WebElement> cityList=driver.findElements(personalDetailLivingCity);
	

	
	cityList.get(0).click();
	
test.log(LogStatus.INFO, "Living City Name Entered Sucessfully " + " "+ livingCityName );
	
	screenShotPath=ExtentManager.capture(driver, "Pass");
	
	test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
	
	return this;
	
	
	
}




public HomeLoanPersonalDetail closeAllBrowser(){
	
	driver.quit();
	return this;
	
}


public HomeLoanPersonalDetail delay5000() throws InterruptedException{
	
	Thread.sleep(5000);
	
	return this;

	
}

public HomeLoanPersonalDetail pageScroll(){
	
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,100)", "");
	
	return this;
	
	
	
}



}


