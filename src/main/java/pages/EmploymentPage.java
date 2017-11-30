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




public class EmploymentPage extends ExtentManager {
	
	public RemoteWebDriver driver;
	
	
	
	
	public By employmentType=By.id("loan-profession");
	
	public By salaryAccountBank=By.id("salemi_loanbankdetailsinp");
	
	public By salaryAccount=By.id("salemi_loanbankdetailsinp");
	
	public By companyName=By.id("salcompanynameinp");
	
	public By grossSalary=By.id("salgrosssalinp");
	
	public By salaryIncentives=By.id("salincentiveinp");
	
	public By salaryBonus=By.id("salbonusinp");
	
	public By workExpYear=By.id("salemi_workexperienceinp_year");
	
	public By workExpMonth=By.id("salemi_workexperienceinp_month");
	public By personalDetailContinueBtn=By.id("continue");
	
	public By businessStartDate=By.id("busstartdate");
	
	public By previousYearProfit=By.id("sebprofitinp");

	
	
	
	public By salariedcurrentEMI=By.id("salemiinp");
	
	public By selfEmpBusinesscurrentEMI=By.id("sebemiinp");
	
	
	
	public By businessTypeValue=By.id("businesstypeinp");
	
	public By businessName=By.name("businesstypeinp");
	
	
	
	public EmploymentPage(RemoteWebDriver driver) throws InterruptedException{
		
		
		Thread.sleep(3000);
		this.driver=driver;
	}
	
	
	public EmploymentPage employmentType(String empType) throws IOException, InterruptedException{
		test=extent.startTest("Employment Entries for Salaried");
		Select emptype=new Select(driver.findElement(employmentType));
		
		emptype.selectByVisibleText(empType);
		
		//Thread.sleep(3000);
		
		test.log(LogStatus.INFO, "Employment Type"+" "+empType+" "+" "+"Selected Sucessfully" );
			
			/*screenShotPath=ExtentManager.capture(driver, "Pass");
			
			test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));*/
		
			
		return this;
				
	}
	 
	public EmploymentPage employmentTypeselfEmpBusiness(String empType) throws IOException, InterruptedException{
		test=extent.startTest("Employment Entries for Self Employed Business");
		Select emptype=new Select(driver.findElement(employmentType));
		
		emptype.selectByVisibleText(empType);
		
		//Thread.sleep(3000);
		
		test.log(LogStatus.INFO, "Employment Type"+" "+empType+" "+" "+"Selected Sucessfully" );
			
			/*screenShotPath=ExtentManager.capture(driver, "Pass");
			
			test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));*/
		
			
		return this;
				
	}
	
	
	
	
	
public EmploymentPage businessType(String busnessType) throws IOException, InterruptedException{
	//test=extent.startTest("Employment Entries for SelfEmployed Business");
		Select business=new Select(driver.findElement(businessName));
		//Thread.sleep(3000);
		
		business.selectByVisibleText(busnessType);
		
		Thread.sleep(3000);
		
		 test.log(LogStatus.INFO, "Business Type"+" "+busnessType+" "+" "+"Selected Sucessfully" );
			
			screenShotPath=ExtentManager.capture(driver, "Pass");
			
			test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
		
			
		return this;
				
	}
	

public EmploymentPage startOfBusiness(String businessStDate) throws InterruptedException, IOException{
	
	driver.findElement(businessStartDate).sendKeys(businessStDate,Keys.TAB);
	
	 test.log(LogStatus.INFO, "Business StartDate Entered Sucessfully " + " "+ businessStDate);
	 
	 Thread.sleep(3000);
		
		/*screenShotPath=ExtentManager.capture(driver, "Pass");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));*/
	
	//driver.findElementByXPath("//div[@class='lw-gender-head']").click();
	//Thread.sleep(3000);
	return this;

	
}
	
public EmploymentPage companyName(String compName) throws IOException{
		
		driver.findElement(companyName).sendKeys(compName);
		

		 test.log(LogStatus.INFO, "Company Name"+" "+compName+" "+ "Entered  Sucessfully");
			
			screenShotPath=ExtentManager.capture(driver, "Pass");
			
			test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
				
		return this;
				
	}
	

public EmploymentPage financialYearincome(String income) throws IOException{
	
	driver.findElement(previousYearProfit).sendKeys(income);
	

	 test.log(LogStatus.INFO, "Financial Year income"+" "+income+" "+ "Entered  Sucessfully");
		
		screenShotPath=ExtentManager.capture(driver, "Pass");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			
	return this;
			
}



public EmploymentPage grossSalary(String salary) throws IOException{
	
	driver.findElement(grossSalary).sendKeys(salary);
	
	test.log(LogStatus.INFO, "Salary "+" "+ salary+" "+"Entered  Sucessfully");
	
	screenShotPath=ExtentManager.capture(driver, "Pass");
	
	test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			
	return this;
			
}



public EmploymentPage salaryIncentives(String incentives) throws IOException{
	
	driver.findElement(salaryIncentives).sendKeys(incentives);
	
test.log(LogStatus.INFO, "Incentives "+" "+" "+incentives+" "+ "Entered  Sucessfully ");
	
	screenShotPath=ExtentManager.capture(driver, "Pass");
	
	test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			
	return this;
			
}
	

public EmploymentPage salaryBonus(String bonus) throws IOException{
	
	driver.findElement(salaryBonus).sendKeys(bonus);
	
test.log(LogStatus.INFO, "Bonus "+" "+ bonus +" "+ "Entered  Sucessfully " );
	
	screenShotPath=ExtentManager.capture(driver, "Pass");
	
	test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			
	return this;
			
}

public EmploymentPage salariedcurrentEMI(String emi) throws IOException{
	
	driver.findElement(salariedcurrentEMI).sendKeys(emi);
	
test.log(LogStatus.INFO, "EMI  "+" " + emi+"Entered  Sucessfully ");
	
	screenShotPath=ExtentManager.capture(driver, "Pass");
	
	test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			
			
	return this;
			
}

public EmploymentPage selfBuscurrentEMI(String emi) throws IOException{
	
	driver.findElement(selfEmpBusinesscurrentEMI).sendKeys(emi);
	
test.log(LogStatus.INFO, "EMI  "+" " + emi+"Entered  Sucessfully ");
	
	screenShotPath=ExtentManager.capture(driver, "Pass");
	
	test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			
			
	return this;
			
}



public EmploymentPage salaryAcctBank(String bankName) throws IOException{
	
	Select bankNameValue=new Select(driver.findElement(salaryAccountBank));
	
	bankNameValue.selectByVisibleText(bankName);
	
test.log(LogStatus.INFO, "The Bank "+" "+bankName  + "Selected Sucessfully ");
	
	/*screenShotPath=ExtentManager.capture(driver, "Pass");
	
	test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));*/
		
	return this;
			
}

public EmploymentPage workExpYear(String workYear,String workMonth) throws InterruptedException, IOException{
	
	Select expYear=new Select(driver.findElement(workExpYear));
	Select expMonth=new Select(driver.findElement(workExpMonth));
	
	expYear.selectByVisibleText(workYear);
	
	Thread.sleep(3000);
	
	//Select expMonth=new Select(driver.findElement(workExpMonth));
	
	expMonth.selectByVisibleText(workMonth);
	
test.log(LogStatus.INFO, "Experience Year and Month Selected Sucessfully " +" " + workYear+" - "+ workMonth);
	
	/*screenShotPath=ExtentManager.capture(driver, "Pass");
	
	test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));*/
		
	return this;
			
}


public EmploymentPage workExpMonth(String workMonth) throws InterruptedException{
	
	
	Select expMonth=new Select(driver.findElement(workExpMonth));
	
		
	Thread.sleep(3000);
	
	//Select expMonth=new Select(driver.findElement(workExpMonth));
	
	expMonth.selectByVisibleText(workMonth);
		
	return this;
			
}


public EmploymentPage personalDetailsContinueBtn() throws InterruptedException{
	
	driver.findElement(personalDetailContinueBtn).click();
	
	Thread.sleep(5000);
	
	return this;
	
	
	
}



public EmploymentPage pageScroll(){
	
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,100)", "");
	
	return this;
	
	
	
}



}


