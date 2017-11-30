package pages;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import supportFiles.ExtentManager;




public class HomePage extends ExtentManager {
	
	public RemoteWebDriver driver;
	
	/*public ExtentReports extent;

	public static ExtentTest test;
	
	public static String screenShotPath;*/
	
	
	//WebDriverWait wait = new WebDriverWait(driver,45);
	// WebDriverWait wait = new WebDriverWait(driver,30);
	//public static String Title="Property for Sale in Chennai | Properties in Chennai | Real Estate in Chennai | For Buy/Sale Residential Apartments, Flats, Independent Houses, Villas, Homes, Lands &amp; Plots in Chennai | IndiaProperty.com";
	public static String HomepageTitle;
	//public static  String ipurl="https://www.indiaproperty.com/";
	
	public  By closeIcon=By.xpath("//*[@id='modalcity-close']");
	
	
	
	public By selectCity=By.xpath("//div[@class='select-city']/a");
	
	public By clickCitytextBox=By.id("searchval");
	
	public By selectCityFromCityDropdown=By.xpath("//li[@class='ui-menu-item']");
	
	public By searchBtn=By.id("home-searchbtn");
	
	public By relatedPropertiesText=By.xpath("//li[text()='Related Properties']");
	
	
	
	//public By homeLoanBtnInHomePage=By.className("btn btn-transparent btn-blue");
	
	
	public By homeLoanBtnInHomePage=By.xpath("//a[@class='btn btn-transparent btn-blue'][1]");
	//a[@class='btn btn-transparent btn-blue'][1]
	
	
	
	///clickByClassNamesCitySelectFromList("ui-menu-item");
	
	//li[@class='ui-menu-item']
	
	
	public HomePage(RemoteWebDriver driver,ExtentTest test){
		
		
		extent = ExtentManager.Instance();
		this.driver=driver;
		this.test=test;
		
		
		
	}
	
	public HomePage getHomeIPUrl(String sUrl)  {
		
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(sUrl);	
								
     	return this;
	
	
	
}
	
	
	
	public HomePage clickHomeLoan() throws InterruptedException{
		
		Thread.sleep(3000);
		
		WebDriverWait wait = (new WebDriverWait(driver, 60));
		
		wait.until(ExpectedConditions.elementToBeClickable(homeLoanBtnInHomePage));
		
		String parent=driver.getWindowHandle();
		
		driver.findElement(homeLoanBtnInHomePage).click();
		
		Set<String> childwindow=driver.getWindowHandles();
		
		for(String eachwin :childwindow){
			
		if(eachwin!=parent){
			
			driver.switchTo().window(eachwin);
				
				
				
			}
		}
			
		
		return this;
		
		
		
	}
	
	
	//Browser selection
	
	public HomePage getIPUrl(String browser,String sUrl){
		
		if(browser.equalsIgnoreCase("chrome")){
			//System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	        			//driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(sUrl);		
	        			//WebDriverWait wait = new WebDriverWait(driver, 120);
	        			
		}else{
			//System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
			driver = new FirefoxDriver();
			
			//WebDriverWait wait = new WebDriverWait(driver, 120);
			
			
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(sUrl);
		}
	
		
		return this;
		
	
	}
		
	
	
	


		
		
	//Close Strip icon in Home Page

	public HomePage closeStrip() throws IOException  {
		
		test=extent.startTest("Closing of Change City Link");
		
		WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(closeIcon));	
		driver.findElement(closeIcon).click();
		
		//test.log(LogStatus.PASS, "Check whether the user able to close change City Strip", "User sucessfully closed the change city strip ");
		
		if(driver.findElement(closeIcon).isDisplayed()){
								
			
			
				test.log(LogStatus.PASS, "Check whether user close the city Strip", "User sucessfully close the strip");

				screenShotPath=ExtentManager.capture(driver, "Strip");
				
				test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));
				
						
		     
		}
		
		else{
						
		test.log(LogStatus.FAIL, "Check whether user close the city Stripe", "User unable to close the strip");
		
		screenShotPath=ExtentManager.capture(driver, "Strip");
		
		test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
		
		
		}
		
		return this;
		
						
		
				
				
	}
	

	public HomePage selectCityClick() {
		
		
	
				
		WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(selectCity));	
		driver.findElement(selectCity).click();
		
		
		
		
		return this;
		
				
				
				
	}
	
	
public HomePage clickCityTextbox(String cityName) throws InterruptedException, IOException{
	
	test=extent.startTest("Browser Launch and "+cityName +" Home Page Navigation");
		WebElement myDynamicElement1 = (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(clickCitytextBox));	
		
		Thread.sleep(3000);
		myDynamicElement1.click();
		
		myDynamicElement1.sendKeys(cityName,Keys.ENTER);
		
		
		
		WebElement myDynamicElement2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(selectCityFromCityDropdown));	
		myDynamicElement2.click();
		
				
		
		//String exptHomePageTitleTier3City="Property in India, Buy, Sell, Rent Properties, Real Estate India, Online Property Sites in India";
		
		//Property in Chennai | Real Estate Properties in Chennai | Chennai properties
		
		
		String exptHomePageTitleTier1City="Property in "+cityName +" "+"| Real Estate Properties in "+cityName +" "+"|"+" "+cityName+" "+"properties" ;
		
		//System.out.println("exptHomePageTitle "+exptHomePageTitleTier3City);
		System.out.println("exptHomePageTitle "+exptHomePageTitleTier1City);
		
		HomepageTitle=driver.getTitle();
		
		System.out.println("HomepageTitle " +HomepageTitle);
		
		//if(HomepageTitle.contains(exptHomePageTitleTier3City)){
		
		if(HomepageTitle.contains(exptHomePageTitleTier1City)){
			
			
			System.out.println("User sucessfully Land to "+cityName +" " +"Home Page");
			
			
        test.log(LogStatus.PASS, "Check whether user navigated to the "+cityName + " Home Page ", "User sucessfully land to the "+cityName + " Home Page");
        
       
         screenShotPath=ExtentManager.capture(driver, "Strip");
		
		test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));	
     	
				
			
		}
		
		else{
			
			System.out.println("User is not able to  Land to "+cityName +" " +"Home Page");
			
			test.log(LogStatus.FAIL, "Check whether user navigated to the "+cityName +" Home Page", "User unable to land to the "+cityName +" Home Page");
			
			screenShotPath=ExtentManager.capture(driver, "Strip");
			
			test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));	
			
		}
		
		
		return this;
	
		
				
	}
	

public HomePage clickCitySelfEmployedTextbox(String cityName) throws InterruptedException, IOException{
	
	test=extent.startTest("Browser Launch and "+cityName +" Home Page Navigation and Self Employed Business Validation");
		WebElement myDynamicElement1 = (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(clickCitytextBox));	
		
		Thread.sleep(3000);
		myDynamicElement1.click();
		
		myDynamicElement1.sendKeys(cityName,Keys.ENTER);
		
		
		
		WebElement myDynamicElement2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(selectCityFromCityDropdown));	
		myDynamicElement2.click();
		
				
		
		//String exptHomePageTitleTier3City="Property in India, Buy, Sell, Rent Properties, Real Estate India, Online Property Sites in India";
		
		//Property in Chennai | Real Estate Properties in Chennai | Chennai properties
		
		
		String exptHomePageTitleTier1City="Property in "+cityName +" "+"| Real Estate Properties in "+cityName +" "+"|"+" "+cityName+" "+"properties" ;
		
		//System.out.println("exptHomePageTitle "+exptHomePageTitleTier3City);
		System.out.println("exptHomePageTitle "+exptHomePageTitleTier1City);
		
		HomepageTitle=driver.getTitle();
		
		System.out.println("HomepageTitle " +HomepageTitle);
		
		//if(HomepageTitle.contains(exptHomePageTitleTier3City)){
		
		if(HomepageTitle.contains(exptHomePageTitleTier1City)){
			
			
			System.out.println("User sucessfully Land to "+cityName +" " +"Home Page");
			
			
        test.log(LogStatus.PASS, "Check whether user navigated to the "+cityName + " Home Page ", "User sucessfully land to the "+cityName + " Home Page");
        
       
         screenShotPath=ExtentManager.capture(driver, "Strip");
		
		test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));	
     	
				
			
		}
		
		else{
			
			System.out.println("User is not able to  Land to "+cityName +" " +"Home Page");
			
			test.log(LogStatus.FAIL, "Check whether user navigated to the "+cityName +" Home Page", "User unable to land to the "+cityName +" Home Page");
			
			screenShotPath=ExtentManager.capture(driver, "Strip");
			
			test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));	
			
		}
		
		
		return this;
	
		
				
	}







public HomePage selectCityName() throws InterruptedException{
	
	
	//WebElement myDynamicElement = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(clickCitytextBox));	
	WebElement cityNameVal=driver.findElements(selectCityFromCityDropdown).get(0);
	
	
	WebElement myDynamicElement = (new WebDriverWait(driver, 30)).until(ExpectedConditions.elementToBeClickable(cityNameVal));	
	
	myDynamicElement.click();
		
	return this;
		
			
			
}



	
public HomePage webDriverwait(By locator)	{
	
	 
	 WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(locator));
		
	return this;
	
}
	

/**
 * WebDriver driver = new FirefoxDriver();
driver.get("http://somedomain/url_that_delays_loading");
WebElement myDynamicElement = (new WebDriverWait(driver, 10))
  .until(ExpectedConditions.presenceOfElementLocated(By.id("myDynamicElement")));
 * @throws InterruptedException 
 * @throws IOException 
 
 * 
 */







public HomePage delay5000() throws InterruptedException{
	
	Thread.sleep(5000);
	
	return this;

	
}



public HomePage closeAllBrowser(){
	
	driver.quit();
	return this;
	
}




}


