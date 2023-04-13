package CentralReports.MultiStockTransfer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import PageObjects.LoginPage;


public class BaseClass{

	public static WebDriver driver;
@Test
public void Login() throws Throwable {

		
       
     	driver = new ChromeDriver();
	   // driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://reports.nukkadshops.com/new/");
	//	driver.get("https://uat.nukkadshops.com:9008/");
	//	driver.get("http://staging.nukkadshops.com/new_central_dashboard/");
	//	driver.get("https://reports.nukkadshops.com/new/site/login");
		
	LoginPage L= new LoginPage(driver);

	
		L.login();
		
		
	
        }
}