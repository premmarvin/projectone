package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.LogStatus;

import supportFiles.ExtentManager;

public class DBValidation extends ExtentManager{
	
	RemoteWebDriver driver;
	//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"
	
	/*
	 * For Staging
	 * 
	 *  public static String dbUrl = "jdbc:mysql://192.168.4.79 :3306/iplisting";	
	 *  
	 *  public static String username = "ipuserpp";	
	 * 
	 * 
	 * public static String password = "PPdbtest";	
	 */
    public static String dbUrl = "jdbc:mysql://192.168.4.79 :3306/iplisting";					

	//Database Username		
    public static String username = "ipuserpp";	
    
	//Database Password		
    public static String password = "PPdbtest";	
    
   public static String first_name;
   public static String last_name;
   public static String pancard;
   public static String hl_user_id;
   
   public static String email;
   
   public static String mobileno;
	
	//String host="192.168.4.79";
	
   
   public DBValidation(RemoteWebDriver driver){
	   
	   this.driver=driver;
   }
	
	public DBValidation dbvalues() throws SQLException, ClassNotFoundException{
	
	//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
    /*String dbUrl = "jdbc:mysql://192.168.4.79 :3306/iplisting";					

	//Database Username		
	String username = "ipuserpp";	
    
	//Database Password		
	String password = "PPdbtest";	
	
	//String host="192.168.4.79";
*/
	//Query to Execute		
	//String query1 = "select * from  iphomeloan_user_details  where hl_user_id = 389;";	
    
		String query1 = "select * from  iphomeloan_user_details  order by hl_user_id desc limit 1;";	
		
		
		
		
	//String query2 = "select * from  iphomeloan_application  where hl_user_id = 389;";	
    
	
	    //Load mysql jdbc driver		
	    Class.forName("com.mysql.jdbc.Driver");

		//Create Connection to DB		
	Connection con = DriverManager.getConnection(dbUrl,username,password);

		//Create Statement Object		
   Statement stmt = con.createStatement();					

		// Execute the SQL Query. Store results in ResultSet		
		ResultSet rs= stmt.executeQuery(query1);
		
		if(rs.next()){
 			hl_user_id=rs.getString(1);
 			
 			System.out.println("hl_user_id"+" : "+hl_user_id);
 			
 		}
			
		
		
		String query2 = "select * from  iphomeloan_application  where hl_user_id =" + hl_user_id+";";	
		
		
		ResultSet rs2= stmt.executeQuery(query2);
		
		
		

		// While Loop to iterate through all data and print results		
	while (rs2.next()){
		
		first_name=rs2.getString(3);
		
		last_name=rs2.getString(7);
		
		pancard=rs2.getString(10);
		
		email=rs2.getString(16);
		
		mobileno=rs2.getString(18);
		
		
		/*String profession = rs.getString(6);								        
        String  employment_type = rs.getString(7);					                               
        System. out.println(profession+"  "+employment_type);	*/
		
		System. out.println("hl_user_id"+ " " +hl_user_id);
		System. out.println("first_name"+ " " +first_name);
		System. out.println("last_name"+ " " +last_name);
		System. out.println("pancard"+ " " +pancard);
		System. out.println("email"+ " " +email);
		System. out.println("mobileno"+ " " +mobileno);
		
        }		
		 // closing DB Connection		
		con.close();
		return this;			
}

	
	public DBValidation UIandDBComparision(){
		
		
		System. out.println("hl_user_id"+ " " +hl_user_id);
		System. out.println("first_name"+ " " +first_name);
		System. out.println("last_name"+ " " +last_name);
		System. out.println("pancard"+ " " +pancard);
		
		System. out.println("HomeLoanPersonalDetail.FName"+ " " +HomeLoanPersonalDetail.FName);
		
	 if(HomeLoanPersonalDetail.FName.equalsIgnoreCase(first_name)&& HomeLoanOffers.emailId.equalsIgnoreCase(email)&&HomeLoanOffers.mobileNumber.equalsIgnoreCase(mobileno)){
		 
	System.out.println("FName" + HomeLoanPersonalDetail.FName +", "+ "first_name"+first_name );
		 
		 test.log(LogStatus.INFO, "Value passed in Application is captured in DB"+"," +"Application Reference"+": "+HomeLoanPersonalDetail.FName+" ,"+" DB Reference"+": "+first_name);
		 test.log(LogStatus.INFO, "Application Reference"+": "+HomeLoanOffers.emailId+" ,"+" DB Reference"+": "+email);
		 test.log(LogStatus.INFO, "Application Reference"+": "+HomeLoanOffers.mobileNumber+" ,"+" DB Reference"+": "+mobileno);
		 
	 }
		
	 else{
		
		
		
		 System.out.println("Not Equal");
		
		
		
	}
	
	 return this;
	

	}
	
	
	
	public DBValidation closeBrowsers(){
		
		
		driver.quit();
		
		return this;
		
		
		
	}
	
	

}
