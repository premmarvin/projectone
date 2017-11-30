package Testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import pages.EmploymentPage;
import pages.HomeLoanOffers;
import pages.HomeLoanPersonalDetail;
import pages.HomePage;
import pages.PurposeOfLoan;
import supportFiles.ExtentManager;
import utils.DataInputProviderSalaried;
import utils.DataInputProviderSalariedWithoutCopplicant;

public class TestcaseSalariedWithoutCoapplicant extends ExtentManager {
	
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
	
	
	
	
	
	
	@Test(priority=2,dataProvider="getData",dataProviderClass=DataInputProviderSalariedWithoutCopplicant.class)
	public static void init(String cityName,String FirstName,String LastName,String dateOfBirth,String panNumber,String livingCityName,String empType,String compName,String salary,String incentives,
			String bonus,String emi,String bankName,
			
			String workYear,String workMonth,String loanpurposeType,String propertyDetail,
			
			String propLocation,String builderNameValue,String projectNameValue,String propertyValue,
			String email,String mobile) throws InterruptedException, IOException{
			
	
		new HomePage(driver,test)
					
		 .getHomeIPUrl("https://www.indiaproperty.com/")
		//.closeStrip()
		 
		 /********************
		  * 
		  * for Production .selectCity() function to be Enabled and for Staging .selectCity() to be disable
		  */
		.selectCityClick()
		
		.clickCityTextbox(cityName)
		.clickHomeLoan()
		.closeAllBrowser();
	  /* new HomeLoanPersonalDetail(driver)
	   .personalDetailsFNameenty(FirstName)
	   .personalDetailsLNameenty(LastName);
	   */
	   
	   /*
	   
	   .pageScroll()
	   .personalDetailsContinueBtn()
	 .DOB(dateOfBirth)
	
	 .genderMale()

	
	 .panNumber(panNumber)
	 
	 
	 .residencyRI()
	 
	 .personalDetailsContinueBtn()
	

	.livingCity(livingCityName)
	   .personalDetailsContinueBtn();
	   
	   new EmploymentPage(driver)
	   .employmentType(empType)
	   .personalDetailsContinueBtn()
	   .companyName(compName)
	   .personalDetailsContinueBtn()
	   .grossSalary(salary)
	   .personalDetailsContinueBtn()
	   .salaryIncentives(incentives)
	   .personalDetailsContinueBtn()
	   .salaryBonus(bonus)
	   .personalDetailsContinueBtn()
	   .salariedcurrentEMI(emi)
	   .personalDetailsContinueBtn()
	   .salaryAcctBank(bankName)
	   .workExpYear(workYear, workMonth);
	 	//.personalDetailsContinueBtn();
	   
	   new PurposeOfLoan(driver)
	   .purposeType(loanpurposeType)
	   .personalDetailsContinueBtn()
	   .propDetails(propertyDetail)
	   .personalDetailsContinueBtn()
	   .propertyCityLocation(propLocation)
	   .personalDetailsContinueBtn()
	   .builderNameOfProperty(builderNameValue)
	   .personalDetailsContinueBtn()
	   .projectNameOfProperty(projectNameValue)
	   .personalDetailsContinueBtn()
	   .propertyCostValue(propertyValue)
	   .personalDetailsContinueBtn()
	   .personalDetailsContinueBtn();
		
	   
	   new HomeLoanOffers(driver)
	   .contactEmailValue(email)
	   .contactMobileValue(mobile)
	   .personalDetailsContinueBtn()
	   .bankList()
	   
	   */
	  /* new HomeLoanOffers(driver)
	 .closeBrowsers();*/
	   
	   
	   
}
	
	
}
