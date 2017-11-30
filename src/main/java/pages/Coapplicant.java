package pages;

import java.awt.Color;
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

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.google.common.base.Verify;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.Assert;
import supportFiles.ExtentManager;




public class Coapplicant extends ExtentManager {
	
	public RemoteWebDriver driver;
	
		
	
	//public By coapplicantYes=By.id("//div[@class='co-applicant']/following::div/div/following::label[@class='css-label1']");
	
	public By coapplicantYes=By.xpath("//div[@class='co-applicant']/following::div/div/following::label[@class='css-label1']");
	
	public By coapplicantFName=By.id("coapp-firstname");
	public By coapplicantLName=By.id("coapp-lastname");
	
	public By coapplicantDOB=By.id("coappdobdate");
	
	public By coapplicantrelationship=By.id("coapprelationinp");
	
	public By coapplicantIsowner=By.id("coappcoownerinp");
	public By coapplicantEmptype=By.id("coappemptypeinp");
	
	
	public By coapplicantCompanyName=By.id("coappsalcompanynameinp");
	
	public By coapplicantSalary=By.id("coappsalgrosssalinp");
	
	
	public By coapplicantIncentives=By.id("coappsalincentiveinp");
	
	public By coapplicantAnnualBonus=By.id("coappsalbonusinp");
	
	public By coapplicantEMI=By.id("coappsamemiinp");
	
	
	
	public By coapplicantPANnumber=By.id("coapppaninput");
	
	
	public By coapplicantResidencyRI=By.xpath("//input[@id='nricoapp1']/following::label[@class='css-label1']/span[1]");
	
	public By coapplicantResidencyNRI=By.xpath("//input[@id='nricoapp1']/following::label[@class='css-label1']/span[2]");
	
	public By personalDetailContinueBtn=By.id("continue");
	
	//contactemail
	
	//contactmobile
	
	
	
	public Coapplicant(RemoteWebDriver driver) throws InterruptedException{
		
		
		test=extent.startTest("Selection Of co-Applicant Status");
		Thread.sleep(3000);
		this.driver=driver;
	}
	
	
	
	public Coapplicant  coapplicantDOB(String dateOfBirth) throws InterruptedException, IOException{
		
		driver.findElement(coapplicantDOB).sendKeys(dateOfBirth,Keys.TAB);
		
		 test.log(LogStatus.INFO, "Date Of Birth Entered Sucessfully " + " "+ dateOfBirth);
			
			/*screenShotPath=ExtentManager.capture(driver, "Pass");
			
			test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));*/
		
		//driver.findElementByXPath("//div[@class='lw-gender-head']").click();
		Thread.sleep(3000);
		return this;

		
	}
	
	
	public Coapplicant coapplicantContinueBtn() throws InterruptedException{
		
		driver.findElement(personalDetailContinueBtn).click();
		
		Thread.sleep(3000);
		
		return this;
		
		
		
	}


public Coapplicant pageScroll(){
	
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,100)", "");
	
	return this;
	
	
	
}



public Coapplicant  coapplicantStatus() throws InterruptedException, IOException{
	
	//Thread.sleep(10000);
	WebElement coStatus=driver.findElement(coapplicantYes);
	
	Actions action=new Actions(driver);
	
	action.moveToElement(coStatus);
	
	action.click();
		
	action.perform();
	
test.log(LogStatus.INFO, "Co-applicant Status Yes  Selected Sucessfully");
	
	/*screenShotPath=ExtentManager.capture(driver, "Pass");
	
	test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));*/
	return this;

	
}



public Coapplicant coapplicantRelation(String relationType) throws IOException, InterruptedException{
	
	Select relationshipType=new Select(driver.findElement(coapplicantrelationship));
	
	relationshipType.selectByVisibleText(relationType);
	
	//Thread.sleep(3000);
	
	test.log(LogStatus.INFO, "Relationship Type"+" "+relationType+" "+" "+"Selected Sucessfully" );
		
		/*screenShotPath=ExtentManager.capture(driver, "Pass");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));*/
		
	return this;
			
}



public Coapplicant Iscoowner(String isowner) throws IOException, InterruptedException{

	Select isadditonalowner=new Select(driver.findElement(coapplicantIsowner));
	
	isadditonalowner.selectByVisibleText(isowner);
	
	//Thread.sleep(3000);
	
	test.log(LogStatus.INFO, "Is Owner Status "+" "+isowner+" "+" "+"Selected Sucessfully" );
		
		/*screenShotPath=ExtentManager.capture(driver, "Pass");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));*/
		
	return this;
			
}




public Coapplicant coapplicantresidencyRI() throws InterruptedException, IOException{
	
	Thread.sleep(3000);
				
	driver.findElement(coapplicantResidencyRI).click();
	
test.log(LogStatus.INFO, "Residency RI Selected Sucessfully ");
	
	/*screenShotPath=ExtentManager.capture(driver, "Pass");
	
	test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
	*/

	//driver.findElementByClassName("icon-dir-left").click();
	
	
	return this;
	
	
	
}


public Coapplicant coapplicantemploymentTypeValue(String coapplicantempType) throws IOException, InterruptedException{
	
	Select coapplicantemptype=new Select(driver.findElement(coapplicantEmptype));
	
	coapplicantemptype.selectByVisibleText(coapplicantempType);
	
	Thread.sleep(3000);
	
	test.log(LogStatus.INFO, "Co-Applicant Employment Type"+" "+coapplicantempType+" "+" "+"Selected Sucessfully" );
		
		/*screenShotPath=ExtentManager.capture(driver, "Pass");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));*/
	
		
	return this;
			
}


public Coapplicant coapplicantcompanyNameValue(String coapplicantcompName) throws IOException{
	
	driver.findElement(coapplicantCompanyName).sendKeys(coapplicantcompName);
	

	 test.log(LogStatus.INFO, "Co-Applicant Company Name"+" "+coapplicantcompName+" "+ "Entered  Sucessfully");
		
		screenShotPath=ExtentManager.capture(driver, "Pass");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			
	return this;
			
}

public Coapplicant coapplicantgrossSalary(String coapplicantsalary) throws IOException{
	
	driver.findElement(coapplicantSalary).sendKeys(coapplicantsalary);
	
	test.log(LogStatus.INFO, "Co-applicant Salary "+" "+ coapplicantsalary+" "+"Entered  Sucessfully");
	
	screenShotPath=ExtentManager.capture(driver, "Pass");
	
	test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			
	return this;
			
}


public Coapplicant coapplicantsalaryIncentives(String coapplicantincentives) throws IOException{
	
	driver.findElement(coapplicantIncentives).sendKeys(coapplicantincentives);
	
test.log(LogStatus.INFO, "Co-applicant Incentives "+" "+" "+coapplicantincentives+" "+ "Entered  Sucessfully ");
	
	screenShotPath=ExtentManager.capture(driver, "Pass");
	
	test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			
	return this;
			
}


public Coapplicant coapplicantsalaryBonus(String coapplicantbonus) throws IOException{
	
	driver.findElement(coapplicantAnnualBonus).sendKeys(coapplicantbonus);
	
test.log(LogStatus.INFO, "Co-applicant Bonus "+" "+ coapplicantbonus +" "+ "Entered  Sucessfully " );
	
	screenShotPath=ExtentManager.capture(driver, "Pass");
	
	test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			
	return this;
			
}

public Coapplicant salariedcurrentEMI(String coapplicantemi) throws IOException{
	
	driver.findElement(coapplicantEMI).sendKeys(coapplicantemi);
	
test.log(LogStatus.INFO, "Co-applicant EMI  "+" " + coapplicantemi+"Entered  Sucessfully ");
	
	screenShotPath=ExtentManager.capture(driver, "Pass");
	
	test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			
			
	return this;
			
}



public Coapplicant coapplicantpanNumber(String coapplicantpanNumber) throws InterruptedException, IOException{
	
	Thread.sleep(3000);
	
	WebDriverWait wait = (new WebDriverWait(driver, 60));
	
	wait.until(ExpectedConditions.elementToBeClickable(coapplicantPANnumber));
	
	//driver.findElement(personalDetailPANNumber).click();
	
	driver.findElement(coapplicantPANnumber).sendKeys(coapplicantpanNumber);
	
	
test.log(LogStatus.INFO, "coapplicant PAN Number Entered Sucessfully " + " "+ coapplicantpanNumber );
	
	screenShotPath=ExtentManager.capture(driver, "Pass");
	
	test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
	
	Thread.sleep(5000);
	
	driver.findElementByClassName("icon-dir-right").click();
	
	return this;
	
	
	
}


public Coapplicant coapplicantpersonalDetailsFNameenty(String coapplicantFirstName) throws InterruptedException, IOException{
	
	
	test=extent.startTest("Personal Detail Entries");
	driver.findElement(coapplicantFName).sendKeys(coapplicantFirstName);
	
	System.out.println("Coapplicant First Name Entered Sucessfully" +" " +  coapplicantFirstName );
	
	//FName=FirstName;
	
	test.log(LogStatus.INFO, "Coapplicant First Name Entered Sucessfully "+" " + coapplicantFirstName);
	
	screenShotPath=ExtentManager.capture(driver, "Pass");
	
	test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
	
	Thread.sleep(3000);
	
	return this;
	
	
	
	
}



public Coapplicant coapplicantpersonalDetailsLNameenty(String coapplicantLastName) throws InterruptedException, IOException{
	
	driver.findElement(coapplicantLName).sendKeys(coapplicantLastName);
	
	System.out.println("Coapplicant Last Name Entered Sucessfully" + coapplicantLastName );
	
     test.log(LogStatus.INFO, "Coapplicant Last Name Entered Sucessfully " +" " + coapplicantLastName);
	
	screenShotPath=ExtentManager.capture(driver, "Pass");
	
	test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
	
	Thread.sleep(3000);
	
	return this;
		
	
}


public Coapplicant closeBrowsers(){
	
	
	driver.quit();
	
	return this;
	
	
	
}



}


