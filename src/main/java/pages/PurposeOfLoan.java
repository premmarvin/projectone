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




public class PurposeOfLoan extends ExtentManager {
	
	public RemoteWebDriver driver;
	
	
	
	
	public By employmentType=By.id("loan-profession");
	
	public By purposeOfLoanType=By.id("purposetypeinp");
	
	public By propertyDetails=By.id("hlpi_propertydetailinp");
	
	public By propertyLocation=By.id("moveinpr_propertylocationinp");
	
	//public By propertyCity=By.className("ui-menu-item");
	
	public By propertyCity=By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']/li[@class='ui-menu-item'][2]");
	
	
	public By transferbuilderName=By.id("moveinpr_buildernameinp");
	
	public By projectName=By.id("moveinpr_projectnameinp");
		public By propertyCost=By.id("moveinpr_costhomeplotinp");
		
		public By landPromoter=By.id("plotland_buildernameinp");
		
		
		public By landcost=By.id("plotland_costplotlandinp");
		
		
		public By constructionCost=By.id("consplotland_costconsinp");
		
		
		public By transferproperty=By.id("nppropertydetailinp");
		
		
		//public By transferVillaProperty=By.id("indhousepropertylocationinp");
		
		
	
	public By personalDetailContinueBtn=By.id("continue");
	
	public By existingLoanBank=By.id("loantopup_existingloaninp");
	
	
	public By existingBankLoanNumber=By.id("loannumberinp");
	
	public By topupAmount=By.id("loantopupinp");
	
	
	public By transferExistingAvailedLoanBank=By.id("loanbankdetailsinp");
	
	public By transferestimatedValue=By.id("valueestimatepropertyinp");
	
	public By transferProjectName=By.id("projectnameinp");
	
	public By transferPropertyCity=By.id("propertylocationinp");
	
	public By transferPropertyVillaCity=By.id("indhousepropertylocationinp");
	
	public By tranferBuilderName=By.id("buildernameinp");
	
	
	public By transferLoanStDate=By.id("loanstartdateinp");
	
	public By transferOutstandingBalance=By.id("loanoutstandinginp");
	
	
	public By transferVillaCityEst=By.id("indhousevalueestimatepropertyinp");
	
	
	
	
	
	public PurposeOfLoan(RemoteWebDriver driver) throws InterruptedException{
		test=extent.startTest("Purpose Of Home Loan Entries");
		Thread.sleep(3000);
		this.driver=driver;
	}
	
	
	public PurposeOfLoan purposeType(String loanpurposeType) throws IOException{
		
		Select purpose=new Select(driver.findElement(purposeOfLoanType));
		
		purpose.selectByVisibleText(loanpurposeType);
		
		test.log(LogStatus.INFO, "Loan Purpose "+" "+loanpurposeType+" "+"Selected Sucessfully ");
		
		/*screenShotPath=ExtentManager.capture(driver, "Pass");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));*/
			
			
		return this;
				
	}
	 
	
	
public PurposeOfLoan transferPropType(String transPropType) throws IOException{
		
		Select proptype=new Select(driver.findElement(transferproperty));
		
		proptype.selectByVisibleText(transPropType);
		
		test.log(LogStatus.INFO, "Property Type  "+" "+transPropType+" "+"Selected Sucessfully ");
		
		/*screenShotPath=ExtentManager.capture(driver, "Pass");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));*/
			
			
		return this;
				
	}
	
	
	
public PurposeOfLoan transferPropCityforBuilderProperty(String propLocation) throws IOException{
		
		driver.findElement(transferPropertyCity).sendKeys(propLocation);
		
		
		
		test.log(LogStatus.INFO, "Property Location"+" "+propLocation+" "+"Entered Sucessfully ");
		
		screenShotPath=ExtentManager.capture(driver, "Pass");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			
			
		return this;
				
	}






public PurposeOfLoan transferexistingBalance(String loanBalance) throws IOException{
	
	try {
		driver.findElement(transferOutstandingBalance).sendKeys(loanBalance);
		
		
		
		test.log(LogStatus.INFO, "Loan Balance"+" "+loanBalance+" "+"Entered Sucessfully ");
		
		screenShotPath=ExtentManager.capture(driver, "Pass");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
		test.log(LogStatus.FAIL, e);
	}
		
		
	return this;
			
}
	
public PurposeOfLoan transferVillaEstimation(String villaEst) throws IOException{
	
	driver.findElement(transferVillaCityEst).sendKeys(villaEst);
	
	
	
	test.log(LogStatus.INFO, "Villa Estimation Of "+" "+villaEst+" "+" has Entered Sucessfully ");
	
	screenShotPath=ExtentManager.capture(driver, "Pass");
	
	test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
		
		
	return this;
			
}



public PurposeOfLoan transferProjectName(String transProjName) throws IOException{
	
	driver.findElement(transferProjectName).sendKeys(transProjName);
	
	
	
	test.log(LogStatus.INFO, "Project Name "+" "+transProjName+" "+"Entered Sucessfully ");
	
	screenShotPath=ExtentManager.capture(driver, "Pass");
	
	test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
		
		
	return this;
			
}	

public PurposeOfLoan transferEstimationOfProperty(String estAmount) throws IOException{
	
	driver.findElement(transferestimatedValue).sendKeys(estAmount);
	
	
	
	test.log(LogStatus.INFO, "Project Estimation Value "+" "+estAmount+" "+"Entered Sucessfully ");
	
	screenShotPath=ExtentManager.capture(driver, "Pass");
	
	test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
		
		
	return this;
			
}	



public PurposeOfLoan transferBuilderName(String transBuildName) throws IOException{
	
	driver.findElement(tranferBuilderName).sendKeys(transBuildName);
	
	
	
	test.log(LogStatus.INFO, "Builder Name "+" "+transBuildName+" "+"Entered Sucessfully ");
	
	screenShotPath=ExtentManager.capture(driver, "Pass");
	
	test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
		
		
	return this;
			
}	

	
	//Existing Loan Topup
	
public PurposeOfLoan existingBankNameList(String existingLoanBankName) throws IOException{
		
		Select existingLoan=new Select(driver.findElement(existingLoanBank));
		
		existingLoan.selectByVisibleText(existingLoanBankName);
		
		test.log(LogStatus.INFO, "Existing Loan Bank Name "+" "+existingLoanBankName+" "+ "Selected Sucessfully ");
		
		/*screenShotPath=ExtentManager.capture(driver, "Pass");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));*/
			
			
		return this;
				
	}
	
	



	
	
	
	
public PurposeOfLoan propDetails(String propertyDetail) throws IOException{
		
		Select propDetail=new Select(driver.findElement(propertyDetails));
		
		propDetail.selectByVisibleText(propertyDetail);
	
		test.log(LogStatus.INFO, "PropertyDetail"+" "+propertyDetail+" "+"Selected Sucessfully ");
		
    
		screenShotPath=ExtentManager.capture(driver, "Pass");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			
		return this;
				
	}


public PurposeOfLoan availedLoanBank(String existingavailedLoanBank) throws IOException{
	
	Select loanBank=new Select(driver.findElement(transferExistingAvailedLoanBank));
	
	loanBank.selectByVisibleText(existingavailedLoanBank);

	test.log(LogStatus.INFO, "Existing Loan Availed Bank"+" "+existingavailedLoanBank+" "+"Selected Sucessfully ");
	

	screenShotPath=ExtentManager.capture(driver, "Pass");
	
	test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
		
	return this;
			
}




public PurposeOfLoan  transferbeginLoanDate(String transLoanDate) throws InterruptedException, IOException{
	
	driver.findElement(transferLoanStDate).sendKeys(transLoanDate,Keys.TAB);
	
	 test.log(LogStatus.INFO, "Loan Start Date Entered Sucessfully " + " "+ transLoanDate);
		
		/*screenShotPath=ExtentManager.capture(driver, "Pass");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));*/
	
	//driver.findElementByXPath("//div[@class='lw-gender-head']").click();
	Thread.sleep(3000);
	return this;

	
}


public PurposeOfLoan  transferVillaCityValue(String VillaCity) throws InterruptedException, IOException{
	
	driver.findElement(transferPropertyVillaCity).sendKeys(VillaCity);
	
	 test.log(LogStatus.INFO, "Property City  " + " "+ VillaCity+ " Enter Sucessfully");
		
		/*screenShotPath=ExtentManager.capture(driver, "Pass");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));*/
	
	//driver.findElementByXPath("//div[@class='lw-gender-head']").click();
	Thread.sleep(3000);
	return this;

	
}



public PurposeOfLoan propertyCityLocation(String propLocation) throws InterruptedException, IOException{
	Thread.sleep(5000);
	
	driver.findElement(propertyLocation).sendKeys(propLocation,Keys.TAB);
	
	test.log(LogStatus.INFO, "Property Location"+" "+propLocation+" "+"Selected Sucessfully ");
	
	
		
		screenShotPath=ExtentManager.capture(driver, "Pass");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
	
	/*List<WebElement> cityListvalue=driver.findElements(propertyCity);
	Thread.sleep(4000);
	cityListvalue.get(0).click();*/
	
	
	
	return this;
	
	
	
}


public PurposeOfLoan existingBankLoanNumber(String loanNumber) throws InterruptedException, IOException{
	Thread.sleep(5000);
	
	driver.findElement(existingBankLoanNumber).sendKeys(loanNumber);
	
	test.log(LogStatus.INFO, "Bank Loan -"+" "+loanNumber+" "+"Entered Sucessfully ");
	
	
		
		screenShotPath=ExtentManager.capture(driver, "Pass");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
	
	/*List<WebElement> cityListvalue=driver.findElements(propertyCity);
	Thread.sleep(4000);
	cityListvalue.get(0).click();*/
	
	
	
	return this;
	
	
	
}



public PurposeOfLoan topupAmount(String reqTopupAmount) throws InterruptedException, IOException{
	Thread.sleep(5000);
	
	driver.findElement(topupAmount).sendKeys(reqTopupAmount);
	
	test.log(LogStatus.INFO, "Top Up Amount Entered"+" "+reqTopupAmount+" "+"Sucessfully ");
	
	
		
		screenShotPath=ExtentManager.capture(driver, "Pass");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
	
	/*List<WebElement> cityListvalue=driver.findElements(propertyCity);
	Thread.sleep(4000);
	cityListvalue.get(0).click();*/
	
	
	
	return this;
	
	
	
}






public PurposeOfLoan projectNameOfProperty(String projectNameValue) throws InterruptedException, IOException{
	Thread.sleep(5000);
	
	driver.findElement(projectName).sendKeys(projectNameValue);
	

	test.log(LogStatus.INFO, "Project Name"+ " "+projectNameValue+" "+"Entered  Sucessfully ");
	
	 //test.log(LogStatus.INFO, "Project Name Entered  Sucessfully " +" " + projectNameValue);
		
		screenShotPath=ExtentManager.capture(driver, "Pass");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
	
	
	return this;
	
	
	
}


public PurposeOfLoan promoterNameOfLand(String promoterNameValue) throws InterruptedException, IOException{
	Thread.sleep(5000);
	
	driver.findElement(landPromoter).sendKeys(promoterNameValue);
	

	test.log(LogStatus.INFO, "Promoter Name"+ " "+promoterNameValue+" "+"Entered  Sucessfully ");
	
	 //test.log(LogStatus.INFO, "Project Name Entered  Sucessfully " +" " + projectNameValue);
		
		screenShotPath=ExtentManager.capture(driver, "Pass");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
	
	
	return this;
	
	
	
}

public PurposeOfLoan costOfLand(String costLand) throws InterruptedException, IOException{
	Thread.sleep(5000);
	
	driver.findElement(landcost).sendKeys(costLand);
	

	test.log(LogStatus.INFO, "Land Cost"+ " "+costLand+" "+"Entered  Sucessfully ");
	
	 //test.log(LogStatus.INFO, "Project Name Entered  Sucessfully " +" " + projectNameValue);
		
		screenShotPath=ExtentManager.capture(driver, "Pass");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
	
	
	return this;
	
	
	
}


public PurposeOfLoan constructioncost(String constructCost) throws InterruptedException, IOException{
	Thread.sleep(5000);
	
	driver.findElement(constructionCost).sendKeys(constructCost);
	

	test.log(LogStatus.INFO, "Construction Cost"+ " "+constructCost+" "+"Entered  Sucessfully ");
	
	 //test.log(LogStatus.INFO, "Project Name Entered  Sucessfully " +" " + projectNameValue);
		
		screenShotPath=ExtentManager.capture(driver, "Pass");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
	
	
	return this;
	
	
	
}






public PurposeOfLoan propertyCostValue(String propertyValue) throws InterruptedException, IOException{
	Thread.sleep(5000);
	
	driver.findElement(propertyCost).sendKeys(propertyValue);
	
	test.log(LogStatus.INFO, "Property Cost"+ " "+propertyValue+" "+"Entered  Sucessfully ");
	
	// test.log(LogStatus.INFO, "Property Cost Entered  Sucessfully " +" " + propertyValue);
		
		screenShotPath=ExtentManager.capture(driver, "Pass");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
	
	
	return this;
	
	
	
}

public PurposeOfLoan builderNameOfProperty(String transferbuilderNameValue) throws InterruptedException, IOException{
	Thread.sleep(5000);
	
	driver.findElement(transferbuilderName).sendKeys(transferbuilderNameValue);
	
	test.log(LogStatus.INFO, "Builder Name"+ " "+transferbuilderNameValue+" "+"Entered  Sucessfully ");
	
	// test.log(LogStatus.INFO, "Builder Name Entered  Sucessfully " +" " + builderNameValue);
		
		screenShotPath=ExtentManager.capture(driver, "Pass");
		
		test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
	
	
	
	return this;
	
	
	
}


public PurposeOfLoan personalDetailsContinueBtn() throws InterruptedException{
	
	driver.findElement(personalDetailContinueBtn).click();
	
	Thread.sleep(5000);
	
	return this;
	
	
	
}

public PurposeOfLoan pageScroll(){
	
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,100)", "");
	
	return this;
	
	
	
}



}


